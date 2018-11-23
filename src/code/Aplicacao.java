package code;

import java.util.ArrayList;
import java.util.List;

/*
 * O boolean pelaEsquerdaPr indica se a busca será feita pela esquerda ou pela direita na busca em profundidade.
 * A direção da busca em profundidade é oposta em relação à direção da busca em largura.
 */

public class Aplicacao {

	public static void main(String[] args) {

		boolean pelaEsquerdaPr = true;
//		boolean pelaEsquerdaPr = false;

		Vertice v1 = new Vertice("1");
		Vertice v2 = new Vertice("2");
		Vertice v3 = new Vertice("3");
		Vertice v4 = new Vertice("4");
		Vertice v5 = new Vertice("5");
		Vertice v6 = new Vertice("6");
		Vertice v7 = new Vertice("7");
		Vertice v8 = new Vertice("8");
		Vertice v9 = new Vertice("9");
		Vertice v10 = new Vertice("10");
		Vertice v11 = new Vertice("11");
		Vertice v12 = new Vertice("12");
		Vertice v13 = new Vertice("13");
		Vertice v14 = new Vertice("14");
		Vertice v15 = new Vertice("15");
		Vertice v16 = new Vertice("16");
		Vertice v17 = new Vertice("17");
		Vertice v18 = new Vertice("18");
		Vertice v19 = new Vertice("19");
		Vertice v20 = new Vertice("20");
		Vertice v21 = new Vertice("21");
		Vertice v22 = new Vertice("22");
		Vertice v23 = new Vertice("23");
		Vertice v24 = new Vertice("24");
		Vertice v25 = new Vertice("25");
		Vertice v26 = new Vertice("26");
		Vertice v27 = new Vertice("27");

		if (pelaEsquerdaPr) {
			v1.addVizinho(v3);
			v1.addVizinho(v2);
			
			v2.addVizinho(v4);
			v2.addVizinho(v3);
	
			v3.addVizinho(v5);
			
			v4.addVizinho(v7);
			v4.addVizinho(v6);
			
			v5.addVizinho(v9);
			v5.addVizinho(v8);
			
			v6.addVizinho(v10);
			v6.addVizinho(v7);
			
			v7.addVizinho(v8);
			
			v8.addVizinho(v9);
			
			v9.addVizinho(v11);
			
			v10.addVizinho(v13);
			v10.addVizinho(v12);
			
			v11.addVizinho(v15);
			v11.addVizinho(v14);
			
			v12.addVizinho(v16);
			v12.addVizinho(v13);
			
			v13.addVizinho(v17);
			
			v14.addVizinho(v18);
			v14.addVizinho(v15);
			
			v15.addVizinho(v19);
			
			v16.addVizinho(v21);
			v16.addVizinho(v20);
			
			v17.addVizinho(v23);
			v17.addVizinho(v22);
			
			v18.addVizinho(v25);
			v18.addVizinho(v24);
			
			v19.addVizinho(v27);
			v19.addVizinho(v26);
			
			v20.addVizinho(v21);
			
			v21.addVizinho(v22);
			
			v22.addVizinho(v23);
			
			v23.addVizinho(v24);
			
			v24.addVizinho(v25);
	
			v25.addVizinho(v26);
			
			v26.addVizinho(v27);
		} else {
			v1.addVizinho(v2);
			v1.addVizinho(v3);
			
			v2.addVizinho(v3);
			v2.addVizinho(v4);
	
			v3.addVizinho(v5);
			
			v4.addVizinho(v6);
			v4.addVizinho(v7);
			
			v5.addVizinho(v8);
			v5.addVizinho(v9);
			
			v6.addVizinho(v7);
			v6.addVizinho(v10);
			
			v7.addVizinho(v8);
			
			v8.addVizinho(v9);
			
			v9.addVizinho(v11);
			
			v10.addVizinho(v12);
			v10.addVizinho(v13);
			
			v11.addVizinho(v14);
			v11.addVizinho(v15);
			
			v12.addVizinho(v13);
			v12.addVizinho(v16);
			
			v13.addVizinho(v17);
			
			v14.addVizinho(v15);
			v14.addVizinho(v18);
			
			v15.addVizinho(v19);
			
			v16.addVizinho(v20);
			v16.addVizinho(v21);
			
			v17.addVizinho(v22);
			v17.addVizinho(v23);
			
			v18.addVizinho(v24);
			v18.addVizinho(v25);
			
			v19.addVizinho(v26);
			v19.addVizinho(v27);
			
			v20.addVizinho(v21);
			
			v21.addVizinho(v22);
			
			v22.addVizinho(v23);
			
			v23.addVizinho(v24);
			
			v24.addVizinho(v25);
	
			v25.addVizinho(v26);
			
			v26.addVizinho(v27);
		}
		
		List<Vertice> lista = new ArrayList<Vertice>();
		lista.add(v1);
		lista.add(v2);
		lista.add(v3);
		lista.add(v4);
		lista.add(v5);
		lista.add(v6);
		lista.add(v7);
		lista.add(v8);
		lista.add(v9);
		lista.add(v10);
		lista.add(v11);
		lista.add(v12);
		lista.add(v13);
		lista.add(v14);
		lista.add(v15);
		lista.add(v16);
		lista.add(v17);
		lista.add(v18);
		lista.add(v19);
		lista.add(v20);
		lista.add(v21);
		lista.add(v22);
		lista.add(v23);
		lista.add(v24);
		lista.add(v25);
		lista.add(v26);
		lista.add(v27);
		
//		BuscaP buscap = new BuscaP();
//		buscap.bpComStack(v1);
		
		BuscaL buscal = new BuscaL();
		buscal.blComQueue(v1);
	}
}