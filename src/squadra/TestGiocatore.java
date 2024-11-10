package squadra;
import java.util.Scanner;
public class TestGiocatore {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        Funzioni squadra=new Funzioni();
        int scelta=0;
        do{
            System.out.println("1 - Aggiunta di un giocatore \n" +
                    "2 - Visualizzazione dei giocatori \n"+
                    "3 - Modifica di un giocatore \n"+
                    "4 - Cancellazione di un giocatore nella squadra \n"+
                    "5 - Visualizzazione di giocatore con più di 5 goal \n"+
                    "6 - Visualizzazione del capitano \n"+
                    "7 - Assegnazione del capitano in modo casuale \n"+
                    "8 - Uscita \n"+
                    "Inserisci la tua scelta ");
            scelta=input.nextInt();
            switch (scelta){
                case 1:{
                    String nome;
                    String capitano;
                    int goal;
                    System.out.print("Inserisci il nome del giocatore: ");
                    nome= input.next();
                    System.out.print("Inserisci se è capitano: ");
                    capitano= input.next();
                    System.out.print("Inserisci il numero di goal: ");
                    goal= input.nextInt();
                    squadra.aggiunta(nome,capitano,goal);
                    break;
                }
            }
        }while (scelta!=8);
    }
}