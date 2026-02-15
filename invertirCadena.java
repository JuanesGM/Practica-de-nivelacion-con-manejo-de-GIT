
//  Escribir un programa que invierta una cadena de texto ingresada por el usuario.

import java.util.Scanner;

public class invertirCadena {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String texto = scanner.nextLine();

        String invertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }

        System.out.println("Cadena invertida: " + invertido);

        scanner.close();
    }
}