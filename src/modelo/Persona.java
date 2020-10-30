package modelo;

public class Persona {
	private String nombreYApellido;
	private double DNI;
	private String estadoCivil;
	private String domicilio; 
	private double telefono; 
	private String mail;
	public String getNombreYApellido() {
		return nombreYApellido;
	}
	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}
	public Double getDNI() {
		return DNI;
	}
	public void setDNI(Double dNI) {
		DNI = dNI;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public Double getTelefono() {
		return telefono;
	}
	public void setTelefono(Double telefono) {
		this.telefono = telefono;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Persona(String nombreYApellido, Double dNI, String estadoCivil, String domicilio, Double telefono,
			String mail) {
		super();
		this.nombreYApellido = nombreYApellido;
		DNI = dNI;
		this.estadoCivil = estadoCivil;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "Persona [nombreYApellido=" + nombreYApellido + ", DNI=" + DNI + ", estadoCivil=" + estadoCivil
				+ ", domicilio=" + domicilio + ", telefono=" + telefono + ", mail=" + mail + "]";
	} 

}
