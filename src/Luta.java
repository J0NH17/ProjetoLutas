
import java.util.Random;

public class Luta {

    Random r = new Random();
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds = 0;
    private boolean aprovado;

    public void marcarLuta(Lutador desafiante, Lutador desafiado) {
        if (desafiante.getCategoria() != desafiado.getCategoria()) {
            System.out.println("Essa luta não pode ocorrer por lutadores serem de categorias diferentes!");
            setAprovado(false);

        } else {
            System.out.println("Luta marcada!!");
            setAprovado(true);

        }

    }

    public void luta(Lutador desafiante, Lutador desafiado) {
        
        //se lutar ↴
        Lutador vencedor ;

        if (isAprovado() == true) {
            do {
                int resultado = r.nextInt(3);

                if (resultado == 0) {

                    //Vitoria do desafiante
                    desafiante.ganharLuta();
                    desafiado.perdeLuta();
                    vencedor = desafiante;
                    System.out.println(desafiante.getNome() + " É o vencedor do "+(rounds +1) +"° round ");

                } else if (resultado == 1) {

                    //Vitoria do desafiado 
                    desafiado.ganharLuta();
                    desafiante.perdeLuta();
                    vencedor = desafiado;
                    System.out.println(desafiado.getNome() + " É o vencedor do "+(rounds +1)+"° round ");

                } else {

                    //EMPATE
                    desafiante.empatarLuta();
                    desafiado.empatarLuta();
                    System.out.println((rounds +1)+"° Round Empatado!! ");
                }
                rounds++;
            } while (rounds != 7 || (desafiante.getVitorias() == 3 || desafiado.getVitorias() == 3));
            
            if(desafiante.getVitorias()>=3){
                vencedor = desafiante;
                System.out.println("VENCEDOR : "+vencedor.getNome());
            
            }else if(desafiado.getVitorias()>=3){
                vencedor = desafiado;
                System.out.println("VENCEDOR : "+vencedor.getNome());
            
            }else{
                
                System.out.println("Empatado!! ");
            
            }
            
  
            //Nao entendi como fazer rouds (* ￣︿￣)     tentei um loop ...

           

        } else {

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
