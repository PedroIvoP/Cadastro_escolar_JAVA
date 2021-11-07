package MODEL;


abstract public class Pessoa_Professor extends Pessoa{
    
    private String materia;

    protected Pessoa_Professor() {
    }

    protected Pessoa_Professor(String materia) {
        this.materia = materia;
    }

    protected Pessoa_Professor(String materia, String nome, String cpf, String matricula, int ano, int mes, int dia) {
        super(nome, cpf, matricula, ano, mes, dia);
        this.materia = materia;
    }

    protected String getMateria() {
        return materia;
    }

    protected void setMateria(String materia) {
        this.materia = materia;
    }
    
    
}
