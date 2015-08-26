import java.util.Scanner;

public class Quizzer
	{
		static int nOfC;
		static int nOfQ;
		static int nOfW;
		public static void main(String[] args)
			{
				greeting();
				generateQuestions();
				
				

			}
		public static void greeting()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Hello! How many questions would you like to answer today?");
			nQ = userInput.nextInt();
			
		}
		public static void generateQuestions()
		{
			int specialAsk = (int)(Math.random()*(nOfQ/2));
			int askSpecial = (int)(Math.random()*(nOfQ/2)+(nOfQ/2));
			Scanner userInput = new Scanner(System.in);
			for( int i=0;i<nOfQ; i++)
				{
					
					int mod1 =(int)(Math.random()*10)+1;
					int mod2 =(int)(Math.random()*10)+10;
					int answer = mod1%mod2;
					if(i==specialAsk)
						{
							mod2=mod1;
							answer=mod1%mod2;
							System.out.println("What is "+mod1+"%"+mod1+"?");
							int userAnswer = userInput.nextInt();
							if( userAnswer == answer)
								{
									nOfC++;
								}
							else
								{
									nOfW++;
								}
							
							
						}
					if(i==askSpecial)
						{
							
						}
				}
			
			
			
		}
		
	

	}
