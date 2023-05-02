import java.util.ArrayList;
import java.util.List;

public class Mercado {

    private List<Produto> estoque = new ArrayList<Produto>();

    public List<String> listarEstoque(){
        List<String> detalhesProdutos = new ArrayList<String>();
        for(Produto produto : this.estoque){
            detalhesProdutos.add(produto.getDetalhes());
        }
        return detalhesProdutos;
    }

    public void registrarProduto(String nomeProduto, Float preco, String nomeFornecedor, String cidadeFornecedor, String estadoFornecedor){
        Fornecedor fornecedor = FornecedorFactory.getFornecedor(nomeFornecedor, cidadeFornecedor, estadoFornecedor);
        Produto produto = new Produto(nomeProduto, preco, fornecedor);
        estoque.add(produto);
    }
}
