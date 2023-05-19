package controller;

import model.Mensalidade;
import model.Socio;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class MensalidadeController {
    private Mensalidade mensalidade;

    public String consultarMensalidades(Socio socio) {
        StringBuilder dados = new StringBuilder();
        for (Mensalidade mensalidade : socio.getMensalidadesSet()) {
            dados.append(mensalidade.getData_mensalidade()).append("\n")
                    .append(mensalidade.getValor()).append("\n")
                    .append(mensalidade.getJuros_mensais()).append("\n")
                    .append(mensalidade.getQuitado()).append("\n============================================\n");
        }
        return dados.toString();
    }

    public Double calcularJuros(Date dataMensalidade, Date dataPagamento, Double valor) {
        Double juros = valor;
        long difMilis = dataMensalidade.getTime() - dataPagamento.getTime();
        long diferencaDias = TimeUnit.MILLISECONDS.toDays(difMilis);
        for (int i = 0; i < diferencaDias; i++) {
            juros *= 1.05;
        }
        return juros;
    }

    public boolean quitarMensalidade(Double valor, Double jurosCalculados, Date dataPagamento) {
        if (valor.equals(jurosCalculados)) {
            mensalidade.setValor_pago(valor);
            mensalidade.setData_pagamento(dataPagamento);
            return true;
        } else {
            return false;
        }
    }

    public Date getDataMensalidade() {
        return mensalidade.getData_mensalidade();
    }

    public void setDataMensalidade(Date dataMensalidade) {
        mensalidade.setData_mensalidade(dataMensalidade);
    }

    public Double getValor() {
        return mensalidade.getValor();
    }

    public void setValor(Double valor) {
        mensalidade.setValor(valor);
    }

    public Date getDataPagamento() {
        return mensalidade.getData_pagamento();
    }

    public void setDataPagamento(Date dataPagamento) {
        mensalidade.setData_pagamento(dataPagamento);
    }

    public Double getJurosMensais() {
        return mensalidade.getJuros_mensais();
    }

    public void setJurosMensais(Double jurosMensais) {
        mensalidade.setJuros_mensais(jurosMensais);
    }

    public Double getValorPago() {
        return mensalidade.getValor_pago();
    }

    public void setValorPago(Double valorPago) {
        mensalidade.setValor_pago(valorPago);
    }

    public Boolean getQuitado() {
        return mensalidade.getQuitado();
    }

    public void setQuitado(Boolean quitado) {
        mensalidade.setQuitado(quitado);
    }
}
