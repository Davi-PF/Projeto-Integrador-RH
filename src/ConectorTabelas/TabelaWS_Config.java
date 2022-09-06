/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConectorTabelas;


/**
 *
 * @author davip
 */
public class TabelaWS_Config {
    
   public boolean excluir(TabelaWS_GS fichadto){
        TabelaWS_Metodos tabelaws_metodos = new TabelaWS_Metodos();
        tabelaws_metodos.excluir(fichadto);
        return true;
    }
}
