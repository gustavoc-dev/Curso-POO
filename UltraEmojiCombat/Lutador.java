package UltraEmojiCombat;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso,int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println("Senhoras e Senhores! Vos Apresento "+this.getNome()+" , pesando "+this.getPeso()+" e com a altura de "+this.getAltura());
        System.out.println("Com "+this.getVitorias()+" vitorias e "+this.getDerrotas()+ " derrotas");
    }

    public void status(){
        System.out.println(this.getNome());
        System.out.println(this.getNacionalidade());
        System.out.println(this.getIdade());
        System.out.println(this.getCategoria());
        System.out.println("Vitórias: "+this.getVitorias());
        System.out.println("Derrotas: "+this.getDerrotas());
        System.out.println("Empates: "+this.getEmpates());
        System.out.println("---------------------------");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.getPeso()<52.2f) {
            this.categoria = "Inválido";
        }else if (this.getPeso()<=70.3f) {
            this.categoria = "Leve";
        }else if (this.getPeso() <=83.9f) {
            this.categoria = "Médio";
        }else if (this.getPeso()<=120.2f) {
            this.categoria="Pesado";
        }else{
            this.categoria="Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }


    
}
