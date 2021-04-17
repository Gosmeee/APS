/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aps;
import java.awt.Color;
/**
 *
 * @author Guilherme
 */
public class Selecao extends javax.swing.JFrame {
    /** Creates new form Selecao */
    public Selecao() {
        initComponents();      
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        cmbxProduto = new javax.swing.JComboBox<>();
        txtPotencia = new javax.swing.JTextField();
        btnProximo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblPotencia = new javax.swing.JLabel();
        txtHorasEletrodomestico = new javax.swing.JTextField();
        lblHorasEletrodomestico = new javax.swing.JLabel();
        cmbxPolegadas = new javax.swing.JComboBox<>();
        lblPolegadas = new javax.swing.JLabel();
        lblGastos = new javax.swing.JLabel();
        cboAgua = new javax.swing.JComboBox<>();
        txtHorasAgua = new javax.swing.JTextField();
        lblHorasAgua = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(300, 400));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        cmbxProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Televisao", "Geladeira", "Lâmpada" }));
        cmbxProduto.setToolTipText("Selecione um eletrodoméstico");
        cmbxProduto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbxProdutoItemStateChanged(evt);
            }
        });
        cmbxProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbxProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 96, -1));

        txtPotencia.setToolTipText("Potência em Watts");
        txtPotencia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPotenciaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPotenciaFocusLost(evt);
            }
        });
        txtPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPotenciaActionPerformed(evt);
            }
        });
        txtPotencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPotenciaKeyPressed(evt);
            }
        });
        getContentPane().add(txtPotencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, -1));

        btnProximo.setText("Calcular");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });
        getContentPane().add(btnProximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 140, -1));

        jLabel1.setText("Selecione um Eletrodoméstico:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        lblPotencia.setText(" Potência");
        getContentPane().add(lblPotencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        txtHorasEletrodomestico.setToolTipText("Tempo em minutos");
        txtHorasEletrodomestico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHorasEletrodomesticoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHorasEletrodomesticoFocusLost(evt);
            }
        });
        txtHorasEletrodomestico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorasEletrodomesticoActionPerformed(evt);
            }
        });
        txtHorasEletrodomestico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHorasEletrodomesticoKeyPressed(evt);
            }
        });
        getContentPane().add(txtHorasEletrodomestico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, -1));

        lblHorasEletrodomestico.setText("Tempo");
        getContentPane().add(lblHorasEletrodomestico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        cmbxPolegadas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "32", "40", "50", "55", "65", "75", " " }));
        cmbxPolegadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxPolegadasActionPerformed(evt);
            }
        });
        getContentPane().add(cmbxPolegadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 96, -1));

        lblPolegadas.setText("Selecione as polegadas");
        getContentPane().add(lblPolegadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
        getContentPane().add(lblGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 80, 20));

        cboAgua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Torneira", "Vaso Sanitário", "Chuveiro", "Máquina de Lavar" }));
        cboAgua.setToolTipText("Selecione um produto");
        cboAgua.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboAguaItemStateChanged(evt);
            }
        });
        cboAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAguaActionPerformed(evt);
            }
        });
        getContentPane().add(cboAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 104, -1));

        txtHorasAgua.setToolTipText("Tempo em minutos");
        txtHorasAgua.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHorasAguaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHorasAguaFocusLost(evt);
            }
        });
        txtHorasAgua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHorasAguaKeyPressed(evt);
            }
        });
        getContentPane().add(txtHorasAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 120, -1));

        lblHorasAgua.setText("Tempo  ");
        getContentPane().add(lblHorasAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        Eletrodomestico eletro = new Eletrodomestico();
        Agua agua = new Agua();
        if(cmbxProduto.getSelectedIndex() == 2)
        {
            eletro.setPotencia(Double.parseDouble(txtPotencia.getText()));
            eletro.setTempo(Double.parseDouble(txtHorasEletrodomestico.getText()));
            lblGastos.setText(Double.toString(eletro.calculo_gastos()));
        }
        else if(cmbxProduto.getSelectedIndex() == 1){
        if(cmbxPolegadas.getSelectedIndex() == 1)
        {
            eletro.setPotencia(60);
            
        }else if(cmbxPolegadas.getSelectedIndex() == 2)
        {
            eletro.setPotencia(75);
            
        }else if(cmbxPolegadas.getSelectedIndex() == 3)
        {
            eletro.setPotencia(110);
            
        }else if(cmbxPolegadas.getSelectedIndex() == 4)
        {
            eletro.setPotencia(150);
            
        }else if(cmbxPolegadas.getSelectedIndex() == 5)
        {
            eletro.setPotencia(195);
            
        }else if(cmbxPolegadas.getSelectedIndex() == 5)
        {
            eletro.setPotencia(245);
        }
        eletro.setTempo(Double.parseDouble(txtHorasEletrodomestico.getText()));
        lblGastos.setText("R$ " + Double.toString(eletro.calculo_gastos()));
        }else if(cmbxProduto.getSelectedIndex() == 3)
        {
            agua.setTempo(Double.parseDouble(txtHorasEletrodomestico.getText()));            
            lblGastos.setText("R$ " + Double.toString(agua.gastos()));
        }
                     
    }//GEN-LAST:event_btnProximoActionPerformed

    private void cmbxProdutoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbxProdutoItemStateChanged
        if(cmbxProduto.getSelectedIndex() == 1)
        {
            lblPolegadas.setVisible(true);            
            cmbxPolegadas.setVisible(true);
            
            lblPotencia.setVisible(false);
            txtPotencia.setVisible(false);
            
            lblHorasEletrodomestico.setVisible(true);
            txtHorasEletrodomestico.setVisible(true);
            
            lblHorasAgua.setVisible(false);
            txtHorasAgua.setVisible(false);
            
            txtHorasEletrodomestico.setText("Tempo em minutos");
            txtHorasEletrodomestico.setForeground(new Color(102,102,102));
        }else if(cmbxProduto.getSelectedIndex() == 2)
        {        
            txtPotencia.setVisible(true);            
            lblPotencia.setVisible(true);
            
            cmbxPolegadas.setVisible(false);
            lblPolegadas.setVisible(false);
            
            lblHorasEletrodomestico.setVisible(true);
            txtHorasEletrodomestico.setVisible(true);
            
            lblHorasAgua.setVisible(false);
            txtHorasAgua.setVisible(false);
            
            txtHorasEletrodomestico.setText("Tempo em minutos");
            txtHorasEletrodomestico.setForeground(new Color(102,102,102));
            
            txtPotencia.setText("Potência em Watts");
            txtPotencia.setForeground(new Color(102,102,102));
            
        }else if(cmbxProduto.getSelectedIndex() == 3)
        {
            
        }else if(cmbxProduto.getSelectedIndex() == 0)
        {
            lblPolegadas.setVisible(false);
            cmbxPolegadas.setVisible(false);
            
            txtPotencia.setVisible(false);
            lblPotencia.setVisible(false);
            
            lblHorasEletrodomestico.setVisible(false);
            txtHorasEletrodomestico.setVisible(false);
            
            lblHorasAgua.setVisible(false);
            txtHorasAgua.setVisible(false);
        }
        
    }//GEN-LAST:event_cmbxProdutoItemStateChanged

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        txtPotencia.setVisible(false);
        cmbxPolegadas.setVisible(false);
        
        lblPolegadas.setVisible(false);
        lblPotencia.setVisible(false);
        
        lblHorasEletrodomestico.setVisible(false);
        txtHorasEletrodomestico.setVisible(false);
        
        lblHorasAgua.setVisible(false);
        txtHorasAgua.setVisible(false);        
        
        txtHorasAgua.setText("Tempo em minutos");
        txtHorasAgua.setForeground(new Color(102,102,102));
        
    }//GEN-LAST:event_formWindowActivated

    private void cmbxProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbxProdutoActionPerformed

    private void txtPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPotenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPotenciaActionPerformed

    private void txtPotenciaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPotenciaFocusGained
        if(txtPotencia.getText().equals("Potência em Watts"))
        {
            txtPotencia.setCaretPosition(0);
            txtPotencia.setCaretColor(Color.BLACK);
        }
    }//GEN-LAST:event_txtPotenciaFocusGained

    private void cboAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAguaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboAguaActionPerformed

    private void cmbxPolegadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxPolegadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbxPolegadasActionPerformed

    private void txtHorasEletrodomesticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorasEletrodomesticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorasEletrodomesticoActionPerformed

    private void txtHorasEletrodomesticoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHorasEletrodomesticoFocusGained
        if(txtHorasEletrodomestico.getText().equals("Tempo em minutos"))
        {
            txtHorasEletrodomestico.setCaretPosition(0);
            txtHorasEletrodomestico.setCaretColor(Color.BLACK);
        }
    }//GEN-LAST:event_txtHorasEletrodomesticoFocusGained

    private void txtHorasEletrodomesticoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHorasEletrodomesticoFocusLost

    }//GEN-LAST:event_txtHorasEletrodomesticoFocusLost

    private void txtHorasEletrodomesticoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHorasEletrodomesticoKeyPressed
        if(txtHorasEletrodomestico.getText().equals("Tempo em minutos"))
        {
            txtHorasEletrodomestico.setText("");
            txtHorasEletrodomestico.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtHorasEletrodomesticoKeyPressed

    private void txtHorasAguaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHorasAguaFocusGained
        if(txtHorasAgua.getText().equals("Tempo em minutos"))
        {
            txtHorasAgua.setCaretPosition(0);
            txtHorasAgua.setCaretColor(Color.BLACK);
        }
    }//GEN-LAST:event_txtHorasAguaFocusGained

    private void txtHorasAguaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHorasAguaFocusLost

    }//GEN-LAST:event_txtHorasAguaFocusLost

    private void txtHorasAguaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHorasAguaKeyPressed
        if(txtHorasAgua.getText().equals("Tempo em minutos"))
        {
            txtHorasAgua.setText("");
            txtHorasAgua.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtHorasAguaKeyPressed

    private void txtPotenciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPotenciaFocusLost

    }//GEN-LAST:event_txtPotenciaFocusLost

    private void txtPotenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPotenciaKeyPressed
        if(txtPotencia.getText().equals("Potência em Watts"))
        {
            txtPotencia.setText("");
            txtPotencia.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtPotenciaKeyPressed

    private void cboAguaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboAguaItemStateChanged
        if(cboAgua.getSelectedIndex() == 1)
        {
            txtPotencia.setVisible(false);
            lblPotencia.setVisible(false);
            
            cmbxPolegadas.setVisible(false);
            lblPolegadas.setVisible(false);
            
            txtHorasEletrodomestico.setVisible(false);
            lblHorasEletrodomestico.setVisible(false);
            
            txtHorasAgua.setVisible(true);
            lblHorasAgua.setVisible(true);
            
            txtHorasAgua.setText("Tempo em minutos");
            txtHorasAgua.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_cboAguaItemStateChanged

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Selecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selecao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProximo;
    private javax.swing.JComboBox<String> cboAgua;
    private javax.swing.JComboBox<String> cmbxPolegadas;
    private javax.swing.JComboBox<String> cmbxProduto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblGastos;
    private javax.swing.JLabel lblHorasAgua;
    private javax.swing.JLabel lblHorasEletrodomestico;
    private javax.swing.JLabel lblPolegadas;
    private javax.swing.JLabel lblPotencia;
    private javax.swing.JTextField txtHorasAgua;
    private javax.swing.JTextField txtHorasEletrodomestico;
    private javax.swing.JTextField txtPotencia;
    // End of variables declaration//GEN-END:variables

}
