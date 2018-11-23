package code;

import java.util.ArrayList;
import java.util.List;

public class Vertice {

	private String valor;
	private boolean visitado;
	private List<Vertice> vizinhos;
	
	public Vertice (String valor) {
		this.valor = valor;
		this.vizinhos = new ArrayList<Vertice>();
	}
	
	public void addVizinho(Vertice vertice) {
		this.vizinhos.add(vertice);
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public boolean isVisitado() {
		return visitado;
	}

	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}

	public List<Vertice> getVizinhos() {
		return vizinhos;
	}

	public void setVizinhos(List<Vertice> vizinhos) {
		this.vizinhos = vizinhos;
	}
}
