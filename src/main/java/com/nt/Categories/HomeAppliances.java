package com.nt.Categories;

import java.util.Base64;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class HomeAppliances {
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "id", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
    private Integer id;
	private String brand;
	private double price;
	@Lob
    private byte[] image;
	
	
	private String category="homeAppliences";
	

	public String getImageBase64() {
	    return image != null ? Base64.getEncoder().encodeToString(image) : "";
	}
}
