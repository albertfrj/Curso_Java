package Unit3;
public class Ejemplo03_01 {
    public static void main (String[] args){
        int temp = Integer.valueOf(args[0]);
        if (temp > 0){
            System.out.println("La temperatura es de "+temp+ "C positivos");
        } else {
            System.out.println("La temperatura es de "+temp+ "C bajo 0");
        }
    }
}
