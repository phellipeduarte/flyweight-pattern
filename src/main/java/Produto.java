public class Produto {

    private String nome;
    private Float preco;
    private Fornecedor fornecedor;

    public Produto(String nome, Float preco, Fornecedor fornecedor){
        this.nome = nome;
        this.preco = preco;
        this.fornecedor = fornecedor;
    }

    public String getDetalhes(){
        return "Produto{" +
                "nome=" + this.nome +
                ", preco=R$" + this.preco +
                ", nomeFornecedor=" + fornecedor.getNome() +
                ", cidadeFornecedor=" + fornecedor.getCidade() +
                ", estadoFornecedor=" + fornecedor.getEstado() +
                "}";
    }
}
