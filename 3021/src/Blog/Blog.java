package Blog;

import java.util.ArrayList;

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
	public String toString(){
		return user.toString() + allPosts.toString();
	}
	
	public boolean equals(Object o){
		boolean ans = true;
		if (o == this){
			ans = true;
		}
		if((o == null) || (this.getClass() != o.getClass())){
			ans = false;
		}
		
		Blog o_blog =(Blog) o;
		if((this.user != o_blog.user) || this.allPosts != o_blog.allPosts){
			ans = false;
		}
		return ans;
	}
	
	public int hashCode(){
		final int hashCode = 7; 
		user.hashCode();
		allPosts.hashCode();
		return hashCode;		
	}
	
	
}
