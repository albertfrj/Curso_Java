public class Ejemplo01_02 {
    public static void main(String[] args) {
        int numManzanas = Integer.valueOf(args[0]);
        int numPeras = Integer.valueOf(args[1]);
        int numFrutas = numManzanas + numPeras;
        System.out.println("el  frutero tiene "+numFrutas+"frutas.");

        int num;
        boolean largo;
        String apellido = "Garcia";
        num = 3;
        largo = apellido.length() > num;
        System.out.println(largo);


    }
}
