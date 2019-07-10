/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

/**
 *
 * @author Correa
 */
public class ListaFacturados {
    
    String patente;
    String fechaingreso;
    String fechaegreso;
    double monto;
    String horaSalida;
    
    public ListaFacturados(){
        
    }

    public ListaFacturados(String patente, String fechaingreso, String fechaegreso, double monto, String horaSalida) {
        this.patente = patente;
        this.fechaingreso = fechaingreso;
        this.fechaegreso = fechaegreso;
        this.monto = monto;
        this.horaSalida = horaSalida;
    }
    
}
