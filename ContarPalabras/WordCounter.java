package ContarPalabras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class WordCounter extends Thread{
	
	// Atributo
	private Path path;
	private int wordCount;
	
	// Constructor
	public WordCounter(Path path) {
		this.path = path;
	}
	
	//Imprimir y leer el Archivo
	public void run() {
		
		try (InputStream in = Files.newInputStream(path);
			    BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
			    String line = null;
			    while ((line = reader.readLine()) != null) {
			        contarPalabras(line);
			    }
			} catch (IOException x) {
			    System.err.println(x);
			}
		System.out.printf("File %s has %d words\n", path.getFileName(), wordCount);
	}
	
	//Cuenta cantidad de espacios
	private void contarPalabras(String line) {
		String split = " ";
		for(int i = 0; i < line.split(split).length; i++) {
			wordCount++;
		}
	}

	//Poder ver la ruta del Archivo
	public Path getPath() {
		return path;
	}
}
