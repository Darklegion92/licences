package model.dao;


import java.io.IOException;
import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import com.lowagie.text.pdf.codec.Base64;


import controller.Coordinador;

public class gestionLicenciaDao {

	private Coordinador miCoordinador;
	private static String ENCRYPT_KEY = "SOLTEC2018-18yr5";

	public boolean validarLicencia(String licencia,String serial) throws IOException {
		
		String data = miCoordinador.desEncryptar(licencia);
		
		String dataValidate = data.substring(19, 25);
		
		if(dataValidate != "50173C") {
			return false;
		}
		
		String serialKey = data.substring(34,40);
		
		if(serialKey != serial) {
			return false;
		}
		
		return true;

	}

	public String encryptar(String miDato) {
		try {
			Key aesKey = new SecretKeySpec(ENCRYPT_KEY.getBytes(), "AES");
			Cipher cipher;

			cipher = Cipher.getInstance("AES");

			cipher.init(Cipher.ENCRYPT_MODE, aesKey);

			byte[] encrypted = cipher.doFinal((miDato).getBytes());
			return Base64.encodeBytes(encrypted);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}

	}

	public String desencryptar(String encrypted) {
		try {
			byte[] encryptedBytes = Base64.decode(encrypted.replace("\n", ""));

			Key aesKey = new SecretKeySpec(ENCRYPT_KEY.getBytes(), "AES");

			Cipher cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.DECRYPT_MODE, aesKey);

			String decrypted = new String(cipher.doFinal(encryptedBytes));

			return decrypted;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}
	}

	public Coordinador getMiCoordinador() {
		return miCoordinador;
	}

	public void setMiCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}

}
