public class aboutme {
    //os argumentos sao fazem parte de um metodo e de um array o termo usado para um argumento e args. E eles podem ser compilados em um terminal.
    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
         double altura = Double.valueOf(args[3]);

        System.out.println("ola me chamo" + nome + sobrenome);
        System.out.println("tenho" + idade + "anos");
        System.out.println("minha altura e" + altura + "cm");
    }
}
