/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes_funcionarios;

import Classes.Funcionario;
import Save.lineSaver;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
/**
 *
 * @author CarlosAugusto
 */
public class FuncionariosDAO {
    
     public static String funSerialisa(Funcionario fun) 
    {
        String retorno = String.valueOf(fun.getCodigo())+"|"+ String.valueOf(fun.getChapa())+"|"+fun.getNome()+"|"+fun.getCargo();
        return retorno;
    }
     
     public static String buscaFun(String cod)throws Exception
    {
        String retorno = "";
      try{
          boolean existe = false;
          String  caminho = new File(".").getCanonicalPath()+ "\\Textos\\funcionarios.txt";
          Scanner scanner = new Scanner(caminho);
			while (scanner.hasNextLine()) {
				retorno = scanner.nextLine();
                                String[] vetor = retorno.split("|");
                                if(vetor[0].equals(cod)){
                                    existe = true;
                                    break;
                                    
                                }
			}
			scanner.close();
                        if(existe)
                        {
                            return retorno;
                        }
                        throw new Exception();
      }
      catch (Exception e){
          System.out.println("não existe funcionario");
          return e.getMessage();
      }
        
    }
     
      public static int searchLineAndStatement(String cod)throws Exception{
         int lin =0;
         String retorno = "";
      try{
          boolean existe = false;
          String  caminho = new File(".").getCanonicalPath()+ "\\Textos\\funcionarios.txt";
          Scanner scanner = new Scanner(caminho);
			while (scanner.hasNextLine()) {
                                lin++;
				retorno = scanner.nextLine();
                                
                                String[] vetor = retorno.split("|");
                                if(vetor[0].equals(cod)){
                                    existe = true;
                                    
                                    break;
                                    
                                }
			}
			scanner.close();
                        if(existe)
                        {
                            return lin;
                        }
                        throw new Exception();
      }
      catch (Exception e){
          System.out.println("não existe funcionario");
          return 0;
      }
      
     }
      
      public static boolean verificaExisteCod(String cod)throws Exception{
         boolean existe=false;
         
         String retorno = "";
         
      try{
          
          String  caminho = new File(".").getCanonicalPath()+ "\\Textos\\funcionarios.txt";
          Scanner scanner = new Scanner(caminho);
			while (scanner.hasNextLine()) {
                               
				retorno = scanner.nextLine();
                                
                                String[] vetor = retorno.split("|");
                                if(vetor[0].equals(cod)){
                                    existe = true;
                                    
                                    break;
                                    
                                }
			}
			scanner.close();
                       return existe;
                        
      }
      catch (Exception e){
          System.out.println("não existe funcionario");
          return existe;
      }
         
         
     }
      
      public static boolean saveUpdateFun(lineSaver lin)throws Exception{
         
          BufferedWriter writer = null;
          String[] separada = lin.getNome().split("|");
         try{
             String  caminho = new File(".").getCanonicalPath()+ "\\Textos\\funcionarios.txt";
              File file = new File (caminho);

        if (file.createNewFile()) {
            
          writer = new BufferedWriter(new FileWriter(file));
                    
            writer.write(lin.getNome());
            
            System.out.println("File has been created.");
            return true;
        } else {
        
            System.out.println("File already exists.");
            
            if(verificaExisteCod(separada[0]))
            {
                writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(lin.getNome());
             System.out.println("File has been saved.");
            return true;
            }
            else{
                
    String caminhoTmp = new File(".").getCanonicalPath()+ "\\Textos\\funcionariostmp.txt";;

    BufferedWriter escrevedor = new BufferedWriter(new FileWriter(caminhoTmp));
    BufferedReader reader = new BufferedReader(new FileReader(caminho));

    String linha;
    String palavraAntiga= buscaFun(separada[0]);
    while ((linha = reader.readLine()) != null) {
        if (linha.contains(palavraAntiga)) {
            linha = linha.replace(palavraAntiga, lin.getNome());
        }
        writer.write(linha + "\n");
    }

    writer.close();        
    reader.close();

    new File(caminho).delete();
    new File(caminhoTmp).renameTo(new File(caminho));
     System.out.println("File has been updated.");
    return true;
            }
            
        }
         }
         catch (Exception e){
             return false;
         }
         
     }
}
