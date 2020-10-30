package modelo;

import java.util.LinkedHashSet;
import java.util.Set;

public class Locatario extends Persona{
	private String actividadDedicada;
	private boolean estudiante;
	private double ingresos; 
	private String usuario;
	private String contraseña;
	private TipoTrabajador tipoTrabajador;
	Set<Contrato> Contrato = new LinkedHashSet<Contrato>();
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
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public TipoTrabajador getTipoTrabajador() {
		return tipoTrabajador;
	}
	public void setTipoTrabajador(TipoTrabajador tipoTrabajador) {
		this.tipoTrabajador = tipoTrabajador;
	}
	public Set<Contrato> getContrato() {
		return Contrato;
	}
	public void setContrato(Set<Contrato> contrato) {
		Contrato = contrato;
	}
	@Override
	public String toString() {
		return "Locatario [actividadDedicada=" + actividadDedicada + ", estudiante=" + estudiante + ", ingresos="
				+ ingresos + ", usuario=" + usuario + ", contraseña=" + contraseña + ", tipoTrabajador="
				+ tipoTrabajador + ", Contrato=" + Contrato + "]";
	}
	public Locatario(String nombreYApellido, Double dNI, String estadoCivil, String domicilio, Double telefono,
			String mail, String actividadDedicada, boolean estudiante, double ingresos, String usuario,
			String contraseña, TipoTrabajador tipoTrabajador, Set<modelo.Contrato> contrato) {
		super(nombreYApellido, dNI, estadoCivil, domicilio, telefono, mail);
		this.actividadDedicada = actividadDedicada;
		this.estudiante = estudiante;
		this.ingresos = ingresos;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.tipoTrabajador = tipoTrabajador;
		Contrato = contrato;
	}
	

}
