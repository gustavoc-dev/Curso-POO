package objetos;

public class Objetos {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo="Bic";
        c1.cor="Azul";
        c1.ponta=0.5f;
        c1.carga=90;
        
        c1.tampar();
        // c1.status();
        // c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Faber Castell";
        c2.cor = "Preta";
        c2.destampar();
        // c2.status();

        c1.rabiscar();
        c2.rabiscar();
        
    }
}
