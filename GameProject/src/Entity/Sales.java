package Entity;

public class Sales {
	private int id;
	private String CrediCardNo;
	
	
	public Sales(int id, String crediCardNo) {
		super();
		this.id = id;
		CrediCardNo = crediCardNo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setCrediCardNo(String crediCardNo) {
		CrediCardNo = crediCardNo;
	}
	
	
	
	
}
