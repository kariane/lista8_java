import java.util.Scanner;
public class exercicio13_aula8Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Escreva uma palavra ou frase: ");
        String pala=leitor.nextLine();
        System.out.println("Palavra escrita com todas as letras maiúsculas: "+ pala.toUpperCase());
        System.out.println("Palavra escrita com todas as letras minúsculas: "+ pala.toLowerCase());
    }
}
