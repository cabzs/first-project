package model.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import exception.NotFoundException;
import model.dao.IbDAO;
import model.dao.IbDAOImpl;
import model.dto.Dealer;
import model.dto.Ib;
import model.dto.IbLine;
import model.dto.Sku;

public interface IbService {
	IbDAO ibDao = new IbDAOImpl();

	/**
	 * 전체 거래처 조회
	 * */
	public List<Dealer> dealerSelect() throws SQLException, NotFoundException;

	/**
	 *거래처 코드로 sku 상품 검색하기
	 * */
	public List<Sku> skuSelectByDealerId(String dealerId) throws SQLException, NotFoundException;

	/**
	 * 발주
	 * */
	public void ibInsert(Ib ib) throws SQLException;

	/**
	 * 발주 내역 보기
	 * */
	public List<Ib> selectIbByDealerId(String dealerId) throws SQLException;

	//	/**
	//	 * 발주 상세 내역
	//	 * */
	//	public List<IbLine> ibTotal(String ibId) throws SQLException;

	//	/**
	//	 * 발주한 물품 Goods에 추가 (-> stock 추가시키기) + 발주 상세 등록하기
	//	 * */
	//	int[] ibLineUpdate(Connection con, Ib ib) throws SQLException;
}
