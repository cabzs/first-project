package model.dto;

public class GoodsTop {
	
	private String goodsId;
	private String goodsName;
	private int totalQty;
	
	public GoodsTop(String goodsId, String goodsName, int totalQty) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.totalQty = totalQty;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public int getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[ 상품코드:");
		builder.append(goodsId);
		builder.append(", 상품이름:");
		builder.append(goodsName);
		builder.append(", 총 재고량=");
		builder.append(totalQty);
		builder.append("]");
		return builder.toString();
	}
	
}