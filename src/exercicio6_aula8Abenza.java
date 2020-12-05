import java.util.Scanner;
public class exercicio6_aula8Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("==MENU==\n1. Cadastro\n" +
"2. Consulta\n" +
"3. Sair");
        System.out.println("Escolha a opção desejada: ");
        int deci=leitor.nextInt();
            if (deci==1){ 
                System.out.println("Opção escolhida: Cadastro\nVocê está no Cadastro");
            }else if (deci==2){
                System.out.println("Opção escolhida: Consulta\nVocê está na Consulta");
            }else if(deci==3) {
                System.out.println("Opção escolhida: Sair\nSaindo");
            } else {
                System.out.println("Opção inválida");
            }
    }}
