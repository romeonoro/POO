package arquivo2;

import java.util.ArrayList;
import java.util.List;

import arquivo1.Aluno;

public class Main {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno ("Romeo", 18);
		Aluno aluno2 = new Aluno ("Anthony", 21);
		Aluno aluno3 = new Aluno ("Matheus", 20);
		List<Aluno> lista = new ArrayList<>();
		Arquivo arquivo = new Arquivo("alunos");
		arquivo.gravaArquivo(aluno1);
		arquivo.gravaArquivo(aluno2);
		arquivo.gravaArquivo(aluno3);
		
		lista = arquivo.lerArquivo();
		
		for(Aluno a : lista) {
			System.out.println("Nome: " + a.getNome() + ", Idade: " + a.getIdade());
		}

	}
}
