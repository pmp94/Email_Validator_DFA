/*
Name - Param Patel
UCID - Pmp94
*/
import java.util.Scanner;
import java.lang.*;

public class p1_21s_pmp94 
{
	public static void main(String[] args)
	{
		System.out.println("Project 1 for CS 341");
		System.out.println("Section number:008 ");
		System.out.println("Semester: Spring 2021");
		System.out.println("Written by: Param Patel, pmp94 ");
		System.out.println("Instructor: Marvin Nakayama, marvin@njit.edu");
		boolean cont = true;
		String input = "";
		while(cont)
		{
			Scanner read = new Scanner(System.in);
			System.out.println("Would you like to enter a string? (y/n): ");
			input = read.nextLine();
			
			if(input.equals("y"))
			{
				System.out.println("Please enter a string: ");
				input = read.nextLine();
				System.out.println("inputut String: " + input);
				testString(input);
			}
			else if(input.equals("n"))
			{
				cont = false;
			}
			else
			{
				System.out.println("You must enter 'y' for yes, or 'n' for no.");
			}
		}
	}
	
	public static void testString (String test)
	{
		char[] chars = test.toCharArray();
		int state = 0;
		
		System.out.println("Starting state: q0");
		for(char i: chars)
		{
			System.out.println("Current character: " + i);
			if(state == 0)
			{
				if(i >= 'a' && i <= 'z')
				{
					
					state = 1;
					cState(state);
				}
				else if(i == '.')
				{
			
					state = 0;
					cState(state);
				}
				else if(i == '@')
				{
					state = 0;
					cState(state);
				}
				else
				{
					state = 0;
					cState(state);
				}
				
			}
			else if(state == 1)
			{
				if(i >= 'a' && i <= 'z')
				{
					
					state = 1;
					cState(state);
				}
				else if(i == '.')
				{
				
					state = 2;
					cState(state);
				}
				else if(i == '@')
				{
					state = 3;
					cState(state);
				}
				else
				{
					state = 5;
					cState(state);
				}
			}
			else if(state == 2)
			{
				if(i >= 'a' && i <= 'z')
				{
					
					state = 1;
					cState(state);
				}
				else if(i == '.')
				{
				
					state = 5;
					cState(state);
				}
				else if(i == '@')
				{
					state = 5;
					cState(state);
				}
				else
				{
					state = 5;
					cState(state);
				}
			}
			else if(state == 3)
			{
				if(i >= 'a' && i <= 'z')
				{
					
					state = 4;
					cState(state);
				}
				else if(i == '.')
				{
				
					state = 5;
					cState(state);
				}
				else if(i == '@')
				{
					state = 5;
					cState(state);
				}
				else
				{
					state = 5;
					cState(state);
				}
			}
			else if(state == 4)
			{
				if(i >= 'a' && i <= 'z')
				{
					
					state = 4;
					cState(state);
				}
				else if(i == '.')
				{
				
					state = 6;
					cState(state);
				}
				else if(i == '@')
				{
					state = 5;
					cState(state);
				}
				else
				{
					state = 5;
					cState(state);
				}
			}
			else if(state == 6)
			{
				if(i >= 'a' && i <= 'm' || i >= 'o' && i <= 'z')
				{
					
					state = 4;
					cState(state);
				}
				else if(i == 'n')
				{
				
					state = 7;
					cState(state);
				}
				else if(i == '.')
				{
				
					state = 5;
					cState(state);
				}
				else if(i == '@')
				{
					state = 5;
					cState(state);
				}
				else
				{
					state = 5;
					cState(state);
				}
			}
			else if(state == 7)
			{
				if(i >= 'a' && i <= 'd' || i >= 'f' && i <= 'z')
				{
					
					state = 4;
					cState(state);
				}
				else if(i == 'e')
				{
				
					state = 8;
					cState(state);
				}
				else if(i == '.')
				{
				
					state = 6;
					cState(state);
				}
				else if(i == '@')
				{
					state = 5;
					cState(state);
				}
				else
				{
					state = 5;
					cState(state);
				}
			}
			else if(state == 8)
			{
				if(i >= 'a' && i <= 's' || i >= 'u' && i <= 'z')
				{
					
					state = 4;
					cState(state);
				}
				else if(i == 't')
				{
				
					state = 9;
					cState(state);
				}
				else if(i == '.')
				{
				
					state = 6;
					cState(state);
				}
				else if(i == '@')
				{
					state = 5;
					cState(state);
				}
				else
				{
					state = 5;
					cState(state);
				}
			}
			else if(state == 9)
			{
				if(i >= 'a' && i <= 'z')
				{
					
					state = 4;
					cState(state);
				}
				else if(i == '.')
				{
				
					state = 6;
					cState(state);
				}
				else if(i == '@')
				{
					state = 5;
					cState(state);
				}
				else
				{
					state = 5;
					cState(state);
				}
			}
			else if(state == 5)
			{
				if(i >= 'a' && i <= 'z')
				{
					
					state = 5;
					cState(state);
				}
				else if(i == '.')
				{
				
					state = 5;
					cState(state);
				}
				else if(i == '@')
				{
					state = 5;
					cState(state);
				}
				else
				{
					state = 5;
					cState(state);
				}
			}
			
		}
		
		if(state == 9)
			System.out.println("String accepted.");
		else
			System.out.println("String rejected.");
	}
	
	public static void cState(int state)
	{
		
			System.out.println("State: q" + state);
	}
}
