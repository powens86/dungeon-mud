/*
 * dungeon/mud sandbox
 * project start date: 8/31/2015
 * author: patrick owens
 */

import java.util.*;
import javax.swing.*;

public class dungeonMain {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, "hello world");
		System.out.println("hello world");
		
		/*Scanner userInput = new Scanner(System.in);*/
		
		String userInput = "";
		
		userInput = JOptionPane.showInputDialog(null, "please choose 'U' for up or 'D' for down");
		System.out.println("please choose u for up or d for down:");
		
		switch (userInput){
			case "u":
			{
				JOptionPane.showMessageDialog(null, "really? you choose up?");
				System.out.println("really? you choose up?");
				break;
			}
			case "d":
			{
				JOptionPane.showMessageDialog(null, "she chose dooooowwwnn!!!");
				System.out.println("she chose dooooowwwnn!!!");
				break;
			}
			case "secret":
			{
				secret();
				break;
			}
			case "test":
			{
				test();
				break;
			}
			default:
			{
				JOptionPane.showMessageDialog(null, "twit");
				System.out.println("twit.");
			}
		}
		
	}
	
	
	public static void secret(){
		
		JOptionPane.showMessageDialog(null, "you found the secret area!!!");
		System.out.println("you found the secret area!!!");
		
	}
	
	
	
	public static void test(){
		
		// define labels for buttons
		String[] buttons = { "north", "south", "east", "west" };

	    int rc = JOptionPane.showOptionDialog(null, "which direction would you like to go?", "Confirmation",
	        JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[2]);

	    System.out.println(rc);
	    
	    switch (rc){
	    case 0:
	    {
	    	System.out.println("you chose " + buttons[0]);
	    	break;
	    }
	    case 1:
	    {
	    	System.out.println("you chose south");
	    	break;
	    }
	    case 2:
	    {
	    	System.out.println("you chose east");
	    	break;
	    }
	    case 3:
	    {
	    	System.out.println("you chose west");
	    	break;
	    }
	    
	    }
	    
	    
	}

}
