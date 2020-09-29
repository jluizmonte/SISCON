package siscon.util;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joseluiz
 */
public class AbrirRelatorio {

    ObterInfoSistema info = new ObterInfoSistema();
    static String diretorioUsuario;
    static String diretorioPadrao = System.getProperty("user.home");

    public void abrirRelatorioFX() throws IOException {
        if (info.getNomeSistema().equals("Windows 7")
                || info.getNomeSistema().equals("Windows 8")
                || info.getNomeSistema().equals("Windows 8.1")
                || info.getNomeSistema().equals("Windows 10")) {
            diretorioUsuario = "C:/Vendas/NSoft";
            relatorioFXWindows();
        } else {
            diretorioUsuario = diretorioPadrao + "/Vendas/NSoft";
            relatorioFXLinux();
        }
        File diretorio = new File(diretorioUsuario);
        diretorio.mkdir();
        if (!diretorio.exists()) {
            diretorio.createNewFile();
        }
    }

    public void relatorioFXWindows() {
        Runtime rp = Runtime.getRuntime();
        try {
            rp.exec("/home/joseluiz/NetBeansProjects/SISCONfx/dist/sis.sh");
        } catch (IOException ex) {
        }

    }

    public void relatorioFXLinux() {
        Runtime rp = Runtime.getRuntime();
        try {
            rp.exec("/home/joseluiz/NetBeansProjects/SISCONfx/dist/sis.exe");
        } catch (IOException ex) {
        }

    }
}
