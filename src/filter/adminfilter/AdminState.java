package filter.adminfilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import sunbookstore.Manager.domain.Manager;

public class AdminState {
	
	 static public boolean  adminState() {
		boolean sate= false;
		HttpServletRequest request = null;
		Manager manager = (Manager)request.getSession().getAttribute("manager");
		if(manager != null) {
			sate = true;
		} else {
			sate=false;
		}
		return sate;
		}

}
