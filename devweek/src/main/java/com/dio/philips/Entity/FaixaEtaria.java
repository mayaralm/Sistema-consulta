package com.dio.philips.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FaixaEtaria {
	 @Id 
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(nullable = false, updatable = false)
	    private Long id;
	 
	    private int Faixa_i;
	    private int Faixa_n;
	    private String Descricao;
	    
	    
		public FaixaEtaria() {
			super();
		}


		public FaixaEtaria(int faixa_i, int faixa_n, String descricao) {
			super();
			Faixa_i = faixa_i;
			Faixa_n = faixa_n;
			Descricao = descricao;
		}


		public Long getId() {
			return id;
		}

		public int getFaixa_i() {
			return Faixa_i;
		}


		public void setFaixa_i(int faixa_i) {
			Faixa_i = faixa_i;
		}


		public int getFaixa_n() {
			return Faixa_n;
		}


		public void setFaixa_n(int faixa_n) {
			Faixa_n = faixa_n;
		}


		public String getDescricao() {
			return Descricao;
		}


		public void setDescricao(String descricao) {
			Descricao = descricao;
		}
	
	    
	    
	
	

}
