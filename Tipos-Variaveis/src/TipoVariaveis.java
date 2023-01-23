public class TipoVariaveis {
//variavel e um tipo de dado que ocupa um espaço na memoria.
//estrutura da variavel:
//Toda variavel tem que ter um tipo um nome e o seu valor.
//exemplo:
int idade; //tipo int valor idade e o seu nome e  ele tem um valor vazio.
int anoFabricaçao = 2022; //tipo int nome anoFabricaçao valor 2022.
double salarioMinimo = 2.500; //tipo double nome salarioMinimo valor 2.500.
//usamomos o int por que ela e a variavel que consegue receber o valor maior em numeral inteiro.
//E usamos o double por que ele consegue receber o valor maior em numeral fracionado. 
//se voce colocar um tipo em uma variavel o seu valor tem que coresponder aquele tipo por que se nao ela da um erro.
//Exemplo:
short numeroCurto = 1;
int numeroNormal = numeroCurto;
short numeroCurto2 = (short) numeroNormal;
//mais alem das variaveis existem as constantes mais qual e a diferença delas.
//A variavel pode ser alterado o seu valor sempre que o progamador quiser. Ja a const o valor da varaivel nao pode ser alterado pelo desenvolvedor.
//para colocar uma variavel para constante voce coloca o atributo final isso permitira que o valor nao sera alterado mais por convençao esta variavel deve ser colocada em caixa alta nas primeiras letras.
//exemplo:
String nome = "ian Pimenta Monteiro";
 final String nomeCompleto = "ian Pimneta monterio";
 nomeCompleto = "barbara cunha";
 nome = "larissa";
}
//Exemplo de cada variavel
class TipoDado{
    public static void main(String [] args){
      byte idade = 123;
      short ano = 2021;
      int cep = 21070333; //Se começar com zero talvez tenha que ser outro tipo. Talvez tenha que ser o tipo string.
      long cpf = 98765432109l; //Se começar com zero talvez tenha que ser outro tipo. Talvez tenha que ser o tipo string.
      float pi = 3.14f;
      double salario = 1275.33; 
    }
}
