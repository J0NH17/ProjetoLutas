
public class Octogono {

    public static void main(String[] args) {
        Lutador player1 = new Lutador("Atom","descarte", 30, 1.70, 111.300);
        Lutador player2 = new Lutador("Zeus","Importado", 5, 2.30, 180.00);
        
        Luta l =new Luta();
        
        l.marcarLuta(player1, player2);
        
        l.luta( player1, player2);
        
                
    }

}
