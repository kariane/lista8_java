import java.util.Scanner;
public class exercicio8_aula8Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Informe um número de 0 a 11, para que possamos informar os proximos meses ");
        int v1=leitor.nextInt();
        switch(v1){
             case 0:
                 System.out.println("Os proximos meses serão:Janeiro, Fevereiro, Março, Abril, Maio, Junho, Julho, Agosto, Setembro, Outubro, Novembro, Dezembro");
                 break;
             case 1:
                 System.out.println("Os proximos meses serão:Fevereiro, Março, Abril, Maio, Junho, Julho, Agosto, Setembro, Outubro, Novembro, Dezembro");
                 break;
             case 2:
                 System.out.println("Os proximos meses serão:Março, Abril, Maio, Junho, Julho, Agosto, Setembro, Outubro, Novembro, Dezembro");
                 break;
             case 3:
                 System.out.println("Os proximos meses serão:Abril, Maio, Junho, Julho, Agosto, Setembro, Outubro, Novembro, Dezembro");
                 break;
             case 4:
                 System.out.println("Os proximos meses serão:Maio, Junho, Julho, Agosto, Setembro, Outubro, Novembro, Dezembro");
                 break;
             case 5:
                 System.out.println("Os proximos meses serão:Junho, Julho, Agosto, Setembro, Outubro, Novembro, Dezembro");
                 break;
             case 6:
                 System.out.println("Os proximos meses serão:Julho, Agosto, Setembro, Outubro, Novembro, Dezembro");
                 break;
             case 7:
                 System.out.println("Os proximos meses serão:Agosto, Setembro, Outubro, Novembro, Dezembro");
                 break;
             case 8:
                 System.out.println("Os proximos meses serão:Setembro, Outubro, Novembro, Dezembro");
                 break;
             case 9:
                 System.out.println("Os proximos meses serão:Outubro, Novembro, Dezembro");
                 break;
             case 10:
                 System.out.println("Os proximos meses serão:Novembro, Dezembro");
                 break;
             case 11:
                 System.out.println("Os proximos meses será: Dezembro ");
         }
    }}