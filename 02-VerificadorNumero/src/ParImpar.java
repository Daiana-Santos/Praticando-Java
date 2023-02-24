import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite um número:");
        int numero = teclado.nextInt();
        System.out.println("O número digitado é...");
        if (numero % 2 == 0){
            System.out.println("->-> PAR ");
        }else{
            System.out.println("->-> IMPAR ");
        }
    }
}
