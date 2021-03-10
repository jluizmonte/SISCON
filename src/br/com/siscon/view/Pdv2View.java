package br.com.siscon.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import br.com.siscon.model.ClienteModel;
import br.com.siscon.model.ProdutoModel;
import br.com.siscon.model.SessaoUsuarioModel;
import br.com.siscon.model.UsuarioModel;
import br.com.siscon.model.VendasModel;
import br.com.siscon.model.VendasProdutosModel;
import br.com.siscon.service.ClienteService;
import br.com.siscon.service.ProdutoService;
import br.com.siscon.service.UsuarioService;
import br.com.siscon.service.VendasProdutosService;
import br.com.siscon.service.VendasService;
import br.com.siscon.util.Datas;
import br.com.siscon.util.Mascaras;

/**
 *
 * @author joseluiz
 */
public class Pdv2View extends javax.swing.JFrame {

    ProdutoModel produtoModel = new ProdutoModel();
    ProdutoService produtoService = new ProdutoService();
    ArrayList<ProdutoModel> listaProdutoModel = new ArrayList<>();

    UsuarioModel usuarioModel = new UsuarioModel();
    UsuarioService usuarioService = new UsuarioService();
    ArrayList<UsuarioModel> listaUsuarioModel = new ArrayList<>();

    ClienteModel clienteModel = new ClienteModel();
    ClienteService clienteService = new ClienteService();
    ArrayList<ClienteModel> listaClienteModel = new ArrayList<>();

    VendasProdutosModel vendasProdutosModel = new VendasProdutosModel();
    VendasProdutosService vendasProdutosService = new VendasProdutosService();
    ArrayList<VendasProdutosModel> listaVendasProdutosModel = new ArrayList<>();

    VendasModel vendasModel = new VendasModel();
    VendasService vendasService = new VendasService();
    ArrayList<VendasModel> listaVendasModels = new ArrayList<>();

    SessaoUsuarioModel sessaoUsuarioModel = new SessaoUsuarioModel();
    int quantidade;
    int codigo;
    String produtoPesquisado;
    Datas datas = new Datas();
    Mascaras mascaras = new Mascaras();
    private PagamentoPdvView viewPagamentoPDV;

    /**
     * Creates new form PDV
     */
    public Pdv2View() {
        URL caminhoImagem = this.getClass().getResource("/br/com/siscon/imagens/buttons/pdv.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem);
        setIconImage(iconeTitulo);
        setExtendedState(JFrame.MAXIMIZED_BOTH); //seta o tamanho da janela (maximizado) ao iniciar
        this.setUndecorated(true);
        initComponents();
        quantidade = 1;
        setarOperador();
        limparCampos();
        this.setTitle("PDV - SISCON");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel6 = new java.awt.Panel();
        panel2 = new java.awt.Panel();
        jLabel7 = new javax.swing.JLabel();
        jtfValorBruto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfQuantidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfValorRecebido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfValorPagar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jlFormaPagamento = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtfDesconto = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProdutos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlOperador = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlStatus = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiExcluir = new javax.swing.JMenuItem();
        jmiAlteraQuantidade = new javax.swing.JMenuItem();
        jmiFinalizaVenda = new javax.swing.JMenuItem();
        jmiPesquisaProdutos = new javax.swing.JMenuItem();
        jmiCancelar = new javax.swing.JMenuItem();
        jmiFecharCaixa = new javax.swing.JMenuItem();
        jmiInserirProduto = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 112, 192));

        jPanel1.setBackground(new java.awt.Color(0, 112, 192));

        panel6.setBackground(new java.awt.Color(0, 112, 192));

        panel2.setBackground(new java.awt.Color(0, 112, 192));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("VALOR BRUTO");

        jtfValorBruto.setEditable(false);
        jtfValorBruto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfValorBruto.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtfValorBruto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorBrutoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("QUANTIDADE");

        jtfQuantidade.setEditable(false);
        jtfQuantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfQuantidade.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("VALOR RECEBIDO");

        jtfValorRecebido.setEditable(false);
        jtfValorRecebido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfValorRecebido.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("VALOR A PAGAR");

        jtfValorPagar.setEditable(false);
        jtfValorPagar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfValorPagar.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtfValorPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorPagarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("FORMA PAGAMENTO");

        jlFormaPagamento.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jlFormaPagamento.setForeground(new java.awt.Color(255, 0, 0));
        jlFormaPagamento.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlFormaPagamento.setText("1- À VISTA");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DESCONTO");

        jtfDesconto.setEditable(false);
        jtfDesconto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jLabel5))
                        .addComponent(jtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel7))
                        .addComponent(jtfValorBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(40, 40, 40))
                        .addComponent(jtfValorRecebido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfValorPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel8)))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jlFormaPagamento)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(15, 15, 15)
                .addComponent(jtfValorBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(jlFormaPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfValorRecebido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfValorPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setBackground(new java.awt.Color(0, 112, 192));
        jScrollPane1.setForeground(new java.awt.Color(0, 112, 192));

        jtProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Código", "Nome", "Quantidade", "Valor Unit.", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProdutos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtProdutos);

        jPanel2.setBackground(new java.awt.Color(0, 112, 192));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Caixa:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("01");

        jlOperador.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlOperador.setForeground(new java.awt.Color(255, 0, 0));
        jlOperador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlOperador.setText("1- ADMINISTRADOR");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Status:");

        jlStatus.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jlStatus.setForeground(new java.awt.Color(255, 0, 0));
        jlStatus.setText("OCUPADO");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Operador:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlOperador)
                .addGap(166, 166, 166)
                .addComponent(jLabel3)
                .addGap(65, 65, 65)
                .addComponent(jlStatus)
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jlStatus)
                        .addComponent(jlOperador)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE))
            .addComponent(panel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 112, 192));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("F3 EXCLUIR PRODUTO F4 ALTERAR QUANTIDADE F5 FINALIZAR VENDA F6 PESQUISAR PRODUTOS F7 CANCELAR F8 FECHAR CAIXA F9 INSERIR PRODUTO F2 SAIR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 1172, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel14)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(47, 87, 151));
        jMenuBar1.setForeground(new java.awt.Color(47, 87, 151));
        jMenuBar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jMenu1.setText("Arquivo");

        jmiSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jMenu1.add(jmiSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Comandos");

        jmiExcluir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jmiExcluir.setText("Excluir Produto");
        jmiExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExcluirActionPerformed(evt);
            }
        });
        jMenu2.add(jmiExcluir);

        jmiAlteraQuantidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jmiAlteraQuantidade.setText("Alterar Quantidade");
        jmiAlteraQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlteraQuantidadeActionPerformed(evt);
            }
        });
        jMenu2.add(jmiAlteraQuantidade);

        jmiFinalizaVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jmiFinalizaVenda.setText("Finalizar Venda");
        jmiFinalizaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFinalizaVendaActionPerformed(evt);
            }
        });
        jMenu2.add(jmiFinalizaVenda);

        jmiPesquisaProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jmiPesquisaProdutos.setText("Pesquisar Produtos");
        jmiPesquisaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPesquisaProdutosActionPerformed(evt);
            }
        });
        jMenu2.add(jmiPesquisaProdutos);

        jmiCancelar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        jmiCancelar.setText("Cancelar");
        jmiCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCancelarActionPerformed(evt);
            }
        });
        jMenu2.add(jmiCancelar);

        jmiFecharCaixa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        jmiFecharCaixa.setText("Fechar Caixa");
        jmiFecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFecharCaixaActionPerformed(evt);
            }
        });
        jMenu2.add(jmiFecharCaixa);

        jmiInserirProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        jmiInserirProduto.setText("Inserir Produto");
        jmiInserirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiInserirProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(jmiInserirProduto);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ajuda");

        jmiSobre.setText("Sobre");
        jmiSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSobreActionPerformed(evt);
            }
        });
        jMenu3.add(jmiSobre);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfValorBrutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorBrutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfValorBrutoActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jmiExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExcluirActionPerformed
        int quantLinha = jtProdutos.getRowCount();
        if (quantLinha < 1) {
            JOptionPane.showMessageDialog(this, "Não existe itens para excluir", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) jtProdutos.getModel();
            int linha = Integer.parseInt(JOptionPane.showInputDialog(this, "Informe o item que deseje excluir"));
            modelo.removeRow(linha - 1);
            jtfValorBruto.setText(String.valueOf(somaValorTotal()));
            for (int i = 0; i < quantLinha; i++) {
                modelo.setValueAt(i + 1, i, 0);
            }
        }
    }//GEN-LAST:event_jmiExcluirActionPerformed

    private void jmiAlteraQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlteraQuantidadeActionPerformed
        quantidade = Integer.parseInt(JOptionPane.showInputDialog(this, "Informe a quantidade!"));
    }//GEN-LAST:event_jmiAlteraQuantidadeActionPerformed

    private void jmiFinalizaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFinalizaVendaActionPerformed

        try {
            this.viewPagamentoPDV = new PagamentoPdvView(this, true);
            viewPagamentoPDV.setValorTotal(Float.parseFloat(jtfValorBruto.getText()));
            viewPagamentoPDV.setTextFieldValorTotal();
            viewPagamentoPDV.setVisible(true);
            if (viewPagamentoPDV.isFinalizarVenda()) {
                salvarVenda();
            } else {
                limparCampos();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Você deve incluir um produto!");
        }
    }//GEN-LAST:event_jmiFinalizaVendaActionPerformed

    private void jmiPesquisaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPesquisaProdutosActionPerformed
        PesquisaPdvView viewPesquisaPDV = new PesquisaPdvView(this, false);
        viewPesquisaPDV.setLocationRelativeTo(null);
        viewPesquisaPDV.setVisible(true);
        viewPesquisaPDV.setModal(true);
    }//GEN-LAST:event_jmiPesquisaProdutosActionPerformed

    private void jmiCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCancelarActionPerformed
        // TODO add your handling code here:
        limparCampos();
        jlStatus.setText("CAIXA LIVRE");
        jlStatus.setForeground(Color.green);
    }//GEN-LAST:event_jmiCancelarActionPerformed

    private void jmiFecharCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFecharCaixaActionPerformed
        PausaPdvView viewPausaPDV = new PausaPdvView(this, false);
        viewPausaPDV.setLocationRelativeTo(null);
        viewPausaPDV.setVisible(true);
        viewPausaPDV.setModal(true);
    }//GEN-LAST:event_jmiFecharCaixaActionPerformed

    private void jmiInserirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiInserirProdutoActionPerformed
        codigo = Integer.parseInt(JOptionPane.showInputDialog(this, "Informe o codigo do produto!"));
        pegarConteudo();
    }//GEN-LAST:event_jmiInserirProdutoActionPerformed

    private void jmiSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSobreActionPerformed
        // TODO add your handling code here:
        PdvAboutView aboutView = new PdvAboutView();
        aboutView.setVisible(true);
    }//GEN-LAST:event_jmiSobreActionPerformed

    private void jtfValorPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfValorPagarActionPerformed

    private void pegarConteudo() {
//        jlStatus.setText("OCUPADO");
//        jlStatus.setForeground(Color.red);
//        DefaultTableModel modelo = (DefaultTableModel) jtProdutos.getModel();
//        try {
//            produtoModel = produtoService.getProdutoDAO(codigo);
//            modelo.addRow(new Object[]{
//                modelo.getRowCount() + 1,
//                produtoModel.getProCodigoProduto(),
//                produtoModel.getProDescricao(),
//                quantidade,
//                produtoModel.getProValor(),
//                produtoModel.getProValorUnitario() * quantidade
//            });
//            jtfValorBruto.setText(String.valueOf(somaValorTotal()));
//            jtfQuantidade.setText(String.valueOf(quantidade));
//            quantidade = 1;
//        } catch (NumberFormatException e) {
//            //JOptionPane.showMessageDialog(this, "Informe neste campo apenas números", "Erro", JOptionPane.ERROR_MESSAGE);
//        }
    }

    private float somaValorTotal() {
        float soma = 0, valor = 0;
        int cont = jtProdutos.getRowCount();
        for (int i = 0; i < cont; i++) {
            valor = Float.parseFloat(String.valueOf(jtProdutos.getValueAt(i, 5)));
            soma += valor;
        }
        return soma;
    }

    private void setarOperador() {
        jlOperador.setText(SessaoUsuarioModel.codigoUsuario + "- " + SessaoUsuarioModel.nomeUsuario);
    }

    private void salvarVenda() {
        int cont = 0;
        int codigoProduto = 0;
        int codigoVenda = 0;

        vendasModel = new VendasModel();
        vendasModel.setCliente(1);
        try {
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy");
            LocalDateTime timepoint = LocalDateTime.now();
            vendasModel.setVenDataVenda(timepoint.format(fmt));
        } catch (Exception ex) {
            Logger.getLogger(Pdv1View.class.getName()).log(Level.SEVERE, null, ex);
        }
        vendasModel.setVenValorBruto(Double.parseDouble(jtfValorBruto.getText()));
        /*
         provavel criação de frame para desconto. Alterar de 0 para a nova regra de negocio
         */
        vendasModel.setVenDesconto(viewPagamentoPDV.getDesconto());
        /**
         * se um frame novo for criado para o desconto, aqui ficara esse
         * jtfValorTotal - desconto
         */
        vendasModel.setVenValorLiquido(viewPagamentoPDV.getValorTotal());
        vendasModel.setVenFormaPagamento(viewPagamentoPDV.getPagamento());
        vendasModel.setVenParcelas(viewPagamentoPDV.getParcelasPagamento());
        codigoVenda = vendasService.salvarVendasDAO(vendasModel);

        cont = jtProdutos.getRowCount();
        for (int i = 0; i < cont; i++) {
            produtoModel = new ProdutoModel();
            vendasProdutosModel = new VendasProdutosModel();
            codigoProduto = (int) jtProdutos.getValueAt(i, 1);
            vendasProdutosModel = new VendasProdutosModel();
            produtoModel = new ProdutoModel();
            vendasProdutosModel.setProduto(codigoProduto);
            vendasProdutosModel.setVendas(codigoVenda);
            vendasProdutosModel.setVendasProValor((double) jtProdutos.getValueAt(i, 4));
            vendasProdutosModel.setVenProQuantidade(Integer.parseInt(jtProdutos.getValueAt(i, 3).toString()));

            //produto
            produtoModel.setProCodigoProduto(codigoProduto);
//            produtoModel.setProQuantidadeEstoque(produtoService.getProdutoDAO(codigoProduto).getProQuantidadeEstoque() - Integer.parseInt(jtProdutos.getValueAt(i, 3).toString()));
            listaVendasProdutosModel.add(vendasProdutosModel);
            listaProdutoModel.add(produtoModel);
        }
        if (vendasProdutosService.salvarVendasProdutosDAO(listaVendasProdutosModel)) {
//            produtoService.alterarEstoqueProdutosDAO(listaProdutoModel);
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao salvar os produtos da venda!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limparCampos() {
        jtfValorBruto.setText("");
        jtfQuantidade.setText("");
        jtfValorPagar.setText("");
        jtfValorRecebido.setText("");
        jlFormaPagamento.setText("1- A VISTA");

        DefaultTableModel modelo = (DefaultTableModel) jtProdutos.getModel();
        modelo.setNumRows(0);
        jlStatus.setText("CAIXA LIVRE");
        jlStatus.setForeground(Color.GREEN);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlFormaPagamento;
    private javax.swing.JLabel jlOperador;
    private javax.swing.JLabel jlStatus;
    private javax.swing.JMenuItem jmiAlteraQuantidade;
    private javax.swing.JMenuItem jmiCancelar;
    private javax.swing.JMenuItem jmiExcluir;
    private javax.swing.JMenuItem jmiFecharCaixa;
    private javax.swing.JMenuItem jmiFinalizaVenda;
    private javax.swing.JMenuItem jmiInserirProduto;
    private javax.swing.JMenuItem jmiPesquisaProdutos;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JMenuItem jmiSobre;
    private javax.swing.JTable jtProdutos;
    private javax.swing.JTextField jtfDesconto;
    private javax.swing.JTextField jtfQuantidade;
    private javax.swing.JTextField jtfValorBruto;
    private javax.swing.JTextField jtfValorPagar;
    private javax.swing.JTextField jtfValorRecebido;
    private java.awt.Panel panel2;
    private java.awt.Panel panel6;
    // End of variables declaration//GEN-END:variables
}
