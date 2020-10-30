package modelo;

import java.util.LinkedHashSet;
import java.util.Set;

public class Garante extends Persona{
	private String actividadDedicada;
	private TipoTrabajador tipoTrabajador;
	Set<Alquiler> Alquiler = new LinkedHashSet<Alquiler>();
	public String getActividadDedicada() {
		return actividadDedicada;
	}
	public void setActividadDedicada(String actividadDedicada) {
		this.actividadDedicada = actividadDedicada;
	}
	public TipoTrabajador getTipoTrabajador() {
		return tipoTrabajador;
	}
	public void setTipoTrabajador(TipoTrabajador tipoTrabajador) {
		this.tipoTrabajador = tipoTrabajador;
	}
	public Set<Alquiler> getAlquiler() {
		return Alquiler;
	}
	public void setAlquiler(Set<Alquiler> alquiler) {
		Alquiler = alquiler;
	}
	@Override
	public String toString() {
		return "Garante [actividadDedicada=" + actividadDedicada + ", tipoTrabajador=" + tipoTrabajador + ", Alquiler="
				+ Alquiler + "]";
	}
	public Garante(String nombreYApellido, Double dNI, String estadoCivil, String domicilio, Double telefono,
			String mail, String actividadDedicada, TipoTrabajador tipoTrabajador, Set<modelo.Alquiler> alquiler) {
		super(nombreYApellido, dNI, estadoCivil, domicilio, telefono, mail);
		this.actividadDedicada = actividadDedicada;
		this.tipoTrabajador = tipoTrabajador;
		Alquiler = alquiler;
	}
	
	
}
