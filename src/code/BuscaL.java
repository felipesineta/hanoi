package code;

import java.util.LinkedList;

public class BuscaL {

private LinkedList<Vertice> queue;
	
	public BuscaL () {
		this.queue = new LinkedList<>();	
	}

	public void blComQueue(Vertice verticeRaiz) {
		this.queue.add(verticeRaiz);
		
		while (!queue.isEmpty()) {
			Vertice verticeAtual = this.queue.pop();
			System.out.print(verticeAtual.getValor() + " ");
			
			for (Vertice v : verticeAtual.getVizinhos()) {
				if (!v.isVisitado()) {
					v.setVisitado(true);
					this.queue.add(v);
				}
			}

			if (verticeAtual.getValor().equals("27")) {
				System.out.print("\nChegou no estado final! Encerra a busca.");
				queue.clear();
			}
		}
	}
}
