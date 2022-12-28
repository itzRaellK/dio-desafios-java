package dio_desafios_java;
import java.util.Scanner;

public class salvandoMusicas {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();
        
        String mp3 = ".mp3";
        
        if(arquivoDoPc.contains(mp3.substring(1))) {
          System.out.println("Salvar");
        } else {
          System.out.println("Deletar");
        }
        
        leitor.close();
    }
}
