class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        UberX uberX = new UberX ("AMQ123", new Account("Andres Herrera ", "AND123"), "Chevrolet", "Spark");
        uberX.setPasseger(4);
        uberX.printDataCar();

        UberX uberX2 = new UberX ("QWE567", new Account("Andrea Ferrara ", "ANDA876"), "Ford", "Focus");
        uberX2.setPasseger(3);
        uberX2.printDataCar();
        

    }    
    
}