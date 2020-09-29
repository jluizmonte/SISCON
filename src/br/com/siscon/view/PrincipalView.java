package br.com.siscon.view;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import br.com.siscon.model.SessaoUsuarioModel;
import br.com.siscon.relatorios.Reporte;

/**
 *
 * @author joseluiz
 */
public class PrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public PrincipalView() {
        URL caminhoImagem = this.getClass().getResource("/br/com/siscon/imagens/buttons/principal.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem);
        setIconImage(iconeTitulo);
        setExtendedState(JFrame.MAXIMIZED_BOTH); //seta o tamanho da janela (maximizado) ao iniciar
        initComponents();
        setLocationRelativeTo(null);
        setarOperador();
        setarData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        btnCliente = new javax.swing.JButton();
        btnFornecedor = new javax.swing.JButton();
        btnProduto = new javax.swing.JButton();
        btnVenda = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        btnPdv = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jlOperador = new javax.swing.JLabel();
        jlData = new javax.swing.JLabel();
        painelInterno = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiUsuario = new javax.swing.JMenuItem();
        jmiClientes = new javax.swing.JMenuItem();
        jmiProdutos = new javax.swing.JMenuItem();
        jmiFornecedores = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiVendas = new javax.swing.JMenuItem();
        jmiPdv = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jmiRelatorios = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VendasNSoft 2.0");

        desktopPane.setBackground(new java.awt.Color(76, 106, 146));

        jPanel1.setBackground(new java.awt.Color(43, 87, 151));

        btnCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siscon/imagens/buttons/icons8-usuário-38.png"))); // NOI18N
        btnCliente.setText("Cliente");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnFornecedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siscon/imagens/buttons/icons8-businessman-38.png"))); // NOI18N
        btnFornecedor.setText("Fornecedor");
        btnFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedorActionPerformed(evt);
            }
        });

        btnProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siscon/imagens/buttons/icons8-cardboard-box-38.png"))); // NOI18N
        btnProduto.setText("Produto");
        btnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutoActionPerformed(evt);
            }
        });

        btnVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siscon/imagens/buttons/icons8-sales-performance-38.png"))); // NOI18N
        btnVenda.setText("Venda");
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });

        btnRelatorio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siscon/imagens/buttons/icons8-bill-38.png"))); // NOI18N
        btnRelatorio.setText("Relatorio");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        btnPdv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPdv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siscon/imagens/buttons/icons8-cash-register-38.png"))); // NOI18N
        btnPdv.setText("PDV");
        btnPdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdvActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jlOperador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlOperador.setForeground(new java.awt.Color(255, 255, 255));
        jlOperador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siscon/imagens/buttons/user.png"))); // NOI18N
        jlOperador.setText("$Usuario");

        jlData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlData.setForeground(java.awt.Color.white);
        jlData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlData.setText("Data");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPdv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRelatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlOperador)
                .addGap(18, 18, 18)
                .addComponent(jlData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlOperador)
                                .addComponent(jlData))
                            .addGap(8, 8, 8)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCliente)
                        .addComponent(btnFornecedor)
                        .addComponent(btnProduto)
                        .addComponent(btnVenda)
                        .addComponent(btnRelatorio)
                        .addComponent(btnPdv)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelInterno.setBackground(new java.awt.Color(76, 106, 146));

        javax.swing.GroupLayout painelInternoLayout = new javax.swing.GroupLayout(painelInterno);
        painelInterno.setLayout(painelInternoLayout);
        painelInternoLayout.setHorizontalGroup(
            painelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1004, Short.MAX_VALUE)
        );
        painelInternoLayout.setVerticalGroup(
            painelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 405, Short.MAX_VALUE)
        );

        desktopPane.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(painelInterno, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelInterno)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelInterno))
        );

        jMenuBar1.setBackground(new java.awt.Color(43, 87, 151));
        jMenuBar1.setForeground(new java.awt.Color(43, 87, 151));
        jMenuBar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jMenu1.setForeground(new java.awt.Color(43, 87, 151));
        jMenu1.setText("Arquivo");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jmiSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        jmiSair.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jmiSair.setForeground(new java.awt.Color(47, 87, 151));
        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jMenu1.add(jmiSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(43, 87, 151));
        jMenu2.setText("Cadastros");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jmiUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jmiUsuario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jmiUsuario.setForeground(new java.awt.Color(47, 87, 151));
        jmiUsuario.setText("Usuário");
        jmiUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(jmiUsuario);

        jmiClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jmiClientes.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jmiClientes.setForeground(new java.awt.Color(47, 87, 151));
        jmiClientes.setText("Clientes");
        jmiClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiClientesActionPerformed(evt);
            }
        });
        jMenu2.add(jmiClientes);

        jmiProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jmiProdutos.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jmiProdutos.setForeground(new java.awt.Color(47, 87, 151));
        jmiProdutos.setText("Produtos");
        jmiProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProdutosActionPerformed(evt);
            }
        });
        jMenu2.add(jmiProdutos);

        jmiFornecedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jmiFornecedores.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jmiFornecedores.setForeground(new java.awt.Color(47, 87, 151));
        jmiFornecedores.setText("Fornecedores");
        jmiFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFornecedoresActionPerformed(evt);
            }
        });
        jMenu2.add(jmiFornecedores);

        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(43, 87, 151));
        jMenu3.setText("Vendas");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jmiVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jmiVendas.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jmiVendas.setForeground(new java.awt.Color(47, 87, 151));
        jmiVendas.setText("Vendas");
        jmiVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVendasActionPerformed(evt);
            }
        });
        jMenu3.add(jmiVendas);

        jmiPdv.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        jmiPdv.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jmiPdv.setForeground(new java.awt.Color(47, 87, 151));
        jmiPdv.setText("PDV");
        jmiPdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPdvActionPerformed(evt);
            }
        });
        jMenu3.add(jmiPdv);

        jMenuBar1.add(jMenu3);

        jMenu5.setForeground(new java.awt.Color(43, 87, 151));
        jMenu5.setText("Ferramentas");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jmiRelatorios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        jmiRelatorios.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jmiRelatorios.setForeground(new java.awt.Color(47, 87, 151));
        jmiRelatorios.setText("Relatórios");
        jmiRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRelatoriosActionPerformed(evt);
            }
        });
        jMenu5.add(jmiRelatorios);

        jMenuBar1.add(jMenu5);

        jMenu4.setForeground(new java.awt.Color(43, 87, 151));
        jMenu4.setText("Ajuda");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jmiAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        jmiAbout.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jmiAbout.setForeground(new java.awt.Color(47, 87, 151));
        jmiAbout.setText("About");
        jmiAbout.setToolTipText("Acesso apenas para o administrador!");
        jmiAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAboutActionPerformed(evt);
            }
        });
        jMenu4.add(jmiAbout);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jmiClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiClientesActionPerformed
        ClienteView clienteView = new ClienteView();
        painelInterno.add(clienteView);
        clienteView.setVisible(true);
    }//GEN-LAST:event_jmiClientesActionPerformed

    private void jmiProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProdutosActionPerformed
        ProdutoView produtoView = new ProdutoView();
        painelInterno.add(produtoView);
        produtoView.setVisible(true);
    }//GEN-LAST:event_jmiProdutosActionPerformed

    private void jmiVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVendasActionPerformed
        VendasView vendasView = new VendasView();
        painelInterno.add(vendasView);
        vendasView.setVisible(true);
    }//GEN-LAST:event_jmiVendasActionPerformed

    private void jmiPdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPdvActionPerformed
        // TODO add your handling code here:
        Pdv1View pdvView = new Pdv1View();
        pdvView.setVisible(true);
    }//GEN-LAST:event_jmiPdvActionPerformed

    private void jmiAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAboutActionPerformed
        // TODO add your handling code here:
        AboutView aboutView = new AboutView();
        painelInterno.add(aboutView);
        aboutView.setVisible(true);
    }//GEN-LAST:event_jmiAboutActionPerformed

    private void jmiUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUsuarioActionPerformed
        // TODO add your handling code here:
        UsuarioView usuarioView = new UsuarioView();
        painelInterno.add(usuarioView);
        usuarioView.setVisible(true);
    }//GEN-LAST:event_jmiUsuarioActionPerformed

    private void jmiFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFornecedoresActionPerformed
        FornecedorView fornecedorView = new FornecedorView();
        painelInterno.add(fornecedorView);
        fornecedorView.setVisible(true);
    }//GEN-LAST:event_jmiFornecedoresActionPerformed

    private void jmiRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRelatoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiRelatoriosActionPerformed

    private void btnPdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdvActionPerformed
        Pdv2View pdv2View = new Pdv2View();
        Pdv1View pdv1View = new Pdv1View();

        Object[] opcoes = {"PDV1", "PDV2"};
        Object resposta;
        resposta = JOptionPane.showInputDialog(null,
                "Qual versão do PDV abrir (TESTE)",
                "Escolha",
                JOptionPane.OK_CANCEL_OPTION,
                null,
                opcoes,
                "PDV1");
        if (resposta.equals("PDV1")) {
            pdv1View.setVisible(true);
        }
        if (resposta.equals("PDV2")) {
            pdv2View.setVisible(true);
        }
        //        pdv2View.setVisible(true);
    }//GEN-LAST:event_btnPdvActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        // TODO add your handling code here:
        Reporte reporte = new Reporte("cliente");
        reporte.gerarRelatorio();
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
        VendasView vendasView = new VendasView();
        painelInterno.add(vendasView);
        vendasView.setVisible(true);
    }//GEN-LAST:event_btnVendaActionPerformed

    private void btnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutoActionPerformed
        ProdutoView produtoView = new ProdutoView();
        painelInterno.add(produtoView);
        produtoView.setVisible(true);
    }//GEN-LAST:event_btnProdutoActionPerformed

    private void btnFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedorActionPerformed
        FornecedorView fornecedorView = new FornecedorView();
        painelInterno.add(fornecedorView);
        fornecedorView.setVisible(true);
    }//GEN-LAST:event_btnFornecedorActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        ClienteView clienteView = new ClienteView();
        painelInterno.add(clienteView);
        clienteView.setVisible(true);
    }//GEN-LAST:event_btnClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new PrincipalView().setVisible(true);
        });
    }

    private void setarOperador() {
        jlOperador.setText(SessaoUsuarioModel.codigoUsuario + "- " + SessaoUsuarioModel.nomeUsuario);
    }

    /*
     * exibir na toolbar (barra de status/ barra inferior) a data atual do login
     * do usuário.
     */
    public void setarData() {
        Thread clock = new Thread() {
            @Override
            public void run() {
                for (;;) {
                    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
                    LocalDateTime timepoint = LocalDateTime.now();
                    jlData.setText(timepoint.format(fmt));
                }
            }
        };
        clock.start();
    }

    protected void setBackgroundImage() {
        try {
            ImageIcon icon = new ImageIcon(new URL("/siscon/imagens/others/pie-percent.png"));
            JLabel label = new JLabel(icon);
            label.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
            painelInterno.add(label, new Integer(Integer.MAX_VALUE));
        } catch (MalformedURLException e) {
            System.out.println(e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnFornecedor;
    private javax.swing.JButton btnPdv;
    private javax.swing.JButton btnProduto;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnVenda;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlData;
    private javax.swing.JLabel jlOperador;
    private javax.swing.JMenuItem jmiAbout;
    private javax.swing.JMenuItem jmiClientes;
    private javax.swing.JMenuItem jmiFornecedores;
    private javax.swing.JMenuItem jmiPdv;
    private javax.swing.JMenuItem jmiProdutos;
    private javax.swing.JMenuItem jmiRelatorios;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JMenuItem jmiUsuario;
    private javax.swing.JMenuItem jmiVendas;
    private javax.swing.JDesktopPane painelInterno;
    // End of variables declaration//GEN-END:variables

}
