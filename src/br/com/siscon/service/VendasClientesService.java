package br.com.siscon.service;

import java.util.ArrayList;
import br.com.siscon.model.VendasClientesModel;
import br.com.siscon.model.dao.VendasClientesDao;

/**
 *
 * @author joseluiz
 */
public class VendasClientesService {

    VendasClientesDao vendasClientesDao = new VendasClientesDao();

    public ArrayList<VendasClientesModel> getListaVendasClienteDAO() {
        return vendasClientesDao.getListaVendasClienteDAO();
    }

}
