package siscon.view;

import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;
import java.text.ParseException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Mushrif
 */
public class SplashView extends javax.swing.JFrame {

    public SplashView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        loadingbar = new javax.swing.JProgressBar();
        loadingnum = new javax.swing.JLabel();
        process = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 179, 227));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siscon/imagens/bkgEstoque/logo-controle-estoque.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("SISCON - SISTEMA DE CONTROLE DE ESTOQUE E VENDAS");

        jPanel2.setBackground(new java.awt.Color(0, 179, 227));

        loadingbar.setBackground(new java.awt.Color(51, 51, 51));
        loadingbar.setForeground(new java.awt.Color(51, 0, 255));

        loadingnum.setBackground(new java.awt.Color(0, 0, 0));
        loadingnum.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        loadingnum.setText("99%");

        process.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        process.setText("conectando banco de dados...");
        process.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loadingbar, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loadingnum)
                .addGap(26, 26, 26)
                .addComponent(process)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(loadingnum)
                        .addComponent(process))
                    .addComponent(loadingbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(124, 124, 124))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(741, 373));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        //SYNTHETICA THEME
        try {
            UIManager.put("Synthetica.window.decoration", Boolean.FALSE);
            UIManager.setLookAndFeel(new SyntheticaPlainLookAndFeel());
        } catch (ParseException | UnsupportedLookAndFeelException erro) {
        }

        SplashView Splash = new SplashView();
        Splash.setVisible(true);

        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
            Splash.loadingnum.setText(Integer.toString(i) + "%");
            Splash.loadingbar.setValue(i);
            switch (i) {
                case 10:
                    Splash.process.setText("carregando dll...");
                    break;
                case 20:
                    Splash.process.setText("conectando banco de dados...");
                    break;
                case 30:
                    Splash.process.setText("Finalizando...");
                    break;
                case 80:
                    Splash.process.setText("Efetue o login a seguir...");
                    break;
            }
            if (i == 100) {
                LoginView lg = new LoginView();
                Splash.setVisible(false);
                lg.setVisible(true);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JProgressBar loadingbar;
    public javax.swing.JLabel loadingnum;
    public javax.swing.JLabel process;
    // End of variables declaration//GEN-END:variables
}
