package Classes;


import Pessoas.EnumFuncionarios;
import Pessoas.Pessoa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CarlosAugusto
 */
public class Funcionario extends Pessoa{
    
    protected int Chapa;
    protected double Salario;
    protected EnumFuncionarios Cargo;
    
    public int getChapa()
    {
        return Chapa;
    }
    
    public void setChapa(int chp){
        Chapa = chp;
    }
    
    public double getSalario(){
        return Salario;
    }
    
    public void setSalario(double salry){
        Salario = salry;
    }
    
    public EnumFuncionarios getCargo() {
        return Cargo;
    }

    public void setCargo(EnumFuncionarios cargo) {
        this.Cargo = cargo;
    }
}
