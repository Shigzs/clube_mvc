package view;

import controller.MensalidadeController;
import model.Socio;

import java.util.Date;

public class MensalidadeView {
    private MensalidadeController mensalidadeController;

    public MensalidadeView() {
        mensalidadeController = new MensalidadeController();
    }

    public void consultarMensalidades(Socio socio) {
        String dadosMensalidades = mensalidadeController.consultarMensalidades(socio);
        System.out.println("Mensalidades do sócio:\n" + dadosMensalidades);
    }

    public void calcularJuros(Date dataMensalidade, Date dataPagamento, Double valor) {
        Double jurosCalculados = mensalidadeController.calcularJuros(dataMensalidade, dataPagamento, valor);
        System.out.println("Juros calculados: " + jurosCalculados);
    }

    public void quitarMensalidade(Double valor, Double jurosCalculados, Date dataPagamento) {
        boolean quitado = mensalidadeController.quitarMensalidade(valor, jurosCalculados, dataPagamento);
        if (quitado) {
            System.out.println("Mensalidade quitada com sucesso.");
        } else {
            System.out.println("Valor fornecido não corresponde ao valor com juros calculados. A mensalidade não pôde ser quitada.");
        }
    }
}
