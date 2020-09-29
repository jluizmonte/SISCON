package br.com.siscon.model.dao;

import java.util.ArrayList;
import br.com.siscon.model.FornecedorModel;

/**
 *
 * @author jluiz
 */
public interface IFornecedorDao {

    public int salvarFornecedorDAO(FornecedorModel pFornecedorModel);

    public FornecedorModel getFornecedorDAO(int pIdFornecedor);

    public FornecedorModel getFornecedorDAO(String pNomeFornecedor);

    public ArrayList<FornecedorModel> getListaFornecedorDAO();

    public boolean atualizarFornecedorDAO(FornecedorModel pFornecedorModel);

    public boolean excluirFornecedorDAO(int pIdFornecedor);
}
