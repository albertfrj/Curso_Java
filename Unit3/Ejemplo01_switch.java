package Unit3;
public class Ejemplo01_switch {
    public static void main(String[] args) {
        int numLados = Integer.valueOf(args[0]);
        String figura = "indefinida";
        switch (numLados){
            case 3:
                figura = "triangulo";
                break;
            case 1:
                figura = "linea";
                break;
            case 4:
                figura = "cuadrado";
        }
        System.out.println("La figura es "+figura);
    }
}
