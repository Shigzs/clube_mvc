package controller;

import model.Categoria;

public class CategoriaController {
    private Categoria categoria;

    public CategoriaController() {
        categoria = new Categoria();
    }

    public String getDescricao() {
        return categoria.getDescricao();
    }

    public void setDescricao(String descricao) {
        categoria.setDescricao(descricao);
    }
}
