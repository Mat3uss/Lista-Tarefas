package br.senai.jandira.sp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);

    CriarTarefa tarefa = new CriarTarefa();
    MostrarTarefa mostrarTarefa = new MostrarTarefa();
    RemoverTarefa remover = new RemoverTarefa();
    EditarTarefa editar = new EditarTarefa();

    boolean continuar = true;

    public void menuIniciar() {
        while (continuar) {
            System.out.println("-----------------------------------");
            System.out.println(" 1 - Cadastrar Usuario");
            System.out.println(" 2 - Criar Tarefa");
            System.out.println(" 3 - Mostrar Tarefas");
            System.out.println(" 4 - Excluir Tarefas");
            System.out.println(" 5 - Editar Tarefas");
            System.out.println("------------------------------------");

            int resposta = teclado.nextInt();
            teclado.nextLine();

            switch (resposta) {
                case 1:
                    CriarTarefa.criarTarefa();
                    break;
                case 2:
                    mostrarTarefa.mostrarTarefa(tarefa.tarefa);
                    break;
                case 3:
                    remover.removerTarefa(tarefa.tarefa);
                    break;
                case 4:
                    editar.editarTarefa(tarefa.tarefas, tarefa.usuarios);
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
    }
}