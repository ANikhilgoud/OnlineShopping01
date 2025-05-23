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
public class Fashion {

    @Id
    @SequenceGenerator(
    	    name = "fashion_seq_gen", 
    	    sequenceName = "FASHION_SEQ", 
    	    initialValue = 1, 
    	    allocationSize = 1
    	)
    	@GeneratedValue(generator = "fashion_seq_gen", strategy = GenerationType.SEQUENCE)
    	private Integer id;
 
    

    @Lob
    private byte[] image;
    private String brand;      
    private String product_size;       
    private String color;      
    private Double price;      
    private String material; 
    private String category="fashion";
    
    public String getImageBase64() {
	    return image != null ? Base64.getEncoder().encodeToString(image) : "";
	}
}
