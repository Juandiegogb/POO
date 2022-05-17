/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;

/**
 *
 * @author juand
 */
public class splash extends javax.swing.JFrame {

    /**
     * Creates new form splash
     */
    public splash() {
        initComponents();
        this.setLocationRelativeTo(this);


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panel_bienvenida = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_aliado = new javax.swing.JPanel();
        label_aliado = new javax.swing.JLabel();
        panel_cliente = new javax.swing.JPanel();
        label_cliente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_bienvenida.setBackground(new java.awt.Color(0, 153, 153));
        panel_bienvenida.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HOLA, BIENVENIDO A");
        panel_bienvenida.add(jLabel1, new java.awt.GridBagConstraints());

        jPanel1.add(panel_bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 100));

        panel_aliado.setBackground(new java.awt.Color(0, 153, 153));
        panel_aliado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_aliado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_aliadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_aliadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_aliadoMouseExited(evt);
            }
        });
        panel_aliado.setLayout(new java.awt.GridBagLayout());

        label_aliado.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        label_aliado.setForeground(new java.awt.Color(255, 255, 255));
        label_aliado.setText("ALIADO");
        panel_aliado.add(label_aliado, new java.awt.GridBagConstraints());

        jPanel1.add(panel_aliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 120, 40));

        panel_cliente.setBackground(new java.awt.Color(0, 153, 153));
        panel_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_clienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_clienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_clienteMouseExited(evt);
            }
        });
        panel_cliente.setLayout(new java.awt.GridBagLayout());

        label_cliente.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        label_cliente.setForeground(new java.awt.Color(255, 255, 255));
        label_cliente.setText("CLIENTE");
        panel_cliente.add(label_cliente, new java.awt.GridBagConstraints());

        jPanel1.add(panel_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 120, 40));

        jLabel3.setFont(new java.awt.Font("JackInput", 1, 50)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Merc");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 140, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
       
    }//GEN-LAST:event_jPanel1MouseClicked

    private void panel_aliadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_aliadoMouseEntered
        panel_aliado.setBackground(new Color(3, 183, 183));

    }//GEN-LAST:event_panel_aliadoMouseEntered

    private void panel_clienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_clienteMouseEntered
        panel_cliente.setBackground(new Color(3, 183, 183));
    }//GEN-LAST:event_panel_clienteMouseEntered

    private void panel_clienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_clienteMouseExited
        panel_cliente.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_panel_clienteMouseExited

    private void panel_aliadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_aliadoMouseExited
        panel_aliado.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_panel_aliadoMouseExited

    private void panel_aliadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_aliadoMouseClicked
        login Login = new login();
        Login.setLocation(700, 350);
        Login.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_panel_aliadoMouseClicked

    private void panel_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_clienteMouseClicked
        login Login = new login();
        Login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_panel_clienteMouseClicked

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
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_aliado;
    private javax.swing.JLabel label_cliente;
    private javax.swing.JPanel panel_aliado;
    private javax.swing.JPanel panel_bienvenida;
    private javax.swing.JPanel panel_cliente;
    // End of variables declaration//GEN-END:variables
}
