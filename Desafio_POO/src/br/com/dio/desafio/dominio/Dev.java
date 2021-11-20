package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudo> conteudos_inscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudos_concluidos = new LinkedHashSet<>();
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudos_inscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevs_inscritos().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo> c = this.conteudos_inscritos.stream().findFirst();
		if(c.isPresent()) {
			this.conteudos_concluidos.add(c.get());
			this.conteudos_inscritos.remove(c.get());
		} else {
			System.err.println("Voce nao esta matriculado em nenhum conteudo!");
		}
	}
	
	public Double calcularXpTotal() {
		return this.conteudos_concluidos.stream().mapToDouble(c -> c.calcularXp()).sum();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudos_inscritos() {
		return conteudos_inscritos;
	}

	public void setConteudos_inscritos(Set<Conteudo> conteudos_inscritos) {
		this.conteudos_inscritos = conteudos_inscritos;
	}

	public Set<Conteudo> getConteudos_concluidos() {
		return conteudos_concluidos;
	}

	public void setConteudos_concluidos(Set<Conteudo> conteudos_concluidos) {
		this.conteudos_concluidos = conteudos_concluidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudos_concluidos, conteudos_inscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudos_concluidos, other.conteudos_concluidos)
				&& Objects.equals(conteudos_inscritos, other.conteudos_inscritos) && Objects.equals(nome, other.nome);
	}
	
}
