package br.com.siscon.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import br.com.siscon.connection.ConexaoMySql;
import br.com.siscon.model.ProdutoModel;
import br.com.siscon.model.ProdutosVendasProdutosModel;
import br.com.siscon.model.VendasProdutosModel;

/**
 *
 * @author Jose Luiz
 */
public class ProdutosVendasProdutosDao extends ConexaoMySql implements IProdutosVendasProdutos {

    @SuppressWarnings("UnusedAssignment")
    @Override
    public ArrayList<ProdutosVendasProdutosModel> getListaProdutosVendasProdutosDAO(int pCodigoVenda) {
        ArrayList<ProdutosVendasProdutosModel> listaModelProdutosVendasProdutos = new ArrayList<>();
        ProdutosVendasProdutosModel modelProdutosVendasProdutos = new ProdutosVendasProdutosModel();
        ProdutoModel produtoModel = new ProdutoModel();
        VendasProdutosModel modelVendasProdutos = new VendasProdutosModel();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + " tbl_produto.pro_codigo_produto,"
                    + " tbl_produto.pro_descricao,"
                    + " tbl_produto.pro_valor,"
                    + " tbl_produto.pro_data_enrtada,"
                    + " tbl_produto.pro_observacao,"
                    + " tbl_vendas_produtos.fk_produto,"
                    + " tbl_vendas_produtos.fk_vendas,"
                    + " tbl_vendas_produtos.pk_id_venda_produto,"
                    + " tbl_vendas_produtos.ven_pro_quantidade,"
                    + " tbl_vendas_produtos.ven_pro_valor "
                    + " FROM tbl_vendas_produtos "
                    + " INNER JOIN tbl_produto ON tbl_produto.pk_id_produto = "
                    + " tbl_vendas_produtos.fk_produto "
                    + " WHERE tbl_vendas_produtos.fk_vendas = '" + pCodigoVenda + "';");

            while (this.getResultSet().next()) {
                modelProdutosVendasProdutos = new ProdutosVendasProdutosModel();
                produtoModel = new ProdutoModel();
                modelVendasProdutos = new VendasProdutosModel();

               produtoModel.setProCodigoProduto(this.getResultSet().getInt(1));
                produtoModel.setProDescricao(this.getResultSet().getString(2));
                produtoModel.setProValor(this.getResultSet().getDouble(3));
                produtoModel.setProDataEntrada(this.getResultSet().getString(4));
                produtoModel.setProObservacao(this.getResultSet().getString(5));

                modelVendasProdutos.setProduto(this.getResultSet().getInt(9));
                modelVendasProdutos.setVendas(this.getResultSet().getInt(10));
                modelVendasProdutos.setIdVendaProduto(this.getResultSet().getInt(11));
                modelVendasProdutos.setVenProQuantidade(this.getResultSet().getInt(12));
                modelVendasProdutos.setVendasProValor(this.getResultSet().getDouble(13));

                modelProdutosVendasProdutos.setModelProdutos(produtoModel);

                modelProdutosVendasProdutos.setModelVendasProdutos(modelVendasProdutos);

                listaModelProdutosVendasProdutos.add(modelProdutosVendasProdutos);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelProdutosVendasProdutos;
    }
}
