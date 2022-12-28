package dio_desafios_java;

import java.util.Scanner;

public class downloadPacotes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();
        
        String barra = "/";
        String barraDownload = barra.repeat(tamanho);
        
        System.out.println(barraDownload);
        
        leitor.close();
    }
}
