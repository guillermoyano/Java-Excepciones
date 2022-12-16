package Entidad;

public class Prueba {

    public static int metodo() {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;
            System.out.println("Valor final del try :" + valor);
        } catch (Exception e) {
            valor = valor + Integer.parseInt("W");
            System.out.println("Valor final del catch  : " + valor);
//        }catch (NumberFormatException e){
//            System.out.println("Rompimo todo rompimoooooo");
//            valor = 1;
        }finally {
            valor = valor + 1;
            System.out.println("Valor final del finally:" + valor);
        }
        valor = valor + 1;
        System.out.println("Valor antes del return:" + valor);
        
        
        return valor;
    }
}
