package quiz;
import java.util.*;
public class game {
	Scanner in=new Scanner(System.in);
	questions[] ques=new questions[2];
	String[] quest= {"which is not access specifier in Java?","Which is not a primitive data type in java?"};
	String[] option1= {"public","int"};
	String[] option2= {"private","float"};
	String[] option3= {"main","double"};
	String[] option4= {"Protected","String"};
	int[] answer= {3,4};
	int score=0;
	people player=new people();
	public void initial() {
		for(int i=0;i<2;i++) {
			ques[i]=new questions();
			ques[i].question=quest[i];
			ques[i].option1=option1[i];
			ques[i].option2=option2[i];
			ques[i].option3=option3[i];
			ques[i].option4=option4[i];
			ques[i].crctans=answer[i];
		}	
		}
	
	public void play(){
		
		player.getdetails();
		for(int i=0;i<2;i++){
			boolean stat=ques[i].askquestion();
			
			if(stat==true) {
				System.out.println("Correct");
				score++;
				
			}
			else {
				score--;
				System.out.println("Wrong");
			}
		System.out.println("Your score is "+score);
			
		}
		
	
		
		
	}

}
