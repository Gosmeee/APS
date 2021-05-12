
package Aps;
import java.awt.Color;
import java.math.*; 


public class Selecao extends javax.swing.JFrame {

    public Selecao() {
        initComponents();     
        
        //Definindo cor de fundo da janela
        getContentPane().setBackground(new Color(209,224,224));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        cmbxProduto = new javax.swing.JComboBox<>();
        txtPotencia = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        lblEletro = new javax.swing.JLabel();
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
        jLabel2 = new javax.swing.JLabel();
        lblException = new javax.swing.JLabel();
        lblException1 = new javax.swing.JLabel();
        lblException2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(500, 300));
        setMinimumSize(new java.awt.Dimension(370, 550));
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
        btnVoltar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Guilherme\\Desktop\\LPOO\\Aps_Original\\src\\Aps\\Imagens\\voltar.png")); // NOI18N
        btnVoltar.setBorderPainted(false);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        cmbxProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Televisao", "Geladeira", "Lâmpada" }));
        cmbxProduto.setToolTipText("Selecione um eletrodoméstico");
        cmbxProduto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbxProdutoItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbxProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 96, -1));

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
        getContentPane().add(txtPotencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 120, -1));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 140, -1));

        lblEletro.setText("Selecione um Eletrodoméstico:");
        getContentPane().add(lblEletro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        lblPotencia.setText(" Potência");
        getContentPane().add(lblPotencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        txtHorasEletrodomestico.setToolTipText("Tempo em horas\n");
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
        getContentPane().add(txtHorasEletrodomestico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 120, -1));

        lblHorasEletrodomestico.setText("Tempo");
        getContentPane().add(lblHorasEletrodomestico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        cmbxPolegadas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "32", "40", "50", "55", "65", "75", " " }));
        getContentPane().add(cmbxPolegadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 96, -1));

        lblPolegadas.setText("Selecione as polegadas");
        getContentPane().add(lblPolegadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));
        getContentPane().add(lblGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 140, 20));

        cboAgua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Torneira", "Chuveiro", "Máquina de Lavar" }));
        cboAgua.setToolTipText("Selecione um produto");
        cboAgua.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboAguaItemStateChanged(evt);
            }
        });
        getContentPane().add(cboAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 104, -1));

        txtHorasAgua.setToolTipText("Tempo em horas");
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
        getContentPane().add(txtHorasAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 120, -1));

        lblHorasAgua.setText("Tempo  ");
        getContentPane().add(lblHorasAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        lblAgua.setText("Selecione um produto:");
        lblAgua.setToolTipText("");
        getContentPane().add(lblAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Guilherme\\Desktop\\LPOO\\Aps_Original\\src\\Aps\\Imagens\\Info.png")); // NOI18N
        jLabel2.setToolTipText("<html> Esse programa lida com uma média de consumo por hora de  determinado produto para obter um consumo mensal <br> Logo, o resultado obtido do consumo é multiplicado por R$ 0,31, valor esse forcecido pela Enel. <br>\nOs valores podem diferenciar pela marca do produto, data de fabricação, por sua região dentre outras varáveis.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 20, 20));
        getContentPane().add(lblException, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 230, 30));
        getContentPane().add(lblException1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 230, 30));
        getContentPane().add(lblException2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 230, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Evento de Click com o mouse no botão Voltar
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        
        //Fechando janela atual e abrindo a anterior(Inicio.form)
        dispose();
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    //Evento de Click com o mouse no botão Calcular
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        lblException.setText("");
        lblException1.setText("");
        lblException2.setText("");
        
        //Instanciando os objetos das classes Eletrodomestico e Agua
        Eletrodomestico eletro = new Eletrodomestico();
        Agua agua = new Agua();
        
        //Caso o indice selecionado na Combobox Produto seja igual 2 exucutará o bloco abaixo
        if(cmbxProduto.getSelectedIndex() == 2) 
        {
            try
            {
                if(Double.parseDouble(txtHorasEletrodomestico.getText()) < 0 || Double.parseDouble(txtPotencia.getText()) < 0)
                {
                    lblException.setText("Insira um valor válido");
                    lblException.setForeground(new Color(223,0,0));
                    
                    lblGastos.setText("R$ 0,00");
                }else
                {
                    //Definindo os valores dos atributos do objeto com os valores que o usuário colocou nos Caixas de texto
                    eletro.setPotencia(Double.parseDouble(txtPotencia.getText()));
                    eletro.setTempo(Double.parseDouble(txtHorasEletrodomestico.getText())); 
                }
                
            }catch(NumberFormatException ex)
            {
                //Definindo o texto e a cor da label Exception
                lblException.setText("Insira um valor válido");
                lblException.setForeground(new Color(223,0,0));
                
                lblGastos.setText("R$ 0,00");
            }
          
            //Definindo o texto da label Gastos para o resultado do método calculo_gastos() localizado na Classe Eletrodomestico
            
            BigDecimal bd = new BigDecimal(eletro.calculo_gastos()).setScale(2, RoundingMode.HALF_EVEN);            
            lblGastos.setText("R$ " + Double.toString(bd.doubleValue()) + "/mês");
            
            
            if(eletro.calculo_consumo() > 0)
            {            
                if(eletro.calculo_consumo() <= 152.2)
                {
                    lblException1.setText("<html> Parabéns, seu consumo de energia está <br> abaixo da média!!");
                    lblException1.setForeground(new Color(19,202,29));
                }else
                {
                    lblException1.setText("<html> Seu consumo de energia está acima <br> da média :c");
                    lblException1.setForeground(new Color(223,0,0));
                }
            }else
            {
                lblException1.setText("");
            }
            
        //Caso o indice selecionado na Combobox Produto seja igual a 1 executará o bloco abaixo
        }else if(cmbxProduto.getSelectedIndex() == 1)
        {
            //Testando qual indice da Combobox Polegadas foi selecionado e definindo o atributo Potencia da classe Eletrodomesico
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
            
            }else
            {
                eletro.setPotencia(245);
            }
            
            try
            {
                if(Double.parseDouble(txtHorasEletrodomestico.getText()) < 0)
                {
                    lblException.setText("Insira um valor válido");
                    lblException.setForeground(new Color(223,0,0));
                    
                    lblGastos.setText("R$ 0,00");
                }else
                {
                    //Definindo o valor do atributo Tempo da classe Eletrodomestico com o valor que o usuário digitou no campo de texto HorasEletrodomestico
                    eletro.setTempo(Double.parseDouble(txtHorasEletrodomestico.getText()));
                }
            //Caso o usuário tenha digitado algum valor incorreto a Excepiton NumberFormat é lançada     
            }catch(NumberFormatException ex)
            {
                //Definindo o texto e a cor da label Exception
                lblException.setText("Insira um valor válido");
                lblException.setForeground(new Color(223,0,0));
                
                lblGastos.setText("R$ 0,00");
            } 
                       
            
            //Definindo o texto da label Gastos para o resultado do método calculo_gastos() localizado na Classe Eletrodomestico
            BigDecimal bd = new BigDecimal(eletro.calculo_gastos()).setScale(2, RoundingMode.HALF_EVEN);
            lblGastos.setText("R$ " + Double.toString(bd.doubleValue()) + "/mês");
            
            if(eletro.calculo_consumo() > 0)
            {
                if(eletro.calculo_consumo() <= 152.2)
                {
                    lblException1.setText("<html> Parabéns, seu consumo de energia está <br> abaixo da média!!");
                    lblException1.setForeground(new Color(19,202,29));
                }else
                {
                    lblException1.setText("<html> Seu consumo de energia está <br> acima da média :c");
                    lblException1.setForeground(new Color(223,0,0));
                }
            }else
            {
                lblException1.setText("");
            }
            
        
        //Caso o indice selecionado na Combobox Produto seja igual a 1 executará o bloco abaixo
        }else if(cmbxProduto.getSelectedIndex() == 3)
        {
            
            try
            {
                if(Double.parseDouble(txtHorasEletrodomestico.getText()) < 0 || Double.parseDouble(txtPotencia.getText()) < 0)
                {
                    lblException.setText("Insira um valor válido");
                    lblException.setForeground(new Color(223,0,0));
                    
                    lblGastos.setText("R$ 0,00");
                }else
                {
                    //Definindo os valores dos atributos do objeto eletro com os valores que o usuário colocou nos Caixas de texto
                    eletro.setPotencia(Double.parseDouble(txtPotencia.getText()));
                    eletro.setTempo(Double.parseDouble(txtHorasEletrodomestico.getText()));                    
                }
            //Caso o usuário tenha digitado algum valor incorreto a Excepiton NumberFormat é lançada    
            }catch(NumberFormatException ex)
            {
                //Definindo o texto e a cor da label Exception
                lblException.setText("Insira um valor válido");
                lblException.setForeground(new Color(223,0,0));
                
                lblGastos.setText("R$ 0,00");
            }              
            
            
            //Definindo o texto da label Gastos para o resultado do método calculo_gastos() localizado na Classe Eletrodomestico
            BigDecimal bd = new BigDecimal(eletro.calculo_gastos()).setScale(2, RoundingMode.HALF_EVEN);
            lblGastos.setText("R$ " + Double.toString(bd.doubleValue()) + "/mês");
            
            if(eletro.calculo_consumo() > 0)
            {
                if(eletro.calculo_consumo() <= 152.2)
                {
                    lblException1.setText("<html> Parabéns, seu consumo de energia está <br> abaixo da média!!");
                    lblException1.setForeground(new Color(19,202,29));
                }else
                {
                    lblException1.setText("<html> Seu consumo de energia está <br> acima da média :c");
                    lblException1.setForeground(new Color(223,0,0));
                }                
            }else
            {
                lblException1.setText("");
            }            
        }
        
        //Caso o Indice da Combobox Agua selecionado seja igual a 1
        if(cboAgua.getSelectedIndex() == 1)
        {
            try
            {
                if(Double.parseDouble(txtHorasAgua.getText()) < 0)
                {
                    lblException.setText("Insira um valor válido");
                    lblException.setForeground(new Color(223,0,0));
                    
                    lblGastos.setText("R$ 0,00");
                }else
                {
                    //Definindo o valor dos atributos do objeto Agua com os valores que o usuário digitou nos Caixas de texto 
                    agua.setTempo(Double.parseDouble(txtHorasAgua.getText()));                    
                }
                
            }catch(NumberFormatException ex)
            {
                //Definindo o texto e a cor da label Exception
                lblException.setText("Insira um valor válido");
                lblException.setForeground(new Color(223,0,0));
                
                lblGastos.setText("R$ 0,00");
            }            
        
            //Definindo o texto da label Gastos para o resultado do método gastos() localizado na Classe Agua
            BigDecimal bd = new BigDecimal(agua.gastos()).setScale(2, RoundingMode.HALF_EVEN);
            lblGastos.setText("R$ "+Double.toString(bd.doubleValue()) + "/mês");
            
            if(agua.gastos() > 0)
            {
                if(agua.calculo() <= 3.480)
                {
                    lblException1.setText("<html> Parabéns, seu consumo de água está <br> abaixo da média!!");
                    lblException1.setForeground(new Color(19,202,29));
                }else
                {
                    lblException1.setText("<html> Seu consumo de água está <br> acima da média :c");
                    lblException1.setForeground(new Color(223,0,0));
                }   
            }else
            {
                lblException1.setText("");
            }
            
        
        //Caso o Indice da Combobox Agua selecionado seja igual a 2  
        }else if(cboAgua.getSelectedIndex() == 2)
        {
            try
            {
                if(Double.parseDouble(txtHorasAgua.getText()) < 0 || Double.parseDouble(txtPotencia.getText()) < 0)
                {
                    lblException.setText("Insira um valor válido");
                    lblException.setForeground(new Color(223,0,0));
                    
                    lblGastos.setText("");
                }else
                {
                     //Definindo o valor dos atributos do objeto Agua e Eletrodomestico com os valores que o usuário digitou nos Caixas de texto 
                     eletro.setTempo(Double.parseDouble(txtHorasAgua.getText()));
                     eletro.setPotencia(Double.parseDouble(txtPotencia.getText()));
                     agua.setTempo(Double.parseDouble(txtHorasAgua.getText()));                    
                }
                
            }catch(NumberFormatException ex)
            {
                //Definindo o texto e a cor da label Exception
                lblException.setText("Insira um valor válido");
                lblException.setForeground(new Color(223,0,0));
                
                lblGastos.setText("R$ 0,00");
            }
        
            //Definindo o texto da label Gastos para o resultado da soma dcs métodos gastos() + calculo_gastos() localizado na Classe Agua e Eletrodomestico
            BigDecimal bd = new BigDecimal(eletro.calculo_gastos() + agua.gastos()).setScale(2, RoundingMode.HALF_EVEN);
            lblGastos.setText("R$ " + Double.toString(bd.doubleValue()) + "/mês");
            
            if(agua.calculo() > 0)
            {
                if(agua.calculo() <= 3.480)
                {
                    lblException1.setText("<html> Parabéns, seu consumo de água está <br> abaixo da média!!");
                    lblException1.setForeground(new Color(19,202,29));
                }else
                {
                    lblException1.setText("<html> Seu consumo de água está <br> acima da média :c");
                    lblException1.setForeground(new Color(223,0,0));
                }  
            }else
            {
                lblException1.setText("");
            }
            
            if(eletro.calculo_consumo() > 0)
            {
                if(eletro.calculo_consumo() <= 152.2)
                {
                    lblException2.setText("<html> Parabéns, seu consumo de energia <br> está abaixo da média!!");
                    lblException2.setForeground(new Color(19,202,29));
                }else
                {
                    lblException2.setText("<html> Seu consumo de energia está <br> acima da média :c");
                    lblException2.setForeground(new Color(223,0,0));
                }   
            }else
            {
                lblException2.setText("");
            }
            
        
        }else if(cboAgua.getSelectedIndex() == 3)
        {
            try
            {
                if(Double.parseDouble(txtHorasAgua.getText()) < 0 || Double.parseDouble(txtPotencia.getText()) < 0)
                {
                    lblException.setText("Insira um valor válido");
                    lblException.setForeground(new Color(223,0,0));
                    
                    lblGastos.setText("R$ 0,00");
                }else
                {
                    //Definindo o valor dos atributos do objeto Agua e Eletrodomestico com os valores que o usuário digitou nos Caixas de texto
                    eletro.setTempo(Double.parseDouble(txtHorasAgua.getText()));
                    eletro.setPotencia(Double.parseDouble(txtPotencia.getText()));
            
                    agua.setTempo(Double.parseDouble(txtHorasAgua.getText()));                    
                }
                
            }catch(NumberFormatException ex)
            {
                //Definindo o texto e a cor da label Exception
                lblException.setText("Insira um valor válido");
                lblException.setForeground(new Color(223,0,0));
                
                lblGastos.setText("R$ 0,00");
            }
            
            
            //Definindo o texto da label Gastos para o resultado da soma dcs métodos gastos() + calculo_gastos() localizado na Classe Agua e Eletrodomestico
            BigDecimal bd = new BigDecimal(eletro.calculo_gastos() + agua.gastos()).setScale(2, RoundingMode.HALF_EVEN);
            lblGastos.setText("R$ " + Double.toString(bd.doubleValue()) + "/mês"); 
            
            
            if(agua.calculo() > 0)
            {
                if(agua.calculo() <= 3.480)
                {
                    lblException1.setText("<html> Parabéns, seu consumo de água está <br> abaixo da média!!");
                    lblException1.setForeground(new Color(19,202,29));
                }else
                {
                    lblException1.setText("<html> Seu consumo de água está <br> acima da média :c");
                    lblException1.setForeground(new Color(223,0,0));
                }    
            }else
            {
                lblException1.setText("");
            }
            
            
            if(eletro.calculo_consumo() > 0)
            {
                if(eletro.calculo_consumo() <= 152.2)
                {
                    lblException2.setText("<html> Parabéns, seu consumo de energia está <br> abaixo da média!!");
                    lblException2.setForeground(new Color(19,202,29));
                }else
                {
                    lblException2.setText("<html> Seu consumo de energia está <br> acima da média :c");
                    lblException2.setForeground(new Color(223,0,0));
                }   
            }else
            {
                lblException2.setText("");
            }
            
        }         
    }//GEN-LAST:event_btnCalcularActionPerformed
    
    //Evento de mudança de item na Combobox Produto
    private void cmbxProdutoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbxProdutoItemStateChanged
        
        //Caso o indice da Combobox Produto seja igual 0, o Botão Calcular fica invisível para o usuário
        if(cmbxProduto.getSelectedIndex() != 0)
        {
            btnCalcular.setVisible(true);
        }else
        {
            btnCalcular.setVisible(false);
            lblGastos.setText("");
        }
        
        //Testando qual Indice está selecionado na Combobox Produto e deixando alguns elementos visíveis para o usuário, outros invisíveis
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
            
            //Definindo o texto e a cor do Caixas de texto HorasEletrodomestico
            txtHorasEletrodomestico.setText("Tempo em horas");
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
            
            //Definindo o texto e a cor do Caixas de texto HorasEletrodomestico e Potencia
            txtHorasEletrodomestico.setText("Tempo em horas");
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
            
            //Definindo o texto e a cor do Caixas de texto HorasEletrodomestico e Potencia
            txtHorasEletrodomestico.setText("Tempo em horas");
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
    
    //Evento para quando a Janela é acionada
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        //Definindo a visibilidade todos os elementos para invisíveis
        txtPotencia.setVisible(false);
        cmbxPolegadas.setVisible(false);
        
        lblPolegadas.setVisible(false);
        lblPotencia.setVisible(false);
        
        lblHorasEletrodomestico.setVisible(false);
        txtHorasEletrodomestico.setVisible(false);
        
        lblHorasAgua.setVisible(false);
        txtHorasAgua.setVisible(false);     
        
        btnCalcular.setVisible(false);
        
    }//GEN-LAST:event_formWindowActivated
    
    //Evento para quando a Caixa de texto Potencia ganha o foco
    private void txtPotenciaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPotenciaFocusGained
        
        //Caso o texto atual da Caixa de texto seja igual ao inicial
        if(txtPotencia.getText().equals("Potência em Watts"))
        {
            //Define a cor e a posição do Cursor de texto para antes do texto escrito na Caixa de texto Potencia 
            txtPotencia.setCaretPosition(0);
            txtPotencia.setCaretColor(Color.BLACK);
        }
    }//GEN-LAST:event_txtPotenciaFocusGained
    
    //Evento para quando a Caixa de texto HorasEletrodomestico ganha o foco
    private void txtHorasEletrodomesticoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHorasEletrodomesticoFocusGained
        
        //Caso o texto atual da Caixa de texto seja igual ao inicial
        if(txtHorasEletrodomestico.getText().equals("Tempo em horas"))
        {
            //Define a cor e a posição do Cursor de texto para antes do texto escrito na Caixa de texto Potencia 
            txtHorasEletrodomestico.setCaretPosition(0);
            txtHorasEletrodomestico.setCaretColor(Color.BLACK);
        }
    }//GEN-LAST:event_txtHorasEletrodomesticoFocusGained

    //Evento para quando o usuário pressionar um tecla do teclado na caixa de texto HorasEletrodomestico
    private void txtHorasEletrodomesticoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHorasEletrodomesticoKeyPressed
        
        //Caso o texto atual da Caixa de texto seja igual ao inicial
        if(txtHorasEletrodomestico.getText().equals("Tempo em horas"))
        {
            //Define a cor e o texto da Caixa de texto HorasEletrodomestico
            txtHorasEletrodomestico.setText("");
            txtHorasEletrodomestico.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtHorasEletrodomesticoKeyPressed

    //Evento para quando a Caixa de texto HorasAgua ganha o foco
    private void txtHorasAguaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHorasAguaFocusGained
       
        //Caso o texto atual da Caixa de texto seja igual ao inicial
        if(txtHorasAgua.getText().equals("Tempo em horas"))
        {
            //Define a cor e a posição do Cursor de texto para antes do texto escrito na Caixa de texto Potencia
            txtHorasAgua.setCaretPosition(0);
            txtHorasAgua.setCaretColor(Color.BLACK);
        }
    }//GEN-LAST:event_txtHorasAguaFocusGained

    //Evento para quando o usuário pressionar um tecla do teclado na caixa de texto HorasAgua
    private void txtHorasAguaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHorasAguaKeyPressed
        if(txtHorasAgua.getText().equals("Tempo em horas"))
        {
            txtHorasAgua.setText("");
            txtHorasAgua.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtHorasAguaKeyPressed

    private void txtPotenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPotenciaKeyPressed
        
        //Caso o texto atual da Caixa de texto seja igual ao inicial
        if(txtPotencia.getText().equals("Potência em Watts"))
        {
            //Define a cor e o texto da Caixa de texto HorasEletrodomestico
            txtPotencia.setText("");
            txtPotencia.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtPotenciaKeyPressed

    //Evento de mudança de item na Combobox Produto
    private void cboAguaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboAguaItemStateChanged
       
        //Caso o indice da Combobox Produto seja igual 0, o Botão Calcular fica invisível para o usuário
        if(cboAgua.getSelectedIndex() != 0)
        {
            btnCalcular.setVisible(true);
        }else
        {
            btnCalcular.setVisible(false);
            lblGastos.setText("");
        }

        //Testando qual Indice está selecionado na Combobox Produto e deixando alguns elementos visíveis para o usuário, outros invisíveis
        if(cboAgua.getSelectedIndex() == 1)
        {
            lblEletro.setVisible(false);
            cmbxProduto.setVisible(false);
            
            txtPotencia.setVisible(false);
            lblPotencia.setVisible(false);
            
            cmbxPolegadas.setVisible(false);
            lblPolegadas.setVisible(false);
            
            txtHorasEletrodomestico.setVisible(false);
            lblHorasEletrodomestico.setVisible(false);
            
            txtHorasAgua.setVisible(true);
            lblHorasAgua.setVisible(true);
            
            //Definindo o texto e a cor do Caixa de texto HorasAgua           
            txtHorasAgua.setText("Tempo em horas");
            txtHorasAgua.setForeground(new Color(102,102,102));
            
        }else if(cboAgua.getSelectedIndex() == 2)
        {
            lblEletro.setVisible(false);
            cmbxProduto.setVisible(false);
            
            txtPotencia.setVisible(true);
            lblPotencia.setVisible(true);
            
            cmbxPolegadas.setVisible(false);
            lblPolegadas.setVisible(false);
            
            txtHorasAgua.setVisible(true);
            lblHorasAgua.setVisible(true);
            
            //Definindo o texto e a cor do Caixas de texto HorasAgua e Potencia
            txtHorasAgua.setText("Tempo em horas");
            txtHorasAgua.setForeground(new Color(102,102,102));
            
            txtPotencia.setText("Potência em Watts");
            txtPotencia.setForeground(new Color(102,102,102));
            
        }else if(cboAgua.getSelectedIndex() == 3)
        {
            lblEletro.setVisible(false);
            cmbxProduto.setVisible(false);
            
            txtPotencia.setVisible(true);
            lblPotencia.setVisible(true);
            
            cmbxPolegadas.setVisible(false);
            lblPolegadas.setVisible(false);
            
            txtHorasAgua.setVisible(true);
            lblHorasAgua.setVisible(true);
            
            //Definindo o texto e a cor do Caixas de texto HorasAgua e Potencia
            txtHorasAgua.setText("Tempo em horas");
            txtHorasAgua.setForeground(new Color(102,102,102));
            
            txtPotencia.setText("Potência em Watts");
            txtPotencia.setForeground(new Color(102,102,102));   
            
        }else
        {
            lblEletro.setVisible(true);
            cmbxProduto.setVisible(true);
            
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAgua;
    private javax.swing.JLabel lblEletro;
    private javax.swing.JLabel lblException;
    private javax.swing.JLabel lblException1;
    private javax.swing.JLabel lblException2;
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
