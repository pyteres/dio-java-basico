public class usuario {
 public static void main(String [] args) {
 smartTv smartTv = new smartTv();
 System.out.println("tv ligada" + smartTv.ligada);
 System.out.println("canal atual" + smartTv.canal);
 System.out.println("volume atual" + smartTv.volume);
 smartTv.abaixarSom();
 smartTv.abaixarSom();
 smartTv.abaixarSom();
 smartTv.aumentarSom();
 System.out.println("volume atual" + smartTv.volume);

 smartTv.ligar();
 System.out.println("status tv ligada" + smartTv.ligada);
 smartTv.desligar();
 System.out.println("status tv desligada" + smartTv.ligada);
System.out.println("volume atual" + smartTv.volume);
System.out.println("canal atual" + smartTv.canal);
smartTv.mudarCanal(13);
System.out.println("canal atual" + smartTv.canal);
}
}
