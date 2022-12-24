import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Digite sua idade");
         
        int idade1 = leitor.nextInt();
        int idade2 = leitor.nextInt();
        int idade3 = leitor.nextInt();
        
         int media = (idade1 + idade2 + idade3) / 3;
         
          if (media >= 0 && media <= 25){
            System.out.println("A turma é :Jovem");
            } 
            if (media >= 26 && media <= 60){
                System.out.println("A turma é :Adulta");
             }
             if (media >= 60){
                System.out.println("A turma é :Idosa");
             }
    }

    public static void Desafio2 (String[] args) {
        Scanner leitor = new Scanner(System.in);
    
        System.out.println("Em que turno você estuda?"+ "Digite: M-matutino ou V-Vespertino ou N- Noturno");
    
        char turno = leitor.next().toUpperCase().charAt(0);
    
        if (turno = M){
            System.out.println("Bom Dia!");
    
        }
    
    }
}
