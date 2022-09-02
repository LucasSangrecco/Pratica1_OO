package br.com.newton.exercicio3.notas.aluno;

public class AlunoMain {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Ana","ADS", 123, 3, 20, 30, 0);
		System.out.println(aluno1.avaliarAluno());
		System.out.println(aluno1.avaliarRecuperacao());
		aluno1.alteraNotaAE(70);
		System.out.println("Alterar nota da Prova Especial");
		System.out.println(aluno1.avaliarRecuperacao());
		
	}

}
