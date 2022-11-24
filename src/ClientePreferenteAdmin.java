
import conexión.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.TabableView;


public class ClientePreferenteAdmin extends javax.swing.JFrame {
     
     Conexion con=new Conexion();
     Connection cn;
     Statement st;
     ResultSet rs;
     DefaultTableModel modelo;
     int id;
     
     public ClientePreferenteAdmin() {
          initComponents();
          this.setLocationRelativeTo(null);
          listar();
     }

  
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jPanel1 = new javax.swing.JPanel();
          jLabel1 = new javax.swing.JLabel();
          jLabel2 = new javax.swing.JLabel();
          jLabel3 = new javax.swing.JLabel();
          txt_Id_Cliente = new javax.swing.JTextField();
          txt_NombreCliente = new javax.swing.JTextField();
          txt_RFC = new javax.swing.JTextField();
          jLabel5 = new javax.swing.JLabel();
          jPanel2 = new javax.swing.JPanel();
          btn_agregar = new javax.swing.JButton();
          btn_Modificar = new javax.swing.JButton();
          btn_Eliminar = new javax.swing.JButton();
          btn_Nuevo = new javax.swing.JButton();
          jPanel3 = new javax.swing.JPanel();
          jScrollPane1 = new javax.swing.JScrollPane();
          TablaCliente = new javax.swing.JTable();
          jButton1 = new javax.swing.JButton();
          jLabel4 = new javax.swing.JLabel();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          jPanel1.setBackground(new java.awt.Color(255, 221, 206));
          jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
          jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

          jLabel1.setText("Id_Cliente");
          jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 28, -1, -1));

          jLabel2.setText("Nombre_Del_Cliente");
          jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 70, -1, -1));

          jLabel3.setText("RFC");
          jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 112, -1, -1));

          txt_Id_Cliente.setEditable(false);
          txt_Id_Cliente.setEnabled(false);
          txt_Id_Cliente.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txt_Id_ClienteActionPerformed(evt);
               }
          });
          jPanel1.add(txt_Id_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 24, 279, -1));

          txt_NombreCliente.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txt_NombreClienteActionPerformed(evt);
               }
          });
          jPanel1.add(txt_NombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 66, 279, -1));
          jPanel1.add(txt_RFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 108, 279, -1));

          jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/prueba2.jpg"))); // NOI18N
          jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

          jPanel2.setBackground(new java.awt.Color(255, 221, 206));
          jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

          btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir-al-carrito.png"))); // NOI18N
          btn_agregar.setText("Agregar");
          btn_agregar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_agregarActionPerformed(evt);
               }
          });

          btn_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
          btn_Modificar.setText("Modificar");
          btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_ModificarActionPerformed(evt);
               }
          });

          btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
          btn_Eliminar.setText("Eliminar");
          btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_EliminarActionPerformed(evt);
               }
          });

          btn_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nueva-ventana.png"))); // NOI18N
          btn_Nuevo.setText("Nuevo");
          btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_NuevoActionPerformed(evt);
               }
          });

          javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
          jPanel2.setLayout(jPanel2Layout);
          jPanel2Layout.setHorizontalGroup(
               jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btn_agregar)
                    .addGap(18, 18, 18)
                    .addComponent(btn_Modificar)
                    .addGap(27, 27, 27)
                    .addComponent(btn_Eliminar)
                    .addGap(18, 18, 18)
                    .addComponent(btn_Nuevo)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          );
          jPanel2Layout.setVerticalGroup(
               jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(btn_Modificar, javax.swing.GroupLayout.Alignment.TRAILING)
                         .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(btn_agregar)
                              .addComponent(btn_Nuevo)
                              .addComponent(btn_Eliminar)))
                    .addContainerGap(28, Short.MAX_VALUE))
          );

          jPanel3.setBackground(new java.awt.Color(255, 221, 206));
          jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Listas"));

          TablaCliente.setModel(new javax.swing.table.DefaultTableModel(
               new Object [][] {

               },
               new String [] {
                    "Id_Cliente", "Nombre", "RFC"
               }
          ));
          TablaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    TablaClienteMouseClicked(evt);
               }
          });
          jScrollPane1.setViewportView(TablaCliente);
          if (TablaCliente.getColumnModel().getColumnCount() > 0) {
               TablaCliente.getColumnModel().getColumn(0).setMinWidth(50);
               TablaCliente.getColumnModel().getColumn(0).setPreferredWidth(50);
               TablaCliente.getColumnModel().getColumn(0).setMaxWidth(50);
          }

          javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
          jPanel3.setLayout(jPanel3Layout);
          jPanel3Layout.setHorizontalGroup(
               jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
          );
          jPanel3Layout.setVerticalGroup(
               jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
          );

          jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
          jButton1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
               }
          });

          jLabel4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
          jLabel4.setText("Cliente Preferente");

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                              .addComponent(jLabel4)
                              .addGap(115, 115, 115)
                              .addComponent(jButton1))
                         .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                         .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(15, Short.MAX_VALUE))
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jButton1)
                         .addComponent(jLabel4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
          Agregar();
          listar();
          nuevo();
     }//GEN-LAST:event_btn_agregarActionPerformed

     private void TablaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaClienteMouseClicked
          int fila = TablaCliente.getSelectedRow();
          if(fila==-1){
               JOptionPane.showMessageDialog(null, "Ciente no seleccionado");
          }else{
               id = Integer.parseInt((String)TablaCliente.getValueAt(fila, 0).toString());
               String nombre = (String)TablaCliente.getValueAt(fila, 1);
               String rfc = (String)TablaCliente.getValueAt(fila, 2);
               txt_Id_Cliente.setText(""+id);
               txt_NombreCliente.setText(nombre);
               txt_RFC.setText(rfc);
          }
     }//GEN-LAST:event_TablaClienteMouseClicked

     private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
          eliminar();
          listar();
          nuevo();
     }//GEN-LAST:event_btn_EliminarActionPerformed

     private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
          nuevo();
     }//GEN-LAST:event_btn_NuevoActionPerformed

     private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
          Agregar();
          listar();
          nuevo();
     }//GEN-LAST:event_btn_ModificarActionPerformed

     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           VentanaPrincipal vp = new VentanaPrincipal();
           vp.setVisible(true);
           this.dispose();
     }//GEN-LAST:event_jButton1ActionPerformed

     private void txt_NombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreClienteActionPerformed
          // TODO add your handling code here:
     }//GEN-LAST:event_txt_NombreClienteActionPerformed

     private void txt_Id_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Id_ClienteActionPerformed
          // TODO add your handling code here:
     }//GEN-LAST:event_txt_Id_ClienteActionPerformed


     public static void main(String args[]) {
     
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new ClientePreferente().setVisible(true);
               }
          });
     }
     
     void listar(){
          String sql="select * from clientepreferente";
          try {
               cn = con.getConnection();
               st = cn.createStatement();
               rs = st.executeQuery(sql);
               Object[ ]cliente = new Object[3];
               modelo=(DefaultTableModel)TablaCliente.getModel();
               while (rs.next()){
                    cliente[0] = rs.getInt("Id_Cliente");
                    cliente[1] = rs.getString("NombreCliente");
                    cliente[2] = rs.getString("RFC");
                    modelo.addRow(cliente);
               }
               TablaCliente.setModel(modelo);
          } catch (Exception e) {
          }
     } 
     
     
     void Agregar(){
          String nombreCliente = txt_NombreCliente.getText();
          String rfc = txt_RFC.getText();
           
           if(nombreCliente.equals("") || rfc.equals("")){
                JOptionPane.showMessageDialog(null, "Cajas están vacias...");
           }else{
                String sql="insert into clientepreferente(NombreCliente,RFC)values(' "+nombreCliente+" ',' "+rfc+" ')";
                try {
                     cn = con.getConnection();
                     st = cn.createStatement();
                     st.executeUpdate(sql);
                     limpiarTabla();
                         JOptionPane.showMessageDialog(null, "Cliente agregado...");
                } catch (Exception e) {
                }
           }
     }
     
     
         void limpiarTabla(){
          for(int i=0;i<=TablaCliente.getRowCount();i++){
               modelo.removeRow(i);
               i=i-1;
          }
     }

         void modificar(){
          String nombre = txt_NombreCliente.getText();
          String rfc = txt_RFC.getText();
          String sql = "update clientepreferente set NombreCliente=' "+nombre+ " ' , RFC=' "+rfc+" ' where Id_Cliente="+id;
          if(nombre.equals("") || rfc.equals("")){
               JOptionPane.showMessageDialog(null, "Debe ingresar datos");
          }else{
               try {
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Cliente actulizado...");
                    limpiarTabla();
               } catch (Exception e) {
               }
          }
     }
         
      void eliminar(){
          int filaSelecionado = TablaCliente.getSelectedRow();
          if(filaSelecionado==-1){
               JOptionPane.showMessageDialog(null, "Debe selecionar una fila...");
          }else{
               String sql="delete from clientepreferente where Id_Cliente="+id;
               try {
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Cliente eliminado con exito...");
                    limpiarTabla();
               } catch (Exception e) {
               }
          }
     }
      
      void nuevo(){
          txt_Id_Cliente.setText("");
          txt_NombreCliente.setText("");
          txt_RFC.setText("");
          txt_NombreCliente.requestFocus();
     }
         
     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JTable TablaCliente;
     private javax.swing.JButton btn_Eliminar;
     private javax.swing.JButton btn_Modificar;
     private javax.swing.JButton btn_Nuevo;
     private javax.swing.JButton btn_agregar;
     private javax.swing.JButton jButton1;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JLabel jLabel5;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JPanel jPanel2;
     private javax.swing.JPanel jPanel3;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JTextField txt_Id_Cliente;
     private javax.swing.JTextField txt_NombreCliente;
     private javax.swing.JTextField txt_RFC;
     // End of variables declaration//GEN-END:variables
}
