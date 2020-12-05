import java.util.Scanner;
public class exercicio14_aula8Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Escreva uma frase: ");
        String frase=leitor.nextLine();
        System.out.println("Escreva uma palavra desta frase:");
        String pala=leitor.nextLine();
        System.out.println("Escreva uma palavra para substituir a anterior dentro da frase");
        String pa=leitor.nextLine();
        System.out.println("A nova frase será: "+frase.replace(pala, pa));
        
    }
}
