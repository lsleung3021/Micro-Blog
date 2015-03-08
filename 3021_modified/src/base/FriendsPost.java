package base;

import java.util.Date;

import base.Post;
import base.User;

public class FriendsPost extends Post{
	private User friend;
	
	public FriendsPost(Date date, String content, User user) {
		super(date,content);	
		this.friend= user;
	}
	
}
