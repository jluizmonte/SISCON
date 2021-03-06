package br.com.siscon.model.dao;

import java.util.ArrayList;
import br.com.siscon.model.ProdutoModel;

/**
 *
 * @author jluiz
 */
public interface IProdutoDao {

    public int salvarProdutoDAO(ProdutoModel pProdutoModel);

    public ProdutoModel getProdutoDAO(int pIdProduto);

    public ArrayList<ProdutoModel> getListaProdutoDAO();

    public boolean atualizarProdutoDAO(ProdutoModel pProdutoModel);

    public boolean excluirProdutoDAO(int pIdProduto);

    public ProdutoModel retornarProdutoDAO(String pProdutoNome);

    public ProdutoModel filtrarEstoqueProdutosDAO(String pEstoqueProduto);

    public ProdutoModel retornarUltimoCodigoDAO();

}
