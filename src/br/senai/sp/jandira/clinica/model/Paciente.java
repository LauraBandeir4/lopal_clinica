package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {

	public String nome;
	public String cpf;
	private double altura;
	private double peso;
	public String telefone;
	public LocalDate dataNascimento;

	public void setAltura(double altura) {

		if (altura > 0 && altura < 3) {
			// true
			this.altura = altura;
		} else {
			// false
			System.out.println("A altura do(a) paciente " + nome + " deve ser maior que zero e menor que três");
		}

	}

	public void setPeso(double peso) {
		if (peso >= 30 && peso < 500) {
			// true
			this.peso = peso;
		} else {
			// false
			System.out.println("O peso do(a) paciente " + nome + " deve ser maior que 30 e menor 500");
		}
	}

	public void setNome(String nome) {
			this.nome = nome.toUpperCase();
			
		public String getNome() {
			return nome;
		}
	}

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
