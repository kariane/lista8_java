import java.util.Scanner;
public class exercicio3_aula8Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Escreva um valor: ");
        int le=leitor.nextInt();
        System.out.println("Escreva outro valor: ");
        int le1=leitor.nextInt();
        System.out.println("Escreva um valor: ");
        int le2=leitor.nextInt();
        if (le>le1&&le1>le2){
            System.out.println("A ordem decrescente é:"+le+", "+le1+", "+le2);
        } else if (le>le2&&le2>le1){
                System.out.println("A ordem decrescente é:"+le+", "+le2+", "+le1);
        }else if (le2>le1&&le1>le){
                System.out.println("A ordem decrescente é:"+le2+", "+le1+", "+le);
        }else  if (le2>le&&le>le1){
                System.out.println("A ordem decrescente é:"+le2+", "+le+", "+le1);
        }else  if (le1>le2&&le2>le){
                System.out.println("A ordem decrescente é: "+le1+", "+le2+", "+le);
        }else if (le1>le&&le>le2){
                System.out.println("A ordem decrescente é: "+le1+", "+le+", "+le2);
        }
    }
 
}
