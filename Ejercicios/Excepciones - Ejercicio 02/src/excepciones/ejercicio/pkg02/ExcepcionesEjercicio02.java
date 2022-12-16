/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
*/
package excepciones.ejercicio.pkg02;

public class ExcepcionesEjercicio02 {

    public static void main(String[] args) {
        
        String nombres [] = {"Messi", "Di María", "De Paul", "Dibu"};
        
        try{
            System.out.println("El jugador que la rompió ayer contra Croacia es: " +nombres[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Ese jugador ni siquiera estaba en la lista");
        }
    }

}
