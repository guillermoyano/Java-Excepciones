/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package excepciones.ejercicio.pkg05;

import java.util.InputMismatchException;
import java.util.Scanner;
import xecion.PersonalException;

public class ExcepcionesEjercicio05 {

    public static void main(String[] args) throws PersonalException{

        int aleatorio = (int) (Math.random() * 500) + 1;
        try{
            metodo(aleatorio);
        }catch (Exception e){
//            e.printStackTrace();
            throw new PersonalException ("");
            
        }
        

    }

    public static void metodo(int aleatorio) {
        int numero = 0, contador = 0;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("El número aleatorio es: " + aleatorio);
        System.out.println("");

        do {

//            try {
                System.out.println("Ingrese un número entre 1 y 500");
                numero = leer.nextInt();
                if (numero > aleatorio) {
                    System.out.println("El número aleatorio es menor. Volvé a intentar");
                } else if (numero < aleatorio) {
                    System.out.println("El número aleatorio es mayor. Volvé a intentar");
                } else if (numero == aleatorio) {
                    System.out.println("Seeeeeeeeeeeeeeeeeeeeeee. Al finnnn payaso");
                }
//            } catch (InputMismatchException e) {
//                System.out.println("Pastenaca, te dije un número.");
//                leer.nextLine();
//            }

        } while (numero != aleatorio);

        System.out.println("");
        System.out.println("Finalizado");
    }

}
