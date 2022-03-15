package model.dao;

import java.sql.SQLException;


import java.util.List;
import model.dto.Revenue;

public interface RevenueDAO {
	
	/**
	 * �� ���� ��ȸ�ϱ�
	 * */
	int selectTotalRevenue() throws SQLException; 
	
	/**
	 * �� ���� ��ȸ�ϱ�
	 * */
	List<Revenue> selectDailyRevenue() throws SQLException;
	
	/**
	 * �� ���� ��ȸ�ϱ�
	 * */
	List<Revenue> selectMonthlyRevenue() throws SQLException; 
	
	/**
	 * �� ���� ��ȸ�ϱ�
	 * */
	List<Revenue> selectYearlyReenue() throws SQLException; 
	
	
}	