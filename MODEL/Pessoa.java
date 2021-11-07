package MODEL;

import java.time.LocalDate;
import java.time.Month;

abstract public class Pessoa {

    private String nome;
    private String cpf;
    private String matricula;
    private LocalDate nascimento;

    protected Pessoa() {
    }

    protected Pessoa(String nome, String cpf, String matricula, int ano, int mes, int dia) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.setNascimento(ano, mes, dia);
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getCpf() {
        return cpf;
    }

    protected void setCpf(String cpf) {
        this.cpf = cpf;
    }

    protected String getMatricula() {
        return matricula;
    }

    protected void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    protected LocalDate getNascimento() {
        return nascimento;
    }

    protected void setNascimento(int ano, int mes, int dia) {
        
        this.nascimento = LocalDate.of(ano, mes, dia);
    }
    
    
}
