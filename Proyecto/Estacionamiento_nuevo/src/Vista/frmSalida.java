package Vista;

import estacionamiento.Auto;
import estacionamiento.Garaje;
import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import org.jcp.xml.dsig.internal.dom.Utils;

/**
 *
 * @author PC
 */
public class frmSalida extends javax.swing.JFrame {

    public frmSalida() throws IOException
    {
        initComponents();
        this.setLocationRelativeTo(null);
       // jPanel2.setBackground(new Color(19, 141, 117  ));
      //  btnSalida.setBackground(new Color(22, 160, 133));
        
       // jLabel2.setForeground(new Color(247, 249, 249));
        //jLabel3.setForeground(new Color(247, 249, 249));
      
       // jButtonPrincipal.setBackground(new Color(22, 160, 133));
       // panelOculto.setVisible(false);
        
    
        
        this.cargarListado();
     
        /*
        
          ArrayList Patentes = Garaje.retornarListadoSoloPatentes();
        //Garaje.retornarListado();
        DefaultListModel Modelo;
        Modelo = new DefaultListModel();
        jList1.setModel(Modelo);
        ArrayList Vector = new ArrayList();
       // Vector.add("hola");
        //Vector.add("chau");
        for(Object unaPatente:Patentes)
        {
           //Vector.add(unaPatente);
            Modelo.addElement(unaPatente);
        }
     */
       
    }
    
    
    
    public void cargarListado(){
        
        
         ArrayList Patentes;
        try {
            Patentes = Garaje.retornarListadoSoloPatentes();
                    DefaultListModel Modelo;
                    Modelo = new DefaultListModel();
                   jList1.setModel(Modelo);
                    ArrayList Vector = new ArrayList();
                    // Vector.add("hola");
                     //Vector.add("chau");
               for(Object unaPatente:Patentes)
                {
                   //Vector.add(unaPatente);
                    Modelo.addElement(unaPatente);
                }
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(frmSalida.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
     
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnSalida = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        txtPatente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonPrincipal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtImporte = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setForeground(new java.awt.Color(0, 120, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalida.setBackground(new java.awt.Color(97, 88, 51));
        btnSalida.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnSalida.setText("Salida");
        btnSalida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalidaMouseExited(evt);
            }
        });
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 550, 80));

        jList1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jList1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 580, 190));

        txtPatente.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtPatente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatenteActionPerformed(evt);
            }
        });
        jPanel2.add(txtPatente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 550, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Egreso de automóviles:");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 870, -1));

        jLabel3.setFont(new java.awt.Font("Cooper Black", 3, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sacar el numero de Patente");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 460, 30));

        jButtonPrincipal.setBackground(new java.awt.Color(97, 88, 51));
        jButtonPrincipal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButtonPrincipal.setText("Principal");
        jButtonPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonPrincipalMouseExited(evt);
            }
        });
        jButtonPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrincipalActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, 140, 70));

        txtImporte.setColumns(20);
        txtImporte.setRows(5);
        jScrollPane2.setViewportView(txtImporte);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 210, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Mustang.jpeg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 1240, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 594, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
     
        /**** principio verificar auto   */
                                boolean existeAuto = false;
                                String patenteIngresada = this.txtPatente.getText();
                               Auto autito = new Auto(patenteIngresada);
                                try {
                                    existeAuto = Garaje.autoExiste(autito);
                                    /*
                                    if(existeAuto){
                                        System.out.println("Existe");
                                    } else{
                                        System.out.println("No existe");
                                    }
                                    */
                                    // cambiar por ventana hemergente o similar
                                } catch (IOException ex) {
                                    Logger.getLogger(frmSalida.class.getName()).log(Level.SEVERE, null, ex);
                                }

         /**** fin de veificar auto 
          si existe auto la variable "existeAuto" va a ser true         
          */
         
         if (existeAuto) 
         {
              System.out.println(patenteIngresada);
              ArrayList patenteYfecha = null;
            try {
                patenteYfecha = Garaje.retornarListado();
            } catch (IOException ex) {
                Logger.getLogger(frmSalida.class.getName()).log(Level.SEVERE, null, ex);
            }
            for(Object unaPatente:patenteYfecha)
            {
                  String[] DATOS ; 
                  DATOS = unaPatente.toString().split("=>");/// devuelve un array 
                  
                  /*
                  System.out.println("solo patente: "+DATOS[0]);  
                  System.out.println("solo hora: "+DATOS[1]);  
                  System.out.println("solo fecha: "+DATOS[2]);  
                  */
                  
                  
                /*** si el la misma patente , calculo el costo */
                if(autito.Patente.equals(DATOS[0]) )
                {
                        LocalTime horaActual = LocalTime.now();
                        LocalTime HoraEstacionado= LocalTime.parse(DATOS[1]);

                        System.out.println("solo horaActual: "+horaActual);  
                        System.out.println("solo HoraEstacionado: "+HoraEstacionado);  
                        
                        int resultado= horaActual.getHour()-HoraEstacionado.getHour();

                        System.out.println("cantidad de horas: "+resultado ); 

                        float importe= (resultado)*170;
                        System.out.println("importe: "+importe ); 
                        if (importe == 0) {

                                    importe = importe + 70;
                                  
                        } 
                            if(importe < 0){
                               importe = importe * (-1); 
                            }
                        
                        
                       FileWriter Archivo = null;
                      try {
                          Archivo = new FileWriter("Facturados.txt", true);
                      } catch (IOException ex) {
                          Logger.getLogger(frmSalida.class.getName()).log(Level.SEVERE, null, ex);
                      }

                       PrintWriter Escritor;
                       Escritor = new PrintWriter(Archivo);
                       Escritor.println(DATOS[0] + "=>" + DATOS[1] + "=>" + DATOS[2]+ "=>" + importe + "=>" + horaActual      );
                      try {
                          // Escritor.println(unAuto.Patente + "=>" + new Date());
                          Archivo.close();
                      } catch (IOException ex) {
                          Logger.getLogger(frmSalida.class.getName()).log(Level.SEVERE, null, ex);
                      }

                       System.out.println(DATOS[0] + "Estoy en facturado ");
                        
                    
                }
                       // System.out.println(unaPatente);
                      

                        
             /* fin    si el la misma patente , calculo el costo               *///
            }
            try {
                
                //busca el auto lo elimina del array, guardando el array nuevamente en el archivo
              Garaje.SacarAuto(autito);
                System.out.println("sacar");
            } catch (IOException ex) {
                Logger.getLogger(frmSalida.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        txtPatente.setText(null);  
         
      this.cargarListado();
        
    }//GEN-LAST:event_btnSalidaActionPerformed

    private void btnSalidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalidaMouseEntered
        // TODO add your handling code here:
        btnSalida.setBackground(new Color(97,88,51  ));
        //panelOculto.setVisible(true);
        //panelOculto.setBackground(new  Color(253, 235, 208));
      //  salidaCoche.setForeground(new Color(46, 64, 83 ));
    }//GEN-LAST:event_btnSalidaMouseEntered

    private void btnSalidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalidaMouseExited
        // TODO add your handling code here:
        btnSalida.setBackground(new Color(97,88,51  ));
       // panelOculto.setVisible(false);
    }//GEN-LAST:event_btnSalidaMouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        jLabel2.setForeground(new Color(166, 172, 175));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        jLabel2.setForeground(new Color(247, 249, 249));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jButtonPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrincipalActionPerformed
        // TODO add your handling code here:
        frmPrincipal regreso = new frmPrincipal();
        regreso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonPrincipalActionPerformed

    private void jButtonPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPrincipalMouseEntered
        // TODO add your handling code here:
        jButtonPrincipal.setBackground(new Color(97,88,51  ));
    }//GEN-LAST:event_jButtonPrincipalMouseEntered

    private void jButtonPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPrincipalMouseExited
        // TODO add your handling code here:
        jButtonPrincipal.setBackground(new Color(97,88,51  ));
    }//GEN-LAST:event_jButtonPrincipalMouseExited

    private void txtPatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatenteActionPerformed
    private Auto retornarAutodelListado(String patente){
        Auto autodeRetorno= null;
        ArrayList listado = null;
        try {
            listado = Garaje.retornarListado();
            for (Object patenteYtiempo:listado) {
                
                     String[] DATOS ; 
                     DATOS = patenteYtiempo.toString().split("=>");   
                
                     if (DATOS[0].equals(patente)) {
                         autodeRetorno = new Auto(patente);
                         autodeRetorno.fechaIngreso = LocalTime.parse(DATOS[1]);
                    
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(frmSalida.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    
    
        return autodeRetorno;
    }
       private int calcularImporte(String patente){
        Auto autito = new Auto(patente);
        int retorno = 0;
        try {
            if (Garaje.autoExiste(autito)) {
                
               autito = this.retornarAutodelListado(patente);
                if (autito!= null) {
                     LocalTime horaActual = (LocalTime.now());
                     int resultado= (horaActual.getHour())-autito.fechaIngreso.getHour();
                     retorno = (resultado) * 170 ;
                        if (retorno == 0) {
                        
                             retorno = resultado + 70 ;
                            
                    }
                        if(retorno < 0){
                                System.out.println("es igual a cero");
                               retorno = retorno * (-2); 
                            }
                        if((horaActual.getHour())-autito.fechaIngreso.getHour() > 24) {
                                                           retorno = retorno * (24); 
  
                    }
                }
            }   } catch (IOException ex) {
            Logger.getLogger(frmSalida.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        return retorno;
}






    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
        //System.out.println(jList1.getSelectedValue());
        this.txtPatente.setText(jList1.getSelectedValue());
        int importeApagar = this.calcularImporte(txtPatente.getText());
       // System.out.println("Este es el impporte a pagar" + importeApagar);
        
        
        this.txtImporte.setText( Integer.toString(importeApagar));
        
    }//GEN-LAST:event_jList1ValueChanged

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        jLabel3.setForeground(new Color(166, 172, 175));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        jLabel3.setForeground(new Color(229, 231, 233 )); 
    }//GEN-LAST:event_jLabel3MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmSalida().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(frmSalida.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalida;
    private javax.swing.JButton jButtonPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtImporte;
    private javax.swing.JTextField txtPatente;
    // End of variables declaration//GEN-END:variables
}
