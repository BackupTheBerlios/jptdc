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
public class UserInfo {
	
	private String userNickname;
	private String userDescripiption;
	private String userSpeed;
	private String userEmail;
	private String userShare;
	private String userState;
	
	private String clientVersion;
	private String clientName;
	private String clientTag;
	
	/**
	 * 
	 */
	public UserInfo(String nickname) {
		super();
		inicialize();
		setUserNickname(nickname);
	}
	private void inicialize(){
		setUserNickname("");
		setUserDescripiption("");
		setUserEmail("");
		setUserShare("");
		setUserSpeed("");
		setUserState(String.valueOf((char)1));
		setClientName("");
		setClientTag("");
		setClientVersion("");
	}

	/**
	 * @return Returns the userDescripiption.
	 */
	public String getUserDescripiption() {
		return userDescripiption;
	}
	/**
	 * @param userDescripiption The userDescripiption to set.
	 */
	public void setUserDescripiption(String userDescripiption) {
		this.userDescripiption = userDescripiption;
	}
	/**
	 * @return Returns the userEmail.
	 */
	public String getUserEmail() {
		return userEmail;
	}
	/**
	 * @param userEmail The userEmail to set.
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	/**
	 * @return Returns the userShare.
	 */
	public String getUserShare() {
		return userShare;
	}
	/**
	 * @param userShare The userShare to set.
	 */
	public void setUserShare(String userShare) {
		this.userShare = userShare;
	}
	/**
	 * @return Returns the userSpeed.
	 */
	public String getUserSpeed() {
		return userSpeed;
	}
	/**
	 * @param userSpeed The userSpeed to set.
	 */
	public void setUserSpeed(String userSpeed) {
		this.userSpeed = userSpeed;
	}
	/**
	 * @return Returns the userState.
	 */
	public String getUserState() {
		return userState;
	}
	/**
	 * @param userState The userState to set.
	 */
	public void setUserState(String userState) {
		this.userState = userState;
	}
	/**
	 * @return Returns the userNickname.
	 */
	public String getUserNickname() {
		return userNickname;
	}
	/**
	 * @param userNickname The userNickname to set.
	 */
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	/**
	 * @return Returns the clientName.
	 */
	public String getClientName() {
		return clientName;
	}
	/**
	 * @param clientName The clientName to set.
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	/**
	 * @return Returns the clientTag.
	 */
	public String getClientTag() {
		return clientTag;
	}
	/**
	 * @param clientTag The clientTag to set.
	 */
	public void setClientTag(String clientTag) {
		this.clientTag = clientTag;
	}
	/**
	 * @return Returns the clientVersion.
	 */
	public String getClientVersion() {
		return clientVersion;
	}
	/**
	 * @param clientVersion The clientVersion to set.
	 */
	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
	}
}
