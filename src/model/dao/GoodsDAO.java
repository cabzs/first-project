package model.dao;

import java.sql.SQLException;
import java.util.List;

import model.dto.Goods;
import model.dto.GoodsTop;

public interface GoodsDAO {
	/**
	��ü�˻�
	 * */
	List<Goods> goodsSelectAll() throws SQLException;

	/**
	���� top5�˻� 
	 * */
	List<GoodsTop> goodsSelectByTop() throws SQLException;

	/**
	������ �˻�
	 * */
	List<Goods> goodsSelectByType(String type) throws SQLException;

	/**
	GoodsID�� �̿��� �˻�
	 * */
	Goods goodsSelectById(String goodsId) throws SQLException;

	/**
	��ǰ���
	 * */
	int goodsInsert(Goods goods) throws SQLException;

	/**
	 ��ǰ����
	 * */
	int goodsUpdate(String goodsId, int stockQty) throws SQLException;

	/**
	��ǰ����
	 * */
	int goodsDelete(String goodsId) throws SQLException;

}