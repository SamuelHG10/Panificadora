
import conexión.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class EmpleadosAdmin extends javax.swing.JFrame {
     Conexion con=new Conexion();
     Connection cn;
     Statement st;
     ResultSet rs;
     DefaultTableModel modelo;
     int id;
     
     public EmpleadosAdmin() {
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
          txt_IdEmpleado = new javax.swing.JTextField();
          txt_Nombre = new javax.swing.JTextField();
          txt_CURP = new javax.swing.JTextField();
          jLabel5 = new javax.swing.JLabel();
          jLabel6 = new javax.swing.JLabel();
          jLabel7 = new javax.swing.JLabel();
          txt_Telefono = new javax.swing.JTextField();
          txt_Usuario = new javax.swing.JTextField();
          txt_Contraseña = new javax.swing.JTextField();
          jLabel8 = new javax.swing.JLabel();
          jPanel2 = new javax.swing.JPanel();
          btn_Agregar = new javax.swing.JButton();
          btn_Modificar = new javax.swing.JButton();
          btn_Eliminar = new javax.swing.JButton();
          btn_Nuevo = new javax.swing.JButton();
          jPanel3 = new javax.swing.JPanel();
          jScrollPane1 = new javax.swing.JScrollPane();
          TablaEmpleado = new javax.swing.JTable();
          jLabel1 = new javax.swing.JLabel();
          jButton1 = new javax.swing.JButton();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          jPanel1.setBackground(new java.awt.Color(255, 221, 206));
          jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
          jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

          jLabel2.setText("Id_Empleado");
          jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

          jLabel3.setText("Nombre");
          jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

          jLabel4.setText("CURP");
          jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

          txt_IdEmpleado.setEditable(false);
          txt_IdEmpleado.setEnabled(false);
          jPanel1.add(txt_IdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 268, -1));
          jPanel1.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 268, -1));
          jPanel1.add(txt_CURP, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 268, -1));

          jLabel5.setText("Telefono");
          jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

          jLabel6.setText("Usuario");
          jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

          jLabel7.setText("Contraseña");
          jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));
          jPanel1.add(txt_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 268, -1));
          jPanel1.add(txt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 268, -1));
          jPanel1.add(txt_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 268, -1));

          jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/prueba2.jpg"))); // NOI18N
          jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

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
                    .addContainerGap()
                    .addComponent(btn_Agregar)
                    .addGap(18, 18, 18)
                    .addComponent(btn_Modificar)
                    .addGap(26, 26, 26)
                    .addComponent(btn_Eliminar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Nuevo)
                    .addGap(29, 29, 29))
          );
          jPanel2Layout.setVerticalGroup(
               jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(btn_Agregar)
                         .addComponent(btn_Modificar)
                         .addComponent(btn_Eliminar)
                         .addComponent(btn_Nuevo))
                    .addContainerGap(41, Short.MAX_VALUE))
          );

          jPanel3.setBackground(new java.awt.Color(255, 221, 206));
          jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Listas"));

          TablaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
          TablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
               new Object [][] {

               },
               new String [] {
                    "Id_Empleado", "Nombre", "CURP", "Telefono"
               }
          ));
          TablaEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    TablaEmpleadoMouseClicked(evt);
               }
          });
          jScrollPane1.setViewportView(TablaEmpleado);

          javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
          jPanel3.setLayout(jPanel3Layout);
          jPanel3Layout.setHorizontalGroup(
               jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
          );
          jPanel3Layout.setVerticalGroup(
               jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
          );

          jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
          jLabel1.setText("Empleado");

          jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
          jButton1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
               }
          });

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                         .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                              .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(layout.createSequentialGroup()
                                   .addComponent(jLabel1)
                                   .addGap(150, 150, 150)
                                   .addComponent(jButton1))
                              .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)))
                    .addContainerGap(16, Short.MAX_VALUE))
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jButton1)
                         .addComponent(jLabel1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15))
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
          Agregar();
          listar();
          nuevo();
     }//GEN-LAST:event_btn_AgregarActionPerformed

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

     private void TablaEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaEmpleadoMouseClicked

          int fila = TablaEmpleado.getSelectedRow();
          if(fila==-1){
               JOptionPane.showMessageDialog(null, "Usuario no seleccionado...");
          }else{
               id = Integer.parseInt((String)TablaEmpleado.getValueAt(fila, 0).toString());
               String nombre = (String)TablaEmpleado.getValueAt(fila, 1);
               String curp = (String)TablaEmpleado.getValueAt(fila, 2);
               int telefono = Integer.parseInt((String)TablaEmpleado.getValueAt(fila, 3).toString());
               txt_IdEmpleado.setText(""+id);
               txt_Nombre.setText(nombre);
               txt_CURP.setText(curp);
               txt_Telefono.setText(""+telefono);
          }
     }//GEN-LAST:event_TablaEmpleadoMouseClicked

     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          VentanaPrincipal vt = new VentanaPrincipal();
           vt.setVisible(true);
           this.dispose();
     }//GEN-LAST:event_jButton1ActionPerformed

          void modificar(){
          String nombre = txt_Nombre.getText();
          String curp = txt_CURP.getText();
          String sql = "update empleado set Nombre=' "+nombre+ " ' , CURP=' "+curp+" ' where Id_Empleado="+id;
          if(nombre.equals("") || curp.equals("")){
               JOptionPane.showMessageDialog(null, "Debe ingresar datos");
          }else{
               try {
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Usuario actulizado...");
                    limpiarTabla();
               } catch (Exception e) {
               }
          }
     }
     
     public static void main(String args[]) {

          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new Empleados().setVisible(true);
               }
          });
     }
     
         void listar(){
          String sql="select * from empleado";
          try {
               cn = con.getConnection();
               st = cn.createStatement();
               rs = st.executeQuery(sql);
               Object[ ]empleado = new Object[4];
               modelo=(DefaultTableModel)TablaEmpleado.getModel();
               while (rs.next()){
                    empleado[0] = rs.getInt("Id_Empleado");
                    empleado[1] = rs.getString("Nombre");
                    empleado[2] = rs.getString("CURP");
                    empleado[3] = rs.getInt("Telefono");
                    //empleado[4] = rs.getString("Usuario");
                    //empleado[5] = rs.getString("Contraseña");
                    modelo.addRow(empleado);
               }
               TablaEmpleado.setModel(modelo);
          } catch (Exception e) {
          }
     } 
     
          void Agregar(){
               String nombre = txt_Nombre.getText();
               String curp = txt_CURP.getText();
               String telefono=txt_Telefono.getText();
               String usuario=txt_Usuario.getText();
               String contraseña=txt_Contraseña.getText();
           
           if(nombre.equals("") ||curp.equals("") || telefono.equals("") || usuario.equals("") || contraseña.equals("")){
                JOptionPane.showMessageDialog(null, "Cajas están vacias...");
           }else{
                String sql="insert into empleado(Nombre,CURP,Telefono,Usuario,Contraseña)values(' "+nombre+" ',' "+curp+" ',' "+telefono+" ',' "+usuario+" ',' "+contraseña+" ')";
                try {
                     cn = con.getConnection();
                     st = cn.createStatement();
                     st.executeUpdate(sql);
                     limpiarTabla();
                     JOptionPane.showMessageDialog(null, "Empleado agregado...");

                } catch (Exception e) {
                }
           }
     }
          
    void limpiarTabla(){
          for(int i=0;i<=TablaEmpleado.getRowCount();i++){
               modelo.removeRow(i);
               i=i-1;
          }
     }
     
         void eliminar(){
          int filaSelecionado = TablaEmpleado.getSelectedRow();
          if(filaSelecionado==-1){
               JOptionPane.showMessageDialog(null, "Debe selecionar una fila...");
          }else{
               String sql="delete from empleado where Id_Empleado="+id;
               try {
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Usuario eliminado con exito...");
                    limpiarTabla();
               } catch (Exception e) {
               }
          }
     }
    
     void nuevo(){
          txt_IdEmpleado.setText("");
          txt_Nombre.setText("");
          txt_CURP.setText("");
          txt_Telefono.setText("");
          txt_Usuario.setText("");
          txt_Contraseña.setText("");
          txt_Nombre.requestFocus();
     }
          
     
          



     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JTable TablaEmpleado;
     private javax.swing.JButton btn_Agregar;
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
     private javax.swing.JPanel jPanel1;
     private javax.swing.JPanel jPanel2;
     private javax.swing.JPanel jPanel3;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JTextField txt_CURP;
     private javax.swing.JTextField txt_Contraseña;
     private javax.swing.JTextField txt_IdEmpleado;
     private javax.swing.JTextField txt_Nombre;
     private javax.swing.JTextField txt_Telefono;
     private javax.swing.JTextField txt_Usuario;
     // End of variables declaration//GEN-END:variables
}
