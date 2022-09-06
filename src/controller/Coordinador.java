package controller;

import model.dao.gestionLicenciaDao;
import views.ventanaPrincipal;


public class Coordinador {

	private ventanaPrincipal miVentanaPrincipal;
	private gestionLicenciaDao miGestionLicencia;

	public gestionLicenciaDao getMiGestionLicencia() {
		return miGestionLicencia;
	}

	public void setMiGestionLicencia(gestionLicenciaDao miGestionLicencia) {
		this.miGestionLicencia = miGestionLicencia;
	}
	
	public ventanaPrincipal getMiVentanaPrincipal() {
		return miVentanaPrincipal;
	}

	public void setMiVentanaPrincipal(ventanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
	}
	
	public String desEncryptar(String dato) {
		return miGestionLicencia.desencryptar(dato);
	}

	public String encryptar(String dato) {
		return miGestionLicencia.encryptar(dato);
	}

}