package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {

	public String nome;
	public String cpf;
	public double altura;
	public double peso;
	public String telefone;
	public LocalDate dataNascimento; 
	public void mostrarDados() {
		System.out.println("--------------------");
		System.out.println("Dados do Paciente");
		System.out.println("--------------------");
		System.out.println("Nome: " + nome);
		System.out.println("Peso:" + peso + "kgs");
	System.out.println("Altura:" + altura + "m");
		System.out.println("cpf:" + cpf);
		System.out.println("--------------------");
		System.out.println("--------------------");
		
		
		
		
	}
}
