import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {

        String[] nomesFila = new String[3];
        Scanner nome = new Scanner(System.in);
        nomesFila[0] = nome.next();
        nomesFila[1] = nome.next();
        nomesFila[2] = nome.next();
        System.out.println(nomesFila[0] + " - esta na posicao: 1");
        System.out.println(nomesFila[1] + " - esta na posicao: 2");
        System.out.println(nomesFila[2] + " - esta na posicao: 3");

    }
}