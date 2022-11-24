import conexión.Conexion;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.TabableView;
import tablas.tabla1_pan;
import tablas.tabla2_cliente;
public class Pedidos extends javax.swing.JFrame {
     Conexion con=new Conexion();
     Connection cn;
     Statement st;
     ResultSet rs;
     DefaultTableModel modelo;
     int id;

     public Pedidos() {
          initComponents();
          this.setLocationRelativeTo(null);
          listar();
          mostrarComboBox1();
          mostrarComboBox2();
         
          
     }
     



     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jPanel1 = new javax.swing.JPanel();
          ComBox_IdPan = new javax.swing.JComboBox<>();
          jLabel1 = new javax.swing.JLabel();
          jLabel2 = new javax.swing.JLabel();
          jLabel3 = new javax.swing.JLabel();
          jLabel4 = new javax.swing.JLabel();
          jLabel5 = new javax.swing.JLabel();
          jLabel6 = new javax.swing.JLabel();
          ComboBox_IdCliente = new javax.swing.JComboBox<>();
          txt_IdPedido = new javax.swing.JTextField();
          txt_Fecha = new javax.swing.JTextField();
          txt_Dirección = new javax.swing.JTextField();
          txt_Hora = new javax.swing.JTextField();
          jLabel7 = new javax.swing.JLabel();
          txt_Total = new javax.swing.JTextField();
          btn_Buscar1 = new javax.swing.JButton();
          btn_Buscar2 = new javax.swing.JButton();
          jLabel9 = new javax.swing.JLabel();
          jPanel2 = new javax.swing.JPanel();
          btn_Agregar = new javax.swing.JButton();
          btn_Modificar = new javax.swing.JButton();
          btn_Eliminar = new javax.swing.JButton();
          btn_Nuevo = new javax.swing.JButton();
          jPanel3 = new javax.swing.JPanel();
          jScrollPane1 = new javax.swing.JScrollPane();
          tablaPedido = new javax.swing.JTable();
          jButton1 = new javax.swing.JButton();
          jLabel8 = new javax.swing.JLabel();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          jPanel1.setBackground(new java.awt.Color(255, 221, 206));
          jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
          jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

          ComBox_IdPan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
          ComBox_IdPan.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    ComBox_IdPanActionPerformed(evt);
               }
          });
          jPanel1.add(ComBox_IdPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 66, 291, -1));

          jLabel1.setText("Id_Pedido");
          jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 31, -1, -1));

          jLabel2.setText("IdPan");
          jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 71, 44, -1));

          jLabel3.setText("Id_Cliente");
          jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 130, -1, -1));

          jLabel4.setText("Fecha");
          jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 167, -1, -1));

          jLabel5.setText("Dirección");
          jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 209, -1, -1));

          jLabel6.setText("Hora");
          jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 251, -1, -1));

          ComboBox_IdCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
          jPanel1.add(ComboBox_IdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 125, 291, -1));

          txt_IdPedido.setEditable(false);
          txt_IdPedido.setEnabled(false);
          jPanel1.add(txt_IdPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 27, 291, -1));

          txt_Fecha.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    txt_FechaMouseClicked(evt);
               }
          });
          jPanel1.add(txt_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 163, 291, -1));
          jPanel1.add(txt_Dirección, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 205, 291, -1));

          txt_Hora.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    txt_HoraMouseClicked(evt);
               }
          });
          jPanel1.add(txt_Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 247, 291, -1));

          jLabel7.setText("TotalPedido");
          jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 293, -1, -1));
          jPanel1.add(txt_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 289, 291, -1));

          btn_Buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen_2022-05-25_182132044.png"))); // NOI18N
          btn_Buscar1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_Buscar1ActionPerformed(evt);
               }
          });
          jPanel1.add(btn_Buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 57, 45, 44));

          btn_Buscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen_2022-05-25_182132044.png"))); // NOI18N
          btn_Buscar2.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_Buscar2ActionPerformed(evt);
               }
          });
          jPanel1.add(btn_Buscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 115, 45, 48));

          jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/prueba2.jpg"))); // NOI18N
          jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

          jPanel2.setBackground(new java.awt.Color(255, 221, 206));
          jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

          btn_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir-al-carrito.png"))); // NOI18N
          btn_Agregar.setText("Agregar");
          btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_AgregarActionPerformed(evt);
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
                    .addGap(19, 19, 19)
                    .addComponent(btn_Agregar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Modificar)
                    .addGap(41, 41, 41)
                    .addComponent(btn_Eliminar)
                    .addGap(46, 46, 46)
                    .addComponent(btn_Nuevo)
                    .addContainerGap())
          );
          jPanel2Layout.setVerticalGroup(
               jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(btn_Agregar)
                         .addComponent(btn_Eliminar)
                         .addComponent(btn_Nuevo)
                         .addComponent(btn_Modificar))
                    .addContainerGap(36, Short.MAX_VALUE))
          );

          jPanel3.setBackground(new java.awt.Color(255, 221, 206));
          jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Listas"));

          tablaPedido.setModel(new javax.swing.table.DefaultTableModel(
               new Object [][] {

               },
               new String [] {
                    "Id_Pedido", "IdPan", "Id_Cliente", "FechaPedido", "Direccion", "HoraPedido", "TotalPedido"
               }
          ));
          tablaPedido.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tablaPedidoMouseClicked(evt);
               }
          });
          jScrollPane1.setViewportView(tablaPedido);

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(286, 286, 286))
          );

          jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
          jButton1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
               }
          });

          jLabel8.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
          jLabel8.setText("Pedidos");

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(layout.createSequentialGroup()
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                   .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                   .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                                   .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                              .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                         .addGroup(layout.createSequentialGroup()
                              .addGap(0, 0, Short.MAX_VALUE)
                              .addComponent(jLabel8)
                              .addGap(181, 181, 181)
                              .addComponent(jButton1)
                              .addGap(15, 15, 15))))
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(layout.createSequentialGroup()
                              .addContainerGap()
                              .addComponent(jButton1))
                         .addComponent(jLabel8))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void ComBox_IdPanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComBox_IdPanActionPerformed
          //mostrarComboBox1();
     }//GEN-LAST:event_ComBox_IdPanActionPerformed

     private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
          Agregar();
          listar();
          nuevo();
     }//GEN-LAST:event_btn_AgregarActionPerformed

     private void tablaPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPedidoMouseClicked
          int fila = tablaPedido.getSelectedRow();
          if(fila==-1){
               JOptionPane.showMessageDialog(null, "Ciente no seleccionado");
          }else{
               id = Integer.parseInt((String)tablaPedido.getValueAt(fila, 0).toString());
               String fecha = (String)tablaPedido.getValueAt(fila, 3);
               String direccion = (String)tablaPedido.getValueAt(fila, 4);
               String hora = (String)tablaPedido.getValueAt(fila, 5);
               String total = (String)tablaPedido.getValueAt(fila, 6);
               txt_IdPedido.setText(""+id);
               txt_Fecha.setText(fecha);
               txt_Dirección.setText(direccion);
               txt_Hora.setText(hora);
               txt_Total.setText(total);
          }
     }//GEN-LAST:event_tablaPedidoMouseClicked

     private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
          modificar();
          listar();
          nuevo();
     }//GEN-LAST:event_btn_ModificarActionPerformed

     private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
          eliminar();
          listar();
          nuevo();
     }//GEN-LAST:event_btn_EliminarActionPerformed

     private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
          nuevo();
     }//GEN-LAST:event_btn_NuevoActionPerformed

     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          VentaPresencial vp = new VentaPresencial();
           vp.setVisible(true);
           this.dispose();
     }//GEN-LAST:event_jButton1ActionPerformed

     private void btn_Buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Buscar1ActionPerformed
          tabla1_pan t1= new tabla1_pan();
          t1.setVisible(true);
          
          
     }//GEN-LAST:event_btn_Buscar1ActionPerformed

     private void btn_Buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Buscar2ActionPerformed
          tabla2_cliente t2=new tabla2_cliente();
          t2.setVisible(true);
     }//GEN-LAST:event_btn_Buscar2ActionPerformed

     private void txt_FechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_FechaMouseClicked
          txt_Fecha.setText(fecha());
     }//GEN-LAST:event_txt_FechaMouseClicked

     private void txt_HoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_HoraMouseClicked
          txt_Hora.setText(hora());
     }//GEN-LAST:event_txt_HoraMouseClicked

     
     public static String fecha(){
          java.util.Date fecha = new java.util.Date();
          SimpleDateFormat formatofecha=new SimpleDateFormat("YYYY-MM-dd");
          return formatofecha.format(fecha);
     }
     
     public static String hora(){
          java.util.Date hora = new java.util.Date();
          DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
          return dateFormat.format(hora);
     }
     
     public static void main(String args[]) {

          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new Pedidos().setVisible(true);
               }
          });
     }
     
void listar(){
          String sql="select * from pedidos";
          try {
               cn = con.getConnection();
               st = cn.createStatement();
               rs = st.executeQuery(sql);
               Object[ ]pedidos = new Object[7];
               modelo=(DefaultTableModel)tablaPedido.getModel();
               while (rs.next()){
                    pedidos[0] = rs.getInt("Id_Pedido");
                    pedidos[1] = rs.getInt("IdPan");
                    pedidos[2] = rs.getInt("Id_Cliente");
                    pedidos[3] = rs.getString("FechaPedido");
                    pedidos[4] = rs.getString("Direccion");
                    pedidos[5] = rs.getString("HoraPedido");
                    pedidos[6] = rs.getString("TotalPedido");
                    modelo.addRow(pedidos);
               }
               tablaPedido.setModel(modelo);
          } catch (Exception e) {
          }
     } 
     
      void mostrarComboBox1(){
          String sql="select * from pan";
           try {
               cn = con.getConnection();
               st = cn.createStatement();
               rs = st.executeQuery(sql);
               ComBox_IdPan.removeAllItems();
               while(rs.next() ){
                    ComBox_IdPan.addItem(rs.getString("IdPan"));
               }
           } catch (Exception e) {
           } 
     }
     
      
       void mostrarComboBox2(){
          String sql="select * from clientepreferente";
           try {
               cn = con.getConnection();
               st = cn.createStatement();
               rs = st.executeQuery(sql);
               ComboBox_IdCliente.removeAllItems();
               while(rs.next() ){
                    ComboBox_IdCliente.addItem(rs.getString("Id_Cliente"));
               }
           } catch (Exception e) {
           } 
     }
       
       void Agregar(){
          String idPan = ComBox_IdPan.getSelectedItem().toString();
          String idCliente = ComboBox_IdCliente.getSelectedItem().toString();
          String fecha = txt_Fecha.getText();
          String direccion = txt_Dirección.getText();
          String hora = txt_Hora.getText();
          String total = txt_Total.getText();
           
           if(idPan.equals("") ||idCliente.equals("") || fecha.equals("") || direccion.equals("") || hora.equals("") || total.equals("")){
                JOptionPane.showMessageDialog(null, "Cajas están vacias...");
           }else{
                String sql="insert into pedidos(IdPan,Id_Cliente,FechaPedido,Direccion,HoraPedido,TotalPedido)values(' "+idPan+" ',' "+idCliente+" ',' "+fecha+" ',' "+direccion+" ',' "+hora+" ',' "+total+" ')";
                try {
                     cn = con.getConnection();
                     st = cn.createStatement();
                     st.executeUpdate(sql);
                     limpiarTabla();
                     JOptionPane.showMessageDialog(null, "Pedido agregado...");
                } catch (Exception e) {
                }
           }
     }
       
     void limpiarTabla(){
          for(int i=0;i<=tablaPedido.getRowCount();i++){
               modelo.removeRow(i);
               i=i-1;
          }
     }

     void modificar(){
          String fecha = txt_Fecha.getText();
          String direccion = txt_Dirección.getText();
          String hora = txt_Hora.getText();
          String total = txt_Total.getText();
          
          String sql = "update pedidos set FechaPedido=' "+fecha+ " ' , Direccion=' "+direccion+" ', HoraPedido=' "+hora+" ', TotalPedido=' "+total+" ' where Id_Pedido="+id;
           if(fecha.equals("") || direccion.equals("") || hora.equals("") || total.equals("")){
               JOptionPane.showMessageDialog(null, "Debe ingresar datos");
          }else{
               try {
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Pedido actulizado...");
                    limpiarTabla();
               } catch (Exception e) {
               }
          }
     }
     
     void eliminar(){
          int filaSelecionado = tablaPedido.getSelectedRow();
          if(filaSelecionado==-1){
               JOptionPane.showMessageDialog(null, "Debe selecionar una fila...");
          }else{
               String sql="delete from pedidos where Id_Pedido="+id;
               try {
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Pedido eliminado con exito...");
                    limpiarTabla();
               } catch (Exception e) {
               }
          }
     }
     
           void nuevo(){
          txt_IdPedido.setText("");
          txt_Fecha.setText("");
          txt_Dirección.setText("");
          txt_Hora.setText("");
          txt_Total.setText("");
          txt_Fecha.requestFocus();
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JComboBox<String> ComBox_IdPan;
     private javax.swing.JComboBox<String> ComboBox_IdCliente;
     private javax.swing.JButton btn_Agregar;
     private javax.swing.JButton btn_Buscar1;
     private javax.swing.JButton btn_Buscar2;
     private javax.swing.JButton btn_Eliminar;
     private javax.swing.JButton btn_Modificar;
     private javax.swing.JButton btn_Nuevo;
     private javax.swing.JButton jButton1;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JLabel jLabel5;
     private javax.swing.JLabel jLabel6;
     private javax.swing.JLabel jLabel7;
     private javax.swing.JLabel jLabel8;
     private javax.swing.JLabel jLabel9;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JPanel jPanel2;
     private javax.swing.JPanel jPanel3;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JTable tablaPedido;
     private javax.swing.JTextField txt_Dirección;
     private javax.swing.JTextField txt_Fecha;
     private javax.swing.JTextField txt_Hora;
     private javax.swing.JTextField txt_IdPedido;
     private javax.swing.JTextField txt_Total;
     // End of variables declaration//GEN-END:variables
}
