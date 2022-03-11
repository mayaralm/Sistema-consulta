package com.dio.philips.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Regiao {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
	
    private String regiao;
    private int qntd_exames;
    
    
	public Regiao(String regiao, int qntd_exames) {
		super();
		this.regiao = regiao;
		this.qntd_exames = qntd_exames;
	}
	
	public Regiao() {}

	public Long getId() {
		return id;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public int getQntd_exames() {
		return qntd_exames;
	}

	public void setQntd_exames(int qntd_exames) {
		this.qntd_exames = qntd_exames;
	}
    
    
    
    
}
