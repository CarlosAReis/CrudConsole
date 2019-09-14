package Classes;


import Pessoas.Pessoa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 082170042
 */
public class Cliente extends Pessoa {
    
    protected int CodClient;
   
    public void setCodClient(int value) throws Exception{
        if (value <=0){
           throw new Exception("O código do cliente não pode ser negativo");
           
        }
        else {
            CodClient = value;
        }
    }
    
    public int getCodClient (){
        return CodClient;
    }
}
