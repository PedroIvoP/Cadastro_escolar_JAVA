package VIEW;

import CONTROLLER.ControllerMenu;
import CONTROLLER.Controller_Pessoa_Aluno;
import CONTROLLER.Controller_Pessoa_Professor;
import MODEL.Pessoa_Aluno;
import MODEL.Pessoa_Professor;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private static Scanner recebe = new Scanner(System.in);
    private static int opcao;
    private static int mat_prof = 1;
    private static int mat_aluno = 1;

    
    public static void MenuPrincipal(ArrayList<Controller_Pessoa_Professor> professor, ArrayList<Controller_Pessoa_Aluno> aluno) {

        while (0 == 0) {

            System.out.println("\n===============================================");
            System.out.println("                    MENU PRINCIPAL               ");
            System.out.println("===============================================\n");
            System.out.println("1 - CADASTRAR ");
            System.out.println("2 - CONSULTAR ");
            System.out.println("3 - EDITAR CADASTRO ");
            System.out.println("4 - DELETAR CADASTRO ");
            System.out.println("5 - **SAIR** ");
            System.out.print("\nOpção escolhida: ");
            opcao = recebe.nextInt();

            switch (opcao) {

                case 1:
                    MenuCadastro(professor, aluno);
                    break;

                case 2:
                    MenuConsulta(professor, aluno);
                    break;

                case 3:
                    MenuEdicao(professor, aluno);
                    break;

                case 4:
                    MenuExclusao(professor, aluno);
                    break;

                case 5:
                    ControllerMenu.Sair();
                    break;

                default:
                    ControllerMenu.OpInvalida();
                    break;

            }
        }

    }

    
    private static void MenuCadastro(ArrayList<Controller_Pessoa_Professor> professor, ArrayList<Controller_Pessoa_Aluno> aluno) {

        while (0 == 0) {

            System.out.println("\n=================================================");
            System.out.println("                    MENU DE CADASTRO               ");
            System.out.println("=================================================\n");
            System.out.println("1 - ALUNO ");
            System.out.println("2 - PROFESSOR ");
            System.out.println("3 - **VOLTAR P/ MENU PRINCIPAL**");
            System.out.println("4 - **SAIR** ");
            System.out.print("\nOpção escolhida: ");
            opcao = recebe.nextInt();

            switch (opcao) {

                case 1:
                    Controller_Pessoa_Aluno a = new Controller_Pessoa_Aluno();
                    a.Cadastra(mat_aluno);
                    aluno.add(a);
                    mat_aluno++;
                    break;

                case 2:
                    Controller_Pessoa_Professor p = new Controller_Pessoa_Professor();
                    p.Cadastra(mat_prof);
                    professor.add(p);
                    mat_prof++;
                    break;

                case 3:
                    MenuPrincipal(professor, aluno);
                    break;

                case 4:
                    ControllerMenu.Sair();
                    break;

                default:
                    ControllerMenu.OpInvalida();
                    break;

            }
        }

    }

    
    private static void MenuConsulta(ArrayList<Controller_Pessoa_Professor> professor, ArrayList<Controller_Pessoa_Aluno> aluno) {

        while (0 == 0) {

            System.out.println("\n=================================================");
            System.out.println("                    MENU DE CONSULTA               ");
            System.out.println("=================================================\n");
            System.out.println("1 - ALUNO ");
            System.out.println("2 - PROFESSOR ");
            System.out.println("3 - **VOLTAR P/ MENU PRINCIPAL**");
            System.out.println("4 - **SAIR** ");
            System.out.print("\nOpção escolhida: ");
            opcao = recebe.nextInt();

            switch (opcao) {

                case 1:

                    if (aluno.isEmpty()) {

                        System.out.println("\nNenhum aluno cadastrado!");

                    } else {

                        System.out.println("\n-----------------------------------------");
                        System.out.println("        RELATÓRIO DE ALUNOS CADASTRADOS");
                        System.out.println("-----------------------------------------\n");

                        for (Controller_Pessoa_Aluno a : aluno) {

                            a.Consulta();
                        }
                    }
                    break;

                case 2:

                    if (professor.isEmpty()) {

                        System.out.println("\nNenhum professor cadastrado!");
                    } else {

                        System.out.println("\n------------------------------------------");
                        System.out.println("     RELATÓRIO DE PROFESSORES CADASTRADOS");
                        System.out.println("------------------------------------------\n");

                        for (Controller_Pessoa_Professor p : professor) {

                            p.Consulta();
                        }
                    }
                    break;

                case 3:
                    MenuPrincipal(professor, aluno);
                    break;

                case 4:
                    ControllerMenu.Sair();
                    break;

                default:
                    ControllerMenu.OpInvalida();
                    break;

            }
        }

    }

    
    private static void MenuEdicao(ArrayList<Controller_Pessoa_Professor> professor, ArrayList<Controller_Pessoa_Aluno> aluno) {

        while (0 == 0) {

            System.out.println("\n=================================================");
            System.out.println("             MENU DE EDIÇÃO DE CADASTRO            ");
            System.out.println("=================================================\n");
            System.out.println("1 - ALUNO ");
            System.out.println("2 - PROFESSOR ");
            System.out.println("3 - **VOLTAR P/ MENU PRINCIPAL**");
            System.out.println("4 - **SAIR** ");
            System.out.print("\nOpção escolhida: ");
            opcao = recebe.nextInt();

            switch (opcao) {

                case 1:

                    if (aluno.isEmpty()) {

                        System.out.println("\nNenhum aluno cadastrado!");

                    } else {

                        boolean atualizado_al = false;

                        Scanner recebe_mat_al = new Scanner(System.in);
                        String matricula_edita_aluno;

                        System.out.print("\nInforme a matrícula do aluno: ");
                        matricula_edita_aluno = recebe_mat_al.nextLine();

                        for (Controller_Pessoa_Aluno a : aluno) {

                            if (a.Edita(matricula_edita_aluno)) {
                                atualizado_al = true;
                                System.out.println("\nCadastro atualizado com sucesso!");
                                a.Consulta();
                            }
                        }

                        if (!atualizado_al) {

                            System.out.println("\nCadastro não localizado!");
                        }
                    }

                    break;

                case 2:

                    if (professor.isEmpty()) {

                        System.out.println("\nNenhum professor cadastrado!");
                    } else {

                        boolean atualizado_prof = false;

                        Scanner recebe_mat_prof = new Scanner(System.in);
                        String matricula_edita_professor;

                        System.out.print("\nInforme a matrícula do professor: ");
                        matricula_edita_professor = recebe_mat_prof.nextLine();

                        for (Controller_Pessoa_Professor p : professor) {

                            if (p.Edita(matricula_edita_professor)) {
                                atualizado_prof = true;
                                System.out.println("\nCadastro atualizado com sucesso!");
                                p.Consulta();
                            }
                        }

                        if (!atualizado_prof) {

                            System.out.println("\nCadastro não localizado!");
                        }
                    }

                    break;

                case 3:
                    MenuPrincipal(professor, aluno);
                    break;

                case 4:
                    ControllerMenu.Sair();
                    break;

                default:
                    ControllerMenu.OpInvalida();
                    break;

            }
        }

    }

    
    private static void MenuExclusao(ArrayList<Controller_Pessoa_Professor> professor, ArrayList<Controller_Pessoa_Aluno> aluno) {

        while (0 == 0) {

            System.out.println("\n=================================================");
            System.out.println("           MENU DE EXCLUSAO DE CADASTRO            ");
            System.out.println("=================================================\n");
            System.out.println("1 - ALUNO ");
            System.out.println("2 - PROFESSOR ");
            System.out.println("3 - **VOLTAR P/ MENU PRINCIPAL**");
            System.out.println("4 - **SAIR** ");
            System.out.print("\nOpção escolhida: ");
            opcao = recebe.nextInt();

            switch (opcao) {

                case 1:

                    if (aluno.isEmpty()) {

                        System.out.println("\nNenhum aluno cadastrado!");

                    } else {

                        boolean removidoA = false;

                        Scanner recebe_mat_al = new Scanner(System.in);
                        String matricula_Aluno;

                        System.out.print("\nInforme a matrícula do aluno: ");
                        matricula_Aluno = recebe_mat_al.nextLine();

                        /*
                    Estava dando erro ao executar...
                    
                    for (Controller_Pessoa_Aluno a : aluno) {

                        if (a.Exclui(matricula_Aluno)) {
                            aluno.remove(a);
                            System.out.println("teste");
                            removidoA = true;
                        }
                    }*/
                        for (int i = 0; i < aluno.size(); i++) {

                            if (aluno.get(i).Exclui(matricula_Aluno)) {
                                aluno.remove(i);
                                removidoA = true;
                            }
                        }

                        if (removidoA) {
                            System.out.println("\nCadastro excluído!");
                        } else {
                            System.out.println("\nCadastro não localizado!");
                        }
                    }

                    break;

                case 2:

                    if (professor.isEmpty()) {

                        System.out.println("\nNenhum professor cadastrado!");
                    } else {

                        boolean removidoP = false;

                        Scanner recebe_mat_prof = new Scanner(System.in);
                        String matricula_Professor;

                        System.out.print("\nInforme a matrícula do professor: ");
                        matricula_Professor = recebe_mat_prof.nextLine();

                        /*
                     Estava dando erro ao executar...
                    
                    for (Controller_Pessoa_Professor p : professor) {

                        if (p.Exclui(matricula_Professor)) {
                            professor.remove(p);
                            removidoP = true;
                        }
                    }*/
                        for (int i = 0; i < professor.size(); i++) {

                            if (professor.get(i).Exclui(matricula_Professor)) {
                                professor.remove(i);
                                removidoP = true;
                            }
                        }

                        if (removidoP) {
                            System.out.println("\nCadastro excluído!");
                        } else {
                            System.out.println("\nCadastro não localizado!");
                        }
                    }
                    break;

                case 3:
                    MenuPrincipal(professor, aluno);
                    break;

                case 4:
                    ControllerMenu.Sair();
                    break;

                default:
                    ControllerMenu.OpInvalida();
                    break;

            }
        }

    }
}
