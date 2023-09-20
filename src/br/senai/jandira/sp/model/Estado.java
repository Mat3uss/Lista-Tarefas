package br.senai.jandira.sp.model;

public class Estado {
    public String estado(String estado) {
        String tarefa = null;

        switch (estado) {
            case "1":
                tarefa = "Feita!";
                break;
            case "2":
                tarefa = "Pendente!";
        }

        return tarefa;
    }
}
