package squadra;
public class Funzioni {
    private int nGiocatori;
    public void setnGiocatori(int nGiocatori){
        this.nGiocatori=nGiocatori;
    }
    public int getnGiocatori(){
        return nGiocatori;
    }
    Giocatore[]giocatori=new Giocatore[nGiocatori];
    public void aggiunta(String nome,String capitano,int goal){
        boolean cap=false;
        for(int i=0;i<giocatori.length;i++){
            if(giocatori[i].getCapitano().equalsIgnoreCase("capitano")){
                cap=true;
                System.out.println("Un capitano è gia presente");
            }
            else{
                System.out.println("Non è ancora presente un capitano");
            }
        }
        for(int i=0;i<giocatori.length;i++){
            if (giocatori[i]==null){
                giocatori[i].setNome(nome);
                giocatori[i].setCapitano(capitano);
                giocatori[i].setGoal(goal);
            }
        }
    }
}
