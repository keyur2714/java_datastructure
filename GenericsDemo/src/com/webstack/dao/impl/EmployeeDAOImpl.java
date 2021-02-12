package com.webstack.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.webstack.dao.IDao;
import com.webstack.dto.EmployeeDTO;
import com.webstack.util.DbUtil;

public class EmployeeDAOImpl implements IDao<EmployeeDTO>{

	private Connection connection = null;
	
	@Override
	public void save(EmployeeDTO object) {
		connection = DbUtil.getConnection();
		String sql = "insert into employee_master values (?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.clearParameters();
			preparedStatement.setInt(1, object.getEmployeeId());
			preparedStatement.setString(2, object.getName());
			int result = preparedStatement.executeUpdate();
			if(result > 0) {
				System.out.println("Employee Inserted Succcessfully...!");;
			}
			preparedStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	@Override
	public EmployeeDTO get(int id) {
		connection = DbUtil.getConnection();
		String sql = "select * from employee_master where emp_id = ?";
		EmployeeDTO employeeDTO = new EmployeeDTO();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.clearParameters();
			preparedStatement.setInt(1, id);
			ResultSet resultset = preparedStatement.executeQuery();
			if(resultset.next()) {
				employeeDTO.setEmployeeId(resultset.getInt(1));
				employeeDTO.setName(resultset.getString(2));
			}
			resultset.close();
			preparedStatement.close();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return employeeDTO;
	}

	@Override
	public List<EmployeeDTO> list() {
		connection = DbUtil.getConnection();
		String sql = "select * from employee_master";
		EmployeeDTO employeeDTO = null;
		List<EmployeeDTO> empList = new ArrayList<EmployeeDTO>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);					
			ResultSet resultset = preparedStatement.executeQuery();
			while(resultset.next()) {
				employeeDTO = new EmployeeDTO();
				employeeDTO.setEmployeeId(resultset.getInt(1));
				employeeDTO.setName(resultset.getString(2));
				empList.add(employeeDTO);
			}
			resultset.close();
			preparedStatement.close();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return empList;
	}

}
