package common;

import java.util.List;

public interface AdminRepository {
void addAdminInputs(AdminInputs admin);
void deleteAdminInputs(int referenceid);
void updateAdminInputs(int referenceid,String approval,String account_no,String admin_remarks);
public List<AdminInputs> getAvailableAdminInputs();
}
