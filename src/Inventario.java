
import conexión.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Inventario extends javax.swing.JFrame {
     Conexion con=new Conexion();
     Connection cn;
     Statement st;
     ResultSet rs;
     DefaultTableModel modelo;
     int id;

     public Inventario() {
          initComponents();
          this.setLocationRelativeTo(null);
          listar();
     }


     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jPanel1 = new javax.swing.JPanel();
          jLabel2 = new javax.swing.JLabel();
          jLabel3 = new javax.swing.JLabel();
          jLabel4 = new javax.swing.JLabel();
          txtIdPan = new javax.swing.JTextField();
          txtNombrePieza = new javax.swing.JTextField();
          txtPrecio = new javax.swing.JTextField();
          jLabel5 = new javax.swing.JLabel();
          jPanel2 = new javax.swing.JPanel();
          btnAgregar = new javax.swing.JButton();
          btnModificar = new javax.swing.JButton();
          btnEliminar = new javax.swing.JButton();
          btnNuevo = new javax.swing.JButton();
          jPanel3 = new javax.swing.JPanel();
          jScrollPane1 = new javax.swing.JScrollPane();
          TablaDatos = new javax.swing.JTable();
          jLabel1 = new javax.swing.JLabel();
          btnBack = new javax.swing.JButton();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          jPanel1.setBackground(new java.awt.Color(255, 224, 209));
          jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
          jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

          jLabel2.setText("IdPan");
          jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 33, -1, -1));

          jLabel3.setText("NombrePieza");
          jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 76, -1, -1));

          jLabel4.setText("Precio");
          jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 118, -1, -1));

          txtIdPan.setEditable(false);
          txtIdPan.setEnabled(false);
          jPanel1.add(txtIdPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 29, 240, -1));

          txtNombrePieza.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtNombrePiezaActionPerformed(evt);
               }
          });
          jPanel1.add(txtNombrePieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 72, 240, -1));
          jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 114, 240, -1));

          jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/prueba2.jpg"))); // NOI18N
          jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));

          jPanel2.setBackground(new java.awt.Color(255, 223, 209));
          jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

          btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir-al-carrito.png"))); // NOI18N
          btnAgregar.setText("Agregar");
          btnAgregar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnAgregarActionPerformed(evt);
               }
          });

          btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
          btnModificar.setText("Modificar");
          btnModificar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnModificarActionPerformed(evt);
               }
          });

          btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
          btnEliminar.setText("Eliminar");
          btnEliminar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnEliminarActionPerformed(evt);
               }
          });

          btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nueva-ventana.png"))); // NOI18N
          btnNuevo.setText("Nuevo");
          btnNuevo.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnNuevoActionPerformed(evt);
               }
          });

          javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
          jPanel2.setLayout(jPanel2Layout);
          jPanel2Layout.setHorizontalGroup(
               jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(btnAgregar)
                    .addGap(26, 26, 26)
                    .addComponent(btnModificar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar)
                    .addGap(38, 38, 38)
                    .addComponent(btnNuevo)
                    .addContainerGap())
          );
          jPanel2Layout.setVerticalGroup(
               jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(btnAgregar)
                         .addComponent(btnModificar)
                         .addComponent(btnEliminar)
                         .addComponent(btnNuevo))
                    .addContainerGap(36, Short.MAX_VALUE))
          );

          jPanel3.setBackground(new java.awt.Color(255, 223, 209));
          jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Listas"));

          TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
               new Object [][] {

               },
               new String [] {
                    "IdPan", "NombrePieza", "Precio"
               }
          ));
          TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    TablaDatosMouseClicked(evt);
               }
          });
          jScrollPane1.setViewportView(TablaDatos);
          if (TablaDatos.getColumnModel().getColumnCount() > 0) {
               TablaDatos.getColumnModel().getColumn(0).setMinWidth(50);
               TablaDatos.getColumnModel().getColumn(0).setPreferredWidth(50);
               TablaDatos.getColumnModel().getColumn(0).setMaxWidth(50);
          }

          javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
          jPanel3.setLayout(jPanel3Layout);
          jPanel3Layout.setHorizontalGroup(
               jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane1)
          );
          jPanel3Layout.setVerticalGroup(
               jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
          );

          jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
          jLabel1.setText("Inventario");

          btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
          btnBack.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnBackActionPerformed(evt);
               }
          });

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                         .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                         .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                         .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(201, 201, 201)
                    .addComponent(btnBack)
                    .addContainerGap())
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(layout.createSequentialGroup()
                              .addGap(17, 17, 17)
                              .addComponent(jLabel1)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                              .addContainerGap(19, Short.MAX_VALUE)
                              .addComponent(btnBack)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
          Agregar();
          listar();
          nuevo();
     }//GEN-LAST:event_btnAgregarActionPerformed

     private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
          int fila = TablaDatos.getSelectedRow();
          if(fila==-1){
               JOptionPane.showMessageDialog(null, "Pan no seleccionado");
          }else{
               id = Integer.parseInt((String)TablaDatos.getValueAt(fila, 0).toString());
               String nombrePan = (String)TablaDatos.getValueAt(fila, 1);
               Float precio = Float.parseFloat((String)TablaDatos.getValueAt(fila, 2).toString());
               txtIdPan.setText(""+id);
               txtNombrePieza.setText(nombrePan);
               txtPrecio.setText(""+precio);
          }
     }//GEN-LAST:event_TablaDatosMouseClicked

     private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
          modificar();
          listar();
          nuevo();
     }//GEN-LAST:event_btnModificarActionPerformed

     private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
          eliminar();
          listar();
          nuevo();
     }//GEN-LAST:event_btnEliminarActionPerformed

     private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
          nuevo();
     }//GEN-LAST:event_btnNuevoActionPerformed

     private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
          VentaPresencial vp = new VentaPresencial();
           vp.setVisible(true);
           this.dispose();
     }//GEN-LAST:event_btnBackActionPerformed

     private void txtNombrePiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePiezaActionPerformed
          // TODO add your handling code here:
     }//GEN-LAST:event_txtNombrePiezaActionPerformed

     void modificar(){
          String nombrePan = txtNombrePieza.getText();
          String precio = txtPrecio.getText();
          String sql = "update pan set NombrePieza=' "+nombrePan+ " ' , Precio=' "+precio+" ' where IdPan="+id;
          if(nombrePan.equals("") || precio.equals("")){
               JOptionPane.showMessageDialog(null, "Debe ingresar datos");
          }else{
               try {
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Pieza de pan actulizada");
                    limpiarTabla();
               } catch (Exception e) {
               }
          }
     }

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
               java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
               java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
          //</editor-fold>

          /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new Inventario().setVisible(true);
               }
          });
     }
     
     void listar(){
          String sql="select * from pan";
          try {
               cn = con.getConnection();
               st = cn.createStatement();
               rs = st.executeQuery(sql);
               Object[ ]pan = new Object[3];
               modelo=(DefaultTableModel)TablaDatos.getModel();
               while (rs.next()){
                    pan[0] = rs.getInt("IdPan");
                    pan[1] = rs.getString("NombrePieza");
                    pan[2] = rs.getFloat("Precio");
                    modelo.addRow(pan);
               }
               TablaDatos.setModel(modelo);
          } catch (Exception e) {
          }
     }
     
     void Agregar(){
           String nombrePan = txtNombrePieza.getText();
           String precio = txtPrecio.getText();
           if(nombrePan.equals("") || precio.equals("")){
                JOptionPane.showMessageDialog(null, "Cajas están vacias...");
           }else{
                String sql="insert into pan(NombrePieza,Precio)values(' "+nombrePan+" ',' "+precio+" ')";
                try {
                     cn = con.getConnection();
                     st = cn.createStatement();
                     st.executeUpdate(sql);
                     JOptionPane.showMessageDialog(null, "Pan agregado...");
                     limpiarTabla();
                } catch (Exception e) {
                }
           }
     }
     
     void limpiarTabla(){
          for(int i=0;i<=TablaDatos.getRowCount();i++){
               modelo.removeRow(i);
               i=i-1;
          }
     }
     
     void eliminar(){
          int filaSelecionado = TablaDatos.getSelectedRow();
          if(filaSelecionado==-1){
               JOptionPane.showMessageDialog(null, "Debe selecionar una fila...");
          }else{
               String sql="delete from pan where IdPan="+id;
               try {
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Pan eliminado con exito...");
                    limpiarTabla();
               } catch (Exception e) {
               }
          }
     }
     
     void nuevo(){
          txtIdPan.setText("");
          txtNombrePieza.setText("");
          txtPrecio.setText("");
          txtNombrePieza.requestFocus();
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JTable TablaDatos;
     private javax.swing.JButton btnAgregar;
     private javax.swing.JButton btnBack;
     private javax.swing.JButton btnEliminar;
     private javax.swing.JButton btnModificar;
     private javax.swing.JButton btnNuevo;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JLabel jLabel5;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JPanel jPanel2;
     private javax.swing.JPanel jPanel3;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JTextField txtIdPan;
     private javax.swing.JTextField txtNombrePieza;
     private javax.swing.JTextField txtPrecio;
     // End of variables declaration//GEN-END:variables
}
