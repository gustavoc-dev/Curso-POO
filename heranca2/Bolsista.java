package heranca2;

public class Bolsista extends Aluno{
    private float bolsa;

    public void RenovarBolsa(){
        System.out.println("Renovando Bolsa de "+ this.nome);
    }

    @Override
    public void PagarMensalidade(){
       System.out.println(this.nome + " é Bolsista. Pagamento facilitado!"); 
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    
}
