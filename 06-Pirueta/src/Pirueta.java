import java.util.Scanner;

public class Pirueta {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantas pirueta o programa deve contar? ");
        int numero = teclado.nextInt();
        int cc = 1;
        do {
            System.out.println(cc + " Pirueta ");
            cc++;
        }while (cc<= numero);
        System.out.println("Bravo! Bravo!");
    }
}
