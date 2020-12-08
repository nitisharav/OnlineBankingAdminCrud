package common;

public class AdminInputs {

	private int referenceId;
	private String approval;
	private String account_no;
	private String admin_remarks;
	public int getReferenceId() {
	   return referenceId;
	}
	public String getApproval() {
		return approval;
	}
	public void setApproval(String approval) {
		this.approval = approval;
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
		return "AdminInputs [referenceId=" + referenceId + ", approval=" + approval + ", account_no=" + account_no
				+ ", admin_remarks=" + admin_remarks + "]";
	}
	
	
}
