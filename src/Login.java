

import com.sun.prism.Graphics;
import conexión.Conexion;
import java.awt.Image;
import java.sql.*;
import java.sql.ResultSet;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Login extends javax.swing.JFrame {
     Conexion con=new Conexion();
     Connection cn;
     Statement st;
     ResultSet rs;
     
     

     public Login() {
          initComponents();
          this.setLocationRelativeTo(null);
          

     }
  
     
     
     void entrar(){
          
          String usuario = jTextField1.getText();
          String contraseña = jPasswordField1.getText();
          
          
          
          if (usuario.isEmpty() || contraseña.isEmpty() ){
               JOptionPane.showMessageDialog(null, "Algún campo está vacio");
          }else{//Dedes aquí
                    if(usuario.equals("admin") && contraseña.equals("admin")){
                    JOptionPane.showMessageDialog(null, "Bienvenido");
                    VentanaPrincipal vt = new VentanaPrincipal();
                    vt.setVisible(true);
                    this.dispose();
               }else{
                    if(usuario.equals("user") && contraseña.equals("12345")){
                         JOptionPane.showMessageDialog(null, "Bienvenido");
                         VentaPresencial vt = new VentaPresencial();
                         vt.setVisible(true);
                         this.dispose();
                    }else{
                         JOptionPane.showMessageDialog(null, "Su usuario o contraseña es incorrecto");
                    }
               }
          }  
     }

     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jPanel1 = new javax.swing.JPanel();
          jPanel2 = new javax.swing.JPanel();
          jPanel3 = new javax.swing.JPanel();
          jLabel5 = new javax.swing.JLabel();
          jLabel6 = new javax.swing.JLabel();
          jTextField1 = new javax.swing.JTextField();
          jLabel3 = new javax.swing.JLabel();
          jLabel4 = new javax.swing.JLabel();
          jButton1 = new javax.swing.JButton();
          jPasswordField1 = new javax.swing.JPasswordField();
          jLabel7 = new javax.swing.JLabel();
          jLabel8 = new javax.swing.JLabel();
          jLabel9 = new javax.swing.JLabel();
          jLabel1 = new javax.swing.JLabel();
          jLabel10 = new javax.swing.JLabel();
          jLabel2 = new javax.swing.JLabel();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          jPanel1.setBackground(new java.awt.Color(255, 255, 255));
          jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

          jPanel2.setBackground(new java.awt.Color(255, 255, 255));
          jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

          jPanel3.setBackground(new java.awt.Color(255, 153, 102));

          jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Avatar_Container.png"))); // NOI18N
          jLabel5.setText("jLabel5");

          jLabel6.setBackground(new java.awt.Color(0, 0, 0));
          jLabel6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
          jLabel6.setForeground(new java.awt.Color(255, 255, 255));
          jLabel6.setText("¡Bienvenido!");

          javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
          jPanel3.setLayout(jPanel3Layout);
          jPanel3Layout.setHorizontalGroup(
               jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addContainerGap())
               .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(111, 111, 111)
                    .addComponent(jLabel6)
                    .addContainerGap(124, Short.MAX_VALUE))
          );
          jPanel3Layout.setVerticalGroup(
               jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(18, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel5))
          );

          jLabel3.setBackground(new java.awt.Color(0, 0, 0));
          jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
          jLabel3.setText("Usuario");

          jLabel4.setBackground(new java.awt.Color(0, 0, 0));
          jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
          jLabel4.setText("Contraseña");

          jButton1.setBackground(new java.awt.Color(255, 187, 153));
          jButton1.setText("Iniciar sesión");
          jButton1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
               }
          });

          jPasswordField1.setText("jPasswordField1");

          javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
          jPanel2.setLayout(jPanel2Layout);
          jPanel2Layout.setHorizontalGroup(
               jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                         .addComponent(jLabel4)
                         .addComponent(jLabel3)
                         .addComponent(jTextField1)
                         .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                         .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          );
          jPanel2Layout.setVerticalGroup(
               jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(32, 32, 32)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          );

          jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 450, 450));

          jLabel7.setBackground(new java.awt.Color(0, 0, 0));
          jLabel7.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
          jLabel7.setText("©2022 Desarrolado y diseño by Samuel, Justino y Jesús.");
          jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, -1, -1));

          jLabel8.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
          jLabel8.setText("©OriginCode");
          jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, -1, -1));

          jLabel9.setIcon(new javax.swing.ImageIcon("D:\\lluvia de panes.gif")); // NOI18N
          jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 590, 420));

          jLabel1.setIcon(new javax.swing.ImageIcon("D:\\lluvia de panes.gif")); // NOI18N
          jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 340, 420));

          jLabel10.setIcon(new javax.swing.ImageIcon("D:\\lluvia de panes.gif")); // NOI18N
          jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 420, 590, 200));

          jLabel2.setIcon(new javax.swing.ImageIcon("D:\\lluvia de panes.gif")); // NOI18N
          jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 340, 200));

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         entrar();
     }//GEN-LAST:event_jButton1ActionPerformed


     public static void main(String args[]) {
          
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new Login().setVisible(true);
               }
          });
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton jButton1;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel10;
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
     private javax.swing.JPasswordField jPasswordField1;
     private javax.swing.JTextField jTextField1;
     // End of variables declaration//GEN-END:variables
}


