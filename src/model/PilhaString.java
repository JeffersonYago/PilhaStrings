package model;

public class PilhaString {

	Nó topo;
	
	public PilhaString() {
		topo = null;
	}
	
	public boolean isEmpty() {
		if (topo == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void Push(String Valor) {
		Nó elemento = new Nó();
		elemento.dado = Valor;
		elemento.Próximo = topo;
		topo = elemento;
		
	}
	
	public String pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pilha vazia");
		}
		String Valor = topo.dado;
		topo = topo.Próximo;
		return Valor;
		
	}
	public String top() throws Exception{
		if (isEmpty()) {
			throw new Exception("Pilha vazia");
		}
		String Valor = topo.dado;
		return Valor;
	}
	public int size() {
		int cont = 0;
		if(!isEmpty()) {
			Nó aux = topo;
			while(aux != null) {
				cont++;
				aux = aux.Próximo;
			}
		}
		return cont;
	}
}