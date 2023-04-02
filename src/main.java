import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
//        sn.useDelimiter("\n");

//        String numeros = "1234567890";
        int dia = 14;
        int cifrado = 4;
        int numero = 0;
        int opcion = 0;

        do {

            System.out.println("---------------------------------");
            System.out.println("|         Menú Principal        |");
            System.out.println("---------------------------------");
            System.out.println("| 1.- Codificar                 |");
            System.out.println("| 2.- Decodificar               |");
            System.out.println("| 3.- Salir                     |");
            System.out.println("---------------------------------");
            System.out.println("|          Opción: [ ]          |");
            System.out.println("---------------------------------");

            System.out.println("Escoja su opcion");
            opcion = teclado.nextInt();

            if(opcion == 1){

                for (int i = 0; i <= 24; i++) {
                    System.out.println(" ");
                }

                System.out.println("Dame un numero");
                numero = input.nextInt();

                codificar(numero, dia, cifrado);
            } else if(opcion == 2){

                for (int i = 0; i <= 24; i++) {
                    System.out.println(" ");
                }

                System.out.println("Dame un numero");
                numero = input.nextInt();

                decodificar(numero, dia, cifrado);
            }else if(opcion < 1 || opcion > 3){

                for (int i = 0; i <= 24; i++) {
                    System.out.println(" ");
                }
                System.out.println("Ingrese una opcion valida");

            }
        }

        while(opcion != 3);
    }

    public static void codificar(int numero, int dia, int cifrado){

        numero = (numero * dia) + cifrado;
        System.out.println("Tu numero codificado es: " + numero);

    }

    public static void decodificar(int numero, int dia, int cifrado){

        numero = (numero - cifrado) / dia;
        System.out.println("Tu numero decodificado es: " + numero);

    }

}
