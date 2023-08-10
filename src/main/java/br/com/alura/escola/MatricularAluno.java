package br.com.alura.escola;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.FabricaDeAluno;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAluno {

	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "123.456.789-00";
		String email = "fulano@email.com";
		
		Aluno aluno = new FabricaDeAluno()
				.comNomeCPFEmail(nome, cpf, email)
				.criar();
		
		RepositorioDeAlunos repositorio = new RepositorioDeAlunosEmMemoria();
		repositorio.matricular(aluno);
	}
}
