package br.com.siscon.model;

/**
 *
 * @author jluiz
 */
public class ProdutoModel {

    private int proCodigoProduto;
    private String proDescricao;
    private Double proValor;
    private String proObservacao;
    private String proDataEntrada;
    private int qtdeProdutos;

    public int getProCodigoProduto() {
        return proCodigoProduto;
    }

    public void setProCodigoProduto(int proCodigoProduto) {
        this.proCodigoProduto = proCodigoProduto;
    }

    public String getProDescricao() {
        return proDescricao;
    }

    public void setProDescricao(String proDescricao) {
        this.proDescricao = proDescricao;
    }

    public Double getProValor() {
        return proValor;
    }

    public void setProValor(Double proValor) {
        this.proValor = proValor;
    }

    public String getProObservacao() {
        return proObservacao;
    }

    public void setProObservacao(String proObservacao) {
        this.proObservacao = proObservacao;
    }

    public String getProDataEntrada() {
        return proDataEntrada;
    }

    public void setProDataEntrada(String proDataEntrada) {
        this.proDataEntrada = proDataEntrada;
    }

    public int getQtdeProdutos() {
        return qtdeProdutos;
    }

    public void setQtdeProdutos(int qtdeProdutos) {
        this.qtdeProdutos = qtdeProdutos;
    }

    @Override
    public String toString() {
        return "ProdutoModel{" + "proCodigoProduto=" + proCodigoProduto + ", proDescricao=" + proDescricao + ", proValor=" + proValor + ", proObservacao=" + proObservacao + ", proDataEntrada=" + proDataEntrada + ", qtdeProdutos=" + qtdeProdutos + '}';
    }
}
