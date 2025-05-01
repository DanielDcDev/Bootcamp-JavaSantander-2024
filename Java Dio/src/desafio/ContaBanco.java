package desafio;

import java.util.Scanner;

public class ContaBanco{
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

    System.out.println("Ola Bom dia, gostaria de criar a sua conta, poderia por obsequio me dizer o teu nome :");
        String nome =scan.next();
    System.out.println("Okay, poderia agora me dizer o vosso numero?");
        int numero = scan.nextInt();
    System.out.println("Perfeito, poderia me informar a vossa agencia?");
        String agencia = scan.next();
    System.out.println("Perfeito, poderia me informar o vosso saldo?");
       Double saldo = scan.nextDouble();

        System.out.println("Aqui estao as informacoes da sua conta.\n nome: "+nome+"\nnumero:" +numero+"\nagencia:"+agencia+"\\nsaldo: RS "+saldo);

    }
}
