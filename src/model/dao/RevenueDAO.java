package model.dao;

import java.sql.SQLException;


import java.util.List;
import model.dto.Revenue;

public interface RevenueDAO {
	
	/**
	 * 총 매출 조회하기
	 * */
	int selectTotalRevenue() throws SQLException; 
	
	/**
	 * 일 매출 조회하기
	 * */
	List<Revenue> selectDailyRevenue() throws SQLException;
	
	/**
	 * 월 매출 조회하기
	 * */
	List<Revenue> selectMonthlyRevenue() throws SQLException; 
	
	/**
	 * 연 매출 조회하기
	 * */
	List<Revenue> selectYearlyReenue() throws SQLException; 
	
	
}	