package encapsulamento;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()) {
            System.out.println("Está Ligado? "+ this.getLigado());
            System.out.println("Está Tocando "+ this.getTocando());
            System.out.println("Volume: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i+=10) {
                System.out.print("|");
            }
        }else{
            System.out.println("TV Desligada");
        }
       
    }

    @Override
    public void fecharMenu() {
        if (this.getLigado()) {
            System.out.println("Fechando Menu...");
        }else{
            System.out.println("TV Desligada");
        }
        
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume()+5);
        } else{
            System.out.println("Impossivel aumentar volume!");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume()-5);
        } else{
            System.out.println("Impossivel diminuir volume!");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume()>0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume()==0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }else{
            System.out.println("Não conseguir reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }else{
            System.out.println("Não conseguir pausar");
        }
    }
}
