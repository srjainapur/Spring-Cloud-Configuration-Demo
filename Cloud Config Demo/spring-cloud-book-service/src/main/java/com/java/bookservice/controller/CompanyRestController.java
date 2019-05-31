package com.java.bookservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.bookservice.bean.Company;
import com.java.bookservice.service.CompanyService;

@RestController
@RequestMapping(value="/company")
public class CompanyRestController {
	
	@Autowired
	private CompanyService companyService;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public Company saveCompany(@RequestBody Company company) {
		return companyService.saveCompany(company);
	}
	
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	public List<Company> getAllCompany() {
		return companyService.getAllCompany();
	}	
	
	@RequestMapping(value="/getAll/SortedByNameAsc", method=RequestMethod.GET)
	public List<Company> allCompanyInSortedInAscOrder() {
		return companyService.allCompanyInSortedOrder();
	}
	
	@RequestMapping(value="/getAll/SortedByNameDesc", method=RequestMethod.GET)
	public List<Company> allCompanyInSortedInDescOrder() {
		return companyService.allCompanyInSortedInDescOrder();
	}
}
