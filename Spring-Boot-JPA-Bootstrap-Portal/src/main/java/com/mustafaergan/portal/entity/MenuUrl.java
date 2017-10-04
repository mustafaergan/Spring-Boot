package com.mustafaergan.portal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
public @Data class MenuUrl {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	String page;
	
	String url;
	
}
