import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * Created on 7/Mai/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author Daniel Botelho
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Connector extends User{

	/**
	 * 
	 */
	public Connector() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void connect(Hub hub) throws IOException{
		InputStream in = hub.getInputStream();
		OutputStream out = hub.getOutputStream();
		
	}
}
