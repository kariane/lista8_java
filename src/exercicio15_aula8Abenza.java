import java.util.Scanner;
public class exercicio15_aula8Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Escreva um frase: ");
        String fra=leitor.nextLine();
        System.out.println("Escreva uma palavra, podendo estar na frase anterior ou não:");
        String pala=leitor.nextLine();
        System.out.println("Palavra escrita com todas as letras maiúsculas: "+fra.toLowerCase().contains(pala.toLowerCase()));
        
    }
}

