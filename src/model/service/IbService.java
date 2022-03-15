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
	 * ��ü �ŷ�ó ��ȸ
	 * */
	public List<Dealer> dealerSelect() throws SQLException, NotFoundException;

	/**
	 *�ŷ�ó �ڵ�� sku ��ǰ �˻��ϱ�
	 * */
	public List<Sku> skuSelectByDealerId(String dealerId) throws SQLException, NotFoundException;

	/**
	 * ����
	 * */
	public void ibInsert(Ib ib) throws SQLException;

	/**
	 * ���� ���� ����
	 * */
	public List<Ib> selectIbByDealerId(String dealerId) throws SQLException;

	//	/**
	//	 * ���� �� ����
	//	 * */
	//	public List<IbLine> ibTotal(String ibId) throws SQLException;

	//	/**
	//	 * ������ ��ǰ Goods�� �߰� (-> stock �߰���Ű��) + ���� �� ����ϱ�
	//	 * */
	//	int[] ibLineUpdate(Connection con, Ib ib) throws SQLException;
}
