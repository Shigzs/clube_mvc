package view;

import controller.DependenteController;

public class DependenteView {
    private DependenteController dependenteController;

    public DependenteView(String nome, String parentesco) {
        dependenteController = new DependenteController(nome, parentesco);
    }

    public void registrarDependente(String nome, String parentesco) {
        Long cartaoDependente = dependenteController.registrarDependente(nome, parentesco);
        System.out.println("Dependente registrado com sucesso. Número do cartão do dependente: " + cartaoDependente);
    }

    public void exibirInformacoesDependente() {
        String nome = dependenteController.getNome();
        String parentesco = dependenteController.getParentesco();
        System.out.println("Nome do dependente: " + nome);
        System.out.println("Parentesco do dependente: " + parentesco);
    }

    public void alterarEmail(String novoEmail) {
        dependenteController.setEmail(novoEmail);
        System.out.println("Email do dependente alterado para: " + novoEmail);
    }
}
