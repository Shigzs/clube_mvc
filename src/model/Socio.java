package model;

import java.util.Set;

public class Socio{
    private Long cartao_socio;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private Categoria categoria;
    private Set<Dependente> dependentes;
    private Set<Mensalidade> mensalidades;

    public Long regSocio(){
        return cartao_socio;
    }
    
    public String conSocio(){
        String dados = (
            getNome() + 
            "-" + 
            getTelefone() +
            "-" +
            getEmail() +
            "-" +
            getEndereco()
        );
        return dados;
    }

    
    public Long getCartao_socio() {
        return cartao_socio;
    }

    public Set<Dependente> getDependentesSet() {
        return dependentes;
    }

    public void addDependentes(Dependente dependente){
        this.dependentes.add(dependente);
    }

    public Set<Mensalidade> getMensalidadesSet() {
        return mensalidades;
    }

    public void addMensalidades(Mensalidade mensalidade){
        this.mensalidades.add(mensalidade);
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setCartao_socio(Long cartao_socio) {
        this.cartao_socio = cartao_socio;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    
}