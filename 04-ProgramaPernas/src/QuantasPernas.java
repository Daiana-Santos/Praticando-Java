import java.util.Scanner;
public class QuantasPernas {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas pernas? ");
        int perna = teclado.nextInt();
        String tipo;
        System.out.println("Isto é um...");
        switch (perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;         
        }
        
        System.out.println(tipo);
    }
}
