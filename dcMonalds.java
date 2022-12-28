package dio_desafios_java;
import java.util.Scanner;

public class dcMonalds {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = ingredientes.split(";");
        
        for(String saida : listaIngredientes) {
        	System.out.println(saida);
        }
        
        leitor.close();
    }
}