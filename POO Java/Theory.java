
/**

1. """Programación orientada a objetos en Java"""

¡Te damos la bienvenida al Curso de Java SE Orientado a Objetos!

Los paradigmas de programación son una teoría que nos suministra 
una base y modelo estandarizado para resolver problemas con nuestro 
código.

La Programación Orientada a Objetos (POO) nos ayuda a analizar y 
entender todos estos problemas para resolverlos de la forma más 
sostenible en el futuro. Java surgió con este paradigma y es uno 
de los lenguajes que define en gran manera el rumbo que sigue la POO.

Este paradigma se compone de 4 elementos (que analizaremos a fondo 
más adelante):

Clases
Propiedades
Métodos
Objetos
Además, se basa en los siguientes 4 pilares:

Encapsulamiento
Abstracción
Herencia
Polimorfismo
Recuerda que antes de tomar este curso es muy recomendado que tomes 
el Curso de Introducción a Java SE y el Curso de Programación 
Orientada a Objetos: POO. Al terminar este curso puedes continuar 
con el Curso de Java SE: Programación Funcional.

2. """¿Qué es un Objeto?"""

Los Objetos son todas las cosas físicas o conceptuales que tienen 
propiedades y comportamientos. Por ejemplo: usuario, sesión, auto, etc.

Las Propiedades o atributos son las características de nuestros 
objetos. Estos atributos siempre serán sustantivos y pueden tener 
diferentes valores que harán referencia a nombres, tamaños, formas 
y estados.

Por ejemplo: el color del auto es verde o rojo (color es el atributo, 
verde y rojo son posibles valores para este atributo).

Los Comportamientos o métodos serán todas las operaciones de nuestros 
objetos que solemos llamar usando verbos o sustantivos y verbos. 
Por ejemplo: los métodos del objeto sesión pueden ser login(), 
logout(), makeReport(), etc.

3. """Abstracción: ¿Qué es una Clase?"""

La Abstracción se trata de analizar objetos de forma independiente, 
sus propiedades, características y comportamientos, para abstraer su 
composición y generar un modelo, lo que traducimos a código como clases.

Las Clases son los modelos sobre los cuales construimos nuestros 
objetos, es decir, las clases son los “moldes” que nos permiten generar 
objetos. Cada clase debe tener identidad (con un nombre de clase único 
usando Upper Camel Case), estado (con sus atributos) y comportamiento 
(con sus métodos y operaciones).

Por ejemplo:

El ejemplo de clase más típico en Internet:

Nombre de la clase: Person
Atributos: Name, Age
Operaciones: Walk()

4. """Modularidad"""

La Modularidad consiste en dividir nuestro programa en diferentes 
módulos de forma que puedan unirse o separarse sin romperse entre ellos 
o perder alguna funcionalidad.

La Modularidad en Programación Orientada a Objetos nos ayuda a:

Reutilizar código.
Evitar colapsos.
Que nuestro código sea mantenible.
Mejorar la legibilidad.
Resolución rápida de problemas.

5. """Creando nuestra primera Clase"""

Nuestro proyecto en este curso es construir un sistema que nos 
permita listar y agendar nuestras citas médicas, por lo que debemos 
crear algunas clases para cada integrante del sistema: doctores, 
pacientes, entre otras.

*Así vamos a crear nuestra primer clase con sus métodos y atributos:

// Clases:

public class Doctor {

  // Atributos:
  int id;
  String name;
  String speciality;

  // Comportamientos (métodos):
  public void showName() {
    // Instrucciones...
  }
}

*Declarar un Objeto:

// Tipo de Objeto ---- Nombre del Objeto
Doctor myDoctor;

// Otro objeto del mismo tipo Doctor:
Doctor anotherDoctor;

*Instanciar un Objeto:

// Nombre del Objeto ---- Clase base para crear algún tipo 
de objetos

myDoctor = new Doctor();

// Otro objeto
anotherDoctor = new Doctor();

*Declarar e instanciar un objeto en la misma línea:

// Declarar el objeto ---- Instanciar el objeto
Doctor myDoctor = new Doctor();

*Utilizar el objeto:

// Declarar el objeto ---- Instanciar el objeto
Doctor myDoctor = new Doctor();
myDoctor.name = "Anahí Salgado";
myDoctor.showName();

6. """Método constructor"""

El Método Constructor es el primer método que se ejecuta por defecto 
cuando creamos una clase, nos permite crear nuevas instancias de una 
clase. Lo invocamos con la palabra reservada new seguida del nombre 
con el que inicializamos la clase y paréntesis.

// nombreDeLaInstancia = new MétodoConstructor();
myDoctor = new Doctor();

El compilador de Java crea un método constructor en caso de que no 
definamos uno, pero de todas formas es muy buena idea programarlo 
nosotros, ya que nos permite definir y/o configurar el comportamiento 
de nuestros objetos usando argumentos.

public class Doctor {
  // Atributos...

  // Método Constructor:
  Doctor(// parámetros //) {
    // Instrucciones que se ejecutan al crear/instanciar
    // un nuevo objeto con la clase Doctor...
       }
  }

El método constructor no debe regresar ningún valor (no necesitamos 
un return). Más adelante estudiaremos un poco más a fondo cómo 
funcionan la sobrecarga de métodos y sobrecarga de constructores.

7. """Static: Variables y Métodos Estáticos"""

Los métodos y variables estáticos nos ayudan a ejecutar o conseguir 
algún código desde clases no han sido instanciadas, ya que sus valores 
se guardan en la memoria de nuestro programa, no en diferentes objetos 
instanciados a través de una clase.

Las variables estáticas mantienen su valor durante todo el ciclo de 
vida de nuestro programa, por lo tanto, podemos alterar los valores 
de una variable estática desde una clase y consumir su valor alterado 
desde otra sin necesidad de conectar ambas clases.

También podemos importar los métodos estáticos de una clase para 
usarlos sin necesidad de escribir el nombre de la clase:

import static com.anncode.operaciones.Calculadora.*
import static java.lang.Math.*

public class Principal {
  public static void (String[] args) {
    int number = suma(3, 5);
    System.out.println(number + PI);
  }
}

8. """Static: Variables y Métodos Estáticos"""

Los métodos y variables estáticos nos ayudan a ejecutar o conseguir 
algún código desde clases no han sido instanciadas, ya que sus valores 
se guardan en la memoria de nuestro programa, no en diferentes objetos 
instanciados a través de una clase.

Las variables estáticas mantienen su valor durante todo el ciclo de 
vida de nuestro programa, por lo tanto, podemos alterar los valores de 
una variable estática desde una clase y consumir su valor alterado desde 
otra sin necesidad de conectar ambas clases.

También podemos importar los métodos estáticos de una clase para usarlos 
sin necesidad de escribir el nombre de la clase:

import static com.anncode.operaciones.Calculadora.*
import static java.lang.Math.*

public class Principal {
  public static void (String[] args) {
    int number = suma(3, 5);
    System.out.println(number + PI);
  }
}

Creando un objeto de una clase:
clase objeto = new clase( );

Llamando al metodod de una clase:
objeto.metodo( );

"Metodo Static"

Cuando disponemos de smetodos de tipo estatico, podemos 
accesar a ellos llamandolos de la siguiente forma:
clase.metodo( );

Si al declarar la clase ademas poseemos variables de tipo estaticas, las
podemos usar de la siguiente forma:
clase.variable

Estos no arrojara el valor que definimos para dicha variable,
la ventaja es que este tipo de variables tiene alcance global, pueden ser 
usadas en cualquier parte de clase (Si estamos dentro de la misma clase la
llamamos solo con el nombre de la variable) y subclases de la clase asociada, 
ademas pueden ser llamadas por otras clases usando la misma nomenclatura 
(clase.variable) o a traves de la palabra reservada import. 

import static package.clase.*; (El * nos permite usar todos los metodos de la clase importada)
import static package.clase.variable;

9. """Creando elementos estáticos"""

En muchos casos nuestro código necesita ejecutar métodos que no 
necesariamente deben pertenecer a un objeto o instancia en concreto, 
ya que pueden ser muy generales (así como Math.Random) o los valores 
que almacenamos deben ser los mismos, sin importar si los consumimos 
desde una o más clases.

En todos estos casos vale la pena usar variables y métodos estáticos.

10. """Variable vs. Objeto: Un vistazo a la memoria"""

Un objeto es una referencia a un espacio en memoria. Cuando creamos 
objetos, Java los guarda en la memoria y nos devuelve coordenadas con 
las que podremos acceder a la información que almacenamos.

Existen dos tipos de memoria: Stack y Heap.

La memoria Stack es mucho más rápida y nos permite almacenar nuestra 
información de forma “ordenada”. Aquí se guardan las variables y sus 
valores de tipos de datos primitivos (booleanos, números, strings, entre 
otros).

Los objetos también usan la memoria Stack, pero no para guardar su 
información, sino para guardar las coordenadas a la verdadera ubicación 
del objeto en la memoria Heap, una memoria que nos permite guardar grandes 
antidades de información, pero con un poco menos de velocidad.
Ejemplo: si tengo dos objetos (objeto1 y objeto2) y asigno el objeto2 al 
objeto1 o (objeto1 = objeto2), lo que estoy haciendo es asignar la referencia
en memoria del objeto2 al objeto1, es decir cada vez que cambie un 
parametro del objeto 1 o 2 cambiaran automaticamente para ambos ya que 
la referencia en memoria de la ubicacion de los parametros de cada uno 
es la misma.

11. """Sobrecarga de métodos y constructores"""

A veces necesitamos que dos o más métodos de una misma clase tengan el mismo 
nombre, pero con diferentes argumentos o distintos tipos de argumentos/valores 
de retorno.

Afortunadamente, Java nos permite ejecutar código y métodos diferentes 
dependiendo de los argumentos que reciba nuestra clase.

public class Calculadora {
  // Los dos parámetros y el valor de retorno son de tipo int
  public int suma(int a, int b) {
    return a + b;
  }

  // Los dos parámetros y el valor de retorno son de tipo float
  public float suma(float a, float b) {
    return a + b;
  }

  // Un parámetro es de tipo int, mientras que el otro parámetro
  // y el valor de retorno son de tipo float
  public float suma(int a, float b) {
    return a + b;
  }
}
El uso más común de la sobrecarga de métodos es la sobrecarga de 
constructores para instanciar objetos de formas distintas dependiendo 
de la cantidad de argumentos que enviamos.

public class Doctor {
  static int id = 0;
  String name;
  String speciality;

  public Doctor() {
    this.name = "Nombre por defecto";
    this.speciality = "Especialidad por defecto";
  }

  public Doctor(String name, String speciality) {
    this.name = name;
    this.speciality = speciality;
  }
}

El metodo constructor se utiliza para definir los atributos minimos 
necesarios a la hora de crear o inicializar un objeto, es decir al 
asignar atributos o propiedades al metodo constructor, cada vez que 
necesitemos crear un objeto de esa clase al menos necesitaremos asignar 
valores a esos atributos como minimo para que el objeto pueda existir.


12. """Encapsulamiento: Modificadores de acceso
Los Modificadores de Acceso nos ayudan a limitar desde dónde podemos 
leer o modificar atributos especiales de nuestras clases. Podemos 
definir qué variables se pueden leer/editar por fuera de las clases 
donde fueron creadas. Esto lo conocemos como Encapsulamiento.

________________________________________________
Modificador | Clase | Package | Subclase | Otros
________________________________________________
public      |   √   |    √    |    √     |   √
________________________________________________
protected   |   √   |    √    |    √     |   X
________________________________________________
default     |   √   |    √    |    X     |   X
________________________________________________
private     |   √   |    X    |    X     |   X
________________________________________________


13. """Getters y Setters"""

Los Getters y Setters nos permiten leer y escribir (respectivamente) los 
valores de nuestras variables privadas desde fuera de la clase donde 
fueron creadas. Con los Getters obtenemos los datos de las variables y 
con los Setters asignamos o cambiamos su valor.

También puedes usar los atajos de tu IDE favorito para generar los métodos 
etters y setters de todas o algunas de tus variables.

public class Patient {
  private String name;

  public String getName() {
    return "Patient name is " + this.name;
  }

  public void setName(String newName) {
    this.name = newName;
  }
}

Los Getter y Setters nos van a ayudar a validar y mantener la consitencia
a la logica del negocio en nuestros modelos o en nuestras clases, es decir
a traves de estos metodos decidimos que tipo de informacion podra meter el
usuario en los campos de asignacion de variables, y ademas podremos informar
al usuario si la informacion suministrada cumple o no con los requerimientos
de dicha informacion (en caso de no serlo) para que puedan ser introducidos
correctamente. Asi nos aseguramos que la informacion suministrada por los 
usuarios siempre tenga una consistencia adecuada a la logica del negocio de
nuestra plataforma.

14. """Variable vs. Objeto"""

Las Variables son entidades elementales muy sencillas, pueden ser números, 
caracteres, booleanos, entre otras. Los Objetos son entidades complejas que 
pueden estar formadas por la agrupación de diferentes variables y métodos.

Los Objetos Primitivos o Clases Wrapper son variables primitivas que 
trabajan con algún tipo de dato y también tienen las características de 
los objetos.

Por ejemplo: Byte, Short, Integer, Long, Float, Double, Character, 
Boolean o String.

15. """Clases Anidadas"""

Las Clases Anidadas o Clases Helper son clases dentro de otras clases que 
agrupamos por su lógica y/o características en común.

Podemos encontrar clases estáticas anidadas, clases internas que son 
locales a un método o clases internas anónimas. Las clases anidadas pueden 
lamar a cualquier tipo de elemento o método de nuestras clases.

Las Clases Estáticas no necesitan ser instanciadas para poder ser 
llamadas y ejecutadas, aunque debes recordar que solo permiten llamar a 
los métodos estáticos de sus clases padre.

Para recorrer una coleccion he imprimir una lista de cada uno de sus elementos
usamos el siguiente modelo, en donde tendremos la lista vinculada a la clase
anidada.
for (Clase_Exterior.Clase_Anidada name_reference: object(de la clase exterior).getClase_Anidada()) {
    System.out.println(name_reference.getAtributo1() + " " + name_reference.getAtributo2());

16. """Enumerations"""

Los enumerations son tipos de datos muy especiales pues este, es el 
único en su tipo que sirve para declarar una colección de constantes, 
al ser así estaremos obligados a escribirlos con mayúsculas.

Usaremos enum cada vez que necesitemos representar un conjunto fijo 
de constantes. Por ejemplo los días de la semana.

Así podemos declarar un enumeration usando la palabra reservada enum.

public enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
	THURSDAY, FRIDAY, SATURDAY
}
Puedo crear referencias de enumerations de la siguiente forma:

Day day;
switch (day) {
	case MONDAY:
		System.out.println(“Mondays are good.”);
		break;
	case FRIDAY:
		System.out.println(“Fridays are nice”);
		break;
	case SATURDAY: case: SUNDAY:
		System.out.println(“Weekends are the best”);
		break;
	default:
		System.out.println(“Midweek are so-so”);
		break;

}
Y puedo llamar un valor del enumeration así:

Day.MONDAY;
Day.FRIDAY;
Day.SATURDAY
Los enumerations pueden tener atributos, métodos y constructores, 
como se muestra:

public enum Day {
  MONDAY("Lunes");
  TUESDAY("Jueves");
  FRIDAY("Viernes");
  SATURDAY("Sábado");
  SUNDAY("Domingo");

  private String spanish;
  private Day(String s) {
    spanish = s;
  }

  private String getSpanish() {
    return spanish;
  }
}
Y para utilizarlo lo podemos hacer así:

System.out.println(Day.MONDAY);
Imprimirá: MONDAY

System.out.println(Day.MONDAY.getSpanish());
Imprimirá: Lunes

17. """¿Qué es la Herencia? Don\'t repeat Yourself

Don’t repeat yourself (DRY) consiste en detectar cuando estamos 
repitiendo el mismo código una y otra vez para crear algún método 
o función que nos ayude a evitar estos repetidos.

Esta es una de las bases de la programación que siempre debemos 
tener en cuenta, ya que nos ayuda a reducir la dificultad de nuestro 
código para implementar cambios y/o mejoras en nuestra aplicación.

La Herencia consiste en crear nuevas clases a partir de otras clases, 
establecemos una relación padre e hijo entre nuestras clases. 
Es diferente a las clases anidadas, ya que, en vez de crear clases 
dentro de clases, le indicamos a nuestras subclases de qué superclase 
pueden heredar (extends) para reutilizar el código de algunos de sus 
métodos.

Recuerda que nuestras clases no pueden heredar de más de una clase.

public class SuperClass {
  // ...
}

public class SubClass extends SuperClass {
  // ...
}

18. """Super y This"""

Super indica que una variable o método es de la clase padre, la 
superclase de cual heredan nuestras subclases, solo la usamos cuando 
aplicamos herencia.

Además, podemos llamar al constructor de la clase padre desde sus 
diferentes subclases usando super(); y enviando los argumentos que 
sean necesarios.

Por otro lado, this nos permite especificar que nuestras variables 
están señalando a la misma clase donde estamos trabajando, ya sea una 
clase normal, anidada, subclase o superclase.

public class User {
  int age = 1;

  public int getAge() {
    return this.age;
  }
}

public class Doctor extends User {
  String speciality = "Dentist";

  Doctor() {
    super.getAge(); // 1
    this.getSpeciality(); // Dentist
  }

  public int getSpeciality() {
    return this.speciality;
  }
}

19. """Polimorfismo: Sobreescritura de Métodos"""

El Polimorfismo es una característica de la programación orientada 
a objetos que consiste en sobrescribir algunos métodos de la clase 
de la cual heredan nuestras subclases para asignar comportamientos 
diferentes.

Además de los métodos de las superclases, también podemos redefinir 
el comportamiento de los métodos que “heredan” todos nuestros objetos, 
así como .toString, hashCode, finalize, notify, entre otros.

La sobreescritura de constructores consiste en usar los miembros 
heredados de una supreclase pero con argumentos diferentes.

Recuerda que no podemos sobrescribir los métodos marcados como final 
o static.

20. """Polimorfismo: Sobreescribiendo el método toString"""

Posibilidad de sobreescribir un metodo con comportamientos
diferentes. En este caso al utilizar la sobreescritura de metodos
podremos sobreescribir un metodo de la clase padre y agregar otras
funcionalidades en las clases hijas, al agregar la palabra "super"
junto con el nombre del metodo (super.metodo()) podremos utilizar
la funcionalidad asociada a la clase padre e indexarla con la nueva
funcionalidad de la clase hija.

Ejemplo:
En la clase padre veriamos esto:
@Override
    public String toString() {
        return "User: " + name + ", Email: " + email +
                "\nAddress: " + address + ". Phone: " + phoneNumber;
    }

Y en la clase hija algo asi:
@Override
        public String toString() {
            return "Available Appointments: \nDate: " + date +
                    "\nTime: " + time;
        }

De esta manera al imprimir la informacion de un objeto de la clase
hija agregara primero todos los atributos que poseia originalmente 
en el metodo padre y posteriormente la nueva informacion perteneciente
a la clase hija.


21. """Interfaces"""

Las Interfaces son un tipo de referencia similar a una clase con solo 
constantes y definiciones de métodos, son de gran ayuda para definir 
los comportamientos que son redundantes y queremos reutilizar un más 
de una clase, incluso cuando tenemos muchas clases y no todas pertenecen 
a la misma “familia”.

Las interfaces establecen la forma de las clases que la implementan, 
así como sus nombres de métodos, listas de argumentos y listas de 
retorno, pero NO sus bloques de código, eso es responsabilidad de 
cada clase.

22. """Creando una interfaz para definir si una fecha es agendable"""

Composición de Interfaces en Clases: abstraer todos los 
métodos/comportamientos de una clase para modularizarlos (comprimirlos, 
encapsularlos) en una interfaz y reutilizar su código en diferentes clases.

Las interfaces se crean utilizando la palabra reservada interface y 
se implementan en nuestras clases con implements.

Recuerda que podemos heredar (implementar) más de una interfaz, pero 
no podemos hacerlo de las clases padres o superclases.

public interface ISchedulabe {
  void schedule(Date date, String Time);
}

public class AppointmentDoctor implements ISchedulable {
  @Override
  public void schedule(Date date, String Time) {
    // ...
  }
}

23. """Clases Abstractas"""

A veces NO necesitamos implementar todos los métodos de una clase 
heredada o interfaz. No siempre necesitamos crear instancias o implementar 
odos los métodos heredados de una clase padre, así como tampoco podremos 
necesitamos algún método de nuestras interfaces, pero estas nos obligan 
a escribir el código de todos los métodos que definimos genéricamente.

Afortunadamente, las Clases Abstractas resuelven todos estos problemas. 
Son una combinación entre interfaces y herencia donde no implementaremos 
todos los métodos ni tampoco crearemos instancias.

public abstract class Figura {
  // ...
}

class Triangulo extends Figura {
  // ...
}

24. """Miembros abstractos"""

Los Métodos Abstractos son los métodos que debemos implementar 
obligatoriamente cada vez que usemos nuestras clases abstractas, 
mientras que los métodos que no sean abstractos van a ser opcionales.

public abstract class Figura {
  abstract void dibujar(); // obligatorio
  void dibujar3D(); // no es obligatorio
}

class Triangulo extends Figura {
  void dibujar() {
    // Instrucciones para dibujar el triángulo...
  }
}
Recuerda los métodos abstractos solo se pueden implementar en clases 
abstractas. Y las clases abstractas no necesitan ser instanciadas 
para ser implementadas.

25. """Clases Anónimas"""

Las Clases Anónimas son una forma de instanciar clases abstractas 
sin necesidad de usar sus clases hijas. Pero este tipo de instanciación 
tiene algunas restricciones: el ciclo de vida de estas instancias NO es 
duradero, no las tendremos disponibles durante toda la ejecución del 
programa.

// Clase Abstracta:
public abstract class Figura {
  abstract void dibujar();
}

// Clase Anónima:
User user = new User() {
  @Override
  public void showDataUser() {
    // Instrucciones...
  }
};

26. """Diferencias entre las Interfaces y las Clases Abstractas"""

Clase Abstracta: Para definir una clase abstracta esta debera tener al
menos una clase hija, para que esta pueda reutilizar los metodos de la
clase padre(la clase que seria abstracta en este caso).
Este tipo de clase no se pueden instanciar, es decir no se podran crear
objetos de ella, unicamente a traves de sus clases hijas.
El comportamiento de la clases abstractas es lineal, es decir de padres
a hijas.

Interfaces: Estas estaran definidas a traves de metodos abstractos, que
a diferencia de las clases abstractas esta podra implementar los metodos
de una manera mas amplia, a todas las familias de clases, dejara de ser
lineal como en el caso de las clases abstractas. Las interfaces convienen
ser usados cuando requerimos implementar metodos que se comparten entre
familias es decir la relacion va mas alla de la herencia entre dos clases.

En las clases abstractas pensaremos mas en los objetos y en las interfaces
pensaremos mas en las acciones que pueden tener en comun muchos objetos

Una buena practica es que el diseño de tus aplicaciones este orientado a
interfaces y no a las implementaciones.
*Crear buenas abstraciones
*Comportamiento comun 
*Declaracion de metodos

27. """Interfaces en Java 8 y 9"""

Las Interfaces nos permiten usar métodos abstractos y campos constantes 
para implementar herencia/polimorfismo de forma muy similar a las clases 
abstractas.

A partir de Java 8 podemos tener implementación en métodos para heredar 
y reutilizar diferentes comportamientos. No todos los métodos de nuestras 
interfaces deben ser abstractos, ahora podemos usar el modificador de 
acceso default y desde Java 9 también private.

Recuerda que el nivel de acceso de default y private son los mismos que 
estudiamos en clases anteriores.

public interface MyInterface {
  // Métodos default: nos permite heredar la definición
  // de la función y también su implementación...
  default void defaultMethod() {
    privateMethod("Hello from the default method!");
  }

  // Métodos private: nos permiten definir comportamiento,
  // pero solo se puede usar desde otras clases de esta
  // interfaz, no se hereda a la clase hija....
  private void privateMethod(final String message) {
    System.out.println(message);
  }

  // Métodos abstractos: recuerda que todos los métodos
  // son abstractos por defecto...
  void normalMethod();
}

28. """Definiendo las citas disponibles"""

Algunas veces necesitamos trabajar las fechas como tipo de dato 
Date y otras veces como String. Para resolver esto podemos usar 
SimpleDateFormat.

SimpleDateFormat format = new SimpleDateFormat(pattern: "dd/MM/yyyy");

// Transformar fechas de formato String a Date:
this.date = format.parse(dateAsString);

// Transformar fechas de formato Date a String:
this.date = format.format(dateAsDate);

29. """Recorriendo estructuras de árbol en Java"""

Las estructuras de árbol pertenecen al grupo de estructuras de datos 
no lineales, es decir, donde toda la información es almacenada con un 
orden específico. En estas estructuras tenemos “troncos” principales 
con diferentes ramificaciones que surgen a partir de ellos. Son muy 
útiles para trabajar con grandes cantidades de datos organizados de 
forma jerárquica.

La forma de implementarlos en Java es usando un Map de tipo TreeMap. 
Recuerda que también podemos guardar Maps dentro de otros Maps. De 
esta forma podemos definir una lista ordenada de doctores y sus 
fechas disponibles para agendar citas médicas.

// 1. Doctor#1
// - - - Fecha#1
// - - - Fecha#2
// 2. Doctor#2
// - - - Fecha#1
// - - - Fecha#2
// 3. Doctor#3
// - - - Fecha#1
// - - - Fecha#2
Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();

*/


 



