package hadl.component;

import hadl.Port;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Observable;
import java.util.Observer;


public class Service implements Observer {
	
	private Object object;
	private Method method;
	
	
	public Service(Object object, Method method) {
		this.object = object;
	}
	
	// @TODO check this... setMethod ou Map
	public void addMethod(Port port, Method method) {
		this.method = method;
		port.addObserver(this);
	}
	
	public void call(Port port, String message) {
		port.writeBytes(message);
	}

	public void update(Observable o, Object arg) {
		try {
			method.invoke(object, arg);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


}
