package com.regmax.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Category {
	
	@Id
	@Column(name="id")
	@GeneratedValue
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@OneToMany
	private List<Electronic> electronic;
	@OneToMany
	private List<Furniture> furniture;

}
