/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Daniel
 */
@Entity
public class Funcionario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length = 100)
    private String nome;
    @Column(length = 17)
    private String cpf;
    @Column(length = 11)
    private String rg;
    @Column(length = 8)
    private String cep;
    @Column(length = 20)
    private String prefixo;
    @Column(length = 200)
    private String endereco;
    @Column(length = 5)
    private String numero;
    @Column(length = 50)
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
        RO, RR, SC, SP, SE, TO,
    }

    public enum Prefixo {

        ALAMEDA, AVENIDA, BECO, BLOCO, BOSQUE, CHACARA,
        COLONIA, CONDOMINIO, CONJUNTO, DISTRITO, ESTRADA,
        FAVELA, FAZENDA, FERROVIA, ILHA, JARDIM, LADEIRA, LAGO,
        LAGOA, LOTEAMENTO, MORRO, PATIO, PONTE, PORTO, PRACA, PROLONGAMENTO,
        QUADRA, RAMAL, RAMPA, RECANDO, RODOVIA, RUA, SITIO, TERMINAL, TRAVESSA,
        TREVO, TUNEL, UNIDADE, VALA, VIA, VIADUTO, VIELA, VILA,
    }

    public enum TipoFuncionario {

        Atendente,
        Professor,
        Gerente,
    }

    @Override
    public String toString() {

        return this.getNome() + " - " + getId();



    }
}
