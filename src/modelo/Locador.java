package modelo;

import java.util.LinkedHashSet;
import java.util.Set;

public class Locador extends Persona{
	Set<Contrato> Contrato = new LinkedHashSet<Contrato>();

	public Set<Contrato> getContrato() {
		return Contrato;
	}

	public void setContrato(Set<Contrato> contrato) {
		Contrato = contrato;
	}

	@Override
	public String toString() {
		return "Locador [Contrato=" + Contrato + "]";
	}

	public Locador(String nombreYApellido, Double dNI, String estadoCivil, String domicilio, Double telefono,
			String mail, Set<modelo.Contrato> contrato) {
		super(nombreYApellido, dNI, estadoCivil, domicilio, telefono, mail);
		Contrato = contrato;
	} 

}
