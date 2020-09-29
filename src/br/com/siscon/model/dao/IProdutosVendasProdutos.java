package br.com.siscon.model.dao;

import java.util.ArrayList;
import br.com.siscon.model.ProdutosVendasProdutosModel;

/**
 *
 * @author joseluiz
 */
public interface IProdutosVendasProdutos {

    public ArrayList<ProdutosVendasProdutosModel> getListaProdutosVendasProdutosDAO(int pCodigoVenda);
}
