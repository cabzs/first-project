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

public class IbServiceImpl implements IbService {
	private IbDAO ibDao = new IbDAOImpl();

	/**
	 * ��ü �ŷ�ó ��ȸ
	 * */
	@Override
	public List<Dealer> dealerSelect() throws SQLException {
		return ibDao.dealerSelect();
	}

	/**
	 *�ŷ�ó �ڵ�� sku ��ǰ �˻��ϱ�
	 * */
	@Override
	public List<Sku> skuSelectByDealerId(String dealerId) throws SQLException {
		List<Sku> skulist = ibDao.skuSelectByDealerId(dealerId);
		if(skulist.size()==0 || skulist.isEmpty()) throw new SQLException("�߸��� �ڵ��Դϴ�.");
		return skulist;
	}

	/**
	 * ����
	 * */
	@Override
	public void ibInsert(Ib ib) throws SQLException {
		ibDao.ibInsert(ib);

	}

	/**
	 * ���� ���� ����
	 * */

	@Override
	public List<Ib> selectIbByDealerId(String dealerId) throws SQLException {
		return ibDao.selectIbByDealerId(dealerId);
	}

	//	/**
	//	 * ���� �� ����
	//	 * */
	//	@Override
	//	public List<IbLine> ibTotal(String ibId) throws SQLException {
	//		return ibDao.ibTotal(ibId);
	//	}

	//	/**
	//	 * ������ ��ǰ Goods�� �߰� (-> stock �߰���Ű��) + ���� �� ����ϱ�
	//	 * */
	//	@Override
	//	public int[] ibLineUpdate(Connection con, Ib ib) throws SQLException {
	//		return ibDao.ibLineUpdate(con, ib);
	//	}

}
