package br.com.siscon.relatorios;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import br.com.siscon.connection.ConexaoMySql;

public class Reporte extends ConexaoMySql {

    private final String reporte;

    public Reporte(String reporte) {
        this.reporte = reporte;
    }

    public void gerarRelatorio() {
        Connection conn = this.conectar();
        try {
            InputStream dir = getClass().getResourceAsStream("/siscon/relatorios/"
                    + this.reporte + ".jrxml");
            JasperReport jr = JasperCompileManager.compileReport(dir);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
            JRViewer test = new JRViewer(jp);
            JFrame frame = new JFrame("Gerador de Relatórios");
            frame.getContentPane().add(test);
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.pack();
            frame.setVisible(true);

        } catch (HeadlessException | JRException ex) {
            System.out.println("Erro ao gerar o relatório " + this.reporte + ": " + ex);
        }
    }

}
