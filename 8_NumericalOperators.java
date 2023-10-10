// Definisci un metodo che calcoli la media tra 3 numeri e restituisca il risultato 
// che dovrà essere stampato.

public class Main {
    public static void main(String args[]) {
    double first = 1.7;
    int second = 3;
    double third = 7.99999999;
    
    System.out.println("La media è = " + avarage (first, second, third) );
    
    }
    
    //creo un metodo in caso le variabili siano integer, per cui facendo un casting successivamente visto che la media molto probabilmente sarà decimale.
    public static double avarage (int a, int b, int c) {
        double av = ( (double)a + (double)b + (double)c ) / 3 ;
        return av;
  }
  
  //mentre qua creo un altro metodo nel caso le variabili in input siano decimali
   public static double avarage (double a, double b, double c) {
        double av = ( a + b + c ) / 3 ;
        return av;
  }
    
 
}
//Utilizzando questi due metodi, noto che riesco a fare la media di variabili int e double contemporaneamente senza nessun errore. Nonostante nei primo metodo passo solamente variabili int e nel secondo metodo passo variabili double.
