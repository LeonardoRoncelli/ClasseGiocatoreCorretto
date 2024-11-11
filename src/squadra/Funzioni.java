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
    public String[] visualizza(){
        int conta=0;
        int agg;
        for(int i=0;i<giocatori.length;i++){
            if(giocatori[i]!=null){
                conta++;
            }
        }
        agg=conta;
        String[]visualizzaGioc=new String[conta];
        for(int i=0;i<visualizzaGioc.length;i++){
            visualizzaGioc[i]="Nome: "+giocatori[agg].getNome()+", Capitano: "+giocatori[agg].getCapitano()+", Goal:"+giocatori[agg].getGoal();
            agg--;
        }
        return visualizzaGioc;
    }
    public void modifica(int posizione,String nome,String capitano,int goal){
        if(giocatori[posizione]!=null){
            giocatori[posizione].setNome(nome);
            giocatori[posizione].setCapitano(capitano);
            giocatori[posizione].setGoal(goal);
        }else {
            System.out.println("La posizione è vuota, non puoi modificarla!");
        }
    }
    public void cancella(int posCancella){
        giocatori[posCancella]=null;
        System.out.println("Giocatore cancellato");
    }
}
