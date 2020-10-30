package modelo;

import java.util.Date;
import java.util.Set;

public class Venta extends Contrato{
	private int cantidadDeAranceles;
	private Inmueble inmueble;
	public int getCantidadDeAranceles() {
		return cantidadDeAranceles;
	}
	public void setCantidadDeAranceles(int cantidadDeAranceles) {
		this.cantidadDeAranceles = cantidadDeAranceles;
	}
	public Inmueble getInmueble() {
		return inmueble;
	}
	public void setInmueble(Inmueble inmueble) {
		this.inmueble = inmueble;
	}
	@Override
	public String toString() {
		return "Venta [cantidadDeAranceles=" + cantidadDeAranceles + ", inmueble=" + inmueble + "]";
	}
	public Venta(Date primerFechaPago, Date segundaFechaPago, int recargoFijo, int valorBaseRecargoProporcional,
			Comision comision, Date inicioDeContrato, Date finDeContrato, Set<Arancel> arancel, int cantidadDeAranceles,
			Inmueble inmueble) {
		super(primerFechaPago, segundaFechaPago, recargoFijo, valorBaseRecargoProporcional, comision, inicioDeContrato,
				finDeContrato, arancel);
		this.cantidadDeAranceles = cantidadDeAranceles;
		this.inmueble = inmueble;
	}
	
}
