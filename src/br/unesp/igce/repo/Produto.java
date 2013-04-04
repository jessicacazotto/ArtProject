/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.repo;

/**
 *
 * @author aluno
 */
public class Produto {
    String nome;
    String descricao;
    String preco;
    String[] categoria;
    
    Produto(String nome, String descricao, String preco, String[] categoria){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }
    
    public static void main(String[] args) {
       // Produto p1 = new Produto("Vovo", "Pote para doces", "R$20,00", )
    }
    
}

