package com.nt.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Actor {
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "aid_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer aid;
	
	@Column(length = 20)
	@NonNull
	private String aname;
	
	@Column(length = 20)
	@NonNull
	private Double remunaration;
	
	@Column(length = 20)
	@NonNull
	private String category;

}
