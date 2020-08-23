import com.jesus.model.Interfaz2;

public class Main {
    public static void main(String[] args) {
        Interfaz2 interfaz2 = (interfaz1, param2) -> {
            interfaz1.funct1(param2 + " Did it!");
        };

        interfaz2.funct2(param1 -> {
            System.out.println("Available Button!.... " + param1);}, "Clicking! Clicking! .....");
    }
}
