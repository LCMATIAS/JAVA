package estacionamiento;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class autoFacturado
{
    
        public String Importe;
        public String fechaSalida;
     public autoFacturado(String Patente)
    {
        //varFacturados = [];
        
    }
     
     public static ArrayList RetornarValoresFacturados() throws IOException{
        ArrayList<Object[]> arrayRetorno = new ArrayList<Object[]>();
        File Archivo = new File("Facturados.txt");
        FileReader Lector = null;
        
        try {
            Lector = new FileReader(Archivo);
            BufferedReader BF = new BufferedReader(Lector);
            String[] arrayDeDatos; 
            String Renglon;
       // arrayRetorno.add("Patente            Horario de entrada          Horario de salida                Monto total");
        while ((Renglon = BF.readLine()) != null)
        {
            //System.out.println(Renglon);
            arrayDeDatos = Renglon.split("=>");
            arrayRetorno.add(arrayDeDatos);
        //    arrayRetorno.add(arrayDeDatos[0] +"            "+ arrayDeDatos[1]+"                        " + arrayDeDatos[4]+"                        " +" $  "+arrayDeDatos[3]);
            
            
           
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Garaje.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return arrayRetorno;
      }
     
     
     
     
}