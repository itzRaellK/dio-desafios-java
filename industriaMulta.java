package dio_desafios_java;
import java.util.Scanner;

public class industriaMulta {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();
        
        if(velocidadeAtual > 60) {
          System.out.println("Foi multado");
        } else {
          System.out.println("Nao foi multado");
        }
        
        leitor.close();
    }
}
