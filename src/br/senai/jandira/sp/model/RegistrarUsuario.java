package br.senai.jandira.sp.model;

import java.util.List;
import java.util.Scanner;
public class RegistrarUsuario {
    public static void registrarUsuario(List<Usuario> usuarios, Scanner teclado) {
        System.out.print("Insira o nome do usuário: ");
        String nomeUsuario = teclado.nextLine();
        Usuario usuario = new Usuario(nomeUsuario);
        usuarios.add(usuario);
        System.out.println("Usuário registrado com sucesso!");
    }
}