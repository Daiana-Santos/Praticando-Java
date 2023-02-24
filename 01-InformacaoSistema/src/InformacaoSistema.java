import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Locale;
import java.util.Date;

public class InformacaoSistema {
    public static void main(String[] args) throws Exception {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("O tamanho da sua tela é: "+ d.width + " x " + d.height);
        
        Locale loc = Locale.getDefault();
        String idioma = loc.getDisplayLanguage();
        System.out.println("O idioma do seu sistema é: " + idioma);
        
        Date relogio = new Date();
        System.out.println("A data e hora do sistema são: ");
        System.out.println(relogio.toString());
    }
}
