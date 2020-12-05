import java.util.Scanner;
public class exercicio7_aula8Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Informe um valor: ");
        float v1=leitor.nextFloat();
        System.out.println("Informe outro valor:");
         float v2=leitor.nextFloat();
         System.out.println("Operações possíveis:\n1 – Somar,\n 2 –" +
"Subtrair,\n 3 – Múltiplicar,\n 4 – Dividir e\n 5 – Sair\nQual operação deseja?");
         int op=leitor.nextInt();
        float somar=v1+v2;
        float sub=v1-v2;
        float mul=v1*v2;
        float divi=v1/v2;
         switch(op){
             case 1:
                 System.out.println("De acordo com a opção escolhida, o resultado é: "+somar);
                 break;
             case 2:
                 System.out.println("De acordo com a opção escolhida, o resultado é: "+sub);
                 break;
             case 3:
                 System.out.println("De acordo com a opção escolhida, o resultado é: "+ mul);
                 break;
             case 4:
                 System.out.println("De acordo com a opção escolhida, o resultado é: "+divi);
                 break;
             case 5:
                 System.out.println("De acordo com a opção escolhida, você está saindo.");
         }
    }}
        
