package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	private String nome;
	private String descricao;
	private final LocalDate data_inicial = LocalDate.now();
	private final LocalDate data_final = data_inicial.plusDays(45);
	private Set<Dev> devs_inscritos = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Set<Dev> getDevs_inscritos() {
		return devs_inscritos;
	}
	public void setDevs_inscritos(Set<Dev> devs_inscritos) {
		this.devs_inscritos = devs_inscritos;
	}
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	public LocalDate getData_inicial() {
		return data_inicial;
	}
	public LocalDate getData_final() {
		return data_final;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public int hashCode() {
		return Objects.hash(conteudos, data_final, data_inicial, descricao, devs_inscritos, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(data_final, other.data_final)
				&& Objects.equals(data_inicial, other.data_inicial) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(devs_inscritos, other.devs_inscritos) && Objects.equals(nome, other.nome);
	}
}
