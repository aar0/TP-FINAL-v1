package controlador;

import java.awt.EventQueue;

import vista.VentanaPrincipal;
import controlador.controlador;
public class main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					controlador cont = new controlador();
					VentanaPrincipal frame = new VentanaPrincipal(cont);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
