package br.com.avalicaofinal.avaliacaofinal.View.Model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Min;

public class ProdutoModeloInclusao {
    private String id;
    @NotBlank(message = "O codigo não pode ser em branco")
    @NotEmpty(message = "O codigo não pode ser vazio")
    private int codigo;
    @NotBlank(message = "O nome não pode ser em branco")
    @NotEmpty(message = "O nome não pode ser vazio")
    private String nome;
    @NotBlank(message = "O valor não pode ser em branco")
    @NotEmpty(message = "O valor não pode ser vazio")
    @Min(value = 1, message="O valor deve ser maior que 0")
    private double valor;
    private int quantidadeEstoque;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    
}
