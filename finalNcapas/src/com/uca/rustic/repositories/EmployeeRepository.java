package com.uca.rustic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uca.rustic.domain.Empleado;

@Repository
public interface EmployeeRepository extends JpaRepository<Empleado, Integer> {
	

}
