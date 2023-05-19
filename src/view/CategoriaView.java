package view;

import controller.CategoriaController;

public class CategoriaView {
    private CategoriaController categoriaController;

    public CategoriaView() {
        categoriaController = new CategoriaController();
    }

    public void exibirDescricao() {
        String descricao = categoriaController.getDescricao();
        System.out.println("Descrição da categoria: " + descricao);
    }

    public void alterarDescricao(String novaDescricao) {
        categoriaController.setDescricao(novaDescricao);
        System.out.println("Descrição da categoria alterada para: " + novaDescricao);
    }
}
