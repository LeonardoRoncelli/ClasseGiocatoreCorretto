package squadra;
import java.util.Scanner;
public class TestGiocatore {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        Funzioni squadra=new Funzioni();
        int scelta=0;
        do{
            System.out.println("1 - Aggiunta di un giocatore \n"+
                    "2 - Visualizzazione dei giocatori \n"+
                    "3 - Modifica di un giocatore \n"+
                    "4 - Cancellazione di un giocatore nella squadra \n"+
                    "5 - Visualizzazione di giocatore con più di 5 goal \n"+
                    "6 - Visualizzazione del capitano \n"+
                    "7 - Assegnazione del capitano in modo casuale \n"+
                    "8 - Uscita \n");
            System.out.print("Inserisci la tua scelta: ");
            scelta=input.nextInt();
            switch (scelta){
                case 1:{
                    String nome;
                    String capitano;
                    int goal;
                    Giocatore giocatoreAggiunto=new Giocatore();
                    System.out.print("Inserisci il nome del giocatore: ");
                    nome= input.next();
                    giocatoreAggiunto.setNome(nome);
                    System.out.print("Inserisci se è capitano: ");
                    capitano= input.next();
                    giocatoreAggiunto.setCapitano(capitano);
                    System.out.print("Inserisci il numero di goal: ");
                    goal= input.nextInt();
                    giocatoreAggiunto.setGoal(goal);
                    squadra.aggiunta(giocatoreAggiunto);
                    break;
                }
                case 2:{
                    System.out.println(squadra.visualizza());
                    break;
                }
                case 3:{
                    int posizione;
                    String nome;
                    String capitano;
                    int goal;
                    System.out.print("Inserisci la posizione del giocatore che vuoi modificare");
                    posizione= input.nextInt();
                    System.out.print("Inserisci il nome della modifica: ");
                    nome= input.next();
                    System.out.print("Inserisci il capitano della modifica: ");
                    capitano= input.next();
                    System.out.print("Inserisci i goal della modifica: ");
                    goal= input.nextInt();
                    squadra.modifica(posizione,nome,capitano,goal);
                    break;
                }
                case 4:{
                    int posCancella;
                    System.out.print("Inserisci la posizione del giocatore da cancellare: ");
                    posCancella= input.nextInt();
                    squadra.cancella(posCancella);
                    break;
                }
            }
        }while (scelta!=8);
    }
}
