package fr.formation.inti.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.inti.entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	
}
