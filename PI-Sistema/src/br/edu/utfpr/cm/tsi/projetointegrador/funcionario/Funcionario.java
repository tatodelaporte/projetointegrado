/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.funcionario;

/**
 *
 * @author Daniel
 */
public class Funcionario {

    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String cep;
    private String prefixo;
    private String endereco;
    private String numero;
    private String cidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getFoneCelular() {
        return foneCelular;
    }

    public void setFoneCelular(String foneCelular) {
        this.foneCelular = foneCelular;
    }

    public String getFoneResidencia() {
        return foneResidencia;
    }

    public void setFoneResidencia(String foneResidencia) {
        this.foneResidencia = foneResidencia;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getTipoFuncionario() {
        return TipoFuncionario;
    }

    public void setTipoFuncionario(String TipoFuncionario) {
        this.TipoFuncionario = TipoFuncionario;
    }
    private String foneCelular;
    private String foneResidencia;
    private String uf;
    private String TipoFuncionario;

    public enum UF {

        AC, AL, AP, AM, BA, CE, DF,
        ES, GO, MA, MT, MS, MG, PA,
        PB, PR, PE, PI, RJ, RN, RS,
        RO, RR, SC, SP, SE, TO,}

    public enum Prefixo {

        ALAMEDA, AVENIDA, BECO, BLOCO, BOSQUE, CHACARA,
        COLONIA, CONDOMINIO, CONJUNTO, DISTRITO, ESTRADA,
        FAVELA, FAZENDA, FERROVIA, ILHA, JARDIM, LADEIRA, LAGO,
        LAGOA, LOTEAMENTO, MORRO, PATIO, PONTE, PORTO, PRACA, PROLONGAMENTO,
        QUADRA, RAMAL, RAMPA, RECANDO, RODOVIA, RUA, SITIO, TERMINAL, TRAVESSA,
        TREVO, TUNEL, UNIDADE, VALA, VIA, VIADUTO, VIELA, VILA,}

    public enum TipoFuncionario {

        Atendente,
        Professor,
        Gerente,}

    @Override
    public String toString() {

        return "Funcionario {" + "id=" + id + ","
                + "nome" + nome + ","
                + "cpf" + cpf + ","
                + "rg" + rg + ","
                + "cep" + cep + ","
                + "prefixo" + prefixo + ","
                + "endereco" + endereco + ","
                + "cidade" + cidade + ","
                + "uf" + uf + ","
                + "fonecelular" + foneCelular + ","
                + "foneresidencia" + foneResidencia + ","
                + "tipofuncionario" + TipoFuncionario + '}';
    }
}
