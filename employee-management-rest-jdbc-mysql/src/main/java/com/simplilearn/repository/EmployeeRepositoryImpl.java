package com.simplilearn.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.simplilearn.model.Employee;

@Repository(value = "employeeRepository")
@Scope("singleton")
public class EmployeeRepositoryImpl implements EmployeeRepository {
	
	private JdbcTemplate jdbcTemplate;
	
	// dataSource Bean is automatically injected
	public EmployeeRepositoryImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	

	public void addEmployee(Employee employee) {
		String sql = "INSERT INTO Employees (id,name,department) VALUES (?,?,?)";
		jdbcTemplate.update(sql,employee.getId(),employee.getName(),employee.getDepartment());
	}

	@Override
	public List<Employee> getAllEmployees() {
		String sql = "SELECT * FROM Employees";
		return jdbcTemplate.query(sql,new EmployeeMapper());
	}
	
	
	private static final class EmployeeMapper implements RowMapper<Employee> {
		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee employee = new Employee();
			employee.setId(rs.getString("id"));
			employee.setName(rs.getString("name"));
			employee.setDepartment(rs.getString("department"));
			return employee;
		}
	}

	@Override
	public Optional<Employee> getEmployeeById(String id) {
		String sql = "SELECT * FROM Employees WHERE id =?";
		return jdbcTemplate.query(sql, new EmployeeMapper(),id).stream().findFirst();
	
	}

	@Override
	public void updateEmployee(Employee employee) {
		String sql = "UPDATE Employees SET name = ? , department = ? WHERE id =?";
		jdbcTemplate.update(sql,employee.getName(),employee.getDepartment(),employee.getId());
	}

	@Override
	public void deleteEmployee(String id) {
		String sql = "DELETE FROM Employees WHERE id = ?";
		jdbcTemplate.update(sql,id);
	}
}
