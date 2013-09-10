/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.enums;

/**
 *
 * @author Daniel
 */
public enum PrefixoEnum {

    SELECIONE("Selecione Uma Opção"),
    ALAMEDA("Alameda"),
    AVENIDA("Avenida"),
    BECO("Beco"),
    BLOCO("Bloco"),
    BOSQUE("Bosque"),
    CHACARA("Chacara"),
    COLONIA("Colonia"),
    CONDOMINIO("Codimio"),
    CONJUNTO("Conjunto"),
    DISTRITO("Distrito"),
    ESTRADA("Estrada"),
    FAVELA("Favela"),
    FAZENDA("Fazenda"),
    FERROVIA("Ferrovia"),
    ILHA("Ilha"),
    JARDIM("Jardim"),
    LADEIRA("Ladeira"),
    LAGO("Lago"),
    LAGOA("Lagoa"),
    LOTEAMENTO("Loteamento"),
    MORRO("Morro"),
    PATIO("Patio"),
    PONTE("Ponto"),
    PORTO("Porto"),
    PRACA("Praca"),
    PROLONGAMENTO("Prolongamento"),
    QUADRA("Quadra"),
    RAMAL("Ramal"),
    RAMPA("Rampa"),
    RECANDO("Recanto"),
    RODOVIA("Rovodovia"),
    RUA("Rua"),
    SITIO("Sitio"),
    TERMINAL("Terminal"),
    TRAVESSA("Travessa"),
    TREVO("Trevo"),
    TUNEL("Tunel"),
    UNIDADE("Unidade"),
    VALA("Vala"),
    VIA("Vila"),
    VIADUTO("Viaduto"),
    VIELA("Viela"),
    VILA("Vila");
    private String prefixo;

    private PrefixoEnum(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getPrefixo() {
        return this.prefixo;
    }

    public static String[] getPrefixos() {
        String[] Prefixo = new String[PrefixoEnum.values().length];
        for (PrefixoEnum prefixoEnum : PrefixoEnum.values()) {
            Prefixo[prefixoEnum.ordinal()] = prefixoEnum.getPrefixo();
        }
        return null;
    }

    public static PrefixoEnum getEnum(String string) {

        switch (string) {
            case "Selecione Uma Opção":
                return SELECIONE;
            case "Alameda":
                return ALAMEDA;
            case "Avenida":
                return AVENIDA;
            case "Beco":
                return BECO;
            case "Bloco":
                return BLOCO;
            case "Bosque":
                return BOSQUE;
            case "Chacara":
                return CHACARA;
            case "Colonia":
                return COLONIA;
            case "Codimio":
                return CONDOMINIO;
            case "Conjunto":
                return CONJUNTO;
            case "Distrito":
                return DISTRITO;
            case "Estrada":
                return ESTRADA;
            case "Favela":
                return FAVELA;
            case "Fazenda":
                return FAZENDA;
            case "Ferrovia":
                return FERROVIA;
            case "Ilha":
                return ILHA;
            case "Jardim":
                return JARDIM;
            case "Ladeira":
                return LADEIRA;
            case "Lago":
                return LAGO;
            case "Lagoa":
                return LAGOA;
            case "Loteamento":
                return LOTEAMENTO;
            case "Morro":
                return MORRO;
            case "Patio":
                return PATIO;
            case "Ponto":
                return PONTE;
            case "Porto":
                return PORTO;
            case "Praca":
                return PRACA;
            case "Prolongamento":
                return PROLONGAMENTO;
            case "Quadra":
                return QUADRA;
            case "Ramal":
                return RAMAL;
            case "Rampa":
                return RAMPA;
            case "Recanto":
                return RECANDO;
            case "Rovodovia":
                return RODOVIA;
            case "Rua":
                return RUA;
            case "Sitio":
                return SITIO;
            case "Terminal":
                return TERMINAL;
            case "Travessa":
                return TRAVESSA;
            case "Trevo":
                return TREVO;
            case "Tunel":
                return TUNEL;
            case "Unidade":
                return UNIDADE;
            case "Vala":
                return VALA;
            case "Via":
                return VIA;
            case "Viaduto":
                return VIADUTO;
            case "Viela":
                return VIELA;
            case "Vila":
                return VILA;
        }
        return null;

    }
}
