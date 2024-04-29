package com.evidenciarframework.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Acudiente")
public class Acudiente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	private String NOMBRE;
	private String APELLIDO;
	private String N_CELULAR;
	private String DIRECCION;
	private String PASSWORD;
	
	public Acudiente () {
		
	}

	public Acudiente(int iD, String nOMBRE, String aPELLIDO, String n_CELULAR, String dIRECCION, String pASSWORD) {
		super();
		ID = iD;
		NOMBRE = nOMBRE;
		APELLIDO = aPELLIDO;
		N_CELULAR = n_CELULAR;
		DIRECCION = dIRECCION;
		PASSWORD = pASSWORD;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNOMBRE() {
		return NOMBRE;
	}

	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}

	public String getAPELLIDO() {
		return APELLIDO;
	}

	public void setAPELLIDO(String aPELLIDO) {
		APELLIDO = aPELLIDO;
	}

	public String getN_CELULAR() {
		return N_CELULAR;
	}

	public void setN_CELULAR(String n_CELULAR) {
		N_CELULAR = n_CELULAR;
	}

	public String getDIRECCION() {
		return DIRECCION;
	}

	public void setDIRECCION(String dIRECCION) {
		DIRECCION = dIRECCION;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	
}
