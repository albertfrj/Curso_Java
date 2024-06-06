public class Ejemplo01_03{
    public static void main (String[] args){
        int numClentesJuan = 5;
        int numClientesMaria = 10;
        int numClientesTotal = suma(numClentesJuan, numClientesMaria);
        
        System.out.println("La suma de clientes total es "+ numClientesTotal);
    }
    private static int suma(int a, int b) {
        return a+b;
    }
}