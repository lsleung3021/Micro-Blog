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
	@Override
	public String toString() {
		return "Post [date=" + date + ", content=" + content + "]";
	}
	@Override
	public boolean equals(java.lang.Object o){
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
		if (content == null) {
			if (o_post.content != null)
				ans = false;
		} else if (!content.equals(o_post.content))
			ans = false;
		if (date == null) {
			if (o_post.date != null)
				ans = false;
		} else if (!date.equals(o_post.date))
			ans = false;
		return ans;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		return result;
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
