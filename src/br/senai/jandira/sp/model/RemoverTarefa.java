package br.senai.jandira.sp.model;

import java.util.List;
import java.util.Scanner;

public class RemoverTarefa {
    Scanner teclado = new Scanner(System.in);

    public void removerTarefa(List<Tarefa> tarefas) {
        if (tarefas.isEmpty()) {
            System.out.println("A lista de tarefas está vazia. Não há tarefas para remover.");
            return;
        }
    }
}