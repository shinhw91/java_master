package todo.p20231214_home;

import lombok.Data;

@Data
public class Cstore {
	// 필드(속성)
	private String accountCode;
	private String accountName;
	private String accountGrade;
	private String managerPw;
	
	// 생성자
	public Cstore() {
		
	}
	
	public Cstore(String accountCode, String accountName, String accountGrade) {
		this.accountCode = accountCode;
		this.accountName = accountName;
		this.accountGrade = accountGrade;
	}
	
	public Cstore(String accountCode, String accountName, String accountGrade, String accountPw) {
		this.accountCode = accountCode;
		this.accountName = accountName;
		this.accountGrade = accountGrade;
		this.managerPw = managerPw;
	}
	

	
	
}
