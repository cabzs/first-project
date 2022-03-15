package model.dao;

import java.sql.Connection;

import java.sql.SQLException;
import java.util.List;

import model.dto.OrderLine;
import model.dto.Orders;

public interface OrderDAO {
	/**
	 * �ֹ��ϱ�
	 * */
	int orderInsert(Orders order) throws SQLException;

	/**
	 * �ֹ��� ����ϱ�
	 * */
	int[] orderLineInsert(Connection con, Orders order) throws SQLException;

	/**
	 * ��� ���ҽ�Ű��
	 * */
	int[] decrementStock(Connection con, List<OrderLine> orderLineList) throws SQLException;

	/**
	 * �����ϱ�(�ֹ���������)
	 * */
	List<Orders> orderTotal(String cusId) throws SQLException;

	/**
	 * �ֹ� �� ��ȸ�ϱ�
	 */
	List<OrderLine> selectOrderLine(String orderId) throws SQLException;
}