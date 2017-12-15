package com.cavaco.cursomc.domain.enums;

public enum TipoCliente {
	
	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURICICA(2,"Pessoa Jurídica");

	private int cod;
	private String descricao;
	
	private TipoCliente(int pcod,String pdescricao) {
		this.cod = pcod;
		this.descricao = pdescricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		
		for (TipoCliente x : TipoCliente.values()){
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("id Inválido: " + cod );
		
	}
}
