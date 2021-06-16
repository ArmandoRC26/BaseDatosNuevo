package basedate1.pkg0;

import basedate1.pkg0.Reloj1;
import basedate1.pkg0.pnl_alta_venta;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Fram_menu_principal extends javax.swing.JFrame {
    //Reloj1 reloj1=new Reloj1();//Instancia el panel del Main de Reloj
pnl_alta_venta pnl_alta_venta=new pnl_alta_venta();  //instanciar el panel del primer boton alta_venta
    CardLayout vista;//El CardLayout permite organizar paneles en forma de una pila de cartas vista desde arriba
   
   
    
    
    public Fram_menu_principal() {
        initComponents();
       // setPreferredSize(new Dimension(5000,2500) );
//this.setLocationRelativeTo(null); //para centrar la pantalla
        setExtendedState(MAXIMIZED_BOTH);//constructor para maximizar la pantalla
        iconoFormulario();//llamar el método en nuestro constructor
        vista=(CardLayout) pnl_vista_principal.getLayout();//variable vista de cardlayout que ejecuta la vista en forma de castillo
        //vista=(CardLayout) reloj1.getLayout();
    }

    public void iconoFormulario() {
        URL url = getClass().getResource("/imagenes/LOGO.png");
        ImageIcon icono_formulario = new ImageIcon(url);//llamar la instancia de imagen,
        //la instancia se llama icono_formulario
        setIconImage(icono_formulario.getImage());
    }//metodo que muestra la imagen del logo en nuestro frame

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_alta = new javax.swing.JToggleButton();
        btn_cambio = new javax.swing.JToggleButton();
        btn_baja = new javax.swing.JToggleButton();
        btn_buscar = new javax.swing.JToggleButton();
        btn_salir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        btn_buscar2 = new javax.swing.JToggleButton();
        btn4 = new javax.swing.JToggleButton();
        jButton3 = new javax.swing.JToggleButton();
        btn_buscar4 = new javax.swing.JToggleButton();
        btn_buscar5 = new javax.swing.JToggleButton();
        jSeparator2 = new javax.swing.JSeparator();
        pnl_vista_principal = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de ventas BENNY MARCOS & CREACIONES");
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("MENÚ DEL SISTEMA");

        btn_alta.setBackground(new java.awt.Color(204, 204, 204));
        btn_alta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_alta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alta.png"))); // NOI18N
        btn_alta.setText("REGISTRAR VENTA");
        btn_alta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_alta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_alta.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_altaActionPerformed(evt);
            }
        });

        btn_cambio.setBackground(new java.awt.Color(204, 204, 204));
        btn_cambio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_cambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambio.png"))); // NOI18N
        btn_cambio.setText("ACTUALIZAR VENTA");
        btn_cambio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cambio.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_cambio.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        btn_baja.setBackground(new java.awt.Color(204, 204, 204));
        btn_baja.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_baja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/baja.png"))); // NOI18N
        btn_baja.setText("ELIMINAR VENTA");
        btn_baja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_baja.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_baja.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        btn_buscar.setBackground(new java.awt.Color(204, 204, 204));
        btn_buscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btn_buscar.setText("BUSCAR");
        btn_buscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_buscar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_buscar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(153, 153, 153));
        btn_salir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btn_salir.setText("SALIR");
        btn_salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_salir.setVerifyInputWhenFocusTarget(false);
        btn_salir.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_salir.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_alta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(btn_cambio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_baja, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_alta)
                .addGap(18, 18, 18)
                .addComponent(btn_cambio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btn_baja)
                .addGap(18, 18, 18)
                .addComponent(btn_buscar)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btn_buscar2.setBackground(new java.awt.Color(204, 204, 204));
        btn_buscar2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_buscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calculadora.png"))); // NOI18N
        btn_buscar2.setText("CALCULADORA");
        btn_buscar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_buscar2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_buscar2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar2ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(204, 204, 204));
        btn4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/addempleado.png"))); // NOI18N
        btn4.setText("REGISTRAR EMPLEADO");
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reloj.png"))); // NOI18N
        jButton3.setText("RELOJ");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btn_buscar4.setBackground(new java.awt.Color(204, 204, 204));
        btn_buscar4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_buscar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambioempleado.png"))); // NOI18N
        btn_buscar4.setText("ACTUALIZAR EMPLEADO");
        btn_buscar4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_buscar4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_buscar4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        btn_buscar5.setBackground(new java.awt.Color(204, 204, 204));
        btn_buscar5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_buscar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bajaempleado.png"))); // NOI18N
        btn_buscar5.setText("ELIMINAR EMPLEADO");
        btn_buscar5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_buscar5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_buscar5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jSeparator2.setForeground(new java.awt.Color(255, 204, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(btn_buscar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(btn_buscar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_buscar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(btn_buscar5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_buscar4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_buscar2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addGap(12, 12, 12))
        );

        pnl_vista_principal.setBackground(new java.awt.Color(102, 102, 255));
        pnl_vista_principal.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1027, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );

        pnl_vista_principal.add(jPanel4, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_vista_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnl_vista_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 247, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 1260, 940));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0); //salida de la interfáz
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_altaActionPerformed
       pnl_vista_principal.add(pnl_alta_venta,"alta");// alta es una palabra que se usará como referencia
       vista.show(pnl_vista_principal,"alta");//variable del card layout + referencia "alta"
       SwingUtilities.updateComponentTreeUI(this);//instanciar el metodo que actualiza el panel 
       this.repaint();//actualiza la vista
    }//GEN-LAST:event_btn_altaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        /* pnl_vista_principal.add(reloj1,"reloj");
        vista.show(reloj1, "reloj");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();*/

        Reloj1 c=new Reloj1();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscar2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
         Registro_empleados c=new Registro_empleados();
        c.setVisible(true);
        dispose();
      
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btn4ActionPerformed

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
            java.util.logging.Logger.getLogger(Fram_menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fram_menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fram_menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fram_menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fram_menu_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn4;
    private javax.swing.JToggleButton btn_alta;
    private javax.swing.JToggleButton btn_baja;
    private javax.swing.JToggleButton btn_buscar;
    private javax.swing.JToggleButton btn_buscar2;
    private javax.swing.JToggleButton btn_buscar4;
    private javax.swing.JToggleButton btn_buscar5;
    private javax.swing.JToggleButton btn_cambio;
    private javax.swing.JButton btn_salir;
    private javax.swing.JToggleButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel pnl_vista_principal;
    // End of variables declaration//GEN-END:variables
}
