package view;

import br.edu.fateczl.listaencadeada.Lista;
import controller.ListaController;

public class Principal {
	
		public static <T> void main(String[] args)throws Exception {

			Lista<Integer> lista = new Lista<>();
			
			int []vet= {3,5,18,12,9,7,6,2,13,4,16};
			
			ListaController l = new ListaController();
			
			l.inserirLista(vet,lista);
			
			l.inverterlista(lista);
			
		}
		
	

}
