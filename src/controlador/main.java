package controlador;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

import vista.VentanaPrincipal;
import controlador.*;

public class main {

	public static void main(String[] args) {
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
				try {
					controlador.desconectarBaseDatos();
				} catch (NotificacionError e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Controlador cont = new Controlador();
					VentanaPrincipal frame = new VentanaPrincipal(cont);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
