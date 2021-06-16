package fp.daw.exprog20210616.ejercicio3;

import java.io.*;
import java.util.*;

public class ParqueMovil {

	String provincia;
	String tipo;
	int camiones;
	int furgonetas;
	int autobuses;
	int turismos;
	int motocicletas;
	int tractores;
	public static final String SEPARATOR = ";";

	public static void ParqueMovil(String ruta, int anio) throws IOException {

		BufferedReader br = null;
		Set<String> datos = new TreeSet<String>();
		try {
			br = new BufferedReader(new FileReader(ruta));
			String linea = br.readLine();
			while (linea != null) {

				linea = br.readLine();
				datos.add(linea);
				System.out.println(datos);
			}
		} catch (Exception e) {

		} finally {
			if (null != br) {
				br.close();
			}
		}
	}

	/*
	 * Definir un método que acepte como parámetros una provincia y un tipo de
	 * vehículo y retorne el número de vehículos.
	 */

	public static void ProvinciaTipo(String provincia, String tipo) {
		int total = 0;
		System.out.println("El total de " + tipo + " en " + provincia + " son: " + total);
		;
	}

	/*
	 * Definir un método que acepte como parámetro una provincia y retorne el total
	 * de vehículos en esa provincia.
	 */

	public static void Provincia(String provincia) {
		int total = 0;
		System.out.println("El total de vehículos en " + provincia + " son: " + total);
		;
	}

	/*
	 * Definir un método que retorne el total de vehículos del parque móvil.
	 */

	public static void Total() {
		int total = 0;
		System.out.println("El total de vehículos son: " + total);
		;

	}
	
	/*
	 * Definir un método que acepte como parámetro una ruta de un fichero y almacene en él los
	 * datos en binario con la estructura que se considere oportuna.
	 */
	
	public static void Guardar(String rutaGuardar) throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(
			new BufferedOutputStream(new FileOutputStream("Guardar")))) {
				out.writeObject(rutaGuardar);
	}
	}
	
	public static void main(String[] args) throws IOException {

		ParqueMovil("C:\\Users\\alumno\\Desktop\\eclipse\\workspace\\Examen Final\\pm2018.csv", 2018);
		ProvinciaTipo("Albacete", "CAMIONES");
		Provincia("Albacete");
		Total();
		Guardar("C:\\Users\\alumno\\Desktop\\eclipse\\workspace\\Examen Final\\datos.csv");
	}
}
