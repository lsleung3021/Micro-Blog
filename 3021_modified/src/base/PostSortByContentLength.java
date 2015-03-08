package base;
import java.util.Comparator;
public class PostSortByContentLength implements Comparator<Post>{
	@Override
	
	public int compare(Post p1,Post p2) {
		final int greater = 1;
		final int less = -1;
		final int equal = 0;
		
		if (p1 == p2) return equal;
		
		if (p1.getContent().length() < p1.getContent().length()) return less;
	    if (p1.getContent().length() > p1.getContent().length()) return greater;
	    //System.out.println(p1.getContent().length());
	    return equal;
	}
	
	/*public int compare(Post p1,Post p2) {
		int result = 0;
		
		if (p1 == p2) result = 0;
		
		if (p1.getContent().length() < p1.getContent().length()) result = -1;
	    if (p1.getContent().length() > p1.getContent().length()) result = 1;
	    System.out.println(p1.getContent().length());
	    return result;
	}*/
}
