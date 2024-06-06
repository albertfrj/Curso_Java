package Unit2;
public class Ejercicio2_4 {
    public static void main(String[] args){
        String apellido1 = String.valueOf(args[0]);
        String apellido2 = String.valueOf(args[1]);
        String nombreHijo1 = String.valueOf(args[2]);
        String nombreHijo2 = String.valueOf(args[3]);
        String nombreHijo3 = String.valueOf(args[4]);
        String nombrePadre = String.valueOf(args[5]);
        String nombreMadre = String.valueOf(args[6]);

        System.out.println("Padre: "+nombrePadre+" "+apellido1+" \nMadre: " + nombreMadre +" "+ apellido2+"\nHijos:\n"+nombreHijo1+" "+ apellido1+" "+ apellido2+ "\n"+nombreHijo2+" "+ apellido1+" "+ apellido2+ "\n"+nombreHijo3+" "+ apellido1+" "+ apellido2);
    }
}
