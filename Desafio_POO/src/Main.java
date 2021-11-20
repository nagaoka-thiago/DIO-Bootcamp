import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descricao curso java");
		curso1.setCarga_horaria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descricao curso js");
		curso2.setCarga_horaria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descricao mentoria java");
		mentoria.setData(LocalDate.now());
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		System.out.println("-----------Exploracao do Dev Thiago-----------");
		Dev dev1 = new Dev();
		dev1.setNome("Thiago");
		System.out.println("Conteudos inscritos: " + dev1.getConteudos_inscritos());
		System.out.println("Conteudos concluidos: " + dev1.getConteudos_concluidos());
		System.out.println("XP: " + dev1.calcularXpTotal());
		
		System.out.println("-----------Dev Thiago se inscreveu no bootcamp-----------");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos: " + dev1.getConteudos_inscritos());
		System.out.println("Conteudos concluidos: " + dev1.getConteudos_concluidos());
		System.out.println("XP: " + dev1.calcularXpTotal());
		
		System.out.println("-----------Dev Thiago progrediu no bootcamp-----------");
		dev1.progredir();
		System.out.println("Conteudos inscritos: " + dev1.getConteudos_inscritos());
		System.out.println("Conteudos concluidos: " + dev1.getConteudos_concluidos());
		System.out.println("XP: " + dev1.calcularXpTotal());
		
		System.out.println("-----------Dev Thiago progrediu no bootcamp-----------");
		dev1.progredir();
		System.out.println("Conteudos inscritos: " + dev1.getConteudos_inscritos());
		System.out.println("Conteudos concluidos: " + dev1.getConteudos_concluidos());
		System.out.println("XP: " + dev1.calcularXpTotal());
		
		System.out.println("-----------Exploracao do Dev Joao-----------");
		
		Dev dev2 = new Dev();
		dev2.setNome("Joao");
		System.out.println("Conteudos inscritos: " + dev2.getConteudos_inscritos());
		System.out.println("Conteudos concluidos: " + dev2.getConteudos_concluidos());
		System.out.println("XP: " + dev2.calcularXpTotal());
		
		System.out.println("-----------Dev Joao se inscreveu no bootcamp-----------");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos: " + dev2.getConteudos_inscritos());
		System.out.println("Conteudos concluidos: " + dev2.getConteudos_concluidos());
		System.out.println("XP: " + dev2.calcularXpTotal());
		
		System.out.println("-----------Dev Joao progrediu no bootcamp-----------");
		dev2.progredir();
		System.out.println("Conteudos inscritos: " + dev2.getConteudos_inscritos());
		System.out.println("Conteudos concluidos: " + dev2.getConteudos_concluidos());
		System.out.println("XP: " + dev2.calcularXpTotal());
		
		System.out.println("-----------Dev Joao progrediu no bootcamp-----------");
		dev2.progredir();
		System.out.println("Conteudos inscritos: " + dev2.getConteudos_inscritos());
		System.out.println("Conteudos concluidos: " + dev2.getConteudos_concluidos());
		System.out.println("XP: " + dev2.calcularXpTotal());
		
		System.out.println("-----------Dev Joao progrediu no bootcamp-----------");
		dev2.progredir();
		System.out.println("Conteudos inscritos: " + dev2.getConteudos_inscritos());
		System.out.println("Conteudos concluidos: " + dev2.getConteudos_concluidos());
		System.out.println("XP: " + dev2.calcularXpTotal());
	}
}
