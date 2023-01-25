package operadores;

public class operadorUnario {
//Operadores Unitariso: Eles sao encrementados com um operador aridimetico. Eles realizam algunas tarefas basicas como encrementar desecrementar e inverter valores numericos e booleans.
//Os simbolos usados para indentificar este operador sao:
//(+) Operador unario de valor positivo: os numeros sao positivos tambem sem esse operador.
//(-) Operador unario de valor negarivo: Nega um numero ou expresao aridimetica.
//(++) Operador unario de encrementaçao de valor: Incrementa o vaolor em uma unidade
//(--) Operador unario de desencrementaçao: Desencrementa o valor em uma unidade.
//(!) Operador unario de negaçao: Nega o valor de uma expresao boolean.

public static void main(String[] args) {
    int numero = 5;
    numero = -numero;
    System.out.println(numero);
    numero = numero * -1;
    System.out.println(numero);
    int numero2 = 5;
    System.err.println(-- numero2);
    System.out.println(numero2);
    System.out.println(++ numero2);
    System.out.println(numero2);
    boolean variavel = true;
    System.out.println(!variavel);
}
}

