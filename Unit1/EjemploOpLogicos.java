package Unit1;
public class EjemploOpLogicos {
    public static void main(String[] args) {
        System.out.println("1) AND = " + (siempreCierto() && siempreFalso() ));
        System.out.println("2) AND2 = " + (siempreFalso() && siempreCierto()));
        System.out.println("3) OR = " + (siempreFalso() || siempreCierto()));
        System.err.println("4) OR2 = "+ (siempreCierto() || siempreFalso()));
    }
    private static boolean siempreCierto(){
        System.out.println("SiempreCierto()");
        return true;
    }    
    private static boolean siempreFalso(){
        System.err.println("siempreFalso()");
        return false;
    }
}
