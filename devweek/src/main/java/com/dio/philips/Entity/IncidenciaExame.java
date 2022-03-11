package com.dio.philips.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class IncidenciaExame {
	
	   @Id 
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   @Column(nullable = false, updatable = false)
	    private Long id;
	   
	    private Long Regiao_id;
	    private int Mes;
	    private Long Faixa_id;
	    private int Qnt_exames;
	    
	    
		public IncidenciaExame() {
			super();
		}


		public IncidenciaExame(Long regiao_id, int mes, Long faixa_id, int qnt_exames) {
			super();
			Regiao_id = regiao_id;
			Mes = mes;
			Faixa_id = faixa_id;
			Qnt_exames = qnt_exames;
		}


		public Long getId() {
			return id;
		}



		public Long getRegiao_id() {
			return Regiao_id;
		}


		public void setRegiao_id(Long regiao_id) {
			Regiao_id = regiao_id;
		}


		public int getMes() {
			return Mes;
		}


		public void setMes(int mes) {
			Mes = mes;
		}


		public Long getFaixa_id() {
			return Faixa_id;
		}


		public void setFaixa_id(Long faixa_id) {
			Faixa_id = faixa_id;
		}


		public int getQnt_exames() {
			return Qnt_exames;
		}


		public void setQnt_exames(int qnt_exames) {
			Qnt_exames = qnt_exames;
		}
	    
		
		
	    

}
