package Unit3;
public class Ejemplo03_02 { 
    private static final int TEMP_FRIO = 15;
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
        return temp <= TEMP_FRIO; 
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

/*Reglas de nombrado 
 * nombreMetodo() -----> Camel Case iniciando en minuscula
 * nombreVariable
 * NombreClase----> CamelCase iniciando en mayuscula
 * NOMBRE_CONSTANTE-----> Todo en mayuscula separado por guion bajo 
 */