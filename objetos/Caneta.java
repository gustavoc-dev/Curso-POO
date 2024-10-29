package objetos;

public class Caneta {
    public String modelo;
    public String cor;
    float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga);
        System.out.println("Está tamapada:"+this.tampada);
    }

    protected void rabiscar(){
        if (tampada == true) {
            System.out.println("ERROR, Não posso Rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){   
        this.tampada = false;
    }
}
