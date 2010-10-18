package hadl;

import hadl.component.PortComponent;
import hadl.connector.Role;


public class Attachment {
	
	public static void attach(Role role, PortComponent port) {
		port.setRole(role);
	}

}
