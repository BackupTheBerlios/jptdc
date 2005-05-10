import java.util.TreeSet;

/*
 * Created on 8/Mai/2005
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
public class UserList extends TreeSet<User>{
	private static final String USER_SEP = "$$";
	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	
	private String nickList;
	private String opList;
	
	

	/**
	 * 
	 */
	public UserList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
