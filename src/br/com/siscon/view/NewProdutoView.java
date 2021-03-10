package br.com.siscon.view;

import br.com.siscon.model.ProdutoModel;
import br.com.siscon.service.ProdutoService;
import br.com.siscon.util.Datas;
import br.com.siscon.util.Formatador;
import br.com.siscon.util.GetDateUtil;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jluiz
 */
public class NewProdutoView extends javax.swing.JInternalFrame {

    GetDateUtil getDateUtil = new GetDateUtil();
    Datas mascaraDatas = new Datas();
    ProdutoModel produtoModel = new ProdutoModel();
    ProdutoService produtoService = new ProdutoService();
    ArrayList<ProdutoModel> listaProdutoModel = new ArrayList<>();
    Formatador formatador = new Formatador();
    String alterarSalvar;

    /**
     * Creates new form NewProdutoView
     */
    public NewProdutoView() {
        initComponents();
        habilitarDesabilitarCampos(false); // desabilita o formulario
        carregarProdutos(); //carrega os produtos já cadastrados na tabela
        limparCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfDescricaoProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dpDataEntrada = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtfObservacao = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProduto = new javax.swing.JTable();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jlCodigoProduto = new javax.swing.JLabel();
        jtfPreco = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Produtos");
        setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 112, 192));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Descrição Produto:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código Produto:");

        jtfDescricaoProduto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Preço Unitário Produto:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data Entrada:");

        dpDataEntrada.setEditable(false);
        dpDataEntrada.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dpDataEntrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Observações Gerais:");

        jtfObservacao.setColumns(20);
        jtfObservacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfObservacao.setRows(5);
        jScrollPane1.setViewportView(jtfObservacao);

        jtProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "#", "Produto", "Entrada", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtProduto);
        if (jtProduto.getColumnModel().getColumnCount() > 0) {
            jtProduto.getColumnModel().getColumn(0).setMinWidth(35);
            jtProduto.getColumnModel().getColumn(0).setPreferredWidth(35);
            jtProduto.getColumnModel().getColumn(0).setMaxWidth(35);
            jtProduto.getColumnModel().getColumn(3).setMinWidth(85);
            jtProduto.getColumnModel().getColumn(3).setPreferredWidth(85);
            jtProduto.getColumnModel().getColumn(3).setMaxWidth(65);
        }

        jbAlterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siscon/imagens/buttons/icons8-crie-um-novo-24.png"))); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.setToolTipText("Alterar Cliente");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siscon/imagens/buttons/icons8-lixo-24.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.setToolTipText("Excluir Cliente");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siscon/imagens/buttons/icons8-cancelar-2-24.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.setToolTipText("Cancelar Cliente");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbNovo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siscon/imagens/buttons/icons8-adicionar-arquivo-24.png"))); // NOI18N
        jbNovo.setText("Novo");
        jbNovo.setToolTipText("Novo Cliente");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siscon/imagens/buttons/icons8-salvar-24.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.setToolTipText("Salvar Cliente");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jlCodigoProduto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlCodigoProduto.setForeground(new java.awt.Color(255, 255, 255));
        jlCodigoProduto.setText("ID");

        jtfPreco.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jtfPreco.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jtfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dpDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfDescricaoProduto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(224, 224, 224)
                                        .addComponent(jLabel4)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCodigoProduto)
                                .addGap(47, 47, 47)))
                        .addGap(13, 13, 13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbCancelar)
                        .addGap(11, 11, 11)
                        .addComponent(jbExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSalvar)
                        .addContainerGap(17, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jlCodigoProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dpDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbNovo)
                    .addComponent(jbExcluir)
                    .addComponent(jbSalvar)
                    .addComponent(jbAlterar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed

        /**
         * seta a linha que o usuário selecionar na tabela na variavel linha e
         * seta o produto pegando a linha selecionada e a posição 0
         */
        int linha = jtProduto.getSelectedRow();
        int codigoProduto = (int) jtProduto.getValueAt(linha, 0);
        /**
         * menu de opções para o usuário confirmar a exclusão do produto
         */
        Object[] opcoes = {"Sim", "Não"};
        Object resposta;
        resposta = JOptionPane.showInputDialog(null,
                "Deseja excluir o produto?",
                "Excluir",
                JOptionPane.OK_CANCEL_OPTION,
                null,
                opcoes,
                "Sim");
        if (resposta.equals("Sim")) {
            /**
             * exclui o produto do banco de dados e atualiza a tabela
             * automaticamete apos excluir altera oo nome do botao para salvar
             * atualiza a lista dos produtos e desabilita os campos para um novo
             * cadastro e volta o foco do mouse para o campo pesquisa
             */
            if (produtoService.excluirProdutoDAO(codigoProduto)) {
                JOptionPane.showMessageDialog(this, "Produto excluido com sucesso!", "Atenção", JOptionPane.WARNING_MESSAGE);
                jbSalvar.setText("Salvar");
                carregarProdutos();
                this.habilitarDesabilitarCampos(false);
                jtfDescricaoProduto.requestFocusInWindow();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir o produto", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        /**
         * ao cancelar desabilita os campos altera o nome do botao salvar limpa
         * os campos joga o foco para o campo pesquisa
         */
        this.habilitarDesabilitarCampos(false);
        jbSalvar.setText("Salvar");
        this.limparCampos();
        jtfDescricaoProduto.requestFocusInWindow();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        /**
         * ao clicar em novo limpa os campos habilita o formulário seta 'salvar'
         * na variavel global coloca o foco do mouse para o campo nome altera o
         * nome do botao salvar
         */
        limparCampos();
        habilitarDesabilitarCampos(true);
        alterarSalvar = "salvar";
        jtfDescricaoProduto.requestFocusInWindow();
        jbSalvar.setText("Salvar");
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        /**
         * chama o metódo para salvar ou alterar diferenciado pela escolha do
         * usuário
         */
        if (alterarSalvar.equals("salvar")) {
            this.salvarProduto();
        } else if (alterarSalvar.equals("alterar")) {
            this.alterarProduto();
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        /**
         * altera a variavel global para alterar altera o nome do botao salvar
         * joga o foco para o campo nome habilita os campos atribui a uma
         * variavel a linha selecionada na tabela
         */
        alterarSalvar = "alterar";
        jbSalvar.setText("Alterar");
        jtfDescricaoProduto.requestFocusInWindow();
        habilitarDesabilitarCampos(true);
        int linha = jtProduto.getSelectedRow();

        try {
            produtoModel = produtoService.retornarUltimoCodigoDAO();
            int codigoProduto = (int) this.jtProduto.getValueAt(linha, 0);
            System.out.println(codigoProduto);
            // recupera os dados do BD
            produtoModel = produtoService.getProdutoDAO(codigoProduto);

            //colocar os dados do BD na tabela
            jlCodigoProduto.setText(String.valueOf(produtoModel.getProCodigoProduto()));
            jtfDescricaoProduto.setText(produtoModel.getProDescricao());
            jtfPreco.setText(String.valueOf((produtoModel.getProValor())));
            jtfObservacao.setText(jtfObservacao.getText());
            dpDataEntrada.setText(produtoModel.getProDataEntrada());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Código invalido ou nenhum registro selecionado", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    //Metódo para carregar os produtos do BD e inserir na tabela
    private void carregarProdutos() {
        /**
         * Array que buscará no BD (atraves do Controller) os dados para serem
         * exibidos na tabela
         */
        listaProdutoModel = produtoService.getListaProdutoDAO();
        DefaultTableModel modelo = (DefaultTableModel) jtProduto.getModel();

        //Setando a quantidade de linhas que a tabela para não haver duplicação de dados
        modelo.setNumRows(0);
        // insere os produtos na tabela
        int cont = listaProdutoModel.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaProdutoModel.get(i).getProCodigoProduto(),
                listaProdutoModel.get(i).getProDescricao(),
                listaProdutoModel.get(i).getProDataEntrada(),
                "R$: " + listaProdutoModel.get(i).getProValor()
            });
        }
    }

    private void salvarProduto() {
        // Salva um novo produto no BD e atualiza a tabela
        produtoModel.setProDescricao(jtfDescricaoProduto.getText().toUpperCase());
        produtoModel.setProValor(formatador.converterVirgulaParaPonto(jtfPreco.getText()));
        produtoModel.setProDataEntrada(dpDataEntrada.getText());
        produtoModel.setProObservacao(jtfObservacao.getText().toUpperCase());
        /**
         * chama o metodo de salvar no controller salva o produto altera o nome
         * do botao salvar recarrega os produtos exibidos na tabela limpa os
         * campos do formulario desabilita os campos do formluario se houver
         * algum erro exibe uma mensagem na tela
         */
        if (produtoService.salvarProdutoDAO(produtoModel) > 0) {
            JOptionPane.showMessageDialog(this, "Produto: " + produtoModel.getProDescricao() + " cadastrado com sucesso!", "Atenção", JOptionPane.WARNING_MESSAGE);
            jbSalvar.setText("Salvar");
            carregarProdutos();
            limparCampos();
            habilitarDesabilitarCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar o produto", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Metódo para alterar e salvar o cliente. Esse metódo é invocado no botao
     * salvar após a verificação da variavel global alterarSalvar
     */
    private void alterarProduto() {
        // altera e salva o  produto no BD e atualiza a tabela
        produtoModel.setProDescricao(jtfDescricaoProduto.getText().toUpperCase());
        produtoModel.setProValor(formatador.converterVirgulaParaPonto(jtfPreco.getText()));
        produtoModel.setProDataEntrada(dpDataEntrada.getText());
        produtoModel.setProObservacao(jtfObservacao.getText().toUpperCase());

        /**
         * chama o metodo de alterar no controller salva o produto altera o nome
         * do botao salvar recarrega os produtos exibidos na tabela limpa os
         * campos do formulario desabilita os campos do formluario se houver
         * algum erro exibe uma mensagem na tela
         */
        if (produtoService.atualizarProdutoDAO(produtoModel)) {
            JOptionPane.showMessageDialog(this, "Produto alterado com sucesso!", "Atenção", JOptionPane.WARNING_MESSAGE);
            carregarProdutos();
            limparCampos();
            habilitarDesabilitarCampos(false);
            this.jbSalvar.setText("Salvar");
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar o produto!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * habilitar ou desabilitar os campos do formulário
     *
     * @param condicao
     */
    private void habilitarDesabilitarCampos(boolean condicao) {
        jtfPreco.setEnabled(condicao);
        jtfDescricaoProduto.setEnabled(condicao);
        jtfObservacao.setEnabled(condicao);
        dpDataEntrada.setEnabled(condicao);
        jbSalvar.setEnabled(condicao);
    }

    /**
     * limpar campos
     */
    private void limparCampos() {
        produtoModel = produtoService.retornarUltimoCodigoDAO();
        int cod = produtoModel.getQtdeProdutos() + 1;
        jlCodigoProduto.setText("");
        jtfDescricaoProduto.setText("");
        jtfPreco.setText("");
        jtfObservacao.setText("");
        dpDataEntrada.setText(getDateUtil.getDateTime());
        jtfDescricaoProduto.requestFocus();
        jlCodigoProduto.setText(String.valueOf(cod));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dpDataEntrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlCodigoProduto;
    private javax.swing.JTable jtProduto;
    private javax.swing.JTextField jtfDescricaoProduto;
    private javax.swing.JTextArea jtfObservacao;
    private javax.swing.JTextField jtfPreco;
    // End of variables declaration//GEN-END:variables

}
