package controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import model.dto.Goods;
import model.dto.GoodsTop;
import model.service.GoodsService;
import model.service.GoodsServiceImpl;
import view.EndView;
import view.FailView;

public class GoodsController {

	static GoodsService goodsService = new GoodsServiceImpl();

	//��ü��ǰ�˻�
	public static void goodsSelectAll() {
		try {
			List<Goods> list = goodsService.goodsSelectAll();
			EndView.printGoodsList(list);
		} catch (Exception e) {
			//e.printStackTrace();
			FailView.errorMessage(e.getMessage());
		}

	}

	//���� ���� �ȸ� ���� 5��
	public static void goodsSelectByTop() {
		try {
			List<GoodsTop> list = goodsService.goodsSelectByTop();
			for (GoodsTop goods : list) {
				System.out.println(goods);
			}
			// EndView.printMessage(map);
		} catch (Exception e) {
			//e.printStackTrace();
			FailView.errorMessage(e.getMessage());
		}

	}

	public static Goods goodsSelectById(String goodsId) {
		try {
			Goods goods = goodsService.goodsSelectById(goodsId);
			return goods;
		} catch (Exception e) {
			FailView.errorMessage(e.getMessage());
			return null;
		}
	}

	//������ �˻�
	public static void goodsSelectByType(String type) {
		try {
			List<Goods> list = goodsService.goodsSelectByType(type);
			for (Goods goods : list) {
				System.out.println(goods.toString());
			}
			EndView.printMessage(type);
		} catch (Exception e) {
			//e.printStackTrace();
			FailView.errorMessage(e.getMessage());
		}
	}


	//��ǰ���
	public static void goodsInsert(Goods goods) {
		try {
			goodsService.goodsInsert(goods);
			EndView.printMessage("��ǰ�� ��ϵǾ����ϴ�");
		} catch (SQLException e) {
			//e.printStackTrace();
			FailView.errorMessage(e.getMessage());
		}

	}

	//��ǰ����
	public static void goodsUpdate(String goodsId, int stockQty) {
		try {
			goodsService.goodsUpdate(goodsId, stockQty);
			EndView.printMessage("��ǰ�� �����Ǿ����ϴ�");
		} catch (SQLException e) {
			//e.printStackTrace();
			FailView.errorMessage(e.getMessage());
		}
	}

	//��ǰ����
	public static void goodsDelete(String goodsId) {
		try {
			goodsService.goodsDelete(goodsId);
			EndView.printMessage("��ǰ�� �����Ǿ����ϴ�");
		} catch (SQLException e) {
			//e.printStackTrace();
			FailView.errorMessage(e.getMessage());;
		}

	}

}

