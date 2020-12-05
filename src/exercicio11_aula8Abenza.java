import java.util.Scanner;
public class exercicio11_aula8Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Escreva uma palavra:");
        String pa=leitor.nextLine();
        System.out.println("A última letra desta palavra é: "+pa.substring(pa.length()-1));
    }
}
