package controlador;

import com.mysql.cj.xdevapi.Session;
import com.mysql.cj.xdevapi.SessionFactory;

public class Persistencia {
	private final String configuracion = "HIBERNATE/hibernate.cfg.xml";
	private SessionFactory factory;
	private Session sesion;

	public Persistencia() {
		this.crearConexion();
	}
	protected void desconectar() {
		/*
		 * Primero se cierra la sesión.
		 */
		this.cerrarSesion();

		/*
		 * Se cierra la conexión a la base de datos desde el sessionFactory.
		 */
		if (this.factory != null) {
			if (this.factory.isOpen()) {
				this.factory.close();
			}
		}
	}
	protected void cerrarSesion() {
		if (this.sesion != null) {
			if (this.sesion.isConnected()) {
				this.sesion.disconnect();
			}

			if (this.sesion.isOpen()) {
				this.sesion.close();
			}
		}
	}
}
