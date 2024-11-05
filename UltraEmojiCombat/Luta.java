package UltraEmojiCombat;
import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private boolean aprovada;


    public void marcarLuta(Lutador l1,Lutador l2){
        if (l1.getCategoria()==l2.getCategoria() && l1.getNome()!=l2.getNome()) {
            this.aprovada=true;
            this.desafiado=l1;
            this.desafiante=l2;
        }else{
            this.aprovada=false;
            this.desafiado=null;
            this.desafiante=null;
        }
    }

    public void lutar(){
        if (aprovada) {
            Random random = new Random();
            desafiado.apresentar();
            desafiante.apresentar();
            int vencedor = random.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("Empate");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("O vencedor desse duelo de titãs foi "+desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("O vencedor desse duelo de titãs foi "+desafiante.getNome());
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                default:
                    break;
            }
        }else{
            System.out.println("Luta não pode acontecer");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

   
}
