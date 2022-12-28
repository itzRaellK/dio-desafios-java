package dio_desafios_java;
import java.util.Scanner;

public class lojinhaDoces {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int valor = leitor.nextInt();
        
        int quantidadeDoces = valor * 2;
        System.out.println("O cliente obteve " + quantidadeDoces + " doces");
        
        leitor.close();
    }
}
