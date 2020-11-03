package controlador;

import javax.swing.JOptionPane;

import util.NotificacionError;

public class Controlador {
	private Persistencia persistencia;
	public Controlador(Persistencia persistencia) {
		this.persistencia = persistencia;
	}
	public void desconectarBaseDatos() {
		this.persistencia.desconectar();
	}
	public void agregar() {
		JOptionPane.showMessageDialog(null, "error, RELLENE CAMPOS NECESARIOS!", "OK", 3);
	}
}
