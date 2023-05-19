package model;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Mensalidade {
    private Date data_mensalidade;
    private Double valor;
    private Date data_pagamento;
    private Double juros_mensais;
    private Double valor_pago;
    private Boolean quitado;

    public String consMens(Socio socio){
        String dados = "";
        String aux;
        for(Mensalidade mensalidade: socio.getMensalidadesSet()){
            aux =
                mensalidade.getData_mensalidade() + 
                "\n" + 
                mensalidade.getValor() +
                "\n" +
                mensalidade.getJuros_mensais() +
                "\n" +
                mensalidade.getQuitado() +
                "\n============================================\n";
        dados = dados.concat(aux);
        }
        return dados;
    }

    public Double calcularJuros(){
        Double juros = this.valor;
        Long difMilis = data_mensalidade.getTime() - data_pagamento.getTime();
        Long diferencaDias = TimeUnit.MILLISECONDS.toDays(difMilis);  
        for(int i = 0; i < diferencaDias; i++){
            juros = juros * 1.05;
        }
        return juros;
    }

    public Boolean quitarMensalidade(Double valor){
        if(valor == calcularJuros()){
            this.valor_pago = valor;
            this.data_pagamento = new Date();
            return true;
        }else{
            return false;
        }
    }

    public Date getData_mensalidade() {
        return data_mensalidade;
    }
    public void setData_mensalidade(Date data_mensalidade) {
        this.data_mensalidade = data_mensalidade;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Date getData_pagamento() {
        return data_pagamento;
    }
    public void setData_pagamento(Date data_pagamento) {
        this.data_pagamento = data_pagamento;
    }
    public Double getJuros_mensais() {
        return juros_mensais;
    }
    public void setJuros_mensais(Double juros_mensais) {
        this.juros_mensais = juros_mensais;
    }
    public Double getValor_pago() {
        return valor_pago;
    }
    public void setValor_pago(Double valor_pago) {
        this.valor_pago = valor_pago;
    }
    public Boolean getQuitado() {
        return quitado;
    }
    public void setQuitado(Boolean quitado) {
        this.quitado = quitado;
    }

    
}
