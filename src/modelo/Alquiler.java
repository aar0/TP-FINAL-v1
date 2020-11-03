package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

public class Alquiler extends Contrato{
	private ArrayList<Servicio> Servicio = new ArrayList();
	private ArrayList<Propiedad> Propiedad = new ArrayList();
	private Garante Garante;
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
	public Garante getGarante() {
		return Garante;
	}
	public void setGarante(Garante garante) {
		Garante = garante;
	}
	@Override
	public String toString() {
		return "Alquiler [Servicio=" + Servicio + ", Propiedad=" + Propiedad + ", Garante=" + Garante + "]";
	}
	public Alquiler(long id, Date primerFechaPago, Date segundaFechaPago, int recargoFijo,
			int valorBaseRecargoProporcional, Comision comision, Date inicioDeContrato, Date finDeContrato,
			Set<Arancel> arancel, modelo.Locador locador, modelo.Locatario locatario,
			ArrayList<modelo.Servicio> servicio, ArrayList<modelo.Propiedad> propiedad, modelo.Garante garante) {
		super(id, primerFechaPago, segundaFechaPago, recargoFijo, valorBaseRecargoProporcional, comision,
				inicioDeContrato, finDeContrato, arancel, locador, locatario);
		Servicio = servicio;
		Propiedad = propiedad;
		Garante = garante;
	}
	
	
}
