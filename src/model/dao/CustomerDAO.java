package model.dao;

import java.sql.SQLException;

import model.dto.Customer;

public interface CustomerDAO {
	/**
	 * �α����ϱ�
	 * */
	Customer login(String cusId, String cusPwd)throws SQLException;
}

