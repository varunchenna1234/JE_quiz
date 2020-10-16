package quiz;
import java.util.*;
public class questions {
	Scanner in=new Scanner(System.in);
	String question,option1,option2,option3,option4;
	int userans,crctans;
	public boolean askquestion() {
		System.out.println(question);
		System.out.println("1. "+option1);
		System.out.println("2. "+option2);
		System.out.println("3. "+option3);
		System.out.println("4. "+option4);
		System.out.println("Enter your answer ");
		userans=in.nextInt();
		if(userans==crctans) {
			return true;
		}
		
		return false;
		
	}
	
}
