
package Interfaz;
import static Interfaz.MiniAbastos.produc;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;


public class Listar_Clientes_General extends javax.swing.JPanel {

   
    public Listar_Clientes_General() {
        initComponents();
        addRowToJTable();
    }
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Público en general");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido Paterno", "No.Contacto"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 680, 300));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordenar Por:", "ID", "Nombre", "Apellido Paterno", "No.Contacto" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBox1MousePressed(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));
        jComboBox1.getAccessibleContext().setAccessibleName("");
        jComboBox1.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MousePressed
       
    }//GEN-LAST:event_jComboBox1MousePressed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
         Collections.sort(produc, new Comparator<Producto>() {
	@Override
	public int compare(Producto p1, Producto p2) {
		return new Integer(p1.getID()).compareTo(new Integer(p2.getID()));
	}
        });
        int answer = (int) jComboBox1.getSelectedIndex();
        if (answer==0){
            System.out.println("No es una opcion");
        }
        
         if (answer==1){
        Collections.sort(produc, new Comparator<Producto>() {
	@Override
	public int compare(Producto p1, Producto p2) {
		return new Integer(p1.getID()).compareTo(new Integer(p2.getID()));
	}
        });
       
        }
        
         if (answer==2){
            
        Collections.sort(produc, new Comparator<Producto>() {
	@Override
	public int compare(Producto p1, Producto p2) {
		return new Float(p1.getPrecio()).compareTo(new Float(p2.getPrecio()));
	}
        });
        
        }
        if (answer==3){
        Collections.sort(produc, new Comparator<Producto>() {
	@Override
	public int compare(Producto p1, Producto p2) {
		return new String(p1.getTipo()).compareTo(new String(p2.getTipo()));
	}
        });
        
        }
         if (answer==4){
        Collections.sort(produc, new Comparator<Producto>() {
	@Override
	public int compare(Producto p1, Producto p2) {
		return new Float(p1.getNombre()).compareTo(new Float(p2.getNombre()));
	}
        });
       
        }
         eliminar();
         addRowToJTable();
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
