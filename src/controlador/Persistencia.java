package controlador;

import com.mysql.cj.xdevapi.Session;
import com.mysql.cj.xdevapi.SessionFactory;

import util.NotificacionError;

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
	protected void comprobarSesion() throws NotificacionError {
		String mensaje = null;

		try {
			/*
			 * Se verifica que el factory esté disponible.
			 */
			if (this.factory.isClosed()) {
				/*
				 * Se intenta abrir la conexión.
				 */
				this.crearConexión();
			}

			/*
			 * Se verifica si la sesión está disponible.
			 */
			if (this.sesion == null || !this.sesion.isConnected()) {
				/*
				 * Se crea una nueva sesión.
				 */
				this.sesion = this.factory.openSession();
			}
		} catch (HibernateException e) {
			mensaje = "Se ha interrumpido la conexión con la base de datos.";
			throw new NotificacionError(mensaje);
		}
	}

	private void crearConexion() throws NotificacionError {
		try {
			this.factory = new Configuration().configure(this.configuracion).buildSessionFactory();
		} catch (HibernateException e) {
			throw new NotificacionError(e.getMessage());
		}
	}
}
