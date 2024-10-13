package controller;

import br.edu.fateczl.listaencadeada.Lista;

public class ListaController {

		
		public ListaController() {
			super();
		}
		
		
		public void inserirLista(int[] vet, Lista<Integer> lista )throws Exception {		
			
			int tamanho=vet.length;
			
			
			lista.addFirst(vet[0]);
			for(int i=1;i<tamanho;i++) {
				lista.addLast(vet[i]);
			}
			System.out.println("lista principal preenchida");
			System.out.println("lista principal com , "+lista.size() +" elementos sendo: ");
			for(int i=0;i<tamanho;i++) {
				System.out.println("elemento #"+ i +" : "+lista.get(i));
				}
			
			
		}
		
		public void inverterlista(Lista <Integer>lista )throws Exception {
			
			//criação lista auxiliar
			Lista<Integer> lAux  = new Lista<>();
			
			//preenchendo lista auxiliar com elementos da lista pricipal , de trás para frente			
			
			lAux.addFirst(lista.get(10));//primeiro da lista auxiliar será o 11º da lista principal 
			
			for(int i=9;i>=0;i--) {
				lAux.addLast(lista.get(i));//preenchimento das outras posições,do 10º elemento(pos. 9) até o 1º (pos.0) entrando por ultimo na lista aux. 
				}
			System.out.println("lista Auxiliar com , "+lAux.size() +" elementos sendo");//printando quantos elementos tem na lista aux
		
			
			int tamanho=lista.size();
			for(int i=0;i<tamanho;i++) {
				System.out.println("elemento #"+ i +" : "+lAux.get(i));//printando elementos na ordem da lista auxiliar
				}
			
			//esvaziando lista principal
			while(!lista.isEmpty()) {
				lista.removeFirst();
			}
			System.out.println("Esvaziando lista principal");
			System.out.println("Lista principal vazia , iniciando repreenchimento");
			
			//repreenchendo lista principal com mesma ordem da lista auxiliar
			lista.addFirst(lAux.get(0));
			
			for(int i=1;i<tamanho;i++) {
				lista.addLast(lAux.get(i));
				}
			
			//lista repreenchida ,printando nova ordem 
			for(int i=0;i<tamanho;i++) {
				System.out.println("elemento #"+ i +" : "+lista.get(i));
				}
			
		}
	
}
