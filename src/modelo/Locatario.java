package modelo;

import java.util.LinkedHashSet;
import java.util.Set;

public class Locatario extends Persona{
	private String actividadDedicada;
	private boolean estudiante;
	private double ingresos; 
	private String usuario;
	private String contrase�a;
	private TipoTrabajador tipoTrabajador;
	public String getActividadDedicada() {
		return actividadDedicada;
	}
	public void setActividadDedicada(String actividadDedicada) {
		this.actividadDedicada = actividadDedicada;
	}
	public boolean isEstudiante() {
		return estudiante;
	}
	public void setEstudiante(boolean estudiante) {
		this.estudiante = estudiante;
	}
	public double getIngresos() {
		return ingresos;
	}
	public void setIngresos(double ingresos) {
		this.ingresos = ingresos;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	public TipoTrabajador getTipoTrabajador() {
		return tipoTrabajador;
	}
	public void setTipoTrabajador(TipoTrabajador tipoTrabajador) {
		this.tipoTrabajador = tipoTrabajador;
	}
	@Override
	public String toString() {
		return "Locatario [actividadDedicada=" + actividadDedicada + ", estudiante=" + estudiante + ", ingresos="
				+ ingresos + ", usuario=" + usuario + ", contrase�a=" + contrase�a + ", tipoTrabajador="
				+ tipoTrabajador + "]";
	}
	public Locatario(String nombreYApellido, Double dNI, String estadoCivil, String domicilio, Double telefono,
			String mail, String actividadDedicada, boolean estudiante, double ingresos, String usuario,
			String contrase�a, TipoTrabajador tipoTrabajador) {
		super(nombreYApellido, dNI, estadoCivil, domicilio, telefono, mail);
		this.actividadDedicada = actividadDedicada;
		this.estudiante = estudiante;
		this.ingresos = ingresos;
		this.usuario = usuario;
		this.contrase�a = contrase�a;
		this.tipoTrabajador = tipoTrabajador;
	}
	

}
