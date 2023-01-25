package operadores;

public class operadoresRelacionais {
   public static void main(String[] args) {
   //Operadores relacionais: eles avaliam a relaçao entre duas variaveis ou duas expreçoes dizendo se ela e maior ou menor ou igual ou menor etc.
   //(==) Usamos este simbolo quando queremos verificar se duas variaveis sao iguais.
   //(!) Quadno desejamos verificar se as variaveis sao diferentes uma da outra.
   //(>) Quando desejamos verificar se o valor e maior que o outro.
   //(>=) Quando desejamos saber se o valor e maior ou igual que o outro.
   //(<) Quando desejamos saber se o valor e menor que o outro.
   //(<=) Quando desejamos saber se o valor e menor ou igual ao outro.
   //Exemplos:
   int numero1 = 1;
   int numero2 = 2;
   boolean simNao = numero1 == numero2;
   System.out.println("numeroUm e igual a numeroDois" + simNao);
   simNao = numero1 != numero2;
   System.out.println("numeroUm e diferente oiu igual a numeroDois" + simNao);
   simNao = numero1 > numero2;
   System.out.println("numeroUm e maior que numeroDois" + simNao);
   
   if(numero1 > numero2){
    System.out.println("a nossa condiçao e verdadeira");
   }else{
    System.out.println("a nossa condiçao e falsa");
   }
   String nome1 = "Ian";
   String nome2 = "Pimenta";
   System.out.println(nome1.equals(nome2));
  }  
}
