package br.com.compartilhado;

import java.time.LocalDate;

public class VendaDTO {
    private String codigo;
    private int quantidade;
    private LocalDate datavenda;
    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public LocalDate getDatavenda() {
        return datavenda;
    }
    public void setDatavenda(LocalDate datavenda) {
        this.datavenda = datavenda;
    }
    
}
