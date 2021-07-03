package in.ashok.Entity;

public class Category {
	
	private String id;
	private String asset_Name;
	private String purchase_Date;
	private String asset_Condition;
	private String asset_Category;
	private String asset_Status;
	
	
	public Category() {
		super();
	}
	
	public Category(String id, String asset_Name, String purchase_Date, String asset_Condition, String asset_Category,
			String asset_Status) {
		super();
		this.id = id;
		this.asset_Name = asset_Name;
		this.purchase_Date = purchase_Date;
		this.asset_Condition = asset_Condition;
		this.asset_Category = asset_Category;
		this.asset_Status = asset_Status;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAsset_Name() {
		return asset_Name;
	}
	public void setAsset_Name(String asset_Name) {
		this.asset_Name = asset_Name;
	}
	public String getPurchase_Date() {
		return purchase_Date;
	}
	public void setPurchase_Date(String purchase_Date) {
		this.purchase_Date = purchase_Date;
	}
	public String getAsset_Condition() {
		return asset_Condition;
	}
	public void setAsset_Condition(String asset_Condition) {
		this.asset_Condition = asset_Condition;
	}
	public String getAsset_Category() {
		return asset_Category;
	}
	public void setAsset_Category(String asset_Category) {
		this.asset_Category = asset_Category;
	}
	public String getAsset_Status() {
		return asset_Status;
	}
	public void setAsset_Status(String asset_Status) {
		this.asset_Status = asset_Status;
	}
	
	@Override
	public String toString() {
		return "Category [id=" + id + ", asset_Name=" + asset_Name + ", purchase_Date=" + purchase_Date
				+ ", asset_Condition=" + asset_Condition + ", asset_Category=" + asset_Category + ", asset_Status="
				+ asset_Status + "]";
	}

}
