/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Generico.Generico;

/**
 *
 * @author CarlosAugusto
 */
public class Produto extends Generico{
    protected double Valor;
    
    public double getValor(){
        return Valor;
    }
    
    public void setValor(double val) throws Exception{
        if(val<=0){
            throw new Exception("O valor não pode ser negativo e nem igual à zero");
        }
        else{
            Valor = val;
        }
    }
}
