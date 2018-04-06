package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionAgregar implements ActionListener {
	private Bridge bridge;

	public ActionAgregar(Bridge bridge) {
		this.bridge = bridge;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Lo que se va a ejecutar cada vez que pulse el boton introducir
		if (bridge.validarCampos()) {
			bridge.agregarCantante(bridge.getTextCantante().getText(), bridge.getTextCancion().getText());
			bridge.actualizarLista();
		}
		
	
		
	}

}
