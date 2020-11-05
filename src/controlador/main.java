package controlador;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

import vista.VentanaPrincipal;
import controlador.*;
import util.NotificacionError;
public class main {

	public static void main(String[] args) throws NotificacionError {
		Persistencia persistencia = null;
		Controlador controlador = null;

		try {

			/*
			 * Se declara y crea una instancia de la Persistencia.
			 */
			persistencia = new Persistencia();

			/*
			 * Se declara y crea una instancia del Controlador.
			 */
			controlador = new Controlador(persistencia);

			/*
			 * Se declara y crea una instancia de la ventana principal, a la cual se le pasa
			 * la instancia del Controlador.
			 */
			VentanaPrincipal ventana = new VentanaPrincipal(controlador);

			/*
			 * Se le indica a la ventana que se haga visible.
			 */
			ventana.setVisible(true);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());

			/*
			 * Se asegura de que se cierre la conexión de la base de datos.
			 */
			if (controlador != null) {
				controlador.desconectarBaseDatos();
			}
		}
	}
}
