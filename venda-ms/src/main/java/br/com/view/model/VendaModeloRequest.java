package br.com.view.model;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.validation.constraints.Min;

public class VendaModeloRequest {
    @NotBlank(message = "O codigo não deve possuir caracteres não brancos")
    @NotEmpty(message = "O codigo deve ser preenchido")
    @Size(min = 6, message = "O nome deve ter, no mínimo, 6 caracteres")
    private String codigo;
    @NotBlank(message = "A quantidade não deve possuir caracteres não brancos")
    @NotEmpty(message = "A quantidade deve ser preenchido")
    @Min(value = 1, message = "A quantidade deve ser maior que 0")
    private int quantidade;
    @NotBlank(message = "A data não deve possuir caracteres não brancos")
    @NotEmpty(message = "A data deve ser preenchido")
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
