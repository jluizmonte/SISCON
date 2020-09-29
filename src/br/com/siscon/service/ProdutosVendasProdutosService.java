package br.com.siscon.service;

import java.util.ArrayList;
import br.com.siscon.model.ProdutosVendasProdutosModel;
import br.com.siscon.model.dao.ProdutosVendasProdutosDao;

/**
 *
 * @author joseluiz
 */
public class ProdutosVendasProdutosService {

    ProdutosVendasProdutosDao produtosVendasProdutosDao = new ProdutosVendasProdutosDao();

    public ArrayList<ProdutosVendasProdutosModel> getListaProdutosVendasProdutosDAO(int pCodigoVenda) {
        return produtosVendasProdutosDao.getListaProdutosVendasProdutosDAO(pCodigoVenda);
    }

}
