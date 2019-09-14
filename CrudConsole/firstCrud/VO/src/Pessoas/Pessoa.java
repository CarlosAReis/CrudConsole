/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pessoas;

import Generico.Generico;

/**
 *
 * @author 082170042
 */
public class Pessoa extends Generico{
    
    @Override
    public void setCodigo(int value)throws Exception{
        
         if (value <=0){
           throw new Exception("O CPF não pode ser negativo");
           
        }
        else if (Integer.toString(value).length()<11 ||Integer.toString(value).length()>11 ){
            
            throw new Exception("O CPF deve conter 11 numeros");
            
        }
        else{
            Codigo = value;
        }
    }
    
}
