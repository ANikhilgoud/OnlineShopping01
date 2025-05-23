package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.Categories.Fashion;

public interface IFashionRepository extends JpaRepository<Fashion, Integer> {

}
