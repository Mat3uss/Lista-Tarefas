package br.senai.jandira.sp.model;

import java.util.List;

public class MostrarTarefa {
    public void mostrarTarefa(List<Tarefa> tarefas) {
        if (tarefas.isEmpty()) {
            System.out.println("Não há tarefas cadastradas.");
        } else {
            System.out.println("Lista de Tarefas:");
            for (int i = 0; i < tarefas.size(); i++) {
                Tarefa tarefa = tarefas.get(i);
                System.out.println("Tarefa #" + (i + 1));
                System.out.println("Título: " + tarefa.tituloTarefa);
                System.out.println("Descrição: " + tarefa.descricaoTarefa);
                System.out.println("Data de Expiração: " + tarefa.dataTarefa);
                if (tarefa.tarefaConcluida) {
                    System.out.println("Status: Concluída");
                } else {
                    System.out.println("Status: Não Concluída");
                }
                if (tarefa.usuarioAtribuido != null) {
                    System.out.println("Usuário Associado: " + tarefa.usuarioAtribuido.nomeUsuario);
                }
                System.out.println("--------------------------");
            }
        }
    }
}