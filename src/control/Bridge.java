package control;

import java.util.Iterator;

import javax.swing.DefaultListModel;

import modelo.Cantante;
import modelo.ListaCantanteFamoso;
import vista.UiLista;

public class Bridge extends UiLista {
	private ListaCantanteFamoso control = new ListaCantanteFamoso();
	private ActionAgregar agregar = new ActionAgregar(this);
	private DefaultListModel modeloLista = new DefaultListModel<Cantante>();

	public Bridge() {
		setListener();
	}

	public void actualizarLista() {
		modeloLista.removeAllElements();
		for (Iterator<Cantante> iterator = control.getLista().iterator(); iterator.hasNext();) {
			Cantante cantante = (Cantante) iterator.next();
			modeloLista.addElement(cantante);
		}
		listCantante.setModel(modeloLista);

	}

	public void agregarCantante(String nombre, String disco) {
		control.agregarCantante(nombre, disco);
	}

	// Cada vez que se haga clik se va hasta el metodo de la clase ActionAgregar
	public void setListener() {
		btnIntroducir.addActionListener(agregar);
	}

	public boolean validarCampos() {
		return !textCancion.getText().isEmpty() && !textCantante.getText().isEmpty();
	}

}
