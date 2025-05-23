package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.Categories.Laptops;

public interface ILaptopRepository extends JpaRepository<Laptops, Integer> {

}
