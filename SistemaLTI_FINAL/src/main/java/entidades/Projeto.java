package entidades;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
	
	private Professor responsavelProjeto;
	private String dataInicioProjeto;
	private String dataConclusaoProjeto;
	private String areaRelacionada;
	private String tituloProjeto;
	private String descricaoProjeto;
	private List<Aluno> equipe;
	private List<Tecnologia> tecnologias;
	private List<Link> links;
		
	public Projeto(){
		this.equipe = new ArrayList<Aluno>();
		this.tecnologias = new ArrayList<Tecnologia>();
		this.links = new ArrayList<Link>();
	}
	
	public Professor getResponsavelProjeto() {
		return responsavelProjeto;
	}
	public void setResponsavelProjeto(Professor responsavelProjeto) {
		this.responsavelProjeto = responsavelProjeto;
	}
	public String getDataInicioProjeto() {
		return dataInicioProjeto;
	}
	public void setDataInicioProjeto(String dataInicioProjeto) {
		this.dataInicioProjeto = dataInicioProjeto;
	}
	public String getDataConclusaoProjeto() {
		return dataConclusaoProjeto;
	}
	public void setDataConclusaoProjeto(String dataConclusaoProjeto) {
		this.dataConclusaoProjeto = dataConclusaoProjeto;
	}
	public String getAreaRelacionada() {
		return areaRelacionada;
	}
	public void setAreaRelacionada(String areaRelacionada) {
		this.areaRelacionada = areaRelacionada;
	}
	public String getTituloProjeto() {
		return tituloProjeto;
	}
	public void setTituloProjeto(String tituloProjeto) {
		this.tituloProjeto = tituloProjeto;
	}
	public String getDescricaoProjeto() {
		return descricaoProjeto;
	}
	public void setDescricaoProjeto(String descricaoProjeto) {
		this.descricaoProjeto = descricaoProjeto;
	}
	public List<Aluno> getEquipe() {
		return equipe;
	}
	public void setEquipe(List<Aluno> equipe) {
		this.equipe = equipe;
	}
	public List<Tecnologia> getTecnologias() {
		return tecnologias;
	}
	public void setTecnologias(List<Tecnologia> tecnologias) {
		this.tecnologias = tecnologias;
	}
	public List<Link> getLinks() {
		return links;
	}
	public void setLinks(List<Link> links) {
		this.links = links;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((areaRelacionada == null) ? 0 : areaRelacionada.hashCode());
		result = prime * result + ((dataConclusaoProjeto == null) ? 0 : dataConclusaoProjeto.hashCode());
		result = prime * result + ((dataInicioProjeto == null) ? 0 : dataInicioProjeto.hashCode());
		result = prime * result + ((descricaoProjeto == null) ? 0 : descricaoProjeto.hashCode());
		result = prime * result + ((equipe == null) ? 0 : equipe.hashCode());
		result = prime * result + ((links == null) ? 0 : links.hashCode());
		result = prime * result + ((responsavelProjeto == null) ? 0 : responsavelProjeto.hashCode());
		result = prime * result + ((tecnologias == null) ? 0 : tecnologias.hashCode());
		result = prime * result + ((tituloProjeto == null) ? 0 : tituloProjeto.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Projeto other = (Projeto) obj;
		if (areaRelacionada == null) {
			if (other.areaRelacionada != null)
				return false;
		} else if (!areaRelacionada.equals(other.areaRelacionada))
			return false;
		if (dataConclusaoProjeto == null) {
			if (other.dataConclusaoProjeto != null)
				return false;
		} else if (!dataConclusaoProjeto.equals(other.dataConclusaoProjeto))
			return false;
		if (dataInicioProjeto == null) {
			if (other.dataInicioProjeto != null)
				return false;
		} else if (!dataInicioProjeto.equals(other.dataInicioProjeto))
			return false;
		if (descricaoProjeto == null) {
			if (other.descricaoProjeto != null)
				return false;
		} else if (!descricaoProjeto.equals(other.descricaoProjeto))
			return false;
		if (equipe == null) {
			if (other.equipe != null)
				return false;
		} else if (!equipe.equals(other.equipe))
			return false;
		if (links == null) {
			if (other.links != null)
				return false;
		} else if (!links.equals(other.links))
			return false;
		if (responsavelProjeto == null) {
			if (other.responsavelProjeto != null)
				return false;
		} else if (!responsavelProjeto.equals(other.responsavelProjeto))
			return false;
		if (tecnologias == null) {
			if (other.tecnologias != null)
				return false;
		} else if (!tecnologias.equals(other.tecnologias))
			return false;
		if (tituloProjeto == null) {
			if (other.tituloProjeto != null)
				return false;
		} else if (!tituloProjeto.equals(other.tituloProjeto))
			return false;
		return true;
	}
	
}
