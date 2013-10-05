/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.enums;

/**
 *
 * @author Daniel
 */
public enum TipoFuncionarioEnum {

    SELECIONE("Selecione uma opção"), //
    ATENDENTE("Atendente"), //
    GERENTE("Gerente"), //
    PROFESSOR("Professor"); //  
    private String tipoFuncionario;

    private TipoFuncionarioEnum(String tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public String getTipoFuncionarioEnum() {
        return this.tipoFuncionario;
    }

    public static String[] getTipos() {
        String[] tipo = new String[TipoFuncionarioEnum.values().length];
        for (TipoFuncionarioEnum tipoFunc : TipoFuncionarioEnum.values()) {
            tipo[tipoFunc.ordinal()] = tipoFunc.getTipoFuncionarioEnum();
        }
        return tipo;
    }

    
    
    public static TipoFuncionarioEnum getEnum(String string) {
        switch (string) {
            case "Selecione":
                return SELECIONE;
            case "Atendente":
                return ATENDENTE;
            case "Gerente":
                return GERENTE;
            case "Professor":
                return PROFESSOR;
        }
        return null;
    }
}
