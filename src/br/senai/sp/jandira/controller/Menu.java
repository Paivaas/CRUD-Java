package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Conexao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    public void executarMenu() throws SQLException {
        boolean continuar = true;
        while (continuar){
            System.out.println("|- ---------------------------- -|");
            System.out.println("|-           Bem vindo!         -|");
            System.out.println("|-                              -|");
            System.out.println("|-  (1) Cadastrar Funcionario   -|");
            System.out.println("|-  (2) Listar Funcionario      -|");
            System.out.println("|-  (3) Deletar Funcionario     -|");
            System.out.println("|-  (4) Pesquisar Funcionario   -|");
            System.out.println("|-  (5) Atualizar Salario       -|");
            System.out.println("|-  (6) Sair                    -|");
            System.out.println("|- ---------------------------- -|");

            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();
            scanner.nextLine();

            FuncionarioController funcionarioController = new FuncionarioController();
            switch (opcao){
                case 1:
                    System.out.println("In Development");
                    break;
                case 2:
                    funcionarioController.listarFuncionarios();
                    break;
                case 3:
                    System.out.println("Informe o nome de quem deseja deletar: ");
                    String nomeDelete = scanner.nextLine();
                    funcionarioController.deletarFuncionarios(nomeDelete);
                    break;
                case 4:
                    System.out.println("Informe o nome de quem deseja pesquisar: ");
                    String nomePesquisa = scanner.nextLine();
                    funcionarioController.pesquisarFuncionario(nomePesquisa);
                    break;
                case 5:
                    System.out.println("In Development");
                    break;
                case 6:
                    continuar = false;
                    break;


            }

        }
    }

}


