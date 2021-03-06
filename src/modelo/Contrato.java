package modelo;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

public class Contrato {
	private long id;
	private Date primerFechaPago;
	private Date segundaFechaPago;
	private int recargoFijo;
	private int valorBaseRecargoProporcional;
	private Comision comision;
	private Date inicioDeContrato;
	private Date finDeContrato;
	Set<Arancel> arancel = new LinkedHashSet<Arancel>();
	private Locador Locador;
	private Locatario Locatario;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getPrimerFechaPago() {
		return primerFechaPago;
	}
	public void setPrimerFechaPago(Date primerFechaPago) {
		this.primerFechaPago = primerFechaPago;
	}
	public Date getSegundaFechaPago() {
		return segundaFechaPago;
	}
	public void setSegundaFechaPago(Date segundaFechaPago) {
		this.segundaFechaPago = segundaFechaPago;
	}
	public int getRecargoFijo() {
		return recargoFijo;
	}
	public void setRecargoFijo(int recargoFijo) {
		this.recargoFijo = recargoFijo;
	}
	public int getValorBaseRecargoProporcional() {
		return valorBaseRecargoProporcional;
	}
	public void setValorBaseRecargoProporcional(int valorBaseRecargoProporcional) {
		this.valorBaseRecargoProporcional = valorBaseRecargoProporcional;
	}
	public Comision getComision() {
		return comision;
	}
	public void setComision(Comision comision) {
		this.comision = comision;
	}
	public Date getInicioDeContrato() {
		return inicioDeContrato;
	}
	public void setInicioDeContrato(Date inicioDeContrato) {
		this.inicioDeContrato = inicioDeContrato;
	}
	public Date getFinDeContrato() {
		return finDeContrato;
	}
	public void setFinDeContrato(Date finDeContrato) {
		this.finDeContrato = finDeContrato;
	}
	public Set<Arancel> getArancel() {
		return arancel;
	}
	public void setArancel(Set<Arancel> arancel) {
		this.arancel = arancel;
	}
	public Locador getLocador() {
		return Locador;
	}
	public void setLocador(Locador locador) {
		Locador = locador;
	}
	public Locatario getLocatario() {
		return Locatario;
	}
	public void setLocatario(Locatario locatario) {
		Locatario = locatario;
	}
	@Override
	public String toString() {
		return "Contrato [id=" + id + ", primerFechaPago=" + primerFechaPago + ", segundaFechaPago=" + segundaFechaPago
				+ ", recargoFijo=" + recargoFijo + ", valorBaseRecargoProporcional=" + valorBaseRecargoProporcional
				+ ", comision=" + comision + ", inicioDeContrato=" + inicioDeContrato + ", finDeContrato="
				+ finDeContrato + ", arancel=" + arancel + ", Locador=" + Locador + ", Locatario=" + Locatario + "]";
	}
	public Contrato(long id, Date primerFechaPago, Date segundaFechaPago, int recargoFijo,
			int valorBaseRecargoProporcional, Comision comision, Date inicioDeContrato, Date finDeContrato,
			Set<Arancel> arancel, modelo.Locador locador, modelo.Locatario locatario) {
		super();
		this.id = id;
		this.primerFechaPago = primerFechaPago;
		this.segundaFechaPago = segundaFechaPago;
		this.recargoFijo = recargoFijo;
		this.valorBaseRecargoProporcional = valorBaseRecargoProporcional;
		this.comision = comision;
		this.inicioDeContrato = inicioDeContrato;
		this.finDeContrato = finDeContrato;
		this.arancel = arancel;
		Locador = locador;
		Locatario = locatario;
	}
}
