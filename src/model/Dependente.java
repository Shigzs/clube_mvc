package model;
import Util.Util;

public class Dependente {
    private Long cartao_dependente;
    private String nome;
    private String parentesco;
    private String email;

    public Dependente(
        String nome, 
        String parentesco
    ){
        this.nome = nome;
        this.parentesco = parentesco;
        this.cartao_dependente = Util.gerarCartao();
    }

    public Long registrarDependente(String nome, String parentesco){
        Dependente dependente = new Dependente(nome, parentesco);
        return dependente.getCartao_dependente();
    }

    public Long getCartao_dependente() {
        return cartao_dependente;
    }

    public void setCartao_dependente(Long cartao_dependente) {
        this.cartao_dependente = cartao_dependente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getParentesco() {
        return parentesco;
    }

    
}
