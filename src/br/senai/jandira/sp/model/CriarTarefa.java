package br.senai.jandira.sp.model;

import java.util.List;
import java.util.Scanner;

public class CriarTarefa {
    public static void criarTarefa(List<Tarefa> tarefas, List<Usuario> usuarios, Scanner teclado) {
        if (usuarios.isEmpty()) {
            System.out.println("Você precisa registrar um usuário antes de criar uma tarefa.");
            return;
        }

        Tarefa tarefa = new Tarefa();

        System.out.println("Insira a tarefa: ");
        tarefa.tituloTarefa = teclado.nextLine();

        System.out.println("Digite a descrição da tarefa: ");
        tarefa.descricaoTarefa = teclado.nextLine();

        tarefa.tarefaConcluida = false;

        System.out.println("Insira a data em que a tarefa irá expirar: ");
        tarefa.dataTarefa = teclado.nextLine();

        System.out.println("Essa tarefa será atribuída a qual usuário?");
        System.out.println("Usuários cadastrados:");

        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(i + 1 + ". " + usuarios.get(i).nomeUsuario);
        }

        System.out.print("Escolha o número do usuário a quem atribuir a tarefa: ");
        int usuarioResposta = Integer.parseInt(teclado.nextLine());

        if (usuarioResposta >= 1 && usuarioResposta <= usuarios.size()) {
            tarefa.usuarioAtribuido = usuarios.get(usuarioResposta - 1);
            System.out.println("Tarefa atribuída ao usuário: " + usuarios.get(usuarioResposta - 1).nomeUsuario);
            tarefas.add(tarefa);
            System.out.println("Tarefa criada com sucesso!");
        } else {
            System.out.println("Opção inválida.");
        }
    }
}