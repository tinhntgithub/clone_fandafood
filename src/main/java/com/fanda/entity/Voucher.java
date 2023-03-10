package com.fanda.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "voucher")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Voucher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Voucher")
	int Id ;
	
	Integer restaurant_id;
	Integer discount;
	Integer minimum_order;
	Double delivery_discount;
	Date end_date;
	Date start_date;
	
	@JsonIgnore
	@OneToMany(mappedBy = "voucher" )
	List<VoucherApply> voucherApplyto  ;
	
}
