import java.util.Scanner;
public class exercicio12_aula8Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Escreva uma palavra ou frase: ");
        String pala=leitor.nextLine();
        System.out.println("Palavra escrita com todas as letras maiúsculas: "+ pala.substring(0,1).toUpperCase()+pala.substring(1));
        
    }
}
