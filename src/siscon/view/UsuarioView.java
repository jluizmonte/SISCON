package siscon.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import siscon.model.UsuarioModel;
import siscon.service.UsuarioService;

/**
 *
 * @author joseluiz
 */
public class UsuarioView extends javax.swing.JInternalFrame {

    UsuarioService usuarioService = new UsuarioService();
    UsuarioModel usuarioModel = new UsuarioModel();
    ArrayList<UsuarioModel> listaModelUsuarios = new ArrayList<>();
    String alterarSalvar;

    /**
     * Creates new form Usuario
     */
    public UsuarioView() {
        initComponents();
        carregarUsuarios(); //carrega na tabela os usuarios já cadastrados
        habilitarDesabilitarCampos(false); //desabilita o formulário
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfLogin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtUsuario = new javax.swing.JTable();
        jbCancelar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jtfSenha = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Usuário");

        jPanel1.setBackground(new java.awt.Color(47, 79, 79));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Código:");

        jtfCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfCodigo.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");

        jtfNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login:");

        jtfLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Senha:");

        jtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Login"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtUsuario.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtUsuario);

        jbCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siscon/imagens/Actions18x18/cancelar/icons8-cancelar-2-24.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.setToolTipText("Cancelar Usuário");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siscon/imagens/Actions18x18/excluir/icons8-lixo-24.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.setToolTipText("Excluir Usuário");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbAlterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siscon/imagens/Actions18x18/alterar/icons8-crie-um-novo-24.png"))); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.setToolTipText("Alterar Usuário");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siscon/imagens/Actions18x18/salvar/icons8-salvar-24.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.setToolTipText("Salvar Usuário");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbNovo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siscon/imagens/Actions18x18/novo/icons8-adicionar-arquivo-24.png"))); // NOI18N
        jbNovo.setText("Novo");
        jbNovo.setToolTipText("Novo Usuário");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jtfSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jbCancelar)
                            .addGap(2, 2, 2)
                            .addComponent(jbExcluir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbNovo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbAlterar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbSalvar))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addGap(9, 9, 9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jtfNome)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbExcluir)
                    .addComponent(jbAlterar)
                    .addComponent(jbSalvar)
                    .addComponent(jbNovo))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        /**
         * desabilita os campos altera o nome do botao slavar limpa os campos do
         * formulario
         */
        habilitarDesabilitarCampos(false);
        jbSalvar.setText("Salvar");
        limparCampos();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // TODO add your handling code here:
        int linha = jtUsuario.getSelectedRow();
        int codigoUsuario = (int) jtUsuario.getValueAt(linha, 0);
        //menu de opções para o usuario confirmar a exclusão
        Object[] opcoes = {"Sim", "Não"};
        Object resposta;
        resposta = JOptionPane.showInputDialog(null,
                "Deseja excluir o usuário?",
                "Excluir",
                JOptionPane.OK_CANCEL_OPTION,
                null,
                opcoes,
                "Sim");
        if (resposta.equals("Sim")) {
            /**
             * exclui o usuario do banco de dados e atualiza a tabela
             * automaticamete apos excluir altera o nome do botao para salvar
             * atualiza a lista dos usuarios desabilita os campos para um novo
             * cadastro
             */
            if (usuarioService.excluirUsuarioDAO(codigoUsuario)) {
                JOptionPane.showMessageDialog(this, "Usuário excluido com sucesso!", "Atenção", JOptionPane.WARNING_MESSAGE);
                jbSalvar.setText("Salvar");
                carregarUsuarios();
                this.habilitarDesabilitarCampos(false);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir o usuário", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        /**
         * altera a variavel global para alterar altera o nome do botao salvar
         * joga o foco para o campo nome habilita os campos atribui a uma
         * variavel a linha selecionada na tabela atribui a uma variavel o
         * codigo do usuario
         */
        alterarSalvar = "alterar";
        jbSalvar.setText("Alterar");
        jtfNome.requestFocusInWindow();
        habilitarDesabilitarCampos(true);
        int linha = jtUsuario.getSelectedRow();
        int codigo = (int) jtUsuario.getValueAt(linha, 0);
        //colocar os dados do BD na tabela
        usuarioModel = usuarioService.getUsuarioDAO(codigo);
        jtfCodigo.setText(String.valueOf(usuarioModel.getIdUsuario()));
        jtfNome.setText(usuarioModel.getUsuNome().toUpperCase());
        jtfLogin.setText(usuarioModel.getUsuLogin().toUpperCase());
        jtfSenha.setText(usuarioModel.getUsuSenha());
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        // TODO add your handling code here:
        /**
         * verifica a variavel global e chama o metodo correspondente
         */
        if (alterarSalvar.equals("salvar")) {
            this.salvarUsuario();
        } else if (alterarSalvar.equals("alterar")) {
            this.alterarUsuario();
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        // TODO add your handling code here:
        /**
         * limpa os campos habilita os campos seta a variavel salvar joga o foco
         * para o campo nome altera o nome do botão salvar
         */
        limparCampos();
        habilitarDesabilitarCampos(true);
        alterarSalvar = "salvar";
        jtfNome.requestFocusInWindow();
        jbSalvar.setText("Salvar");
    }//GEN-LAST:event_jbNovoActionPerformed

    //carregar usuarios do BD na tabela
    private void carregarUsuarios() {
        /**
         * Array que buscará no BD (atraves do Controller) os dados para serem
         * exibidos na tabela
         */
        listaModelUsuarios = usuarioService.getListaUsuarioDAO();
        DefaultTableModel modelo = (DefaultTableModel) jtUsuario.getModel();
        modelo.setNumRows(0);

        // insere os clientes na tabela
        int cont = listaModelUsuarios.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelUsuarios.get(i).getIdUsuario(),
                listaModelUsuarios.get(i).getUsuNome(),
                listaModelUsuarios.get(i).getUsuLogin(),});
        }
    }

    private void limparCampos() {
        //metodo para limpar o formulário
        jtfCodigo.setText("");
        jtfNome.setText("");
        jtfLogin.setText("");
        jtfSenha.setText("");
    }

    /**
     * Metódo para desativar ou não os campos mediante escolha por uma variavel
     * booleana
     *
     * @param condicao
     */
    private void habilitarDesabilitarCampos(boolean condicao) {
        jtfNome.setEnabled(condicao);
        jtfLogin.setEnabled(condicao);
        jtfSenha.setEnabled(condicao);
        jbSalvar.setEnabled(condicao);
    }

    private void salvarUsuario() {
        // Salva um novo usuário no BD e atualiza a tabela
        usuarioModel.setUsuNome(jtfNome.getText().toUpperCase());
        usuarioModel.setUsuLogin(jtfLogin.getText().toUpperCase());
        usuarioModel.setUsuSenha(String.valueOf(jtfSenha.getText()));

        Object[] opcoes = {"Sim", "Não"};
        Object resposta;
        resposta = JOptionPane.showInputDialog(null,
                "Deseja cadastrar o usuário?",
                "Cadastrar",
                JOptionPane.OK_CANCEL_OPTION,
                null,
                opcoes,
                "Sim");
        if (resposta.equals("Sim")) {

            /**
             * chama o metodo de salvar no controller salva o usuario altera o
             * nome do botao salvar recarrega os usuarios exibidos na tabela
             * limpa os campos do formulario desabilita os campos do formluario
             * se houver algum erro exibe uma mensagem na tela
             */
            if (usuarioService.salvarUsuarioDAO(usuarioModel) > 0) {
                JOptionPane.showMessageDialog(this, "Usuário: " + usuarioModel.getUsuNome() + " cadastrado com sucesso!", "Atenção", JOptionPane.WARNING_MESSAGE);
                jbSalvar.setText("Salvar");
                carregarUsuarios();
                limparCampos();
                habilitarDesabilitarCampos(false);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar o usuário", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void alterarUsuario() {
        // altera e salva o  usuário no BD e atualiza a tabela
        usuarioModel.setUsuNome(jtfNome.getText());
        usuarioModel.setUsuLogin(jtfLogin.getText());
        usuarioModel.setUsuSenha(jtfSenha.getText());

        Object[] opcoes = {"Sim", "Não"};
        Object resposta;
        resposta = JOptionPane.showInputDialog(null,
                "Deseja alterar o usuário?",
                "Alterar",
                JOptionPane.OK_CANCEL_OPTION,
                null,
                opcoes,
                "Sim");
        if (resposta.equals("Sim")) {

            /**
             * chama o metodo de alterar no controller salva o usuario altera o
             * nome do botao salvar recarrega os produtos exibidos na tabela
             * limpa os campos do formulario desabilita os campos do formluario
             * se houver algum erro exibe uma mensagem na tela
             */
            if (usuarioService.atualizarUsuarioDAO(usuarioModel)) {
                JOptionPane.showMessageDialog(this, "Usuário alterado com sucesso!", "Atenção", JOptionPane.WARNING_MESSAGE);
                carregarUsuarios();
                habilitarDesabilitarCampos(false);
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao alterar o usuário!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTable jtUsuario;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfSenha;
    // End of variables declaration//GEN-END:variables
}
