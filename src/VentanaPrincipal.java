
public class VentanaPrincipal extends javax.swing.JFrame {


     public VentanaPrincipal() {
          initComponents();
          this.setLocationRelativeTo(null);
          this.dispose();
     }


     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jCheckBoxMenuItem5 = new javax.swing.JCheckBoxMenuItem();
          jPanel1 = new javax.swing.JPanel();
          jButton6 = new javax.swing.JButton();
          jLabel2 = new javax.swing.JLabel();
          jMenuBar1 = new javax.swing.JMenuBar();
          jMenu1 = new javax.swing.JMenu();
          jCheckBoxMenuItem_Inventario = new javax.swing.JCheckBoxMenuItem();
          jCheckBoxMenuItem_Cliente = new javax.swing.JCheckBoxMenuItem();
          jCheckBoxMenuItem_pedidos = new javax.swing.JCheckBoxMenuItem();
          jCheckBoxMenuItem_Empleado = new javax.swing.JCheckBoxMenuItem();
          jMenu2 = new javax.swing.JMenu();
          jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();

          jCheckBoxMenuItem5.setSelected(true);
          jCheckBoxMenuItem5.setText("jCheckBoxMenuItem5");

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          jPanel1.setBackground(new java.awt.Color(0, 0, 0));
          jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

          jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
          jButton6.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton6ActionPerformed(evt);
               }
          });
          jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, -1, -1));

          jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/oa.jpg"))); // NOI18N
          jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

          jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu_pixel_icon_123657.png"))); // NOI18N

          jCheckBoxMenuItem_Inventario.setSelected(true);
          jCheckBoxMenuItem_Inventario.setText("Inventario");
          jCheckBoxMenuItem_Inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inventario.png"))); // NOI18N
          jCheckBoxMenuItem_Inventario.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBoxMenuItem_InventarioActionPerformed(evt);
               }
          });
          jMenu1.add(jCheckBoxMenuItem_Inventario);

          jCheckBoxMenuItem_Cliente.setSelected(true);
          jCheckBoxMenuItem_Cliente.setText("Cliente preferente");
          jCheckBoxMenuItem_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
          jCheckBoxMenuItem_Cliente.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBoxMenuItem_ClienteActionPerformed(evt);
               }
          });
          jMenu1.add(jCheckBoxMenuItem_Cliente);

          jCheckBoxMenuItem_pedidos.setSelected(true);
          jCheckBoxMenuItem_pedidos.setText("Pedidos");
          jCheckBoxMenuItem_pedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pedidos.png"))); // NOI18N
          jCheckBoxMenuItem_pedidos.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBoxMenuItem_pedidosActionPerformed(evt);
               }
          });
          jMenu1.add(jCheckBoxMenuItem_pedidos);

          jCheckBoxMenuItem_Empleado.setSelected(true);
          jCheckBoxMenuItem_Empleado.setText("Empleados");
          jCheckBoxMenuItem_Empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empleado.png"))); // NOI18N
          jCheckBoxMenuItem_Empleado.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBoxMenuItem_EmpleadoActionPerformed(evt);
               }
          });
          jMenu1.add(jCheckBoxMenuItem_Empleado);

          jMenuBar1.add(jMenu1);

          jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vender (1).png"))); // NOI18N

          jCheckBoxMenuItem1.setSelected(true);
          jCheckBoxMenuItem1.setText("Venta presencial");
          jCheckBoxMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vender (1).png"))); // NOI18N
          jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBoxMenuItem1ActionPerformed(evt);
               }
          });
          jMenu2.add(jCheckBoxMenuItem1);

          jMenuBar1.add(jMenu2);

          setJMenuBar(jMenuBar1);

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
          Login lg = new Login();
          lg.setVisible(true);
          this.dispose();
          
     }//GEN-LAST:event_jButton6ActionPerformed

     private void jCheckBoxMenuItem_InventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem_InventarioActionPerformed
             InventarioAdm iv = new InventarioAdm();
             iv.setVisible(true);
             this.dispose();
     }//GEN-LAST:event_jCheckBoxMenuItem_InventarioActionPerformed

     private void jCheckBoxMenuItem_pedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem_pedidosActionPerformed
             PedidosAdmin p=new PedidosAdmin();
             p.setVisible(true);
             this.dispose();
     }//GEN-LAST:event_jCheckBoxMenuItem_pedidosActionPerformed

     private void jCheckBoxMenuItem_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem_ClienteActionPerformed
          ClientePreferenteAdmin cp=new ClientePreferenteAdmin();
          cp.setVisible(true);
           this.dispose();          
     }//GEN-LAST:event_jCheckBoxMenuItem_ClienteActionPerformed

     private void jCheckBoxMenuItem_EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem_EmpleadoActionPerformed
          EmpleadosAdmin ep = new EmpleadosAdmin();
          ep.setVisible(true);
          this.dispose();
     }//GEN-LAST:event_jCheckBoxMenuItem_EmpleadoActionPerformed

     private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
          VentaPresencial vp=new VentaPresencial();
          vp.setVisible(true);
          this.dispose();
     }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed


     public static void main(String args[]) {
          try {
               for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                         javax.swing.UIManager.setLookAndFeel(info.getClassName());
                         break;
                    }
               }
          } catch (ClassNotFoundException ex) {
               java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
               java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
          //</editor-fold>

          /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new VentanaPrincipal().setVisible(true);
               }
          });
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton jButton6;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem5;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem_Cliente;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem_Empleado;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem_Inventario;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem_pedidos;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JMenu jMenu1;
     private javax.swing.JMenu jMenu2;
     private javax.swing.JMenuBar jMenuBar1;
     private javax.swing.JPanel jPanel1;
     // End of variables declaration//GEN-END:variables
}
