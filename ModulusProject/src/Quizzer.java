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
			nOfQ = userInput.nextInt();
			
		}
		public static void generateQuestions()
		{
			int specialAsk = (int)(Math.random()*(nOfQ/2)+1);
			int askSpecial = (int)(Math.random()*(nOfQ/2)+(nOfQ/2)+1);
			Scanner userInput = new Scanner(System.in);
			for( int i=0;i<nOfQ; i++)
				{
					
					int mod1 =(int)(Math.random()*10)+1;
					int mod2 =(int)(Math.random()*10)+10;
				
					int answer = mod2%mod1;
					
					if(i==specialAsk)
						{
							mod2=mod1;
							answer=mod1%mod2;
							System.out.println("What is "+mod1+"%"+mod1+"?");
							int userAnswer = userInput.nextInt();
							if( userAnswer == answer)
								{
									nOfC++;
									System.out.println("Correct!");
								}
							else
								{
									nOfW++;
									System.out.println("Sorry, wrong");
								}
							
							
						}
					if(i==askSpecial)
						{
							System.out.println("What is "+mod1+"%"+mod2+"?");
							answer = mod1%mod2;
							int userAnswer = userInput.nextInt();
							if( userAnswer == answer)
								{
									nOfC++;
									System.out.println("Correct!");
								}
							else
								{
									nOfW++;
									System.out.println("Sorry, wrong");
								}
						}
					else
						{
							System.out.println("What is "+mod2+"%"+mod1+"?");
							int userAnswer = userInput.nextInt();
							if(userAnswer == answer)
								{
									nOfC++;
									System.out.println("Correct!");
									
								}
							else
								{
									nOfW++;
									System.out.println("Sorry, wrong");
								}
						}
					
				}
			System.out.println("You have gotten "+nOfC+" correct and "+nOfW+" wrong.");
			
			
		}
		
	

	}
