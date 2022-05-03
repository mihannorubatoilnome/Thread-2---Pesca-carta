public class Giocatore extends Thread {
    private String nome;
    private int carta;

    public Giocatore(String nome){
        this.nome = nome;
        this.carta = (int)(10 * Math.random()) + 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCarta() {
        return carta;
    }

    public void setCarta(int carta) {
        this.carta = carta;
    }
    
    @Override
    public void run(){
        System.out.println("Il Giocatore "+this.nome+" sta giocando");
        System.out.println("Il Giocatore "+this.nome+" ha pescato la carta : "+this.carta);

    }
}
