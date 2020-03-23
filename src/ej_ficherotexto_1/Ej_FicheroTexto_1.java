package ej_ficherotexto_1;

import java.io.BufferedReader;  
import java.io.FileReader;

/**
 *
 * Julio
 */
public class Ej_FicheroTexto_1 {

    
    public static void main(String[] args) {

    //Creamos un String que va a contener todo el texto del archivo
        String texto = "";

        try {
            //Abrir un archivo FileReader que obtiene lo que tenga el archivo
            FileReader lector = new FileReader("palabra4.txt");  //abrir este fichero
            //El contenido de lector se guarda en un BufferedReader
            BufferedReader contenido = new BufferedReader(lector);

            //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
            while ((texto = contenido.readLine()) != null) {
                
                System.out.println(texto);
                
            }
        } //Si se causa un error al leer cae aqui
        catch (Exception e) {   }
    }
}

