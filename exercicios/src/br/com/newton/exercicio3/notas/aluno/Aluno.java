package br.com.newton.exercicio3.notas.aluno;

public class Aluno {
	
	private String nome;
	private String curso; 
	private int matricula;
	private int periodo;
	private float notaAV1, notaAV2, notaAE;
	
	//ctrl + 3 - gcuf - gerar construtor automaticamente
	
	public Aluno(String nome, String curso, int matricula, int periodo, float notaAv1, float notaAv2, float notaAE) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.matricula = matricula;
		this.periodo = periodo;
		this.notaAV1 = notaAv1;
		this.notaAV2 = notaAv2;
		this.notaAE = notaAE;
	}
	
	public void alteraNotaAV1(float nota) {
		this.notaAV1=nota;
	}
	
	public void alteraNotaAV2(float nota) {
		this.notaAV2=nota;
	}
	
	public void alteraNotaAE(float nota) {
		this.notaAE=nota;
	}
	
	public String avaliarAluno() {
		if((this.notaAV1+this.notaAV2)>=60)
			return "Aprovado";
		else 
			return "Recuperação";
	}
		
	public String avaliarRecuperacao() {
		if(((this.notaAV1+this.notaAV2+this.notaAE)/2)>=60)
			return "Aprovado";
		else
			return "Reprovado";		
	}
	
}
