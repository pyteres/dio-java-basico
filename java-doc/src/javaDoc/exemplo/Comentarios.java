package javaDoc.exemplo;

public class Comentarios {
    public static void name(String[] args) {
    //Nos usamos essas duas barras nessa caso//ola eu sou um comentario em uma unica linha.
    
    //Esse comentario e utilizado quando e necesario escrever mais de uma linha comentada.
    /*Ola eu sou um comentario
     * que posso ser mais detalahdo quando necesario
     */ 

    /**Esses sao usados especificamente para dizer que e uma documentaçao*/
    //Mais eeses comentarios nao pode substituir o algoritimo em si.
    
    //Exemplo:
    }
    //Esse metodo foi criado as presas e por isso que eu avibriei as coisas.
     public int somarMultiplicar(int r, int x, String m){
        r = 0; //r e igual a resultado
        if(m == "m"){//Se for m ele ira multiplicar.
         r = r * x;
        }else{//Se nao ele vai somar.
            r = r + x;
        }
        return r;
     }
}
