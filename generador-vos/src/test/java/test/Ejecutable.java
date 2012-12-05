package test;

import info.pedrodonte.generador.dto.GeneradorDTO;

public class Ejecutable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GeneradorDTO dto = new GeneradorDTO();
		dto.setTest(true);
		dto.generar();

	}

}
