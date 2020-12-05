import java.util.Scanner;
public class exercicio1_aula8benza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
       
        System.out.println("True or false?");
        Boolean v1=leitor.nextBoolean();
        System.out.println("True or false?");
        Boolean v2=leitor.nextBoolean();   
        if(v1==v2){
            if (v1=true){
            System.out.println("Ambas são verdadeiras");
            }else
                System.out.println("Ambas são falsas");
        }
        if(v1!=v2){
            if (v1=true){
                System.out.println("Apenas a primeira é verdadeira");
            } else if(v2=true)
                System.out.println("Apenas a segunda é verdadeira");
        }
        
    }
  
}
