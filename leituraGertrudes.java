package dio_desafios_java;
import java.util.Scanner;

public class leituraGertrudes {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        
        int quantosDias = paginas / paginasLidas;
        System.out.println(quantosDias + " dias");
        
        leitor.close();
    }
}
