package siscon.model.dao;

import siscon.model.FormaPagamentoModel;
import siscon.connection.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author Jose Luiz
 */
public class DAOFormaPagamento extends ConexaoMySql implements IFormaPagamentoDao {

    /**
     * grava FormaPagamento
     *
     * @param pModelFormaPagamento return int
     * @return
     */
    @Override
    public int salvarFormaPagamentoDAO(FormaPagamentoModel pModelFormaPagamento) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_forma_pagamento ("
                    + "pk_id_for_pag,"
                    + "descricao_for_pag,"
                    + "desconto_for_pag,"
                    + "parcelas_for_pag,"
                    + "situacao_for_pag"
                    + ") VALUES ("
                    + "'" + pModelFormaPagamento.getIdForPag() + "',"
                    + "'" + pModelFormaPagamento.getDescricaoForPag() + "',"
                    + "'" + pModelFormaPagamento.getDescontoForPag() + "',"
                    + "'" + pModelFormaPagamento.getParcelasForPag() + "',"
                    + "'" + pModelFormaPagamento.getSituacaoForPag() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera FormaPagamento
     *
     * @param pIdForPag return ModelFormaPagamento
     * @return
     */
    @Override
    public FormaPagamentoModel getFormaPagamentoDAO(int pIdForPag) {
        FormaPagamentoModel modelFormaPagamento = new FormaPagamentoModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_for_pag,"
                    + "descricao_for_pag,"
                    + "desconto_for_pag,"
                    + "parcelas_for_pag,"
                    + "situacao_for_pag"
                    + " FROM"
                    + " tbl_forma_pagamento"
                    + " WHERE"
                    + " pk_id_for_pag = '" + pIdForPag + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelFormaPagamento.setIdForPag(this.getResultSet().getInt(1));
                modelFormaPagamento.setDescricaoForPag(this.getResultSet().getString(2));
                modelFormaPagamento.setDescontoForPag(this.getResultSet().getFloat(3));
                modelFormaPagamento.setParcelasForPag(this.getResultSet().getInt(4));
                modelFormaPagamento.setSituacaoForPag(this.getResultSet().getInt(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelFormaPagamento;
    }

    /**
     * recupera uma lista de FormaPagamento return ArrayList
     *
     * @return
     */
    @Override
    public ArrayList<FormaPagamentoModel> getListaFormaPagamentoDAO() {
        ArrayList<FormaPagamentoModel> listamodelFormaPagamento = new ArrayList();
        FormaPagamentoModel modelFormaPagamento = new FormaPagamentoModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_for_pag,"
                    + "descricao_for_pag,"
                    + "desconto_for_pag,"
                    + "parcelas_for_pag,"
                    + "situacao_for_pag"
                    + " FROM"
                    + " tbl_forma_pagamento"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelFormaPagamento = new FormaPagamentoModel();
                modelFormaPagamento.setIdForPag(this.getResultSet().getInt(1));
                modelFormaPagamento.setDescricaoForPag(this.getResultSet().getString(2));
                modelFormaPagamento.setDescontoForPag(this.getResultSet().getFloat(3));
                modelFormaPagamento.setParcelasForPag(this.getResultSet().getInt(4));
                modelFormaPagamento.setSituacaoForPag(this.getResultSet().getInt(5));
                listamodelFormaPagamento.add(modelFormaPagamento);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelFormaPagamento;
    }

    /**
     * atualiza FormaPagamento
     *
     * @param pModelFormaPagamento return boolean
     * @return
     */
    @Override
    public boolean atualizarFormaPagamentoDAO(FormaPagamentoModel pModelFormaPagamento) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_forma_pagamento SET "
                    + "pk_id_for_pag = '" + pModelFormaPagamento.getIdForPag() + "',"
                    + "descricao_for_pag = '" + pModelFormaPagamento.getDescricaoForPag() + "',"
                    + "desconto_for_pag = '" + pModelFormaPagamento.getDescontoForPag() + "',"
                    + "parcelas_for_pag = '" + pModelFormaPagamento.getParcelasForPag() + "',"
                    + "situacao_for_pag = '" + pModelFormaPagamento.getSituacaoForPag() + "'"
                    + " WHERE "
                    + "pk_id_for_pag = '" + pModelFormaPagamento.getIdForPag() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui FormaPagamento
     *
     * @param pIdForPag return boolean
     * @return
     */
    @Override
    public boolean excluirFormaPagamentoDAO(int pIdForPag) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_forma_pagamento "
                    + " WHERE "
                    + "pk_id_for_pag = '" + pIdForPag + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
