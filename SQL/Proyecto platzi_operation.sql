CREATE TABLE IF NOT EXISTS books (
    book_id INTEGER UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    author_id INTEGER UNSIGNED,
    title VARCHAR(100) NOT NULL,
    year INTEGER UNSIGNED NOT NULL DEFAULT 1900,
    language VARCHAR(2) NOT NULL DEFAULT 'es' COMMENT 'ISO 639-1 Language',
    cover_url VARCHAR(500),
    price DOUBLE(6,2) NOT NULL DEFAULT 10.0,
    sellable TINYINT(1) DEFAULT 1,
    copies INTEGER NOT NULL DEFAULT 1,
    description TEXT   	
);

CREATE TABLE IF NOT EXISTS authors (
    author_id INTEGER UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    nationality VARCHAR(3)
);

CREATE TABLE IF NOT EXISTS clients (
    client_id INTEGER UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    birthdate DATETIME,
    gender ENUM('M', 'F', 'ND') NOT NULL,
    active TINYINT(1) NOT NULL DEFAULT 1,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
    ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS 	operations (
    operation_id INTEGER UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    book_id INTEGER UNSIGNED,
    client_id INTEGER UNSIGNED,
    type ENUM('BORROWED', 'RETURNED', 'SOLD') NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
    ON UPDATE CURRENT_TIMESTAMP,
    finished TINYINT(1) NOT NULL
);

INSERT INTO authors (name, nationality)
VALUES ('Juan Rulfo', 'MEX');

INSERT INTO authors (name, nationality)
VALUES ('Gabriel García Márquez', 'COL');

INSERT INTO authors (name, nationality)
VALUES ('Juan Gabriel Vasquez', 'COL');

INSERT INTO authors (name, nationality)
VALUES ('Julio Cortázar', 'ARG'),
       ('Isabel Allende', 'CHI'),
       ('Octavio Paz', 'MEX'),
       ('Juan Carlos Onetti', 'URU');

INSERT INTO clients (client_id, name, email, birthdate, gender, active, created_at)
VALUES (1,'Maria Dolores Gomez','Maria Dolores.95983222J@random.names','1971-06-06','F',1,'2018-04-09 16:51:30'),
       (2,'Adrian Fernandez','Adrian.55818851J@random.names','1970-04-09','M',1,'2018-04-09 16:51:30'),
       (3,'Maria Luisa Marin','Maria Luisa.83726282A@random.names','1957-07-30','F',1,'2018-04-09 16:51:30'),
       (4,'Pedro Sanchez','Pedro.78522059J@random.names','1992-01-31','M',1,'2018-04-09 16:51:30');

INSERT INTO clients (name, email, birthdate, gender, active)
VALUES ('Pedro Sanchez', 'Pedro.78522059J@random.names', '1992-01-31', 'M', 1)
ON DUPLICATE KEY UPDATE active = VALUES (active);


INSERT INTO books (title, author_id)
VALUES ('El laberinto de la Soledad', 6);

INSERT INTO books (title, author_id, `year`)
VALUES ('Vuelta al Laberinto de la Soledad',
    (SELECT author_id FROM authors
    WHERE name = 'Octavio Paz'
    LIMIT 1), 
    1960
);

DELETE FROM books
WHERE year = 1900;

INSERT INTO transactions (book_id, client_id, type, finished) 
VALUES (12,34,'sell',1),
       (54,87,'lend',0),
       (3,14,'sell',1),
       (1,54,'sell',1),
       (12,81,'lend',1),
       (12,81,'sell',1),
       (87,29,'sell',1);

SELECT c.name, b.title, a.name, t.type
FROM transactions as t
JOIN books as b
    ON t.book_id = b.book_id
JOIN clients as c
    ON t.client_id = c.client_id
JOIN authors as a
    ON b.author_id = a.author_id
WHERE c.gender = 'M'
    and t.type IN ('sell', 'lend');

SELECT a.author_id, a.name, a.nationality, b.title
FROM authors as a
JOIN books as b
    ON b.author_id = a.author_id
WHERE a.author_id between 1 and 5
ORDER BY a.author_id desc;

SELECT a.author_id, a.name, a.nationality, COUNT(b.book_id) AS books_quantity
FROM authors as a
LEFT JOIN books as b
    ON b.author_id = a.author_id
WHERE a.author_id between 1 and 5
GROUP BY a.author_id
ORDER BY a.author_id;

-- Preguntas de interes de negocios para una libreria

-- 1. Que nacionalidades hay?

SELECT DISTINCT nationality
FROM authors
WHERE nationality IS NOT NULL
ORDER BY nationality;

-- 2. Cuantos escritores hay de cada nacionalidad?

SELECT nationality, COUNT(author_id) AS c_authors
FROM authors
WHERE nationality IS NOT NULL
    AND nationality NOT IN ('RUS', 'AUT') --<-- Ejemplo de como excluir elementos del grupo
GROUP BY nationality
ORDER BY c_authors DESC, nationality ASC;

-- 3. Cuantos libros hay de cada nacionalidad?

SELECT DISTINCT a.nationality, COUNT(b.book_id) AS c_books
FROM authors AS a
LEFT JOIN books as b
ON a.author_id = b.author_id
GROUP BY a.nationality
ORDER BY c_books DESC;

-- 4. Cual es el promedio/desviacion estandar del precio de los libros?

SELECT COUNT(book_id) AS libros,
    AVG(price) AS prom,
    STDDEV(price) AS std
FROM books as b
JOIN authors as a
    ON a.author_id = b.author_id
ORDER BY libros DESC;

-- 5. idem, pero por nacionalidad

SELECT nationality, 
    COUNT(book_id) AS libros,
    AVG(price) AS prom,
    STDDEV(price) AS std
FROM books as b
JOIN authors as a
    ON a.author_id = b.author_id
GROUP BY nationality
ORDER BY libros DESC; 

-- 6. Cual es el precio maximo/minimo de un libro

SELECT nationality, MAX(price), MIN(price)
FROM books AS b
JOIN authors as a
  ON a.author_id = b.author_id 
GROUP BY a.nationality
ORDER BY MAX(price) DESC;

-- 7. Como quedaria el reporte de prestamos?

SELECT c.name, t.type, b.title,
    CONCAT(a.name, " (", a.nationality, ")") as author,
    TO_DAYS(NOW()) - TO_DAYS(t.created_at) AS ago
FROM transactions AS t
LEFT JOIN clients AS c
  ON c.client_id = t.client_id
LEFT JOIN books AS b
  ON b.book_id = t.book_id
LEFT JOIN authors as a
  ON b.author_id = a.author_id;

SELECT * FROM authors ORDER BY rand() LIMIT 10;
-- Este query me trae de la tabla autores 10 registros aleatorios

DELETE FROM authors WHERE author_id = 161 LIMIT 1;
-- Este query me borra el registro del autor cuyo id es 161 de la
-- tabla autores, el limit se coloca por seguridad en el caso de 
-- usar el comando delete a siempre ejecutar este comando limitado
-- a la cantidad de registros deseados.

SELECT client_id, name FROM clients WHERE active <> 1;
-- Este query me trae los campos del id y nombre de la tabla clientes
-- que no esten activos, es decir cuya bandera boleana de status sea
-- sea diferente de 1(activo = 1, inactivo = 0)

UPDATE clients
SET active = 0
WHERE client_id = 80
LIMIT 1;
-- Este query me actualiza la informacion del campo active, cambiando
-- el estatus del cliente cuyo id es 80 de activo a inactivo.

UPDATE clients
SET active = 0
WHERE client_id IN (1, 6, 8, 27, 90)
  OR name LIKE '%Lopez%';
-- Este query me actualiza la informacion del campo activo, cambiando
-- el estatus del cliente cuyos id este en la lista (1, 6, 8, 27, 90) o
-- cuyo nombre contenga la palabra Lopez (se agregan los % para definir
-- que puede estar al princio al final o entre).

TRUNCATE transactions;
-- Este query borra toda la data contenida en la tabla transactions, 
-- manteniendo la estructura de la tabla.

SELECT COUNT(book_id), SUM(1) FROM books;
-- Este query contara todos los libros que se encuentran en la tabla
-- books, y ademas la funcion SUM sumara una unidad cada vez que la
-- funcion COUNT cuente un libro por lo que al final ambas columnas
-- nos arrojaran el mismo resultado.

SELECT SUM(price) FROM books WHERE sellable = 1;
-- Este query nos va a sumar todos los precios de aquellos libros
-- cuya condicion del campo "vendible" o "sellable" sea verdadera,
-- es decir tinyint(1).

SELECT SUM(price*copies) FROM books WHERE sellable = 1;
-- Este query es igual al anterior pero ademas nos incluira el valor
-- de aquellos libros que tengan copias.

SELECT sellable, SUM(price*copies) FROM books GROUP BY sellable;
-- Este query nos va a sumar y mostrar el mismo resultado del query
-- anterior pero ademas nos agregara el valor de los libros cuyo 
-- status del campo "selleable" es no vendible (o tinyint(0)) y los
-- agrupara por el campo "selleable".

SELECT COUNT(book_id), SUM(IF(year < 1950, 1, 0)) AS '< 1950' FROM books;
-- Este query nos va a contar cuantos libros hay registrados en la tabla 
-- books y nos va a sumar la cantidad de todos aquellos libros cuyo año 
-- de edicion sea menor a 1950.

SELECT COUNT(book_id), 
    SUM(IF(year < 1950, 1, 0)) AS '< 1950',
    SUM(IF(year < 1950, 0, 1)) AS '< 1950'
FROM books;
-- Este query es igual al anterior pero ademas nos agrega la columna de la
-- que suma la cantidad de libros cuya edicion es mayor a 1950.

SELECT COUNT(book_id), 
    SUM(IF(year < 1950, 1, 0)) AS '< 1950',
    SUM(IF(year >= 1950 AND year < 1990, 1, 0)) AS '< 1990',
    SUM(IF(year >= 1990 AND year < 2000, 1, 0)) AS '< 2000'
FROM books;

-- Este query suma la cantidad de libros cuyos años de edicion
--  estan en rangos definidos de tiempo.

SELECT nationality, COUNT(book_id) AS books_quantity, 
    SUM(IF(year < 1950, 1, 0)) AS '< 1950',
    SUM(IF(year >= 1950 AND year < 1990, 1, 0)) AS '< 1990',
    SUM(IF(year >= 1990 AND year < 2000, 1, 0)) AS '< 2000'
FROM books AS b
JOIN authors as a
  ON a.author_id = b.author_id
WHERE a.nationality IS NOT NULL
GROUP BY nationality
ORDER BY books_quantity DESC;
-- Este query cuenta la cantidad de libros registrado en la tabla
-- books y ademas nos suma los libros cuyo año de edicion esta 
-- especificado en la condicion (< 1950, 1950 <= year < 1990, 
-- 1990 <= year < 2000) y ademas nos muestra la columna 
-- nacionalidad que nos idicara cuantos libros hay de cada condicion
-- y a que nacionalidad pertenecen estos autores.

ALTER TABLE authors
ADD COLUMN birthyear INTEGER DEFAULT 1930 AFTER name;
-- Este query nos agrega el campo birthyear a la tabla de autores,
-- y ademas con el comando after especificamos que lo coloque luego
-- del campo name. Se agregan los respectivos atributos contenidos
-- en la tabla como Type = integer, el campo null se deja por defecto
-- es decir puede ser null y default se agrega como 1930, en caso de
-- no se agrege ningun dato de este campo.

ALTER TABLE authors MODIFY COLUMN birthyear YEAR DEFAULT 1920;
-- Este query modifica el año por defaul del query anterior a
-- 1920 y el tipo de dato cambia de integer a year.

ALTER TABLE authors DROP COLUMN birthyear;
-- Este query nos elimina o desecha la columna birthyear de la
-- tabla autores.

SHOW TABLES LIKE '%i%';
-- Este query nos muestra todas las tablas de nuestra base de
-- datos actual cuyo titulo contenga la letra i.

mysqldump -h 127.0.0.1 -P 3306 -u root -p -d pruebaplatzi > esquema.sql
-- Este comando nos guarda en el archivo esquema.sql todo el
-- Schema de la base de datos pruebaplatzi.






