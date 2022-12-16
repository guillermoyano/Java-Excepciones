package excepciones.ejercicios.pkg06.en.adelante;

import Entidad.Prueba;

public class ExcepcionesEjercicios06EnAdelante {

    public static void main(String[] args) {

        Prueba p = new Prueba();

        try {
            System.out.println(p.metodo());
        } catch (Exception e) {
            System.out.println("Excepcion en metodo() - jjjjjjjjjjjj");
            System.out.println("");
            System.out.println("Andapayabobo");
            System.out.println("");
            System.err.println("Excepcion en metodo() ");
            e.printStackTrace();
        }
    }
}
