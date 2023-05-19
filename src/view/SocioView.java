package view;

import controller.SocioController;
import model.Dependente;
import model.Mensalidade;
import model.Categoria;

import java.util.Set;

public class SocioView {
    private SocioController socioController;

    public SocioView() {
        socioController = new SocioController();
    }

    public void registrarSocio() {
        Long cartaoSocio = socioController.registrarSocio();
        System.out.println("Sócio registrado com sucesso. Número do cartão do sócio: " + cartaoSocio);
    }

    public void consultarSocio() {
        String informacoesSocio = socioController.consultarSocio();
        System.out.println("Informações do sócio:\n" + informacoesSocio);
    }

    public void adicionarDependente(Dependente dependente) {
        socioController.adicionarDependente(dependente);
        System.out.println("Dependente adicionado ao sócio.");
    }

    public Set<Dependente> obterDependentes() {
        return socioController.obterDependentes();
    }

    public void adicionarMensalidade(Mensalidade mensalidade) {
        socioController.adicionarMensalidade(mensalidade);
        System.out.println("Mensalidade adicionada ao sócio.");
    }

    public Set<Mensalidade> obterMensalidades() {
        return socioController.obterMensalidades();
    }

    public Categoria obterCategoria() {
        return socioController.obterCategoria();
    }

    public void definirCategoria(Categoria categoria) {
        socioController.setCategoria(categoria);
        System.out.println("Categoria do sócio definida.");
    }

    public void definirNumeroCartao(Long numeroCartao) {
        socioController.setCartaoSocio(numeroCartao);
        System.out.println("Número do cartão do sócio definido.");
    }

    public void definirEndereco(String endereco) {
        socioController.setEndereco(endereco);
        System.out.println("Endereço do sócio definido.");
    }

    public void definirTelefone(String telefone) {
        socioController.setTelefone(telefone);
        System.out.println("Telefone do sócio definido.");
    }

    public void definirEmail(String email) {
        socioController.setEmail(email);
        System.out.println("Email do sócio definido.");
    }

    public String obterNomeSocio() {
        return socioController.getNome();
    }
}
