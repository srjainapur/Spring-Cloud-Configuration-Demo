package com.java.bookservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.java.bookservice.bean.Company;
import com.java.bookservice.repository.CompanyRepository;

@Service
@Qualifier("companyService")
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@Override
	public Company saveCompany(Company company) {
		return companyRepository.save(company);
	}

	@Override
	public List<Company> getAllCompany() {
		return companyRepository.findAll();
	}

	@Override
	public List<Company> allCompanyInSortedOrder() {
		return companyRepository.findAll(new Sort(Direction.ASC, "name"));
	}

	@Override
	public List<Company> allCompanyInSortedInDescOrder() {
		return companyRepository.findAll(new Sort(Direction.DESC, "name"));
	}
}
