package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.Categories.HomeAppliances;

public interface IHomeAPPRepository extends JpaRepository<HomeAppliances, Integer> {

}
