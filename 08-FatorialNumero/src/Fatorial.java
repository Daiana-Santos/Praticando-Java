public class Fatorial {
    
    private int numero = 0;
    private int fat = 1;
    private String formula = "";
    //método que não retorna valor pois tem void
     public void setValor(int n){
        numero = n;
        int f = 1;
        String s = "";
        for(int contador = n; contador > 1;contador --){
            f *= contador;
            s += contador + " x ";
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }//método que retorna valor
     public int getFatorial(){
        return fat;
    }//método que retorna valor
     public String getFormula(){
        return formula;
     }     
}
