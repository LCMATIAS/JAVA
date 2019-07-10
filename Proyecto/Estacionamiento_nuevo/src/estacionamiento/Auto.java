package estacionamiento;

import java.time.LocalTime;
import java.util.Date;

public class Auto
{
    public String Patente;
    public LocalTime fechaIngreso;
    
    public Auto(String Patente)
    {
        this.Patente = Patente;
        this.fechaIngreso = LocalTime.now();
    }
    public String Ingresos(String patente1){
        this.Patente = LocalTime.now() + " "+ patente1;
        
        return Patente;
    }
    public static boolean ValidarPatente(String posiblePatente){
        boolean retorno = false;
            if (posiblePatente.length() == 6 ) {
               // System.out.println(posiblePatente.charAt(0));
                for (int i = 0; i < 6; i++) {
                   
                        if (i < 3) {
                               //System.out.println(posiblePatente.charAt(i));
                               if((posiblePatente.charAt(i) >= 'A' && posiblePatente.charAt(i) <= 'Z') || (posiblePatente.charAt(i) >= 'a' && posiblePatente.charAt(i) <= 'z')){
                                   System.out.println(posiblePatente.charAt(i));
                               }else{
                                   return false;
                               }

                        } else{
                               //System.out.println(posiblePatente.charAt(i));
                               if(posiblePatente.charAt(i) >= '0' && posiblePatente.charAt(i) <= '9' ){
                                   System.out.println(posiblePatente.charAt(i));
                               }else{
                                   return false;
                               }

                        }
                    
                }
                
                retorno = true;
            
            }
            if (posiblePatente.length() == 7 ) {
                 
                 for (int i = 0; i < 7; i++) {
                   
                        if (i < 2 || i > 4) {
                               //System.out.println(posiblePatente.charAt(i));System.out.println(posiblePatente);
                              // System.out.println(posiblePatente);
                               if((posiblePatente.charAt(i) >= 'A' && posiblePatente.charAt(i) <= 'Z') || (posiblePatente.charAt(i) >= 'a' && posiblePatente.charAt(i) <= 'z') ){
                                   System.out.println(posiblePatente.charAt(i));
                               }else{
                                  System.out.println(posiblePatente);
                                   return false;
                               }

                        } else{
                               //System.out.println(posiblePatente.charAt(i));
                               if(posiblePatente.charAt(i) >= '0' && posiblePatente.charAt(i) <= '9' ){
                                   System.out.println(posiblePatente.charAt(i));
                               }else{
                                   return false;
                               }

                        }
                    
                }
               
               
                
                
                
                
                
                
                
                
                
                
                
                
                
               
               retorno = true;
            }
        return retorno;
    }

    public Date parse(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}