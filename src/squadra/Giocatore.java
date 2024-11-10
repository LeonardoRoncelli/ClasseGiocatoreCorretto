package squadra;
public class Giocatore {
    private String nome;
    private String capitano;
    private int goal;
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    public void setCapitano(String capitano){
        this.capitano=capitano;
    }
    public String getCapitano(){
        return capitano;
    }
    public void setGoal(int goal){
        this.goal=goal;
    }
    public int getGoal(){
        return goal;
    }
}