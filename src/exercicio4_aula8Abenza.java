import java.util.Scanner;
public class exercicio4_aula8Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite um número, podendo ser positivo ou negativo:");
        float num=leitor.nextFloat();
        System.out.println("Digite outro número, podendo ser positivo ou negativo:");
        float num2=leitor.nextFloat();
        if (num>0 &&num2>0){
        float soma=num+num2; 
            System.out.println("Estes números foram somados e o resultado é: "+soma);
        }else if(num<0 && num2<0){
             float sub=num+num2; 
            System.out.println("Estes números foram subtraidos e o resultado é: "+sub);
        }else if (num<0 && num2>0 || num>0 && num2<0){
            float multi=num*num2; 
            System.out.println("Estes números foram mutiplicados e o resultado é: "+multi);
        }else{
            System.out.println("Inválido");  
        }
    }
}
