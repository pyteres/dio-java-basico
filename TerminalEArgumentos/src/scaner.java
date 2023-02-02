import java.util.Locale;
import java.util.Scanner;

public class scaner {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
        System.out.println("digite seu nome");
         String nome  = scanner.next();
         System.out.println("digite o seu sobrenome");
         String sobrenome = scanner.next();
         System.out.println("digite a sua idade");
         int idade = scanner.nextInt();
         System.out.println("digite a sua altura");
         double altura = scanner.nextDouble();

         System.out.println("ola me chamo" + nome + sobrenome);
         System.out.println("minha idade e" + idade + "anos");
         System.out.println("minha altura e" + altura + "cm");
    }
    }

