import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int cantidad_xiaomi = 0;
        int cantidad_iphone = 0;
        int cantidad_samsung = 0;
        for (int index = 1; index <= 20; index++) {
            int opcion = 0;
            System.out.println(
                    "Selccione el producto que desea comprar: 1) Xiaomi 18 Fold. 2) Iphone Duo. 3) Samsung Fold 8");
            System.out.print("Escriba la opción: ");
            opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.println("Gracias por comprar el Xiaomi");
                cantidad_xiaomi++;
            } else if (opcion == 2) {
                System.out.println("Gracuas por comprar el Iphone");
                cantidad_iphone++;

            } else if (opcion == 3) {
                System.out.println("Gracias por comprar el Samsung");
                cantidad_samsung++;

            } else {
                System.out.println("No contamos con esa refrencia");
            }
        }
        System.out.println("La cantidad vendida de Xiaomi 18 Fold es: " + cantidad_xiaomi);
        System.out.println("La cantidad vendida de Xiaomi 18 Fold es: " + cantidad_iphone);
        System.out.println("La cantidad vendida de Xiaomi 18 Fold es: " + cantidad_samsung);

        sc.close();
    }
}
