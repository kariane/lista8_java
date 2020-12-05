/*1. Dirigir: >= 18 anosfiz
2. Beber: >= 18 anosfiz
3. Voto facultativo: >= 16 anos, < 18 anos e >= 70 anosfiz
4. Voto obrigatório: >= 18 anos e < 70 anos*/
import java.util.Scanner;
public class exercicio5_aula8Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.print("Digite sua idade:");
        int idade=leitor.nextInt();
        if(idade>=18){
            System.out.println("Você pode dirigir");
            System.out.println("Você pode beber");
        }else if(idade<18){
            System.out.println("Você não pode dirigir");
            System.out.println("Você não pode beber");
        }if(idade>=16&&idade<18||idade>=70){
             System.out.println("O voto de acordo com sua idade é facultativo");
        } if(idade>=18&&idade<70){
            System.out.println("O voto de acordo com sua idade é obrigatório");
        } if(idade<16){
               System.out.println("Você não pode votar");     
                    }
        
            }
    }