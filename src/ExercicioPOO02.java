import java.util.Scanner;
public class ExercicioPOO02 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        String comando = "sim";
        while(comando.equals("sim")){
        System.out.println("Digite a quantidades de lados do dado");
        int faces = ler.nextInt();
        Dado dado = new Dado(faces);
        dado.RolarDados();
        System.out.println("Gostaria de jogar outra vez?(sim/não)");
        comando = ler.next();
        }
        ler.close();
    }
    
}

