package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class ClinicaApp {

	public static void main(String[] args) {
		// Criar um objeto do tipo Paciente
		Paciente p1 = new Paciente();
		p1.setNome("Ana Maria");
		p1.cpf = "999.888.777-66";
		p1.setAltura(11.60);
		p1.setPeso(75);
		p1.telefone = "(11)98766-7523";
		p1.dataNascimento = LocalDate.of(2005, 8, 1);

		Paciente p2 = new Paciente();
		p2.setNome("Laura");
		p2.cpf = "879.548.758-66";
		p2.setAltura(1.60);
		p2.setPeso(80);
		p2.telefone = "(11)98766-7524";
		p2.dataNascimento = LocalDate.of(2007, 12, 13);
		System.out.println(p2.dataNascimento);
		System.out.println(p2.dataNascimento.getDayOfWeek());

//		public void setNome(Strinh Nome) {
//			this.nome = nome.toUpperCase()
//		}
		Paciente p3 = p2;

		new Paciente();

		System.out.println(p1.nome);
		System.out.println(p2.nome);
		System.out.println(p3.nome);
		System.out.println(p1.nome);
		System.out.println(p2.nome);

		p1.mostrarDados();
		p2.mostrarDados();

		String teste = p1.getNome();
		System.out.println(teste.toLowerCase());
		System.out.println(p2.getNome());
	}

}
