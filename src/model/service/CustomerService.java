package model.service;

import java.sql.SQLException;

import exception.NotFoundException;
import model.dto.Customer;

public interface CustomerService {
	
	/**
	 * �α���
	 * */
	public Customer login(String cusId, String cusPwd) throws SQLException, NotFoundException;
}
