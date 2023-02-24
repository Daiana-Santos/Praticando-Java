import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        System.out.print("O programa deve contar até qual número? ");
        int numero = teclado.nextInt();
        System.out.println("Contando...");
        int contador = 1;
        while (contador <= numero){
            System.out.print(+contador+" ");
            contador++;
        }    
    }
}
