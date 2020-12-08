package common;

public class PayeeDetails {
	private String account_no;
	private String payeeName;
	private String payeeAccountNo;
	private String bankName;
	private String ifsc;
	public String getaccount_no() {
		return account_no;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public String getPayeeName() {
		return payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
	public String getPayeeAccountNo() {
		return payeeAccountNo;
	}
	public void setPayeeAccountNo(String payeeAccountNo) {
		this.payeeAccountNo = payeeAccountNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	@Override
	public String toString() {
		return "PayeeDetails [account_no=" + account_no + ", payeeName=" + payeeName + ", payeeAccountNo="
				+ payeeAccountNo + ", bankName=" + bankName + ", ifsc=" + ifsc + "]";
	}
	
}
