package br.com.siscon.util;

import br.com.siscon.view.Pdv2View;
import br.com.siscon.view.PrincipalView;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author jluiz
 */
public class SISCON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PrincipalView.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        java.awt.EventQueue.invokeLater(() -> {
//            new PrincipalView().setVisible(true);     
//        //  new Pdv2View().setVisible(true);
//        });

        try {
            UIManager.put("Synthetica.window.decoration", Boolean.FALSE);
            try {
                UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel");
               new PrincipalView().setVisible(true);   
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                //      e.printStackTrace();
            }
        } catch (UnsupportedLookAndFeelException erro) {
            //  erro.printStackTrace();
        }
    }
}
