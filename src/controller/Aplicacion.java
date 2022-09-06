package controller;

import model.dao.gestionLicenciaDao;
import views.ventanaPrincipal;

public class Aplicacion {

	public void iniciarSistema() {

		ventanaPrincipal miVentanaPrincipal = new ventanaPrincipal();

		Coordinador miCoordinador = new Coordinador();

		miVentanaPrincipal.setMiCoordinador(miCoordinador);
		gestionLicenciaDao gestionLicenciaDao = new gestionLicenciaDao();
		miCoordinador.setMiGestionLicencia(gestionLicenciaDao);
		miCoordinador.setMiVentanaPrincipal(miVentanaPrincipal);
		miCoordinador.setMiVentanaPrincipal(miVentanaPrincipal);
		miVentanaPrincipal.setVisible(true);
	}
}