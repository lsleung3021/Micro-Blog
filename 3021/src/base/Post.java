package base;


import java.util.Date;

import org.omg.CORBA.Object;

public class Post {
	
	private Date date;
	private String content;

	public Post(Date date, String content) {
		this.date = date;
		this.content = content;		
	}
	
	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content = content;	
	}
	public String toString(){
		return date.toString() + content;
	}
	public boolean equals(Object o){
		boolean ans = true;
		if (o == this){
			ans = true;
		}
		if((o == null) || (this.getClass() != o.getClass())){
			ans = false;
		}
		
		Post o_post =(Post) o;
		if((this.date != o_post.date) || this.content != o_post.content){
			ans = false;
		}
		return ans;
	}
	@Override
	public int hashCode(){
		final int hashCode = 7; 
		date.hashCode();
		content.hashCode();
		return hashCode;		
	}
	public boolean contains(String keyword){
		if(content.contains(keyword)){
			return true;
		}
		else{
			return false;
		}
		
	}
}
