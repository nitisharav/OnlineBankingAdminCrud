package common;

public class TrackStatus {
	private int referenceId;
	private String accountStatus;
	private String account_no;
	private String admin_remarks;
	public int getReferenceId() {
		   return referenceId;
		}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public String getAdmin_remarks() {
		return admin_remarks;
	}
	public void setAdmin_remarks(String admin_remarks) {
		this.admin_remarks = admin_remarks;
	}
	public void setReferenceId(int referenceId) {
		this.referenceId = referenceId;
	}
	@Override
	public String toString() {
		return "TrackStatus [referenceId=" + referenceId + ", accountStatus=" + accountStatus + ", account_no="
				+ account_no + ", admin_remarks=" + admin_remarks + "]";
	}
	
}
