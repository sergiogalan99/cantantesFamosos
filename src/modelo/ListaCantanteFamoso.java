package modelo;

import java.util.ArrayList;

import control.Bridge;
//Los arrayList y el tipo que van a tener especifico
public class ListaCantanteFamoso {

	private ArrayList<Cantante> lista = new ArrayList<>();

	public void agregarCantante(String nombre, String disco) {
		if (nombre.isEmpty() || disco.isEmpty()) {
			
			
		}
		// Para añadir a la lista un cantante se le pasa la instancia
		this.lista.add(new Cantante(nombre, disco));
	}

	public ArrayList<Cantante> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Cantante> lista) {
		this.lista = lista;
	}

	

}
