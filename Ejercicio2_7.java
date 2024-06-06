public class Ejercicio2_7 {

    public static void main (String[] args){
        String nombre = String.valueOf(args[0]);
        String apellido1 = String.valueOf(args[1]);
        String apellido2 = String.valueOf(args[2]);
        String nombreCompleto = construyeNombreCompleto(nombre, apellido1, apellido2);
        pintarNombre(nombreCompleto);

    }
    
    private static String construyeNombreCompleto(String nombre, String apellido1, String apellido2){
        String nombreCompleto = (nombre + " " + apellido1 + " " + apellido2);
        return nombreCompleto;
        
    }

    private static void pintarNombre(String nombreCompleto){
        System.out.println("El nombre completo es: "+nombreCompleto);
    }
}