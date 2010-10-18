package hadl.component;

import hadl.Port;
import hadl.connector.Role;

public class PortComponent extends Port {

	private Role roleMapping = null;
	
    public void setRole(Role role) {
    	this.roleMapping = role;
    }
	
	public void writeBytes(String data) {
		roleMapping.write(data);
	}
	
	public void readBytes(String data) {
		notifyObservers(data);
	}
	

}
