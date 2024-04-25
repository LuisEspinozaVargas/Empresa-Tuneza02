package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_vehiculos")

public class Vehiculo {
	
	@Id
	
	@Column(name = "idvehiculo")
	private int idvehiculo;
	
	@Column(name="Marca")
	private String Marca;
	
	@Column(name="Modelo")
	private String Modelo;
	
	@Column(name="Placa")
	private String Placa;
	
	public Vehiculo() {}

	public int getIdvehiculo() {
		return idvehiculo;
	}

	public void setIdvehiculo(int idvehiculo) {
		this.idvehiculo = idvehiculo;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}
	
	

}
