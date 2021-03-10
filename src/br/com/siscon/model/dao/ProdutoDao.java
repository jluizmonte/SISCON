package br.com.siscon.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import br.com.siscon.connection.ConexaoMySql;
import br.com.siscon.model.ProdutoModel;

/**
 *
 * @author jluiz
 */
public class ProdutoDao extends ConexaoMySql implements IProdutoDao {

    /**
     * grava Produto
     *
     * @param pProdutoModel return int
     * @return
     */
    @Override
    public int salvarProdutoDAO(ProdutoModel pProdutoModel) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_produto ("
                    + "pro_descricao,"
                    + "pro_valor,"
                    + "pro_data_entrada,"
                    + "pro_observacao"
                    + ") VALUES ("
                    + "'" + pProdutoModel.getProDescricao() + "',"
                    + "'" + pProdutoModel.getProValor() + "',"
                    + "'" + pProdutoModel.getProDataEntrada() + "',"
                    + "'" + pProdutoModel.getProObservacao() + "'"
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
     * recupera Produto
     *
     * @param pIdProduto return ModelProduto
     * @return
     */
    @Override
    public ProdutoModel getProdutoDAO(int pIdProduto) {
        ProdutoModel produtoModel = new ProdutoModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT * FROM tbl_produto"
                    + " WHERE"
                    + " pro_codigo_produto = '" + pIdProduto + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                produtoModel.setProCodigoProduto(this.getResultSet().getInt(1));
                produtoModel.setProDescricao(this.getResultSet().getString(2));
                produtoModel.setProValor(this.getResultSet().getDouble(3));
                produtoModel.setProDataEntrada(this.getResultSet().getString(4));
                produtoModel.setProObservacao(this.getResultSet().getString(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return produtoModel;
    }

    /**
     * recupera uma lista de Produto return ArrayList
     *
     * @return
     */
    @Override
    public ArrayList<ProdutoModel> getListaProdutoDAO() {
        ArrayList<ProdutoModel> listamodelProduto = new ArrayList();
        ProdutoModel produtoModel = new ProdutoModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT * FROM tbl_produto;"
            );

            while (this.getResultSet().next()) {
                produtoModel = new ProdutoModel();
                produtoModel.setProCodigoProduto(this.getResultSet().getInt(1));
                produtoModel.setProDescricao(this.getResultSet().getString(2));
                produtoModel.setProValor(this.getResultSet().getDouble(3));
                produtoModel.setProDataEntrada(this.getResultSet().getString(4));
                produtoModel.setProObservacao(this.getResultSet().getString(5));
                listamodelProduto.add(produtoModel);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelProduto;
    }

    /**
     * atualiza Produto
     *
     * @param pProdutoModel return boolean
     * @return
     */
    @Override
    public boolean atualizarProdutoDAO(ProdutoModel pProdutoModel) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_produto SET "
                    + "pro_codigo_produto = '" + pProdutoModel.getProCodigoProduto() + "',"
                    + "pro_descricao = '" + pProdutoModel.getProDescricao() + "',"
                    + "pro_valor = '" + pProdutoModel.getProValor() + "',"
                    + "pro_data_entrada = '" + pProdutoModel.getProDataEntrada() + "',"
                    + "pro_observacao = '" + pProdutoModel.getProObservacao() + "'"
                    + " WHERE "
                    + "pro_codigo_produto = '" + pProdutoModel.getProCodigoProduto() + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui Produto
     *
     * @param pIdProduto return boolean
     * @return
     */
    @Override
    public boolean excluirProdutoDAO(int pIdProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_produto "
                    + " WHERE "
                    + "pro_codigo_produto = '" + pIdProduto + "'"
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
     * retornar um produto pelo nome
     *
     * @param pNomeProduto
     * @return modelproduto
     */
    @Override
    public ProdutoModel retornarProdutoDAO(String pNomeProduto) {
        ProdutoModel produtoModel = new ProdutoModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_produto"
                    + " WHERE"
                    + " pro_descricao = '" + pNomeProduto + "'"
                    + ";");
            while (this.getResultSet().next()) {
                produtoModel = new ProdutoModel();
                produtoModel.setProCodigoProduto(this.getResultSet().getInt(1));
                produtoModel.setProDescricao(this.getResultSet().getString(2));
                produtoModel.setProValor(this.getResultSet().getDouble(3));
                produtoModel.setProDataEntrada(this.getResultSet().getString(4));
                produtoModel.setProObservacao(this.getResultSet().getString(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return produtoModel;
    }

    /**
     * Filtra produtos pela quantidade em estoque
     *
     * @param pEstoqueProduto
     * @return
     */
    @Override
    public ProdutoModel filtrarEstoqueProdutosDAO(String pEstoqueProduto) {
        ProdutoModel produtoModel = new ProdutoModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_produto" + " WHERE pro_quantidade_estoque = '" + pEstoqueProduto + "';");
            while (this.getResultSet().next()) {
                produtoModel = new ProdutoModel();
                produtoModel.setProCodigoProduto(this.getResultSet().getInt(1));
                produtoModel.setProDescricao(this.getResultSet().getString(2));
                produtoModel.setProValor(this.getResultSet().getDouble(3));
                produtoModel.setProDataEntrada(this.getResultSet().getString(4));
                produtoModel.setProObservacao(this.getResultSet().getString(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return produtoModel;
    }

    /**
     * Filtra produtos pelo último ID do produto
     *
     * @return
     */
    @Override
    public ProdutoModel retornarUltimoCodigoDAO() {
        ProdutoModel produtoModel = new ProdutoModel();
        try {
            this.conectar();
            this.executarSQL("SELECT COUNT(pro_codigo_produto) FROM tbl_produto;");
            while (this.getResultSet().next()) {
                produtoModel = new ProdutoModel();
                produtoModel.setQtdeProdutos(this.getResultSet().getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return produtoModel;
    }
}
