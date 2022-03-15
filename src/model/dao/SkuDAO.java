package model.dao;

import java.sql.SQLException;

import model.dto.Sku;

public interface SkuDAO {

	/**
	 * Id·Î Á¶È¸
	 */
	Sku selectSkuById(String skuId) throws SQLException;
}
