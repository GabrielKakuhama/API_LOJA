package com.loja;

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
}
