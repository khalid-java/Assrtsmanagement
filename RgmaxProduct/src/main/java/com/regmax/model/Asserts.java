package com.regmax.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CollectionId;

import lombok.Data;

@Data
@Entity
public class Asserts {
	@Id
	@GeneratedValue
	private Integer aid;
	@Column(name = "asset_name")
	private String assetnae;
	@Column(name = "asset_category")
	private String category;
	@Column(name = "purched_date")
	private Date purchsed_date;
	@Column(name = "condition_detail")
	private String condition_note;
	@Column(name = "status")
	private String status;
}
