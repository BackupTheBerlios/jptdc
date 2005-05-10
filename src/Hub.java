import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.MessageFormat;

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
public class Hub extends Socket{
	private static final String PM_PARSER = new String("$To:{0} From: {1} $<{2}> {3}|");
	private static final String LOCK = new String("$Lock {0} Pk={2}|");
	private static final String MYINFO = new String("$MyINFO $ALL {0} {1}$ ${2}{3}${4}${5}$|");
	private static final String HELLO = "$Hello {0}|";
	
	private String hubKey;
	private String hubLock;
	/**
	 * @return Returns the hubDNS.
	 */
	public String getHubDNS() {
		return hubDNS;
	}
	/**
	 * @param hubDNS The hubDNS to set.
	 */
	public void setHubDNS(String hubDNS) {
		this.hubDNS = hubDNS;
	}
	/**
	 * @return Returns the hubKey.
	 */
	public String getHubKey() {
		return hubKey;
	}
	/**
	 * @param hubKey The hubKey to set.
	 */
	public void setHubKey(String hubKey) {
		this.hubKey = hubKey;
	}
	/**
	 * @return Returns the hubLock.
	 */
	public String getHubLock() {
		return hubLock;
	}
	/**
	 * @param hubLock The hubLock to set.
	 */
	public void setHubLock(String hubLock) {
		this.hubLock = hubLock;
	}
	/**
	 * @return Returns the hubName.
	 */
	public String getHubName() {
		return hubName;
	}
	/**
	 * @param hubName The hubName to set.
	 */
	public void setHubName(String hubName) {
		this.hubName = hubName;
	}
	private String hubName;
	private String hubDNS;
	
	/**
	 * @throws IOException
	 * @throws UnknownHostException
	 */
	public Hub(String hubDNS) throws UnknownHostException, IOException {
		super(hubDNS,411);
		
	}
	
	/**
	 * This method sends a raw message to de Server.
	 * 
	 * @param raw
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @author dbotelho
	 */
	public void sendRaw(String raw) throws UnsupportedEncodingException, IOException{
		writeCommand(raw);
	}
	
	public void sendPrivateMessage(UserInfo from, UserInfo to,String message) throws UnsupportedEncodingException, IOException{
		writeCommand(MessageFormat.format(PM_PARSER,from.getUserNickname(),to.getUserNickname(),message));
	}
	
	private void writeCommand(String command) throws UnsupportedEncodingException, IOException{
		getOutputStream().write(command.getBytes("ISO-8859-1"));
	}
	private String generateKey(String lockcode){
		return "";
	}
}
