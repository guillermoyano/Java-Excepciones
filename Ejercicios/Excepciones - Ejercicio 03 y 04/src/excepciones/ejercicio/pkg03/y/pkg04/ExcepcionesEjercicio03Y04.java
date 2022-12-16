/*
3- Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.

4- Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
*/
package excepciones.ejercicio.pkg03.y.pkg04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionesEjercicio03Y04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
        
     try{
         int a = leer.nextInt();
         String b = leer.next();
         
         int c = a;
         int d = Integer.parseInt(b);
         
         System.out.println("El resultado de la división es: " +(c/d));
     }catch (InputMismatchException e){
         System.out.println("Error de imputación");
     }catch (NumberFormatException e){
         System.out.println("Error de formato");
     }catch (ArithmeticException e){
         System.out.println("No se puede dividir por cero");
     }
               
    }
}
