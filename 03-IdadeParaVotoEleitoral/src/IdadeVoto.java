import java.util.Scanner;
import java.util.Calendar;

public class IdadeVoto {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
       System.out.println("Informe o ano de nascimento: ");
       int ano_nascimento = Integer.parseInt(teclado.nextLine());
       
       Calendar cal = Calendar.getInstance();
       int ano_atual = cal.get(Calendar.YEAR);
       int idade = ano_atual - ano_nascimento;
       
       System.out.println("Você tem " + idade + " anos de idade." );
       System.out.println("Portanto...");
       
       if (idade <16){
           System.out.println("NÃO VOTA!");
       }else{
           if((idade >=16 && idade <18)||(idade >70)){
           System.out.println("O voto é OPCIONAL!");
       }else{
            System.out.println("O voto é OBRIGATÓRIO!");   
               }
       }
    }
}
