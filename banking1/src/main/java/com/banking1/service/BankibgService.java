package com.banking1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.banking1.dao.BankingDAOInterface;
import com.banking1.entity.Employee;



@Service
@Transactional
public class BankibgService implements BankingServiceInterface{
	
	@Autowired
	private BankingDAOInterface bDao;

	@Override
	public String createProfileService(Employee emp) {
		bDao.save(emp);
		return "record created successfully";
	}

	@Override
	public List<Employee> getAllEmployeeRecordService() {
		// TODO Auto-generated method stub
		return bDao.findAll();
	}

	@Override
	public String editRecordService(Employee emp) {
		bDao.saveAndFlush(emp);
		return "record updated";
	}

	@Override
	public String deleteRecordService(String email) {
		bDao.deleteById(email);
		return "record deleted";
	}

}











