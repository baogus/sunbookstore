package sunbookstore.Manager.service;

import sunbookstore.Manager.dao.ManagerDao;
import sunbookstore.Manager.domain.Manager;

public class ManagerService {
	ManagerDao managerDao = new ManagerDao();
	
	public int login(Manager manager) {
		return managerDao.login(manager);
	}

	public int updatePassword(Manager manager1 ,Manager manager2) {
		return managerDao.updatePassword(manager1, manager2);
		
	}

}
