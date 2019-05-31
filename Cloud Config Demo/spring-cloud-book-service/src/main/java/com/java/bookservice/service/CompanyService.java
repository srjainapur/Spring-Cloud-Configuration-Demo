package com.java.bookservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.bookservice.bean.Company;

@Service
public interface CompanyService {

	public Company saveCompany(Company company);

	public List<Company> getAllCompany();

	public List<Company> allCompanyInSortedOrder();

	public List<Company> allCompanyInSortedInDescOrder();

}
