package dio_desafios_java;
import java.util.Scanner;

public class mesadaSobrinho {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;
        
        int resultado = entrada * mesada;
        System.out.println(resultado);
        
        leitor.close(); /*Comando responsável por fechar o Scanner aberto anteriormente*/
	}
}
