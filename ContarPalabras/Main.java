package ContarPalabras;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {

		//path coge la ruta del Directorio
		Path p1 = Paths.get(System.getProperty("user.dir"), "files");
		
		//Generamos array para guardar tantos archivos como haya
		Path files[] = new Path[new File(p1.toString()).list().length];
		int position = 0;
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(p1)) {
		    for (Path file: stream) {
		        files[position] = file;
		        position++;
		    }
		} catch (IOException | DirectoryIteratorException x) {
		    // IOException can never be thrown by the iteration.
		    // In this snippet, it can only be thrown by newDirectoryStream.
		    System.err.println(x);
		}
		
		//Generamos tantos arrrays como archivos haya
		WordCounter tamaño[] = new WordCounter[files.length];
		
		//Por cada posicion del WordCounter generamos una objeto/Instancia del path/Ruta
		for(int i = 0; i < files.length; i++) {
			tamaño[i] = new WordCounter(files[i]);
		}
		
		//Utilizamos el metodo para imprimir
		for(int i = 0; i < tamaño.length; i++) {
			tamaño[i].start();
		}
		
	}

}
