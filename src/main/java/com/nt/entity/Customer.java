package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NonNull;
@Data
@Entity
 // all caps by convention for Oracle
public class Customer {

    @Id
    @SequenceGenerator(name = "gen1", sequenceName = "c_id", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
    
    private Integer cid;

    
    @Column(length = 30)
    private String username;

   
    private Long mno;
}
