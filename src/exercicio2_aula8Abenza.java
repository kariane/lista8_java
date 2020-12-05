import java.util.Scanner;
public class exercicio2_aula8Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Valor do produto?");
        float num=leitor.nextFloat();
        System.out.println("==MÉTODOS DE PAGAMENTO==\n1 - À vista em dinheiro ou cheque, recebe 10% de desconto\n" +
"2 - À vista no cartão de crédito, recebe 15% de desconto\n" +
"3 - Em duas vezes, preço normal de etiqueta sem juros\n" +
"4 - Em duas vezes, preço normal de etiqueta mais juros de 10%");
        int num1=leitor.nextInt();
        float in=  (float) (num*0.1);
        float in2= (float) (num*0.15);
        float vista= num-in;
        float vi= num-in2;
        float du=num/2;
        float du2=num+in2;
        float du3= du2/2;
        switch(num1){
            case 1:
                System.out.println("Método escolhido: À vista em dinheiro ou cheque, recebe 10% de desconto"
                        + "\nValor total: "+ vista);
                break;
            case 2:
                System.out.println("Método escolhido: À vista no cartão de crédito, recebe 15% de desconto"
                        + "\nValor total: "+ vi);
                break;
            case 3:
                System.out.println("Método escolhido: Em duas vezes, preço normal de etiqueta sem juros"
                        + "\nValor total: "+num+"\nCada parcela: "+du);
                break;
            case 4: 
                System.out.println("Método escolhido:  Em duas vezes, preço normal de etiqueta mais juros de 10%"
                        + "\nValor total:"+du2+"\nCada parcela: "+du3);
        }
    }
}
