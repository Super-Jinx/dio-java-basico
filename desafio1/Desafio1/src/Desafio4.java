import java.util.*;
 
public class Desafio4{

public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
		
    int M = input.nextInt();
    int S = input.nextInt();  
    
    int desconto = ((M-S)*100/M); 


    System.out.println("O desconto foi de " +  desconto + "%");
  
}
}