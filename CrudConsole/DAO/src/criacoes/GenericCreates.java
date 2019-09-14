package criacoes;


import Classes.Cliente;
import Generico.Generico;
import Save.lineSaver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CarlosAugusto
 */
public class GenericCreates {
    
    public static String createParameterToSave (Generico gen, String type)
    {
        
            
            switch (type)
            {
                case "Cliente":
                {
                return clientes_funcionarios.ClientesDAO.cliSerialisa((Cliente)gen);
                }
                case "Funcionario":
                {
                 return"";
                }
                case "Produto":
                {
                 return"";
                }
                case "Pedido":
                {
                 return"";
                }
            }
                
        return "";
       
    }
    
    
    public static String searchObjectToPrint (String cod, String type)throws Exception
    {
        
            
            switch (type)
            {
                case "Cliente":
                {
                return clientes_funcionarios.ClientesDAO.buscaCli(cod);
                }
                case "Funcionario":
                {
                 return"";
                }
                case "Produto":
                {
                 return"";
                }
                case "Pedido":
                {
                 return"";
                }
            }
                
        return "";
       
    }
    
     public static lineSaver createLineObject(String cod, String type, String novoString)throws Exception {
         
         lineSaver obj = new lineSaver();
         int lin;
         switch (type)
            {
                case "Cliente":
                {
                lin = clientes_funcionarios.ClientesDAO.searchLineAndStatement(cod);
                obj.setCodigo(lin);
                obj.setNome(novoString);
                return obj;
                }
                case "Funcionario":
                {
                 return obj;
                }
                case "Produto":
                {
                 return obj;
                }
                case "Pedido":
                {
                 return obj;
                }
            }
                
        
         return obj;
         
     }
}
