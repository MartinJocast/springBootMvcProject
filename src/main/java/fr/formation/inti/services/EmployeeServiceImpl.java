package fr.formation.inti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.inti.dao.EmployeeDao;
import fr.formation.inti.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao dao;
	
	@Override
	public List<Employee> findAll() {
		return dao.findAll();
	}

}
