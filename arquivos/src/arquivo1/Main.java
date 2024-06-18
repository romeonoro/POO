package arquivo1;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Main {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Romeo", 18);
		Aluno aluno2 = new Aluno("Matheus", 20);
		Aluno aluno3 = new Aluno("Anthony", 21);
		
		try {
			FileWriter arquivo = new FileWriter("alunos.txt");
			BufferedWriter escritor = new BufferedWriter(arquivo);
			
			escritor.write(aluno1.getNome() + "," +aluno1.getIdade());
			escritor.newLine();
			
			escritor.write(aluno2.getNome() + "," +aluno2.getIdade());
			escritor.newLine();
			
			escritor.write(aluno3.getNome() + "," +aluno3.getIdade());
			escritor.newLine();
			
			escritor.close();
			arquivo.close();
			
			System.out.println("Alunos salvos no arquivo alunos.txt");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileReader arquivo = new FileReader("alunos.txt");
			BufferedReader leitor = new BufferedReader(arquivo);
			
			System.out.println("Alunos lidos no arquivo: ");
			
			String linha;
			while((linha = leitor.readLine()) != null) {
				String[] campos = linha.split(",");
				
				String nome = campos[0];
				int idade = Integer.parseInt(campos[1]);
				
				Aluno aluno = new Aluno(nome, idade);
				
				System.out.println("Nome: " + aluno.getNome() + ", Idade: " + aluno.getIdade());
			}
			
			leitor .close();
			arquivo.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
