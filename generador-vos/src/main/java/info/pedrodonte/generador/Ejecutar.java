package info.pedrodonte.generador;

import java.io.File;

import info.pedrodonte.generador.dto.GeneradorDTO;

public class Ejecutar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GeneradorDTO generadorDTO = new GeneradorDTO();
		generadorDTO.generar();
		
		File file = new File("src/main/java/");
		System.out.println(file.getAbsolutePath());
	}

}
