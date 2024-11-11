package squadra;
public class Funzioni {
    Giocatore[] giocatori = new Giocatore[11];
    public void aggiunta(Giocatore giocatoreAggiunto) {
        boolean cap = false;
        for (int i = 0; i < giocatori.length; i++) {
            if (giocatori[i] != null && giocatori[i].getCapitano().equalsIgnoreCase("capitano")) {
                cap = true;
                System.out.println("Un capitano è già presente");
                break;
            }
        }
        if (!cap) {
            System.out.println("Non è ancora presente un capitano");
        }
        for (int i = 0; i < giocatori.length; i++) {
            if (giocatori[i] == null) {
                giocatori[i] = giocatoreAggiunto;
                System.out.println("Giocatore aggiunto nella posizione " + i);
                System.out.println(" ");
                break;
            }
        }
    }
}
