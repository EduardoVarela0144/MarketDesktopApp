
package Interfaz;


import static Interfaz.MiniAbastos.produc;
import static Interfaz.MiniAbastos.produc;
import java.awt.Color;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;


public class Agregar_Producto extends javax.swing.JPanel {

    
    public Agregar_Producto() {
        
        MiniAbastos.deserializarObjetos();
        initComponents();
        addRowToJTable();
    }

  
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Text1 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Text2 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Text3 = new javax.swing.JLabel();
        Tipo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        Text4 = new javax.swing.JLabel();
        Precio = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Agregar Producto");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Text1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text1.setText("ID");
        add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        ID.setForeground(new java.awt.Color(204, 204, 204));
        ID.setText("Ingresa el ID");
        ID.setBorder(null);
        ID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IDMousePressed(evt);
            }
        });
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 360, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 360, 10));

        Text2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text2.setText("Nombre");
        add(Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        Nombre.setForeground(new java.awt.Color(204, 204, 204));
        Nombre.setText("Ingresa el nombre");
        Nombre.setBorder(null);
        Nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NombreMousePressed(evt);
            }
        });
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 360, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 360, 10));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Tipo");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        Tipo.setForeground(new java.awt.Color(204, 204, 204));
        Tipo.setText("Ingresa el tipo");
        Tipo.setBorder(null);
        Tipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TipoMousePressed(evt);
            }
        });
        Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoActionPerformed(evt);
            }
        });
        add(Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 360, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 360, 10));

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Precio");
        add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        Precio.setForeground(new java.awt.Color(204, 204, 204));
        Precio.setText("Ingresa el precio");
        Precio.setBorder(null);
        Precio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PrecioMousePressed(evt);
            }
        });
        add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 360, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 360, 10));

        jPanel1.setBackground(new java.awt.Color(47, 45, 46));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 80, 30));

        jPanel2.setBackground(new java.awt.Color(47, 45, 46));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Eliminar");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel2);

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 80, 30));

        jPanel3.setBackground(new java.awt.Color(47, 45, 46));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Modificar");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel3);

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 80, 30));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(402, 402));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Tipo", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 310, 270));

        jPanel4.setBackground(new java.awt.Color(47, 45, 46));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Exportar");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel4);

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 70, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void IDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDMousePressed

           if (ID.getText().equals("Ingresa el ID")) {
            ID.setText("");
            ID.setForeground(Color.black);}
            
            if (Nombre.getText().isEmpty()) {
            Nombre.setText("Ingresa el nombre");
            Nombre.setForeground(Color.gray);
        }
               if (Tipo.getText().isEmpty()) {
            Tipo.setText("Ingresa el tipo");
            Tipo.setForeground(Color.gray);
        }
                  if (Precio.getText().isEmpty()) {
            Precio.setText("Ingresa el precio");
            Precio.setForeground(Color.gray);
        }
 
    }//GEN-LAST:event_IDMousePressed

    private void NombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreMousePressed
        if (ID.getText().isEmpty()) {
            ID.setText("Ingresa el ID");
            ID.setForeground(Color.gray);}
            
            if (Nombre.getText().equals("Ingresa el nombre")) {
            Nombre.setText("");
            Nombre.setForeground(Color.black);
        }
               if (Tipo.getText().isEmpty()) {
            Tipo.setText("Ingresa el tipo");
            Tipo.setForeground(Color.gray);
        }
                  if (Precio.getText().isEmpty()) {
            Precio.setText("Ingresa el precio");
            Precio.setForeground(Color.gray);
        }
    }//GEN-LAST:event_NombreMousePressed

    private void TipoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TipoMousePressed
          if (ID.getText().isEmpty()) {
            ID.setText("Ingresa el ID");
            ID.setForeground(Color.gray);}
            
            if (Nombre.getText().isEmpty()) {
            Nombre.setText("Ingresa el nombre");
            Nombre.setForeground(Color.gray);
        }
               if (Tipo.getText().equals("Ingresa el tipo")) {
            Tipo.setText("");
            Tipo.setForeground(Color.black);
        }
                  if (Precio.getText().isEmpty()) {
            Precio.setText("Ingresa el precio");
            Precio.setForeground(Color.gray);
        }
    }//GEN-LAST:event_TipoMousePressed

    private void PrecioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrecioMousePressed
       if (ID.getText().isEmpty()) {
            ID.setText("Ingresa el ID");
            ID.setForeground(Color.gray);}
            
            if (Nombre.getText().isEmpty()) {
            Nombre.setText("Ingresa el nombre");
            Nombre.setForeground(Color.gray);
        }
               if (Tipo.getText().isEmpty()) {
            Tipo.setText("Ingresa el tipo");
            Tipo.setForeground(Color.gray);
        }
                  if (Precio.getText().equals("Ingresa el precio")) {
            Precio.setText("");
            Precio.setForeground(Color.black);
        }
    }//GEN-LAST:event_PrecioMousePressed

    public void addRowToJTable(){
DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
Object rowData[] = new Object [4];
for(int i = 0;i<produc.size();i++){
rowData[0]=produc.get(i).ID;
rowData[1]=produc.get(i).Nombre;
rowData[2]=produc.get(i).Tipo;
rowData[3]=produc.get(i).Precio;
model.addRow(rowData);
} 

 


}
 public void eliminar(){
        DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
        int a = jTable1.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }
        
    }
    
    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        int id = Integer.decode(ID.getText());
        String n = Nombre.getText();
        String t = Tipo.getText();
        float p = Float.valueOf(Precio.getText());
        Producto pr = new Producto(id,n,t,p);
        pr.CalcularIva();
        produc.add(pr);
        
        MiniAbastos.serializarObjetos();
        eliminar();
        addRowToJTable();
        
        
            ID.setText("Ingresa el ID");
            ID.setForeground(Color.gray);
            
           
            Nombre.setText("Ingresa el nombre");
            Nombre.setForeground(Color.gray);
        
            Tipo.setText("Ingresa el tipo");
            Tipo.setForeground(Color.gray);
                  
            Precio.setText("Ingresa el precio");
            Precio.setForeground(Color.gray);
        
    }//GEN-LAST:event_jPanel1MouseClicked
//Quitar esto
    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
       jPanel1.setBackground(new Color(41, 112, 202));
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
                jPanel1.setBackground(new Color(47,45,46));

    }//GEN-LAST:event_jPanel1MouseExited

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        
    
      
        if(jTable1.getSelectedRow()!=-1){
       JOptionPane.showMessageDialog(null,"Fila seleccionada");
     
       
      produc.remove(jTable1.getSelectedRow());
       
      for(int i = 0;i<produc.size();i++){
           Producto pr = new Producto(i+1,produc.get(i).Nombre,produc.get(i).Tipo,produc.get(i).Precio);
        produc.set(i,pr);
        

} 
      MiniAbastos.serializarObjetos();
      
        }
        if(jTable1.getSelectedRow()==-1){
        JOptionPane.showMessageDialog(null,"Ninguna fila seleccionada");
        }
        
           eliminar();
        addRowToJTable();
        
        
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
         jPanel2.setBackground(new Color(41, 112, 202));
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
           jPanel2.setBackground(new Color(47,45,46));
    }//GEN-LAST:event_jPanel2MouseExited

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        int id = Integer.decode(ID.getText());
        String n = Nombre.getText();
        String t = Tipo.getText();
        float p = Float.valueOf(Precio.getText());
        Producto pr = new Producto(id,n,t,p);
        
        produc.set(jTable1.getSelectedRow(), pr);
        MiniAbastos.serializarObjetos();
        eliminar();
        addRowToJTable();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        jPanel3.setBackground(new Color(41, 112, 202));
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        // TODO add your handling code here:
           jPanel3.setBackground(new Color(47,45,46));
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        Export_P jdep = new Export_P(null, true);
        jdep.setVisible(true);       
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
       jPanel4.setBackground(new Color(41, 112, 202));
      
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        jPanel4.setBackground(new Color(47,45,46));
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MouseExited

    
    
    
    
     
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Precio;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JTextField Tipo;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

   
    
}
