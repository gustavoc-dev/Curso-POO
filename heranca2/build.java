package heranca2;

public class build {
    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");

        a1.setNome("Claudio");
        a1.setMatricula(2000);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.PagarMensalidade();

        b1.setNome("Jubileu");
        b1.setMatricula(3000);
        b1.setCurso("Informatica");
        b1.setIdade(18);
        b1.setSexo("M");
        b1.setBolsa(12.5f);
        b1.PagarMensalidade();

        System.out.println(v1.toString());

    }
}
