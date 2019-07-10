package estacionamiento;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Garaje
{
    public static void ingresarAuto(Auto unAuto) throws IOException
    {
        FileWriter Archivo;
        Archivo = new FileWriter("Estacionados.txt", true);
        
        PrintWriter Escritor;
        Escritor = new PrintWriter(Archivo);
        Escritor.println(unAuto.Patente + "=>" +  LocalTime.now().toString() + "=>" +  LocalDate.now().toString()          );
       // Escritor.println(unAuto.Patente + "=>" + new Date());
        Archivo.close();
        
        System.out.println(unAuto.Patente + "Estoy en ingresar auto");
    }
    public static ArrayList retornarListado() throws FileNotFoundException, IOException
    {
        ArrayList arrayRetorno = new ArrayList();
        File Archivo = new File("Estacionados.txt");
        FileReader Lector = new FileReader(Archivo);
        BufferedReader BF = new BufferedReader(Lector);
        String[] arrayDeDatos; 
        String Renglon;
        while ((Renglon = BF.readLine()) != null)
        {
            //System.out.println(Renglon);
            /*
            arrayDeDatos = Renglon.split("=>");
            arrayRetorno.add(arrayDeDatos[0]);
            */
            arrayRetorno.add(Renglon);
        }
        return arrayRetorno;
    }
      public static ArrayList retornarListadoSoloPatentes() throws FileNotFoundException, IOException
    {
        ArrayList arrayRetorno = new ArrayList();
        File Archivo = new File("Estacionados.txt");
        FileReader Lector = new FileReader(Archivo);
        BufferedReader BF = new BufferedReader(Lector);
        String[] arrayDeDatos; 
        String Renglon;
        while ((Renglon = BF.readLine()) != null)
        {
            //System.out.println(Renglon);
            arrayDeDatos = Renglon.split("=>");
            arrayRetorno.add(arrayDeDatos[0]);
            
           
        }
        return arrayRetorno;
    }
      
      public static ArrayList RetornoHorario() throws IOException{
        ArrayList arrayRetorno = new ArrayList();
        File Archivo = new File("Estacionados.txt");
        FileReader Lector = null;
        try {
            Lector = new FileReader(Archivo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Garaje.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader BF = new BufferedReader(Lector);
        String[] arrayDeDatos; 
        String Renglon;
        while ((Renglon = BF.readLine()) != null)
        {
            //System.out.println(Renglon);
            arrayDeDatos = Renglon.split("=>");
            arrayRetorno.add(arrayDeDatos[1]);
            
            
           
        }
        return arrayRetorno;
      }
      
      
    public static boolean autoExiste(Auto Autito) throws FileNotFoundException, IOException
    {
       
        File Archivo = new File("Estacionados.txt");
        FileReader Lector = new FileReader(Archivo);
        BufferedReader BF = new BufferedReader(Lector);
        String[] arrayDeDatos; 
        String Renglon;
        
       
        while ((Renglon = BF.readLine()) != null)
        {
            //System.out.println(Renglon);
            arrayDeDatos = Renglon.split("=>");
          /*  System.out.println(arrayDeDatos[0].length());
            System.out.println(Autito.Patente.length());*/
            if(  Autito.Patente.equalsIgnoreCase(arrayDeDatos[0]) ){
                return true;
            }
        }
        return false;
    }
    ///
    
    /*
    ***
    
    
    
    */public static void SacarAuto(Auto Autito) throws IOException{
        
        
        boolean esta=Garaje.autoExiste(Autito);
        System.out.println("esta :"+esta);
        if(esta)
        {
             
                ArrayList arrayRetorno = new ArrayList();
                File Archivo = new File("Estacionados.txt");
                FileReader Lector = new FileReader(Archivo);
                BufferedReader BF = new BufferedReader(Lector);
                String[] arrayDeDatos; 
                String Renglon;
                while ((Renglon = BF.readLine()) != null)
                {
                    //System.out.println(Renglon);
                    arrayDeDatos = Renglon.split("=>");
                  /*  System.out.println(arrayDeDatos[0].length());
                    System.out.println(Autito.Patente.length());*/
                    if( Autito.Patente.equalsIgnoreCase(arrayDeDatos[0]) ){
                        //
                        
                        
                            
                    }else
                    {
                         arrayRetorno.add(Renglon);
                    }
                }
                 Lector.close();
                 
                   /// arrayRetorno tiene los estacionados
                 
            FileWriter Archivo1;
            Archivo1 = new FileWriter("Estacionados.txt", false);

            PrintWriter Escritor;
            Escritor = new PrintWriter(Archivo1);
            int i;
           for(i=0;i<arrayRetorno.size();i++)
           {
                 Escritor.println(arrayRetorno.get(i));
           }
            
            
          
            Archivo1.close();
                 
              
            
        }
        
    }
}