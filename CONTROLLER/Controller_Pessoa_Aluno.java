package CONTROLLER;

import java.time.LocalDate;
import java.util.Scanner;

public class Controller_Pessoa_Aluno extends MODEL.Pessoa_Aluno implements Interface_Pessoa {

    public Controller_Pessoa_Aluno() {
    }

    public Controller_Pessoa_Aluno(String turma, String nome, String cpf, String matricula, int ano, int mes, int dia) {
        super(turma, nome, cpf, matricula, ano, mes, dia);
    }

    @Override
    public void Cadastra(int mat) {

        Scanner recebe = new java.util.Scanner(System.in);

        /*Nome*/
        System.out.print("\nNome: ");
        super.setNome(recebe.nextLine());

        /*Data de Nascimento*/
        System.out.print("Data de Nascimento(dd/mm/aaaa): ");
        String[] data = recebe.nextLine().split("/");

        int dia = Integer.parseInt(data[0]);
        int mes = Integer.parseInt(data[1]);
        int ano = Integer.parseInt(data[2]);

        super.setNascimento(ano, mes, dia);

        /*CPF*/
        System.out.print("CPF(111.222.333-44):");
        super.setCpf(recebe.nextLine());

        /*Turma*/
        System.out.print("Turma: ");
        super.setTurma(recebe.nextLine());

        /*Matrícula*/
        String matricula = "A" + LocalDate.now().getYear() + ".0" + mat;

        super.setMatricula(matricula);
    }

    @Override
    public void Consulta() {

        System.out.println("\nNome: " + super.getNome());
        System.out.println("Matricula: " + super.getMatricula());
        System.out.println("Turma: " + super.getTurma());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Data de Nascimento: " + super.getNascimento());
        System.out.println("**************************************************************");
    }

    @Override
    public boolean Edita(String matricula) {

        if (super.getMatricula().equalsIgnoreCase(matricula)) {

            Scanner recebe = new java.util.Scanner(System.in);

            /*Nome*/
            System.out.print("\nNome: ");
            super.setNome(recebe.nextLine());

            /*Data de Nascimento*/
            System.out.print("Data de Nascimento(dd/mm/aaaa): ");
            String[] data = recebe.nextLine().split("/");

            int dia = Integer.parseInt(data[0]);
            int mes = Integer.parseInt(data[1]);
            int ano = Integer.parseInt(data[2]);

            super.setNascimento(ano, mes, dia);

            /*CPF*/
            System.out.print("CPF(111.222.333-44):");
            super.setCpf(recebe.nextLine());

            /*Turma*/
            System.out.print("Turma: ");
            super.setTurma(recebe.nextLine());

            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean Exclui(String matricula) {

        if (super.getMatricula().equalsIgnoreCase(matricula)) {

            return true;
        } else {
            return false;
        }
    }

}
