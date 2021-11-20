package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
	private Integer carga_horaria;
	
	public Curso() {
	}
	
	public Integer getCarga_horaria() {
		return carga_horaria;
	}
	public void setCarga_horaria(Integer carga_horaria) {
		this.carga_horaria = carga_horaria;
	}
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", carga_horaria=" + carga_horaria + "]";
	}

	@Override
	public Double calcularXp() {
		return XP_PADRAO * carga_horaria;
	}
}
