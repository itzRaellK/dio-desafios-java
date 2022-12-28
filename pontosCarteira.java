package dio_desafios_java;
import java.util.Scanner;

public class pontosCarteira {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();
        
        String comPontos = " multas. Levou pontos na carteira";
        String semPontos = " multas. Nao levou pontos na carteira";
        
        if(velocidade > 80){
          multas++;
          if(multas >= 3) {
            System.out.println(multas + comPontos);
          } else {
            System.out.println(multas + semPontos);
          }
        } else if (velocidade <= 80) {
            System.out.println(multas + semPontos);
          }
        
        leitor.close();
    }
}
