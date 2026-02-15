
// Crear un programa que utilice estructuras de control para resolver un problema sencillo
// Como una calculadora basica que realice operaciones de suma, resta, multiplicación y division.

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        char operacion;

        System.out.println("Introduzca el primer numero");
        num1 = scanner.nextDouble();

        System.out.println("Introduzca la operacion");
        operacion = scanner.next().charAt(0);

        System.out.println("Introduzca el segundo numero");
        num2 = scanner.nextDouble();

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                System.out.println("El resultado es:" + resultado);
                break;
                case '-':
                resultado = num1 - num2;
                System.out.println("El resultado es:" + resultado);
                break;
                case '*':
                resultado = num1 * num2;
                System.out.println("El resultado es:" + resultado);
                break;
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("El resultado es:" + resultado);
                    } else {
                        System.out.println("No se puede dividir por cero");
                    }                
                break;                  
            default:
                break;

            
        }
        scanner.close();
       
    }

}