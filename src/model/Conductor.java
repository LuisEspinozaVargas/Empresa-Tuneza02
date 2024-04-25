package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_conductores")
public class Conductor {
	
	@Id
	@Column(name = "idconductor")
	private int idconductor;
	
	@Column(name = "dni")
    private String Dni;
	
	@Column(name = "restricciones")
    private int Restricciones;
	
	@Column(name = "Licencia")
    private String Licencia;
	
    
    public Conductor() {}


	public int getIdconductor() {
		return idconductor;
	}


	public void setIdconductor(int idconductor) {
		this.idconductor = idconductor;
	}


	public String getDni() {
		return Dni;
	}


	public void setDni(String dni) {
		Dni = dni;
	}

	public int getRestricciones() {
		return Restricciones;
	}


	public void setRestricciones(int restricciones) {
		Restricciones = restricciones;
	}


	public String getLicencia() {
		return Licencia;
	}


	public void setLicencia(String licencia) {
		Licencia = licencia;
	}

    

}
