public class Ejemplo03_02Mal { 
    public static void main(String[] args) {
        int temp = Integer.valueOf(args[0]); 
        if (haceFrio(temp)) {
            ponerCalefaccion(); 
            abrigarse(); 
            }
            else if (haceFrio(temp)== false){
                quitarChaqueta();
            }
        } 
    private static boolean haceFrio(int temp) { 
        return temp <= 15; 
    }
    private static void ponerCalefaccion() { 
        System.out.println("Calefacción a tope!!"); 
    }
    private static void abrigarse() { 
        System.out.println("¿Dónde está mi batamanta?"); 
    }
    private static void quitarChaqueta(){
        System.out.println("Quetarse abrigo");
    } 
}
