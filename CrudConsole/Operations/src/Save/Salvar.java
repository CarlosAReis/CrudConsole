/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Save;

import Generico.Generico;

/**
 *
 * @author CarlosAugusto
 */
public class Salvar {
    
     public static boolean saveObjectinline (Generico gen , String type)throws Exception
    {
        
            
            switch (type)
            {
                case "Cliente":
                {
                return clientes_funcionarios.ClientesDAO.saveUpdateCli((lineSaver)gen);
                }
                case "Funcionario":
                {
                 return false;
                }
                case "Produto":
                {
                 return false;
                }
                case "Pedido":
                {
                 return false;
                }
            }
                
        return false;
       
    }
    
    
    
}
