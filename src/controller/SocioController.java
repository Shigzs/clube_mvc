package controller;

import model.Socio;
import model.Dependente;
import model.Mensalidade;
import model.Categoria;

import java.util.Set;

public class SocioController {
    private Socio socio;

    public SocioController() {
        socio = new Socio();
    }

    public Long registrarSocio() {
        return socio.getCartao_socio();
    }

    public String consultarSocio() {
        return socio.conSocio();
    }

    public void adicionarDependente(Dependente dependente) {
        socio.addDependentes(dependente);
    }

    public Set<Dependente> obterDependentes() {
        return socio.getDependentesSet();
    }

    public void adicionarMensalidade(Mensalidade mensalidade) {
        socio.addMensalidades(mensalidade);
    }

    public Set<Mensalidade> obterMensalidades() {
        return socio.getMensalidadesSet();
    }

    public Categoria obterCategoria() {
        return socio.getCategoria();
    }

    public void setCategoria(Categoria categoria) {
        socio.setCategoria(categoria);
    }

    public void setCartaoSocio(Long cartaoSocio) {
        socio.setCartao_socio(cartaoSocio);
    }

    public String getEndereco() {
        return socio.getEndereco();
    }

    public void setEndereco(String endereco) {
        socio.setEndereco(endereco);
    }

    public String getTelefone() {
        return socio.getTelefone();
    }

    public void setTelefone(String telefone) {
        socio.setTelefone(telefone);
    }

    public String getEmail() {
        return socio.getEmail();
    }

    public void setEmail(String email) {
        socio.setEmail(email);
    }

    public String getNome() {
        return socio.getNome();
    }
}
