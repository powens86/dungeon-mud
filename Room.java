import java.util.*;

public class Room{

String description;
String roomNumber;

public static String dir;
public Scanner input = new Scanner(System.in);

	public Room(String roomNumber){
		// objects in room and stuff the room does goes here
		System.out.println(roomNumber);
		
		
		
		/*dir = input.next();
		
		switch(dir){
			case "2":{
				Room.;
				break;
			}
		}*/
	}
	
	public void setDescription(String roomDesc){
		description = roomDesc;
	}
	
	public String getDescription(){
		System.out.println(description);
		return description;
	}
	
	public void setRoomNumber(String roomNum){
		roomNumber = roomNum;
	}
	
	public String getRoomNumber(){
		System.out.println(roomNumber);
		return roomNumber;
	}
	
	
	public static void main(String[] args){
		// this is where the new room objects are created
		
		Room r201 = new Room("this is room r201.");
		
		r201.setDescription("you are in room ");
		
		r201.setRoomNumber("r201");
		
		r201.getRoomNumber();
		
		System.out.println("to be redundant, " + r201.description + r201.roomNumber);
		
		
	}


}