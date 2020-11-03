package modelo;

public class Garante extends Persona{
	private String actividadDedicada;
	private TipoTrabajador tipoTrabajador;
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
	@Override
	public String toString() {
		return "Garante [actividadDedicada=" + actividadDedicada + ", tipoTrabajador=" + tipoTrabajador + "]";
	}
	public Garante(String nombreYApellido, Double dNI, String estadoCivil, String domicilio, Double telefono,
			String mail, String actividadDedicada, TipoTrabajador tipoTrabajador) {
		super(nombreYApellido, dNI, estadoCivil, domicilio, telefono, mail);
		this.actividadDedicada = actividadDedicada;
		this.tipoTrabajador = tipoTrabajador;
	}

}
