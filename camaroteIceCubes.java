package dio_desafios_java;
import java.util.Scanner;

public class camaroteIceCubes {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;
        int i;
        
        for (i = 0; i < tamanhoDaFila; i++) {
        	if (tamanhoDaFila % 2 == 1) {
        		pessoasNoCamarote = (tamanhoDaFila / 2) + 1;
        	} else {
        		pessoasNoCamarote = tamanhoDaFila / 2;
        	}
        }
        
        System.out.println(pessoasNoCamarote + " pessoas no camarote");
        
        leitor.close();
    }
}
