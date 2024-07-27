package estudo2;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;


public class Notas {
	
		public static void main(String[] args) throws IOException {
			
			Path caminho = Path.of("C:\\Users\\erick.ERICK\\OneDrive\\Área de Trabalho\\Erickin.txt");
			
			if(Files.notExists(caminho)) {
			Files.createFile(caminho);
			}
			
			String código = "include<stdio.h>\ninclude<math.h>\\nint main(){\\nprintf(\\\"Ola mundo\\n\\\");\\nreturn 0;\\n}\\n";
			
			Files.writeString(caminho, código);
			
			
					 
			
			
			
			
				 
				
				 
				
				 
				
				
				

		}
}