
import conexión.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tablas.tabla1_pan;
import tablas.tabla2_cliente;


public class VentaPresencial extends javax.swing.JFrame {
     Conexion con=new Conexion();
     Connection cn;
     Statement st;
     ResultSet rs;
     DefaultTableModel modelo;
     int id;
   
     public VentaPresencial() {
          initComponents();
          this.setLocationRelativeTo(null);
          listar();
          mostrarComboBox1();
          mostrarComboBox2();
         
     }

 
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
          jPanel1 = new javax.swing.JPanel();
          jLabel1 = new javax.swing.JLabel();
          jLabel2 = new javax.swing.JLabel();
          jLabel3 = new javax.swing.JLabel();
          jLabel4 = new javax.swing.JLabel();
          jLabel5 = new javax.swing.JLabel();
          jLabel6 = new javax.swing.JLabel();
          txt_IdVenta = new javax.swing.JTextField();
          comBox_idPan = new javax.swing.JComboBox<>();
          comBox_IdCliente = new javax.swing.JComboBox<>();
          txt_Total = new javax.swing.JTextField();
          txt_Piezas = new javax.swing.JTextField();
          txt_Fecha = new javax.swing.JTextField();
          btn_buscar3 = new javax.swing.JButton();
          btn_buscar4 = new javax.swing.JButton();
          jLabel7 = new javax.swing.JLabel();
          jPanel2 = new javax.swing.JPanel();
          btn_Agregar = new javax.swing.JButton();
          btn_modificar = new javax.swing.JButton();
          btn_Eliminar = new javax.swing.JButton();
          btn_Nuevo = new javax.swing.JButton();
          jPanel3 = new javax.swing.JPanel();
          jScrollPane1 = new javax.swing.JScrollPane();
          listas = new javax.swing.JTable();
          jButton1 = new javax.swing.JButton();
          jLabel8 = new javax.swing.JLabel();
          jMenuBar1 = new javax.swing.JMenuBar();
          jMenu1 = new javax.swing.JMenu();
          jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
          jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
          jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();

          jCheckBoxMenuItem1.setSelected(true);
          jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          jPanel1.setBackground(new java.awt.Color(255, 221, 206));
          jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
          jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

          jLabel1.setText("Id_Venta");
          jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 32, -1, -1));

          jLabel2.setText("IdPan");
          jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 75, -1, -1));

          jLabel3.setText("Id_Cliente");
          jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 136, -1, -1));

          jLabel4.setText("Total");
          jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 184, -1, -1));

          jLabel5.setText("Piezas");
          jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 226, -1, -1));

          jLabel6.setText("Fecha");
          jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 268, -1, -1));

          txt_IdVenta.setEditable(false);
          txt_IdVenta.setEnabled(false);
          jPanel1.add(txt_IdVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 28, 322, -1));

          comBox_idPan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
          jPanel1.add(comBox_idPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 70, 322, -1));

          comBox_IdCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
          jPanel1.add(comBox_IdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 131, 322, -1));

          txt_Total.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    txt_TotalMouseClicked(evt);
               }
          });
          jPanel1.add(txt_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 180, 322, -1));
          jPanel1.add(txt_Piezas, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 222, 322, -1));

          txt_Fecha.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    txt_FechaMouseClicked(evt);
               }
          });
          jPanel1.add(txt_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 264, 322, -1));

          btn_buscar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen_2022-05-25_182132044.png"))); // NOI18N
          btn_buscar3.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_buscar3ActionPerformed(evt);
               }
          });
          jPanel1.add(btn_buscar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 131, 41, 43));

          btn_buscar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen_2022-05-25_182132044.png"))); // NOI18N
          btn_buscar4.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_buscar4ActionPerformed(evt);
               }
          });
          jPanel1.add(btn_buscar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 76, 41, 43));

          jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/prueba2.jpg"))); // NOI18N
          jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

          jPanel2.setBackground(new java.awt.Color(255, 221, 206));
          jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

          btn_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir-al-carrito.png"))); // NOI18N
          btn_Agregar.setText("Agregar");
          btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_AgregarActionPerformed(evt);
               }
          });

          btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
          btn_modificar.setText("Modificar");
          btn_modificar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_modificarActionPerformed(evt);
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
                    .addComponent(btn_Agregar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_modificar)
                    .addGap(50, 50, 50)
                    .addComponent(btn_Eliminar)
                    .addGap(30, 30, 30)
                    .addComponent(btn_Nuevo)
                    .addContainerGap())
          );
          jPanel2Layout.setVerticalGroup(
               jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(btn_Agregar)
                         .addComponent(btn_modificar)
                         .addComponent(btn_Eliminar)
                         .addComponent(btn_Nuevo))
                    .addContainerGap(40, Short.MAX_VALUE))
          );

          jPanel3.setBackground(new java.awt.Color(255, 221, 206));
          jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Listas"));

          listas.setModel(new javax.swing.table.DefaultTableModel(
               new Object [][] {

               },
               new String [] {
                    "Id_Venta", "IdPan", "Id_Cliente", "Total", "Piezas", "Fecha"
               }
          ));
          listas.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    listasMouseClicked(evt);
               }
          });
          jScrollPane1.setViewportView(listas);

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(256, 256, 256))
          );

          jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
          jButton1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
               }
          });

          jLabel8.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
          jLabel8.setText("Venta");

          jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));

          jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu_pixel_icon_123657.png"))); // NOI18N

          jCheckBoxMenuItem2.setSelected(true);
          jCheckBoxMenuItem2.setText("Pan");
          jCheckBoxMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inventario.png"))); // NOI18N
          jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBoxMenuItem2ActionPerformed(evt);
               }
          });
          jMenu1.add(jCheckBoxMenuItem2);

          jCheckBoxMenuItem3.setSelected(true);
          jCheckBoxMenuItem3.setText("Cliente");
          jCheckBoxMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
          jCheckBoxMenuItem3.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBoxMenuItem3ActionPerformed(evt);
               }
          });
          jMenu1.add(jCheckBoxMenuItem3);

          jCheckBoxMenuItem4.setSelected(true);
          jCheckBoxMenuItem4.setText("Pedidos");
          jCheckBoxMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pedidos.png"))); // NOI18N
          jCheckBoxMenuItem4.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBoxMenuItem4ActionPerformed(evt);
               }
          });
          jMenu1.add(jCheckBoxMenuItem4);

          jMenuBar1.add(jMenu1);

          setJMenuBar(jMenuBar1);

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(layout.createSequentialGroup()
                              .addGap(0, 0, Short.MAX_VALUE)
                              .addComponent(jLabel8)
                              .addGap(202, 202, 202)
                              .addComponent(jButton1)
                              .addGap(22, 22, 22))
                         .addGroup(layout.createSequentialGroup()
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                   .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                   .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                   .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE))
                              .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(layout.createSequentialGroup()
                              .addComponent(jButton1)
                              .addGap(4, 4, 4))
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                              .addComponent(jLabel8)
                              .addGap(18, 18, 18)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
          Agregar();
          listar();
          nuevo();
     }//GEN-LAST:event_btn_AgregarActionPerformed

     private void listasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listasMouseClicked
          int fila = listas.getSelectedRow();
          if(fila==-1){
               JOptionPane.showMessageDialog(null, "Venta no seleccionado");
          }else{
               id = Integer.parseInt((String)listas.getValueAt(fila, 0).toString());
               Float total = Float.parseFloat((String)listas.getValueAt(fila, 3).toString());
               String piezas = (String)listas.getValueAt(fila, 4);
               String fecha = (String)listas.getValueAt(fila, 5);
               txt_IdVenta.setText(""+id);
               txt_Total.setText(""+total);
               txt_Piezas.setText(piezas);
               txt_Fecha.setText(fecha);

          }
     }//GEN-LAST:event_listasMouseClicked

     private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
          Agregar();
          listar();
          nuevo();
     }//GEN-LAST:event_btn_modificarActionPerformed

     private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
          eliminar();
          listar();
          nuevo();
     }//GEN-LAST:event_btn_EliminarActionPerformed

     private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
          nuevo();
     }//GEN-LAST:event_btn_NuevoActionPerformed

     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          JOptionPane.showConfirmDialog(null, "¿Seguro que quieres salir?");
          Login lg= new Login();
          lg.setVisible(true);
          this.dispose();
     }//GEN-LAST:event_jButton1ActionPerformed

     private void btn_buscar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar4ActionPerformed
          tabla1_pan t1=new tabla1_pan();
          t1.setVisible(true);
     }//GEN-LAST:event_btn_buscar4ActionPerformed

     private void btn_buscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar3ActionPerformed
          tabla2_cliente t2 = new tabla2_cliente();
          t2.setVisible(true);
     }//GEN-LAST:event_btn_buscar3ActionPerformed

     private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
          Inventario iv = new Inventario();
          iv.setVisible(true);
          this.dispose();        
     }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

     private void jCheckBoxMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem3ActionPerformed
          ClientePreferente cp = new ClientePreferente();
          cp.setVisible(true);
          this.dispose();
     }//GEN-LAST:event_jCheckBoxMenuItem3ActionPerformed

     private void jCheckBoxMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem4ActionPerformed
          Pedidos p = new Pedidos();
          p.setVisible(true);
          this.dispose();
     }//GEN-LAST:event_jCheckBoxMenuItem4ActionPerformed

     private void txt_FechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_FechaMouseClicked
          txt_Fecha.setText(fecha());
     }//GEN-LAST:event_txt_FechaMouseClicked

     private void txt_TotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_TotalMouseClicked
          calculaTotal();
     }//GEN-LAST:event_txt_TotalMouseClicked

     public static String fecha(){
          Date fecha = new Date();
          SimpleDateFormat formatofecha=new SimpleDateFormat("YYYY-MM-dd");
          return formatofecha.format(fecha);
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
               java.util.logging.Logger.getLogger(VentaPresencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(VentaPresencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
               java.util.logging.Logger.getLogger(VentaPresencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(VentaPresencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
          //</editor-fold>


          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new VentaPresencial().setVisible(true);
               }
          });
     }
     
    void calculaTotal(){
          String idPan = comBox_idPan.getSelectedItem().toString();
          int resultado=0;
          int cantidad=0;
          int piezas = Integer.parseInt(txt_Piezas.getText());
          
          String sql = "SELECT Precio FROM pan WHERE IdPan=" + idPan;
           try {
               cn = con.getConnection();
               st = cn.createStatement();
               rs = st.executeQuery(sql);
               System.out.print(rs);      
               cantidad = (Integer) rs.getObject(1);
                 while(rs.next() ){
                       resultado = piezas * cantidad;
                        txt_Total.setText(""+String.valueOf(resultado));
               }    
           } catch (Exception e) {
           } 
     } 
     
     void mostrarComboBox1(){
          String sql="select * from pan";
           try {
               cn = con.getConnection();
               st = cn.createStatement();
               rs = st.executeQuery(sql);
               comBox_idPan.removeAllItems();
               while(rs.next() ){
                    comBox_idPan.addItem(rs.getString("IdPan"));
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
               comBox_IdCliente.removeAllItems();
               while(rs.next() ){
                    comBox_IdCliente.addItem(rs.getString("Id_Cliente"));
               }
           } catch (Exception e) {
           } 
     }
       
       void listar(){
          String sql="select * from ventapresencial";
          try {
               cn = con.getConnection();
               st = cn.createStatement();
               rs = st.executeQuery(sql);
               Object[ ]venta = new Object[6];
               modelo=(DefaultTableModel)listas.getModel();
               while (rs.next()){
                    venta[0] = rs.getInt("Id_Venta");
                    venta[1] = rs.getInt("IdPan");
                    venta[2] = rs.getInt("Id_Cliente");
                    venta[3] = rs.getString("TotalPrecio");
                    venta[4] = rs.getString("PiezasVendidas");
                    venta[5] = rs.getString("FechaVenta");
                    
                    modelo.addRow(venta);
               }
               listas.setModel(modelo);
          } catch (Exception e) {
          }
     } 
       
       void Agregar(){
          String idPan = comBox_idPan.getSelectedItem().toString();
          String idCliente = comBox_IdCliente.getSelectedItem().toString();
          String total = txt_Total.getText();
          String piezas = txt_Piezas.getText();
          String fecha = txt_Fecha.getText();
          
           
           if(idPan.equals("") ||idCliente.equals("") ||  total.equals("") || piezas.equals("") || fecha.equals("")){
                JOptionPane.showMessageDialog(null, "Cajas están vacias...");
           }else{
                String sql="insert into ventapresencial(IdPan,Id_Cliente,TotalPrecio,PiezasVendidas,FechaVenta)values(' "+idPan+" ',' "+idCliente+" ',' "+total+" ',' "+piezas+" ',' "+fecha+" ')";
                try {
                     cn = con.getConnection();
                     st = cn.createStatement();
                     st.executeUpdate(sql);
                     limpiarTabla();
                     JOptionPane.showMessageDialog(null, "Venta agregada...");
                } catch (Exception e) {
                }
           }
     }
       
       void limpiarTabla(){
          for(int i=0;i<=listas.getRowCount();i++){
               modelo.removeRow(i);
               i=i-1;
          }
     }
       
       void modificar(){
          String total = txt_Total.getText();
          String piezas = txt_Piezas.getText();
          String fecha = txt_Fecha.getText();
          String sql = "update ventapresencial set TotalPrecio=' "+total+ " ' , PiezasVendidas=' "+piezas+" ', FechaVenta=' "+fecha+" ' where Id_Venta="+id;
           if(total.equals("") || piezas.equals("") || fecha.equals("")){
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
          int filaSelecionado = listas.getSelectedRow();
          if(filaSelecionado==-1){
               JOptionPane.showMessageDialog(null, "Debe selecionar una fila...");
          }else{
               String sql="delete from ventapresencial where Id_Venta="+id;
               try {
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Venta eliminado con exito...");
                    limpiarTabla();
               } catch (Exception e) {
               }
          }
     }
       
       void nuevo(){
          txt_IdVenta.setText("");
          txt_Total.setText("");
          txt_Piezas.setText("");
          txt_Fecha.setText("");
          txt_IdVenta.requestFocus();
     }
       
       

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton btn_Agregar;
     private javax.swing.JButton btn_Eliminar;
     private javax.swing.JButton btn_Nuevo;
     private javax.swing.JButton btn_buscar3;
     private javax.swing.JButton btn_buscar4;
     private javax.swing.JButton btn_modificar;
     private javax.swing.JComboBox<String> comBox_IdCliente;
     private javax.swing.JComboBox<String> comBox_idPan;
     private javax.swing.JButton jButton1;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JLabel jLabel5;
     private javax.swing.JLabel jLabel6;
     private javax.swing.JLabel jLabel7;
     private javax.swing.JLabel jLabel8;
     private javax.swing.JMenu jMenu1;
     private javax.swing.JMenuBar jMenuBar1;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JPanel jPanel2;
     private javax.swing.JPanel jPanel3;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JTable listas;
     private javax.swing.JTextField txt_Fecha;
     private javax.swing.JTextField txt_IdVenta;
     private javax.swing.JTextField txt_Piezas;
     private javax.swing.JTextField txt_Total;
     // End of variables declaration//GEN-END:variables
}
