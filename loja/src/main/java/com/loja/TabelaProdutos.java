package com.loja;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

public class TabelaProdutos {
    List<Produto> produtos = new ArrayList<>();

    public TabelaProdutos() {
        Produto caneta = new Produto(1, "Caneta BIC0",
                "Caneta da cor azul" , 1.99);
        Produto borracha = new Produto(2, "Borracha Branca",
                "Borracha Branca Comum", 3.99);
        Produto lápis = new Produto(3, "Lapis Faber Castel" ,
                "Lapis Faber Castel Comum  ", 2.99);

        this.produtos.add(caneta);
        this.produtos.add(borracha);
        this.produtos.add(lápis);
    }
        public List<Produto> getProdutos(){
            return produtos;

    }
public List <Produto> buscarTodosOsProdutos(){
        return this.getProdutos();

}

public Produto buscarProdutoPeloId(int produtoId){
        Produto produtoProcurado = null;
        for (Produto p: this.produtos){
            if(p.getId() == produtoId){
                produtoProcurado = p;
                break;
            }
        }
        return  produtoProcurado;
    }
    public Produto cadastrarNovoProduto(Produto novoProduto){
        int ultimoIndex = this.produtos.size() - 1;
        Produto ultimoProduto = this.produtos.get(ultimoIndex);
        int proximoId = ultimoProduto.getId() + 1;

        novoProduto.setId(proximoId);
        this.produtos.add(novoProduto);
        return novoProduto;
    }

    /**
     * Método que atualiza um produto
     * Primeiro busca o produto a atualizar pelo ID
     * Depois atribui as novas informações:nome, descrição e valor
     * Finalmente salva o produto atualizado
     * @param produtoId
     * @param produtoAtualizar
     */

    public void atualizarProdutos(int produtoId, Produto produtoAtualizar) {
        Produto produtoProcurado = this.buscarProdutoPeloId(produtoId);
        if(produtoProcurado != null) {
            produtoProcurado.setNome(produtoAtualizar.getNome());
            produtoProcurado.setDescricao(produtoAtualizar.getDescricao());
            produtoProcurado.setValorUnitario(produtoAtualizar.getValorUnitario());
        }


    }

    /**
     * Método que remove um produto da lista
     * Utiliza como base o próprio objeto para remover
     *
     * @param produtoRemover
     */

    public void removerProduto(int produtoId) {
        this.produtos.remove(produtoId);
    }


}

