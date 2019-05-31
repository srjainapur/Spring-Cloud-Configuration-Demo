package com.java.bookservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.bookservice.bean.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
