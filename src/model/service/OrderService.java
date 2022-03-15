package model.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import model.dao.OrderDAO;
import model.dao.OrderDAOImpl;
import model.dto.OrderLine;
import model.dto.Orders;

public interface OrderService {
	OrderDAO orderDao = new OrderDAOImpl();
	
	/**
	 * �ֹ��ϱ�
	 */
	public void orderInsert(Orders order) throws SQLException;
	
	/**
	 * �ֹ� ��������
	 */
	public List<Orders> orderTotal(String cusId) throws SQLException;
}
