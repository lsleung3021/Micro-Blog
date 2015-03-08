package base;

import org.omg.CORBA.Object;


public class User {
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

	@Override
	/**
	 * Output this object in string format
	 * @return String
	 */
	public String toString(){
		return userID + userName + userEmail;
	}
	
	
	public boolean equals(Object o){
		boolean ans = true;
		if (o == this){
			ans = true;
		}
		if((o == null) || (this.getClass() != o.getClass())){
			ans = false;
		}
		
		User o_user =(User) o;
		if((this.userID != o_user.userID) || this.userName != o_user.userName || this.userEmail != o_user.userEmail){
			ans = false;
		}
		return ans;
	}
	
	@Override
	public int hashCode(){
		final int hashCode = 7; 
		//userID.hashCode();
		userName.hashCode();
		userEmail.hashCode();
		return hashCode;		
	}
	public boolean contains(String keyword){
		if(userName.contains(keyword) || userEmail.contains(keyword)){
			return true;
		}
		else{
			return false;
		}
		
	}
	
}
