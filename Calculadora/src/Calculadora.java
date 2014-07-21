/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego Juarez     13280
 * @author Daniel Mejia     13271
 * @author Jose Sagastumme  13217
 */

import java.io.*;

public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            // Abrimos el archivo
            FileInputStream fstream = new FileInputStream("datos.txt");
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fstream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;           
            
            // Leer el archivo linea por linea
            while ((strLinea = buffer.readLine()) != null)   {
                // Imprimimos la línea por pantalla
                System.out.println (strLinea);
                
                char[] aCaracteres = strLinea.toCharArray();
                
                for (int x=0;x<aCaracteres.length;x++)
                    System.out.println("[" + x + "] " + aCaracteres[x]);

            
            }
            // Cerramos el archivo
            entrada.close();
        }
        catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
    
    }
}
