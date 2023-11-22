package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Funcionario {

    Scanner scanner = new Scanner(System.in);
    private String nome,cargo, departamento;
    private int idFuncionarios = 0;

    //generate > getter and setter
    private double salario;

    public void cadastrarFuncionario(){
        System.out.println("Informe o nome: ");
        this.nome = scanner.nextLine();
        System.out.println("Informe o cargo: ");
        this.cargo = scanner.nextLine();
        System.out.println("Informe o Departamento: ");
        this.departamento = scanner.nextLine();
        System.out.println("Informe o Salario: ");
        this.salario = scanner.nextDouble();
        scanner.nextLine();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getIdFuncionarios() {
        return idFuncionarios;
    }

    public void setIdFuncionarios(int idFuncionarios) {
        this.idFuncionarios = idFuncionarios;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
