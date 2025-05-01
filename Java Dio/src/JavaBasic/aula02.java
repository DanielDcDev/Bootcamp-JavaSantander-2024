package JavaBasic;

public class aula02 {
    public static void main(String[] args) {


    int ano = 2021;
    final String BR = "Brasil";
    double PI = 3.14;
    // Aula 3
    String meuNome = "Gleyson";
    int anoFabricacao= 2022;
    boolean verdadeira = false;
    //anoFabricacao = 2018;


        String primeiroNome = "Gleyson";
        String segundoNome = "Sampaio";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
