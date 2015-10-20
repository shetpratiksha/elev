
public class Door {
	
String state;
	
	Door ()
	{
		state="close";
	}

	
	void change_state()
	{
		if(state=="close")
		{
			state="open";
			System.out.println("opening the door");
		}
		else
		{
			state="close";
			System.out.println("close the door");
			
		}
	}

}
