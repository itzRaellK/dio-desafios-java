package dio_desafios_java;
import java.util.Scanner;

public class imoveisDisponiveis {

	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        String[] textoSeparado = frase.split("/");
        
        String imovel = textoSeparado[0];
        String aluguel = textoSeparado[1];
        String disponibilidade = textoSeparado[2];
        
        String saidaFormatada = String.format("Imovel: %s R$%s %s", imovel, aluguel, disponibilidade);
        
        System.out.println(saidaFormatada);
        leitor.close();
    }
}