package rozee;
import java.io.*;
import java.util.*;
public class rozee_pk {

	public static void main(String[] args) throws IOException 
	{
		String logchoice;
		Scanner input=new Scanner(System.in);
		do{
			System.out.println("You must be logged in\n" + "Type S to Sign up\n" 
		+ "Type L to Login");
		logchoice = input.nextLine();
		if(!logchoice.matches("s|l"))
			System.out.println("Please type right input");
		}
		while(!logchoice.matches("s|l"));
	
		
	       if(logchoice.equalsIgnoreCase("S")){
	    System.out.print("Enter your email and password for registration\n" + "Email : ");
			String b = input.nextLine(); 
		

			
		
		String c,d;
		
		
		
		do{
				System.out.print("password : ");
			c = input.nextLine();
			
			System.out.print("Re-type password : ");
			d = input.nextLine();
		
			if(!c.equals(d))
				System.out.println("Password does not match, Please re-enter the password");
				
		}

		while(!c.equals(d));
		
		System.out.println("Your account is registered");
		
		
		File file;
		file = new File("afi.txt");
		if(!file.exists()){
			file.createNewFile();
		}	
		try
		{
		    String filename= "accountsfile.txt";
		    FileWriter writer = new FileWriter(filename,true);
		    writer.write(String.format("%n%s %s",b,d));
		    writer.close();
		}
		    catch(IOException ioe)
			{
			    System.err.println("IOException: " + ioe.getMessage());
			}
	          }
		
		
		else if(logchoice.equalsIgnoreCase("L")){
			String email;
			String password;
			String j = null;
		    String i = null;
		    int correct= 0;
		  
		do {
			System.out.print("Enter you Email and password\n" + "Email : ");
			email = input.nextLine();
			System.out.print("Password : ");
			password = input.nextLine();
			Scanner g = new Scanner(new File("afi.txt"));
			
				while(g.hasNext()){
				i = g.next();
				j = g.next();
				
				if(email.equals(i) && password.equals(j)){
					correct = 1;
				}
			}
				if(correct == 0){
				System.out.println("Your password or email is incorrect please try again");
			}
				}
			while(correct != 1);

		}
	}}