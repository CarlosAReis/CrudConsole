/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoas;

/**
 *
 * @author CarlosAugusto
 */
public enum EnumFuncionarios {
    
   
    
    GERENTE("Gerente"), 
    VENDEDOR("Vendedor");
    /**
     *
     */
    private String descricao;
    EnumFuncionarios (String descricao) {
        this.descricao = descricao;
    }

    /**
     *
     */
    
public String getDescricao() {
        return descricao;
    }
    /**
     *
     */
    
 
    
}
