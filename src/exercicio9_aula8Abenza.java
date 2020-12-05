import java.util.Scanner;
public class exercicio9_aula8Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Escreva uma palavra:");
        String pa=leitor.nextLine();
        int tamanho=pa.length();
        System.out.println("O tamanho desta palavra é: "+tamanho);
    }
  
}
