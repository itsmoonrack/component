package cs;

import java.util.Vector;

import hadl.connector.Connector;
import hadl.connector.Role;

public class RPC extends Connector {
	Role caller = null;
	Role callee = null;
	
	public RPC() {
		this.callee = new Role();
		this.caller = new Role();
		
		Vector<Role> roleFrom = new Vector<Role>();
		roleFrom.add(caller);
		glues.put(roleFrom, callee);
		
		roleFrom = new Vector<Role>();
		roleFrom.add(callee);
		glues.put(roleFrom, caller);
		
		Role roleTo = glues.get(roleFrom);
	}
	
	public void addGlue(Role roleTo, Role ...roleFrom) {
		
	}
	
	public Role getGlue(Role ...roleFrom) {
		return glues.get(roleFrom);
	}
	
	
}
