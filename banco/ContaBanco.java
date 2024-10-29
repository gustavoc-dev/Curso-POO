package banco;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private String status;
    

    public void estadoAtual(){
        System.out.println("----------------------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
    }


    public ContaBanco(){
        this.saldo=0;
        this.status="Conta Fechada";
    }

    public void abrirConta(String t){
        if (t.equals("CC")) {
            setTipo(t);
            this.setSaldo(50.0f);
            System.out.println("Conta aberta com sucesso!");
        }else if (t.equals("CP")) {
            setTipo(t);
            System.out.println("Conta aberta com sucesso!");
            this.setSaldo(150.0f);
        }else if (t !="CC" && t!="CP") {
            System.out.println("Insira um tipo de conta válido. CP ou CC");
        }
        
        this.setStatus("Conta Aberta");
    }

    public void fecharConta(){
        if (this.saldo>0) {
            System.out.println("Você precisa sacar o dinheiro antes!");
        }else if (this.saldo<0) {
            System.out.println("Conta em débito!");
        }
        else{
            this.setStatus("Conta Fechada");
        }
    }

    public void depositar(int s){
        if (this.status.equals("Conta Aberta")) {
            System.out.println("Depósito feito com sucesso!");
            this.setSaldo(this.getSaldo()+s);;
        }else{
            System.out.println("Esta conta está fechada");
        }
    }

    public void sacar(float s) {
        if (this.status.equals("Conta Aberta")) {
            if (this.getSaldo() >= s) {
                this.setSaldo(this.getSaldo() - s);
                System.out.println("Saque efetuado!");
            } else {
                System.out.println("Não foi possível realizar o saque: saldo insuficiente.");
            }
        } else {
            System.out.println("Não foi possível realizar o saque: conta fechada.");
        }
    }
    

    public void pagarMensal(){
        if (this.tipo.equals("CC")) {
            this.setSaldo(getSaldo()-12);
            System.out.println("Mensalide paga por "+this.getDono());
        }else if (this.tipo.equals("CP")) {
            this.setSaldo(getSaldo()-20);
            System.out.println("Mensalide paga por "+this.getDono());
        }
    }

    public int getNumConta() {
        return numConta;
    }
    
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getDono() {
        return dono;
    }
    
    public void setDono(String dono) {
        this.dono = dono;
    }
    
    public float getSaldo() {
        return saldo;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    

}
