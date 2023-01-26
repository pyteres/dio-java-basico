public class escopo {
//Escopo: Pode ser entendida  como o ambiente onde uma variavell pode sser acessada. Em java o escopo de variaveis e de acotdo com o bloco onde ela foi declarada.
//Ou seja a variavel so pode ser manipulada dentro do escopo onde ela foi declarada. 
//Mais se voce por uma classe nao dentro de uma escopo voce pode acessar ela em qual quer lugar.
//exemplo:
public void smartTv() {
boolean ligada=false;
int canal=1;
int volume=25;

public void ligar(){
    ligada = true;
}
public void desligar(){
    ligada = false;
}
public void aumentarSom(){
++ volume;
System.out.println("aumentando volume" + volume);
}
public void abaixarSom(){
    -- volume;
    System.out.println("abaixando volume" + volume);
}
public void aumentarCanal(){
    canal ++;
}
public void diminuirCanal(){
    canal --;
}

}