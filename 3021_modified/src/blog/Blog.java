package blog;

import java.util.ArrayList;
import java.util.Calendar;

import org.omg.CORBA.Object;

import base.*;


public class Blog{
	private User user;
	private ArrayList<Post> allPosts;
	
	public Blog(User user){
		this.user=user;
		this.allPosts = new ArrayList<Post>();
	}
	
	public User getUser(){
		return this.user;
	}
	
	public void setUser(User user){
		this.user=user;
	}
	
	public void post(Post p){
		allPosts.add(p);
		System.out.println("Post" + allPosts.indexOf(p) + "adding to blog succeed");
	}
	
	public void list(){
		for (Post i : allPosts) {   
		    System.out.println(""+ i );
		}
	}
	public void delete(int index){
		index--;
		if (index < 0 || index > allPosts.size()){
			System.out.println("illegal index" );
			}
		else{
			allPosts.remove(index);
		}
	}
	@Override
	public String toString() {
		return "Blog [user=" + user + ", allPosts=" + allPosts + "]";
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
		
		Blog o_blog =(Blog) o;
		if (allPosts == null) {
			if (o_blog.allPosts != null)
				ans = false;
		} else if (!allPosts.equals(o_blog.allPosts))
			ans = false;
		if (user == null) {
			if (o_blog.user != null)
				ans = false;
		} else if (!user.equals(o_blog.user))
			ans = false;
		return ans;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((allPosts == null) ? 0 : allPosts.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}
	public void search(int month,String somemone) {
		
		Calendar cal = Calendar.getInstance();
		// search from all posts
		for(Post p : allPosts) {
			cal.setTime(p.getDate());
			int postMonth = cal.get(Calendar.MONTH);
			System.out.println(postMonth);
			int actualMonth = postMonth+1;
			System.out.println(actualMonth);
			if((actualMonth) == month && (p.getContent().contains(someone))){
				
			}
		}
	}
	
}
