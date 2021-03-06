/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelos.Estudiante;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author romar
 */
public class JDListadoAlumnos extends javax.swing.JDialog {
    DefaultTableModel Modelo = new DefaultTableModel();
    /**
     * Creates new form JDListadoAlumnos
     */
    public JDListadoAlumnos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Modelo.addColumn("Carnet");
        Modelo.addColumn("Nombres");
        Modelo.addColumn("Apellidos");
        Modelo.addColumn("Teléfono");
        Modelo.addColumn("Dirección");
        Modelo.addColumn("Correo electrónico");
       tablita.setModel(Modelo);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtBusqueda = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablita = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        txtApe = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDirec = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Eliminar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(550, 550));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setText("Listado de alumnos");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 150, 30));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Listado de alumnos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 20, 250, 21));

        btnBuscar1.setLabel("Buscar alumno");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 160, 30));

        jLabel2.setText("No. Carnet del alumno");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, 200));

        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyTyped(evt);
            }
        });
        jPanel1.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 50, 20));

        jButton2.setText("Limpiar listado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 150, 30));

        tablita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null", "null"
            }
        ));
        tablita.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tablita);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 490, 220));

        jTabbedPane1.addTab("Alumnos", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 112, 38));

        txtApe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApeActionPerformed(evt);
            }
        });
        txtApe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApeKeyTyped(evt);
            }
        });
        jPanel3.add(txtApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 185, -1));

        jLabel5.setText("Teléfono:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelKeyTyped(evt);
            }
        });
        jPanel3.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 185, -1));

        jLabel3.setText("Carnet:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        txtId.setEnabled(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel3.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 185, -1));

        jLabel4.setText("Nombres:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        txtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomKeyTyped(evt);
            }
        });
        jPanel3.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 185, -1));

        jLabel6.setText("Apellidos:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setText("Modificación de datos del alumno");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, 21));
        jPanel3.add(txtDirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 185, -1));

        jLabel8.setText("Dirección:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));
        jPanel3.add(txtCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 185, -1));

        jLabel9.setText("Correo electrónico:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        jTabbedPane1.addTab("Modificar", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        Estudiante NC = new Estudiante();
        NC.ListarAlumno(Modelo);
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        // TODO add your handling code here:
        
        if ((txtBusqueda.getText().equals(""))){
            
            javax.swing.JOptionPane.showMessageDialog(this,"No ingresó número de carnet. \n","AVISO",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txtBusqueda.requestFocus();
            
        }
        else{
        
            Estudiante NC = new Estudiante();
            NC.LimpiarLista(Modelo);
            NC.BuscarAlumno(txtBusqueda.getText(),Modelo);
            txtBusqueda.setText("");
            
        }
        
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void txtApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApeActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int fila=tablita.getSelectedRow();
        if(fila>=0){
            txtId.setText(tablita.getValueAt(fila,0).toString());
            txtNom.setText(tablita.getValueAt(fila,1).toString());
            txtApe.setText(tablita.getValueAt(fila,2).toString());
            txtTel.setText(tablita.getValueAt(fila,3).toString());
            txtDirec.setText(tablita.getValueAt(fila,4).toString());
            txtCor.setText(tablita.getValueAt(fila,5).toString());
         
        }else{
            JOptionPane.showMessageDialog(null,"No seleccionó la fila");
        }
        
        
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if ((txtId.getText().equals("")) || (txtNom.getText().equals("")) || (txtApe.getText().equals("")) || 
           (txtDirec.getText().equals("")) || (txtTel.getText().equals("")) || (txtCor.getText().equals(""))){
            
            javax.swing.JOptionPane.showMessageDialog(this,"Llene todos los campos, por favor. \n","AVISO",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txtNom.requestFocus();
        }
        else{
        
            Estudiante NE = new Estudiante();
            JOptionPane.showMessageDialog(null, NE.ModificarEstudiante(Integer.parseInt(txtId.getText()), txtNom.getText(), txtApe.getText(), txtTel.getText(), txtDirec.getText(), txtCor.getText()));
            txtId.setText("");
            txtNom.setText("");
            txtApe.setText("");
            txtTel.setText("");
            txtDirec.setText("");
            txtCor.setText("");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Estudiante NC = new Estudiante();
        NC.LimpiarLista(Modelo);
        txtBusqueda.setText("");
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:    
        Estudiante NE = new Estudiante();
        DefaultTableModel Modelo =(DefaultTableModel)tablita.getModel();// obtener el modelo de la tabla
        String idC=(Modelo.getValueAt(tablita.getSelectedRow(),0)+"");
        JOptionPane.showMessageDialog(null, NE.EliminarEstudiante(Integer.parseInt(idC)));
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'á' || c>'ú') && (c<'A' || c>'Z' ) && (c<'Á' || c>'Ú') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txtNomKeyTyped

    private void txtApeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'á' || c>'ú') && (c<'A' || c>'Z' ) && (c<'Á' || c>'Ú') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txtApeKeyTyped

    private void txtTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtTelKeyTyped

    private void txtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtBusquedaKeyTyped

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
            java.util.logging.Logger.getLogger(JDListadoAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDListadoAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDListadoAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDListadoAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDListadoAlumnos dialog = new JDListadoAlumnos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTable tablita;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtDirec;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
