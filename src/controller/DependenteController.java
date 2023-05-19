package controller;

import model.Dependente;

public class DependenteController {
    private Dependente dependente;

    public DependenteController(String nome, String parentesco) {
        dependente = new Dependente(nome, parentesco);
    }

    public Long registrarDependente(String nome, String parentesco) {
        dependente = new Dependente(nome, parentesco);
        return dependente.getCartao_dependente();
    }

    public Long getCartaoDependente() {
        return dependente.getCartao_dependente();
    }

    public void setCartaoDependente(Long cartaoDependente) {
        dependente.setCartao_dependente(cartaoDependente);
    }

    public String getEmail() {
        return dependente.getEmail();
    }

    public void setEmail(String email) {
        dependente.setEmail(email);
    }

    public String getNome() {
        return dependente.getNome();
    }

    public String getParentesco() {
        return dependente.getParentesco();
    }
}
