package com.distribuida.entities;

import java.util.Date;

public class Factura {
	private int idFactura;
	private String num_factura;
	private Date fecha;
	private double total_neto;
	private double  iva;
	private double total;
	private int idCliente;
	public Factura(int idFactura, String num_factura, Date fecha, double total_neto, double iva, double total,
			int idCliente) {
	
		this.idFactura = idFactura;
		this.num_factura = num_factura;
		this.fecha = fecha;
		this.total_neto = total_neto;
		this.iva = iva;
		this.total = total;
		this.idCliente = idCliente;
	}
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public String getNum_factura() {
		return num_factura;
	}
	public void setNum_factura(String num_factura) {
		this.num_factura = num_factura;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getTotal_neto() {
		return total_neto;
	}
	public void setTotal_neto(double total_neto) {
		this.total_neto = total_neto;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", num_factura=" + num_factura + ", fecha=" + fecha + ", total_neto="
				+ total_neto + ", iva=" + iva + ", total=" + total + ", idCliente=" + idCliente + "]";
	}
	
	
	
	
	
	

}
