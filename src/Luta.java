

public class Luta {
    
    
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovado;
    
    public void marcarLuta(Lutador desafiante,Lutador desafiado){
        if(desafiante.getCategoria()!= desafiado.getCategoria()){
            System.out.println("Essa luta não pode ocorrer por lutadores serem de categorias diferentes!");
            setAprovado(false);
        
        }else{
            System.out.println("Luta marcada!!");
            setAprovado(true);
        
        }
        
       
    }
    public void luta (){
        
        if(isAprovado()==true){
            
            System.out.println("lutando");
        
        }else{
            
            System.out.println("AHHH SEM LUTA DEU ERRO ALGO AE !");
            
        }
     
    
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    
   
}

