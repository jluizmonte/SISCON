package br.com.siscon.model.dao;

import java.util.ArrayList;
import br.com.siscon.model.FormaPagamentoModel;

/**
 *
 * @author joseluiz
 */
public interface IFormaPagamentoDao {

    public int salvarFormaPagamentoDAO(FormaPagamentoModel pModelFormaPagamento);

    public FormaPagamentoModel getFormaPagamentoDAO(int pIdForPag);

    public ArrayList<FormaPagamentoModel> getListaFormaPagamentoDAO();

    public boolean atualizarFormaPagamentoDAO(FormaPagamentoModel pModelFormaPagamento);

    public boolean excluirFormaPagamentoDAO(int pIdForPag);

}
