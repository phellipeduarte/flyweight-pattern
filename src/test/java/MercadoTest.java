import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MercadoTest {


    @Test
    void deveRetornarEstoqueDetalhado(){
        Mercado mercado = new Mercado();
        mercado.registrarProduto("Chocolate Lacta", 9.90f, "Oswaldo", "Além Paraíba", "MG");
        mercado.registrarProduto("Chocolate Nestle", 6.90f, "Oswaldo", "Além Paraíba", "MG");
        mercado.registrarProduto("Chocolate Hershey's", 12.90f, "Oswaldo", "Além Paraíba", "MG");
        mercado.registrarProduto("Pão de Queijo", 15.00f, "Luciano", "Juiz de Fora", "MG");

        List<String> saida = Arrays.asList(
                "Produto{nome=Chocolate Lacta, preco=R$9.9, nomeFornecedor=Oswaldo, cidadeFornecedor=Além Paraíba, estadoFornecedor=MG}",
                "Produto{nome=Chocolate Nestle, preco=R$6.9, nomeFornecedor=Oswaldo, cidadeFornecedor=Além Paraíba, estadoFornecedor=MG}",
                "Produto{nome=Chocolate Hershey's, preco=R$12.9, nomeFornecedor=Oswaldo, cidadeFornecedor=Além Paraíba, estadoFornecedor=MG}",
                "Produto{nome=Pão de Queijo, preco=R$15.0, nomeFornecedor=Luciano, cidadeFornecedor=Juiz de Fora, estadoFornecedor=MG}"
        );

        assertEquals(saida, mercado.listarEstoque());
    }

    @Test
    void deveRetornarQuantidadeFornecedores(){
        Mercado mercado = new Mercado();
        mercado.registrarProduto("Chocolate Lacta", 9.90f, "Oswaldo", "Além Paraíba", "MG");
        mercado.registrarProduto("Chocolate Nestle", 6.90f, "Oswaldo", "Além Paraíba", "MG");
        mercado.registrarProduto("Chocolate Hershey's", 12.90f, "Oswaldo", "Além Paraíba", "MG");
        mercado.registrarProduto("Pão de Queijo", 15.00f, "Luciano", "Juiz de Fora", "MG");

        assertEquals(2, FornecedorFactory.getQuantidadeFornecedores());
    }

}
