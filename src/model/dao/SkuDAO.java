package model.dao;

import java.sql.SQLException;

import model.dto.Sku;

public interface SkuDAO {

	/**
	 * Id�� ��ȸ
	 */
	Sku selectSkuById(String skuId) throws SQLException;
}
