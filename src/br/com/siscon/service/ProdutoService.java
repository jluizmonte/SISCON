package br.com.siscon.service;

import java.util.ArrayList;
import br.com.siscon.model.ProdutoModel;
import br.com.siscon.model.dao.ProdutoDao;

/**
 *
 * @author jluiz
 */
public class ProdutoService {

    ProdutoDao produtoDao = new ProdutoDao();

    public int salvarProdutoDAO(ProdutoModel pProdutoModel) {
        return produtoDao.salvarProdutoDAO(pProdutoModel);
    }

    public ProdutoModel getProdutoDAO(int pIdProduto) {
        return produtoDao.getProdutoDAO(pIdProduto);
    }

    public ArrayList<ProdutoModel> getListaProdutoDAO() {
        return produtoDao.getListaProdutoDAO();
    }

    public boolean atualizarProdutoDAO(ProdutoModel pProdutoModel) {
        return produtoDao.atualizarProdutoDAO(pProdutoModel);
    }

    public boolean excluirProdutoDAO(int pIdProduto) {
        return produtoDao.excluirProdutoDAO(pIdProduto);
    }

    public ProdutoModel retornarProdutoDAO(String pProdutoNome) {
        return produtoDao.retornarProdutoDAO(pProdutoNome);
    }

    public ProdutoModel filtrarEstoqueProdutosDAO(String pEstoqueProduto) {
        return produtoDao.filtrarEstoqueProdutosDAO(pEstoqueProduto);
    }

    public ProdutoModel retornarUltimoCodigoDAO() {
        return produtoDao.retornarUltimoCodigoDAO();
    }

}
