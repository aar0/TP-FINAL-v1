package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

public class Alquiler extends Contrato{
	private ArrayList<Servicio> Servicio = new ArrayList();
	private ArrayList<Propiedad> Propiedad = new ArrayList();
	public ArrayList<Servicio> getServicio() {
		return Servicio;
	}
	public void setServicio(ArrayList<Servicio> servicio) {
		Servicio = servicio;
	}
	public ArrayList<Propiedad> getPropiedad() {
		return Propiedad;
	}
	public void setPropiedad(ArrayList<Propiedad> propiedad) {
		Propiedad = propiedad;
	}
	@Override
	public String toString() {
		return "Alquiler [Servicio=" + Servicio + ", Propiedad=" + Propiedad + "]";
	}
	public Alquiler(Date primerFechaPago, Date segundaFechaPago, int recargoFijo, int valorBaseRecargoProporcional,
			Comision comision, Date inicioDeContrato, Date finDeContrato, Set<Arancel> arancel,
			ArrayList<modelo.Servicio> servicio, ArrayList<modelo.Propiedad> propiedad) {
		super(primerFechaPago, segundaFechaPago, recargoFijo, valorBaseRecargoProporcional, comision, inicioDeContrato,
				finDeContrato, arancel);
		Servicio = servicio;
		Propiedad = propiedad;
	}
}
