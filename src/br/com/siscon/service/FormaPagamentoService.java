package siscon.service;

import siscon.model.FormaPagamentoModel;
import siscon.model.dao.DAOFormaPagamento;
import java.util.ArrayList;

/**
 *
 * @author Jose Luiz
 */
public class FormaPagamentoService {

    private final DAOFormaPagamento daoFormaPagamento = new DAOFormaPagamento();

    /**
     * grava FormaPagamento
     *
     * @param pModelFormaPagamento return int
     * @return
     */
    public int salvarFormaPagamentoController(FormaPagamentoModel pModelFormaPagamento) {
        return this.daoFormaPagamento.salvarFormaPagamentoDAO(pModelFormaPagamento);
    }

    /**
     * recupera FormaPagamento
     *
     * @param pIdForPag return ModelFormaPagamento
     * @return
     */
    public FormaPagamentoModel getFormaPagamentoController(int pIdForPag) {
        return this.daoFormaPagamento.getFormaPagamentoDAO(pIdForPag);
    }

    /**
     * recupera uma lista deFormaPagamento
     *
     * @return
     */
    public ArrayList<FormaPagamentoModel> getListaFormaPagamentoController() {
        return this.daoFormaPagamento.getListaFormaPagamentoDAO();
    }

    /**
     * atualiza FormaPagamento
     *
     * @param pModelFormaPagamento return boolean
     * @return
     */
    public boolean atualizarFormaPagamentoController(FormaPagamentoModel pModelFormaPagamento) {
        return this.daoFormaPagamento.atualizarFormaPagamentoDAO(pModelFormaPagamento);
    }

    /**
     * exclui FormaPagamento
     *
     * @param pIdForPag return boolean
     * @return
     */
    public boolean excluirFormaPagamentoController(int pIdForPag) {
        return this.daoFormaPagamento.excluirFormaPagamentoDAO(pIdForPag);
    }
}
