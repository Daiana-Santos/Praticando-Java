import java.util.Scanner;

public class Funcao {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quer ver o fatorial de qual número? ");
        int numerofator = teclado.nextInt();
        Fatorial fator = new Fatorial();
        fator.setValor(numerofator);
        System.out.print(fator.getFormula());
        System.out.println(fator.getFatorial());
       
        
    }
}
