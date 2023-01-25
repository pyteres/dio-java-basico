package operadores;

public class operadoresLogicos {
   public static void main(String [] args) {
    //Operadores logicos: Os operadores logicos nos permite criar expreçoes logicas maiores com duas ou mais expreçoes.
    //& Operador logico e.
    //|| Operador logico ou.
    //exemplos:
    boolean condiçao1 = true;
    boolean condiçao2 = true;
    if(condiçao1 && (7 > 4)){
        System.out.println("as duas condiçoes sao verdadeiras");
    }else{
        System.out.println("fim");
    }
    if(condiçao1 || condiçao2){
     System.out.println("as duas condiçoes sao verdadeiras");
    }else{
        System.err.println("fim");
    }
   } 
}
