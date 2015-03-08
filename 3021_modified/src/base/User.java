package base;

import org.omg.CORBA.Object;


public class User implements Comparable<User>{
	private int userID;
	private String userName;
	private String userEmail;
	/**
	 * Constructor
	 * @param id
	 * @param name
	 * @param email
	 */
	public User(int id,String name,String email) {
		this.userID = id;
		this.userName = name;		
		this.userEmail = email;
	}
	/**
	 * 
	 * @return userName
	 */
	public String getUserName(){
		return this.userName;
	}
	public void setUserName(String name){
		this.userName = name;	
	}
	/**
	 * 
	 * @return userEmail
	 */
	public String getUserEmai(){
		return this.userEmail;
	}
	public void setUserEmai(String email){
		this.userEmail = email;	
	}

	/**
	 * Output this object in string format
	 * @return String
	 */
	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName
				+ ", userEmail=" + userEmail + "]";
	}
	
	
	@Override
	public boolean equals(java.lang.Object  o){
		boolean ans = true;
		if (o == this){
			ans = true;
		}
		if((o == null) || (this.getClass() != o.getClass())){
			ans = false;
		}
		
		User o_user =(User) o;
		if (userEmail == null) {
			if (o_user.userEmail != null)
				ans = false;
		} else if (!userEmail.equals(o_user.userEmail))
			ans = false;
		if (userID != o_user.userID)
			ans = false;
		if (userName == null) {
			if (o_user.userName != null)
				ans = false;
		} else if (!userName.equals(o_user.userName))
			ans = false;
		return ans;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result + userID;
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	public boolean contains(String keyword){
		if(userName.contains(keyword) || userEmail.contains(keyword)){
			return true;
		}
		else{
			return false;
		}
		
	}
	@Override
	public int compareTo(User u){
		final int greater = 1;
		final int less = -1;
		final int equal = 0;
		
		if (this == u) return equal;
		
		if (this.userID < u.userID) return less;
	    if (this.userID > u.userID) return greater;
	    
	    return equal;
	}
	
}
