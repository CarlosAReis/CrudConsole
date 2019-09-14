/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Generico;

/**
 *
 * @author 082170042
 */
public abstract class Generico {
    
    protected int Codigo;
    protected String Nome;
    
  
    
    public int getCodigo (){
        
        return Codigo;
    }
     public void setCodigo  (int value)throws Exception{
        
        if (value <=0){
           throw new Exception("O código não pode ser negativo");
           
        }
        else {
            Codigo = value;
        }
    }
     
    public String getNome (){
        
        return Nome;
    }
    
    public void setNome( String valor)throws Exception{
        
        if(valor == "")
        {
            throw new Exception("O nome não pode ser vazio");
        }
        else if(valor.length()<2){
            throw new Exception("Não existe nome tão pequeno");
        }
    }
}
