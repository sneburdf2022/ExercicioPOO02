import java.util.Random;
public class Dado {

    private int _qtdFaces = 3;
    public Dado(int QuantidadeFaces){
        this._qtdFaces = QuantidadeFaces;
    }
    public void RolarDados() {
        Random rolar = new Random();
        System.out.println("Você jogou os dados e obteve o número: ");
        int saida = 0;
        int i = 0;
        while(i == 0){
            saida = rolar.nextInt(_qtdFaces);
            if(saida > 0 && saida <= _qtdFaces){
                i++;
            }else{
                i=0;
            }

        }
        System.out.println("****   " + saida + "   ****");
    }
    
    
}