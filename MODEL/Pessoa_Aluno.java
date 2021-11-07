package MODEL;


abstract public class Pessoa_Aluno extends Pessoa{
    
    private String turma;

    protected Pessoa_Aluno() {
    }

    protected Pessoa_Aluno(String turma) {
        this.turma = turma;
    }

    protected Pessoa_Aluno(String turma, String nome, String cpf, String matricula, int ano, int mes, int dia) {
        super(nome, cpf, matricula, ano, mes, dia);
        this.turma = turma;
    }

    protected String getTurma() {
        return turma;
    }

    protected void setTurma(String turma) {
        this.turma = turma;
    }
    
    
    
}
