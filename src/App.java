public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("****** Main Partita Iniziata ******");

        Giocatore g1 = new Giocatore("Edmard");
        Giocatore g2 = new Giocatore("Filippo");
        Giocatore g3 = new Giocatore("Dawid");

        g1.start();
        g2.start();
        g3.start();

        g1.join();
        g2.join();
        g3.join();
        
        if(g1.getCarta() > g2.getCarta() && g1.getCarta() > g3.getCarta())
            System.out.println("Il vincitore è "+g1.getNome());
        else if(g2.getCarta() > g3.getCarta() && g2.getCarta() > g1.getCarta())
            System.out.println("Il vincitore è "+g2.getNome());

        if(g3.getCarta() > g2.getCarta() && g3.getCarta() > g1.getCarta())
            System.out.println("Il vincitore è "+g3.getNome());

        if(g1.getCarta() == g2.getCarta() || g2.getCarta() == g3.getCarta() || g1.getCarta() == g3.getCarta())
            System.out.println("PAREGGIO");


        System.out.println("****** Main FINE ******");
    }
}
