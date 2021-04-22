
package Aps;
import java.awt.Color;


public class Selecao extends javax.swing.JFrame {

    public Selecao() {
        initComponents();     
        getContentPane().setBackground(new Color(209,224,224));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        cmbxProduto = new javax.swing.JComboBox<>();
        txtPotencia = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
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
        lblAgua = new javax.swing.JLabel();
        lblException = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(500, 300));
        setMinimumSize(new java.awt.Dimension(350, 400));
        setPreferredSize(new java.awt.Dimension(300, 400));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltar.setBackground(new java.awt.Color(209, 224, 224));
        btnVoltar.setForeground(new java.awt.Color(209, 224, 224));
        btnVoltar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Guilherme\\Desktop\\LPOO\\APS\\src\\Aps\\Imagens\\voltar.png")); // NOI18N
        btnVoltar.setBorderPainted(false);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        cmbxProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Televisao", "Geladeira", "Lâmpada" }));
        cmbxProduto.setToolTipText("Selecione um eletrodoméstico");
        cmbxProduto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbxProdutoItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbxProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 96, -1));

        txtPotencia.setToolTipText("Potência em Watts");
        txtPotencia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPotenciaFocusGained(evt);
            }
        });
        txtPotencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPotenciaKeyPressed(evt);
            }
        });
        getContentPane().add(txtPotencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, -1));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 140, -1));

        jLabel1.setText("Selecione um Eletrodoméstico:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        lblPotencia.setText(" Potência");
        getContentPane().add(lblPotencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        txtHorasEletrodomestico.setToolTipText("Tempo em minutos");
        txtHorasEletrodomestico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHorasEletrodomesticoFocusGained(evt);
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
        getContentPane().add(cmbxPolegadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 96, -1));

        lblPolegadas.setText("Selecione as polegadas");
        getContentPane().add(lblPolegadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
        getContentPane().add(lblGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 140, 20));

        cboAgua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Torneira", "Chuveiro", "Máquina de Lavar" }));
        cboAgua.setToolTipText("Selecione um produto");
        cboAgua.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboAguaItemStateChanged(evt);
            }
        });
        getContentPane().add(cboAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 104, -1));

        txtHorasAgua.setToolTipText("Tempo em minutos");
        txtHorasAgua.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHorasAguaFocusGained(evt);
            }
        });
        txtHorasAgua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHorasAguaKeyPressed(evt);
            }
        });
        getContentPane().add(txtHorasAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 120, -1));

        lblHorasAgua.setText("Tempo  ");
        getContentPane().add(lblHorasAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        lblAgua.setText("Selecione um produto:");
        lblAgua.setToolTipText("");
        getContentPane().add(lblAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));
        getContentPane().add(lblException, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 230, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Guilherme\\Desktop\\LPOO\\APS\\src\\Aps\\Imagens\\Info.png")); // NOI18N
        jLabel2.setToolTipText("<html> Esse programa lida com uma média de consumo por hora de  determinado produto para obter um consumo mensal <br> Logo, o resultado obtido do consumo é multiplicado por R$ 0,31, valor esse forcecido pela Enel. <br>\nOs valores podem diferenciar pela marca do produto, data de fabricação, por sua região dentre outras varáveis.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 20, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        Eletrodomestico eletro = new Eletrodomestico();
        Agua agua = new Agua();
        
        if(cmbxProduto.getSelectedIndex() == 2)
        {
            try
            {
                eletro.setPotencia(Double.parseDouble(txtPotencia.getText()));
                eletro.setTempo(Double.parseDouble(txtHorasEletrodomestico.getText()));               
            }catch(NumberFormatException ex)
            {
                lblException.setText("Insira um valor válido");
                lblException.setForeground(new Color(223,0,0));
            }

            lblGastos.setText("R$ " + Double.toString(eletro.calculo_gastos()) + "/mês");
            
        }else if(cmbxProduto.getSelectedIndex() == 1)
        {
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
        try
        {
        eletro.setTempo(Double.parseDouble(txtHorasEletrodomestico.getText()));
        }catch(NumberFormatException ex)
        {
            lblException.setText("Insira um valor válido");
            lblException.setForeground(new Color(223,0,0));
        }
        lblGastos.setText("R$ " + Double.toString(eletro.calculo_gastos()) + "/mês");
        
        }else if(cmbxProduto.getSelectedIndex() == 3)
        {
            try
            {
                eletro.setPotencia(Double.parseDouble(txtPotencia.getText()));
                eletro.setTempo(Double.parseDouble(txtHorasEletrodomestico.getText()));  
            }catch(NumberFormatException ex)
            {
                lblException.setText("Insira um valor válido");
                lblException.setForeground(new Color(223,0,0));               
            }
            lblGastos.setText("R$ " + Double.toString(eletro.calculo_gastos()) + "/mês");
        }
        
        if(cboAgua.getSelectedIndex() == 1)
        {
            try
            {
                agua.setTempo(Double.parseDouble(txtHorasAgua.getText()));
            }catch(NumberFormatException ex)
            {
                lblException.setText("Insira um valor válido");
                lblException.setForeground(new Color(223,0,0));               
            }
            lblGastos.setText("R$ "+Double.toString(agua.gastos()) + "/mês");
            
        }else if(cboAgua.getSelectedIndex() == 2)
        {
            try
            {
            eletro.setTempo(Double.parseDouble(txtHorasAgua.getText()));
            eletro.setPotencia(Double.parseDouble(txtPotencia.getText()));
            
            agua.setTempo(Double.parseDouble(txtHorasAgua.getText()));
            
            }catch(NumberFormatException ex)
            {
                lblException.setText("Insira um valor válido");
                lblException.setForeground(new Color(223,0,0));               
            }
            
            lblGastos.setText("R$ " + Double.toString(eletro.calculo_gastos() + agua.gastos()) + "/mês");
            
        }else if(cboAgua.getSelectedIndex() == 3)
        {
            try
            {
            eletro.setTempo(Double.parseDouble(txtHorasAgua.getText()));
            eletro.setPotencia(Double.parseDouble(txtPotencia.getText()));
            
            agua.setTempo(Double.parseDouble(txtHorasAgua.getText()));
            
            }catch(NumberFormatException ex)
            {
                lblException.setText("Insira um valor válido");
                lblException.setForeground(new Color(223,0,0));               
            }
            
            lblGastos.setText("R$ " + Double.toString(eletro.calculo_gastos() + agua.gastos()) + "/mês");            
        }
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void cmbxProdutoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbxProdutoItemStateChanged
        if(cmbxProduto.getSelectedIndex() != 0)
        {
            btnCalcular.setVisible(true);
        }else
        {
            btnCalcular.setVisible(false);
        }
        
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
            
            cboAgua.setVisible(false);
            lblAgua.setVisible(false);
            
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
            
            cboAgua.setVisible(false);
            lblAgua.setVisible(false);
            
            txtHorasEletrodomestico.setText("Tempo em minutos");
            txtHorasEletrodomestico.setForeground(new Color(102,102,102));
            
            txtPotencia.setText("Potência em Watts");
            txtPotencia.setForeground(new Color(102,102,102));
            
        }else if(cmbxProduto.getSelectedIndex() == 3)
        {
            txtPotencia.setVisible(true);            
            lblPotencia.setVisible(true);
            
            cmbxPolegadas.setVisible(false);
            lblPolegadas.setVisible(false);
            
            lblHorasEletrodomestico.setVisible(true);
            txtHorasEletrodomestico.setVisible(true);
            
            lblHorasAgua.setVisible(false);
            txtHorasAgua.setVisible(false);
            
            cboAgua.setVisible(false);
            lblAgua.setVisible(false);
            
            txtHorasEletrodomestico.setText("Tempo em minutos");
            txtHorasEletrodomestico.setForeground(new Color(102,102,102));
            
            txtPotencia.setText("Potência em Watts");
            txtPotencia.setForeground(new Color(102,102,102));

        }else if(cmbxProduto.getSelectedIndex() == 0)
        {
            lblPolegadas.setVisible(false);
            cmbxPolegadas.setVisible(false);
            
            txtPotencia.setVisible(false);
            lblPotencia.setVisible(false);
            
            lblHorasEletrodomestico.setVisible(false);
            txtHorasEletrodomestico.setVisible(false);
            
            cboAgua.setVisible(true);
            lblAgua.setVisible(true);
            
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
        
        btnCalcular.setVisible(false);
        
        txtHorasAgua.setText("Tempo em minutos");
        txtHorasAgua.setForeground(new Color(102,102,102));
        
    }//GEN-LAST:event_formWindowActivated

    private void txtPotenciaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPotenciaFocusGained
        if(txtPotencia.getText().equals("Potência em Watts"))
        {
            txtPotencia.setCaretPosition(0);
            txtPotencia.setCaretColor(Color.BLACK);
        }
    }//GEN-LAST:event_txtPotenciaFocusGained

    private void txtHorasEletrodomesticoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHorasEletrodomesticoFocusGained
        if(txtHorasEletrodomestico.getText().equals("Tempo em minutos"))
        {
            txtHorasEletrodomestico.setCaretPosition(0);
            txtHorasEletrodomestico.setCaretColor(Color.BLACK);
        }
    }//GEN-LAST:event_txtHorasEletrodomesticoFocusGained

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

    private void txtHorasAguaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHorasAguaKeyPressed
        if(txtHorasAgua.getText().equals("Tempo em minutos"))
        {
            txtHorasAgua.setText("");
            txtHorasAgua.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtHorasAguaKeyPressed

    private void txtPotenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPotenciaKeyPressed
        if(txtPotencia.getText().equals("Potência em Watts"))
        {
            txtPotencia.setText("");
            txtPotencia.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtPotenciaKeyPressed

    private void cboAguaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboAguaItemStateChanged
        if(cboAgua.getSelectedIndex() != 0)
        {
            btnCalcular.setVisible(true);
        }else
        {
            btnCalcular.setVisible(false);
        }

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
            
        }else if(cboAgua.getSelectedIndex() == 2)
        {
            txtPotencia.setVisible(true);
            lblPotencia.setVisible(true);
            
            cmbxPolegadas.setVisible(false);
            lblPolegadas.setVisible(false);
            
            txtHorasAgua.setVisible(true);
            lblHorasAgua.setVisible(true);
            
            txtHorasAgua.setText("Tempo em minutos");
            txtHorasAgua.setForeground(new Color(102,102,102));
            
            txtPotencia.setText("Potência em Watts");
            txtPotencia.setForeground(new Color(102,102,102));
            
        }else if(cboAgua.getSelectedIndex() == 3)
        {
            txtPotencia.setVisible(true);
            lblPotencia.setVisible(true);
            
            cmbxPolegadas.setVisible(false);
            lblPolegadas.setVisible(false);
            
            txtHorasAgua.setVisible(true);
            lblHorasAgua.setVisible(true);
            
            txtHorasAgua.setText("Tempo em minutos");
            txtHorasAgua.setForeground(new Color(102,102,102));
            
            txtPotencia.setText("Potência em Watts");
            txtPotencia.setForeground(new Color(102,102,102));   
            
        }else
        {
            txtPotencia.setVisible(false);
            lblPotencia.setVisible(false);
            
            cmbxPolegadas.setVisible(false);
            lblPolegadas.setVisible(false);
            
            txtHorasAgua.setVisible(false);
            lblHorasAgua.setVisible(false);
        }
    }//GEN-LAST:event_cboAguaItemStateChanged

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cboAgua;
    private javax.swing.JComboBox<String> cmbxPolegadas;
    private javax.swing.JComboBox<String> cmbxProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAgua;
    private javax.swing.JLabel lblException;
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
