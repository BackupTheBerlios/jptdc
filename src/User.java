import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
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
public class User extends Socket{
	
	private static final String MYINFO = new String("$MyINFO $ALL {0} {1}$ ${2}{3}${4}${5}$|");
	private static final String KEY = "$Key {0}|";
	private static final String VALIDATE_NICK = "$ValidateNick {0}|";
	private static final String MY_PASS = "$MyPass {0}|";
	private static final String VERSION = "$Version {0}|";
	private static final String GET_INFO = "$GetINFO {0} {1}|";
	
	private UserInfo userInfo;
	private String userPassword;
	private FileList fileList;
	
	public User(String nickname) {
		super();
		userInfo = new UserInfo(nickname);
	}

	
	
	/**
	 * This message reqests the userinfos from a other user.
	 * Format: $GetINFO <nickname> <ownnickname>
	 * 
	 * @param hub
	 * @param user
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	public void sendGetInfo(Hub hub, UserInfo user) throws UnsupportedEncodingException, IOException{
		hub.sendRaw(MessageFormat.format(GET_INFO, user.getUserNickname(), this.userInfo.getUserNickname()));
	}
	
	/**
	 * The client sends the version of the clientsoftware to the server
	 * Format: $Version <versionnumber>
	 * 
	 * @param hub
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	public void sendVersion(Hub hub) throws UnsupportedEncodingException, IOException{
		hub.sendRaw(MessageFormat.format(MY_PASS, userInfo.getClientVersion()));
	}
	
	/**
	 * The client sends this message to the server to send the password.
	 * 
	 * @param hub
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	public void sendMyPass(Hub hub) throws UnsupportedEncodingException, IOException{
		hub.sendRaw(MessageFormat.format(MY_PASS, getUserPassword()));
	}
	
	/**
	 * The Client sends his Username to the Server.
	 * If the Username is already in use or wrong, the server sends a $ValidateDenide message.
	 * Format: $ValidateNick <nickname>
	 * 
	 * @param hub
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	public void sendValidateNick(Hub hub) throws UnsupportedEncodingException, IOException{
		hub.sendRaw(MessageFormat.format(VALIDATE_NICK, userInfo.getUserNickname()));
	}
	
	/**
	 * This is the Clients first message to the server.
	 * the client sends a Key. this key will be calculated from the <lockcode>.
	 * Format: $Key <keycode>
	 * 
	 * @param hub
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	public void sendKey(Hub hub) throws UnsupportedEncodingException, IOException{
		hub.sendRaw(MessageFormat.format(KEY, hub.getHubKey()));
	}
	
	/**
	 * This message informs the server about the Userinfos.
	 * This message will send from server too as response to $GetINFO.
	 * Format: $MyINFO $ALL <nickname> <description>$ $<speed>$<email>$<sharedsizeinbyte$
	 * 		"" stands for (as ascii char):
	 * 		1 = normal
	 * 		2 = away
	 * 		3 = away
	 * 		4 = fileserver
	 * 		5 = fileserver
	 * 		6 = fileserver away
	 * 		7 = fileserver away
	 * 		8 = speeduser
	 * 		9 = speeduser
	 * 		10 = speeduser away
	 * 		12 = speeduser away
	 * 
	 * @param hub
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	public void sendMyInfo(Hub hub) throws UnsupportedEncodingException, IOException{
		hub.sendRaw(MessageFormat.format(MYINFO, userInfo.getUserNickname(), userInfo.getUserDescripiption(),
				userInfo.getUserSpeed(), userInfo.getUserState(),userInfo.getUserEmail(),userInfo.getUserShare()));
	}

	/**
	 * @return Returns the fileList.
	 */
	public FileList getFileList() {
		return fileList;
	}
	/**
	 * @param fileList The fileList to set.
	 */
	public void setFileList(FileList fileList) {
		this.fileList = fileList;
	}
	/**
	 * @return Returns the userInfo.
	 */
	public UserInfo getUserInfo() {
		return userInfo;
	}
	/**
	 * @param userInfo The userInfo to set.
	 */
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	/**
	 * @return Returns the userPassword.
	 */
	public String getUserPassword() {
		return userPassword;
	}
	/**
	 * @param userPassword The userPassword to set.
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
}
