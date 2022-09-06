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
public class TabelaWS_GS {
    int Id_Projeto;
    String NomeProjeto, TipoProjeto, EquipeProjeto, InfoProjeto, StatusProjeto;

    
    public String getStatusProjeto() {
        return StatusProjeto;
    }

    public void setStatusProjeto(String StatusProjeto) {
        this.StatusProjeto = StatusProjeto;
    }
    
    public int getId_Projeto() {
        return Id_Projeto;
    }

    public void setId_Projeto(int Id_Projeto) {
        this.Id_Projeto = Id_Projeto;
    }
    
    public String getNomeProjeto() {
        return NomeProjeto;
    }

    public void setNomeProjeto(String NomeProjeto) {
        this.NomeProjeto = NomeProjeto;
    }

    public String getTipoProjeto() {
        return TipoProjeto;
    }

    public void setTipoProjeto(String TipoProjeto) {
        this.TipoProjeto = TipoProjeto;
    }

    public String getEquipeProjeto() {
        return EquipeProjeto;
    }

    public void setEquipeProjeto(String EquipeProjeto) {
        this.EquipeProjeto = EquipeProjeto;
    }

    public String getInfoProjeto() {
        return InfoProjeto;
    }

    public void setInfoProjeto(String InfoProjeto) {
        this.InfoProjeto = InfoProjeto;
    }
    
    
    
}
