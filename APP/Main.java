package APP;

import CONTROLLER.Controller_Pessoa_Aluno;
import CONTROLLER.Controller_Pessoa_Professor;
import java.util.ArrayList;
import VIEW.Menu;

public class Main {

    public static void main(String[] args) {

        ArrayList<Controller_Pessoa_Aluno> Aluno = new ArrayList<>();
        ArrayList<Controller_Pessoa_Professor> Professor = new ArrayList<>();

        Menu.MenuPrincipal(Professor, Aluno);
    }

}
