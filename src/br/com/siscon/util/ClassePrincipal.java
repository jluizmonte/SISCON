package siscon.util;

import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;
import java.text.ParseException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import siscon.view.LoginView;
import siscon.view.Pdv1View;
import siscon.view.SplashView;

/**
 *
 * @author Jose Luiz
 */
public class ClassePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        //SYNTHETICA THEME
//        try {
//            // Configurar se deve aplicar o look a borda do JFrame  
//            //    No caso esta programado para não aplicar (Boolean.FALSE)  
//            UIManager.put("Synthetica.window.decoration", Boolean.FALSE);
//            //          Configura qual Look você quer usar no projeto  
//            UIManager.setLookAndFeel(new SyntheticaPlainLookAndFeel());
//            //     Chama a interface do seu programa  
//            (new SplashView()).setVisible(true);
//        } catch (ParseException | UnsupportedLookAndFeelException erro) {
//            erro.printStackTrace();
//        }

//NIMBUS THEME
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SplashView().setVisible(true);
        });


        //JTATOO THEME
//        try {
//            // select Look and Feel
//            UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
//            // start application
//            new SplashView().setVisible(true);
//        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
//            ex.printStackTrace();
//        }
    }
}
