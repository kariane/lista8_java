import java.util.Scanner;
public class exercicio10_aula8Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Escreva uma palavra:");
        String pa=leitor.nextLine();
        System.out.println("A primeira letra desta palavra é: "+pa.substring(0, 1));
    }
  
}
