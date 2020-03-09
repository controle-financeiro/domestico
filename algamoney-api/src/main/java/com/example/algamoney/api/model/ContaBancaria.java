package com.example.algamoney.api.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "conta_bancaria")
public class ContaBancaria {
	
	@Id
	@Column(name = "id_Conta_bancaria")	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idContaBancaria;

	@NotNull
	private String descricao;
	
	@NotNull
	private String investimento;
	
	@NotNull
	@Column(name = "aviso_emal")
	private String avisoEmail;
	
	@Column(name = "dia_fechamento")
	private int diaFechamento;
	
	@Column(name = "dia_vencimento")
	private int diaVencimento;
	
	@Column(name = "limte_valor")
	private BigDecimal limiteValor;
	
	
	@Column(name = "exibi_resumo")
	private String exibiResumo;
	
	@Column(name = "situacao")
	private String situacao;
	
	@Column(name = "data_saldo")
	private Date dataSaldo;
	
	@Column(name = "valor_saldo")	
	private BigDecimal valorSaldo;
	
	@Column(name = "lancar_saldo")	
	private String lancarSaldo;
	
	@Column(name = "data_cadastro")	
	private Date dataCadastro;
	
	@Column(name = "login_cadastro")	
	private String loginCadastro;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idContaBancaria == null) ? 0 : idContaBancaria.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaBancaria other = (ContaBancaria) obj;
		if (idContaBancaria == null) {
			if (other.idContaBancaria != null)
				return false;
		} else if (!idContaBancaria.equals(other.idContaBancaria))
			return false;
		return true;
	}

	public BigDecimal getLimiteValor() {
		return limiteValor;
	}

	public void setLimiteValor(BigDecimal limiteValor) {
		this.limiteValor = limiteValor;
	}

	public String getExibiResumo() {
		return exibiResumo;
	}

	public void setExibiResumo(String exibiResumo) {
		this.exibiResumo = exibiResumo;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Date getDataSaldo() {
		return dataSaldo;
	}

	public void setDataSaldo(Date dataSaldo) {
		this.dataSaldo = dataSaldo;
	}

	public BigDecimal getValorSaldo() {
		return valorSaldo;
	}

	public void setValorSaldo(BigDecimal valorSaldo) {
		this.valorSaldo = valorSaldo;
	}

	public String getLancarSaldo() {
		return lancarSaldo;
	}

	public void setLancarSaldo(String lancarSaldo) {
		this.lancarSaldo = lancarSaldo;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getLoginCadastro() {
		return loginCadastro;
	}

	public void setLoginCadastro(String loginCadastro) {
		this.loginCadastro = loginCadastro;
	}



	public Long getIdContaBancaria() {
		return idContaBancaria;
	}

	public void setIdContaBancaria(Long idContaBancaria) {
		this.idContaBancaria = idContaBancaria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getInvestimento() {
		return investimento;
	}

	public void setInvestimento(String investimento) {
		this.investimento = investimento;
	}

	public String getAvisoEmail() {
		return avisoEmail;
	}

	public void setAvisoEmail(String avisoEmail) {
		this.avisoEmail = avisoEmail;
	}

	public int getDiaFechamento() {
		return diaFechamento;
	}

	public void setDiaFechamento(int diaFechamento) {
		this.diaFechamento = diaFechamento;
	}

	public int getDiaVencimento() {
		return diaVencimento;
	}

	public void setDiaVencimento(int diaVencimento) {
		this.diaVencimento = diaVencimento;
	}


}
