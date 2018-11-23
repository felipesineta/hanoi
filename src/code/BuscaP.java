package code;

import java.util.Stack;

public class BuscaP {

	private Stack<Vertice> stack;
	
	public BuscaP () {
		this.stack = new Stack<>();	
	}

	public void bpComStack(Vertice verticeRaiz) {
		this.stack.add(verticeRaiz);
		
		while (!stack.isEmpty()) {
			Vertice verticeAtual = this.stack.pop();
			System.out.print(verticeAtual.getValor() + " ");
			
			for (Vertice v : verticeAtual.getVizinhos()) {
				if (!v.isVisitado()) {
					v.setVisitado(true);
					this.stack.push(v);
				}
			}

			if (verticeAtual.getValor().equals("27")) {
				System.out.print("\nChegou no estado final! Encerra a busca.");
				stack.clear();
			}
		}
	}
}
