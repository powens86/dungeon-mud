import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class swingSandbox {
	
	//// main app window and panels ////
	private JFrame appWindow;		  //
	private JPanel storyPanel;		  //
	private JPanel btnContainer;	  //
	private JPanel controlPanel;	  //
	private JTextArea txtStory;		  //
	//// main app window and panels ////
	
	
	//// inventory window and panels ////////
	private JFrame inventoryWindow;		   //
	private JPanel inventoryPanel;		   //
	private JPanel inventButtons;		   //
	//// inventory window and panels ////////
	
	
	public swingSandbox(){
		loadGUI();
	}
	
	
	public static void main(String[] args){
		swingSandbox callApp = new swingSandbox();
		callApp.dungeonApp();
	}
	
	
	private void loadGUI(){
		
		//// create main app window ////////////////////////////////
		appWindow = new JFrame("Dungeon App GUI Test");			  //
		appWindow.setSize(400,550);								  //
		// make app not resizeable								  //
		appWindow.setResizable(false);							  //
		appWindow.setLayout(new GridLayout(2, 1));				  //
		appWindow.addWindowListener(new WindowAdapter() {		  //
	         public void windowClosing(WindowEvent windowEvent){  //
	            System.exit(0);									  //
	         }        											  //
	      });													  //
		//// create main app window ////////////////////////////////
		
		
		//// create inventory window //////////////////////////////////////////
		inventoryWindow = new JFrame("Inventory");							 //
		inventoryWindow.setSize(300, 400);									 //
		// make inventory window not resizeable								 //
		inventoryWindow.setResizable(false);								 //
		inventoryWindow.setLayout(new GridLayout(1,1));						 //
		inventoryWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   //
		//// create inventory window //////////////////////////////////////////
		
		
		////////// main app window ///////////////////////
		//// create text panel ///////////////////////////
		storyPanel = new JPanel();                      //
		int storyWidth = appWindow.getWidth()-25;		//
		int storyHeight = appWindow.getHeight()/3-10;	//
		storyPanel.setPreferredSize(new Dimension(storyWidth,storyHeight));
		storyPanel.setLayout(new FlowLayout());         //
		//// create button panel and its container ///////
		btnContainer = new JPanel();					//
		btnContainer.setLayout(new FlowLayout());		//
		btnContainer.setBorder(BorderFactory.createEtchedBorder());
		controlPanel = new JPanel();					//
		int btnWidth = appWindow.getWidth()-25;			//
		int btnHeight = appWindow.getHeight()/4;		//
		controlPanel.setPreferredSize(new Dimension(btnWidth,btnHeight));
		controlPanel.setLayout(new GridLayout(4,3));	//
		//// place text and story panels /////////////////
		appWindow.add(storyPanel);						//
		appWindow.add(btnContainer);					//
		btnContainer.add(controlPanel);					//
		appWindow.setVisible(true);						//
		////////// main app window ///////////////////////
		
		
		////////// inventory window //////////////////////
		//// create text panel ///////////////////////////
		inventoryPanel = new JPanel();					//
		inventoryPanel.setLayout(new FlowLayout());		//
		//// create button panel /////////////////////////
		inventButtons = new JPanel();					//
		inventButtons.setLayout(new GridLayout(2,3));	//
		//// place panels ////////////////////////////////
		inventoryWindow.add(inventoryPanel);			//
		inventoryWindow.add(inventButtons);				//
		inventoryWindow.setVisible(false);				//
		////////// inventory window //////////////////////
		
	}
	
	
	private void dungeonApp(){
		
		//// center app windows on screen ////////////////////////////////
		// Get the size of the screen									//
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();	//
        																//
        // Determine the new location of the window						//
        int w = appWindow.getSize().width;								//
        int h = appWindow.getSize().height;								//
        int x = (dim.width-w)/2;										//
        int y = (dim.height-h)/2;										//
        int ix = (dim.width)/2+(w/2);									//
        																//
        // Move the window												//
        appWindow.setLocation(x, y);									//
        inventoryWindow.setLocation(ix,y);								//
        //// center app windows on screen ////////////////////////////////
        
		
		//// create buttons /////////////////////////////
        JButton btnLook = new JButton("Look");		   //
        JButton btnUp = new JButton("UP");			   //
        JButton btnDown = new JButton("Down");		   //
        JButton btnPickUp = new JButton("Pick Up");	   //
        JButton btnUse = new JButton("Use");		   //
        JButton button4 = new JButton("Button 4");	   //
		JButton btnInvent = new JButton("Inventory");  //
		JButton btnNorth = new JButton("North");	   //
		JButton btnQuit = new JButton("Quit");		   //
		JButton btnWest = new JButton("West");		   //
		JButton btnSouth = new JButton("South");	   //
		JButton btnEast = new JButton("East");		   //
		JButton closeInvent = new JButton("Close");	   //
		//// create buttons /////////////////////////////
		
		
		//// buttons do stuff ////////////////////////////////
		// open inventory screen							//
		btnInvent.addActionListener(new ActionListener() {  //
			public void actionPerformed(ActionEvent e){		//
				inventoryWindow.setVisible(true);			//
			}												//
		});													//
		// quit button										//
		btnQuit.addActionListener(new ActionListener() {	//
			public void actionPerformed(ActionEvent e){		//
				int confirmQuit = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?", null, JOptionPane.YES_NO_OPTION);
					if (confirmQuit == JOptionPane.YES_OPTION){
						System.exit(0);						//
					}										//
			}												//
		});													//
		// north button										//
		btnNorth.addActionListener(new ActionListener(){	//
			public void actionPerformed(ActionEvent e){		//
				txtStory.append("You chose to go North. \n");
			}												//
		});													//
		// south button										//
		btnSouth.addActionListener(new ActionListener(){	//
			public void actionPerformed(ActionEvent e){		//
				txtStory.append("You chose to go South. \n");
			}												//
		});													//
															//
		// west button										//
		btnWest.addActionListener(new ActionListener(){		//
			public void actionPerformed(ActionEvent e){		//
				txtStory.append("You chose to go West. \n");//
			}												//
		});													//
		// east button										//
		btnEast.addActionListener(new ActionListener(){		//
			public void actionPerformed(ActionEvent e){		//
				txtStory.append("You chose to go East. \n");//
			}												//
		});													//
		// button 4. because i can
		button4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				btnQuit.setEnabled(false);
			}
		});
		//// buttons do stuff ////////////////////////////////
		
		
		//// create text area for story //////////////////////
		txtStory = new JTextArea(15,1);						//
		int txtStoryWidth = appWindow.getWidth()-25;		//
		int txtStoryHeight = appWindow.getHeight()/3-10;	//
		//txtStory.setPreferredSize(new Dimension(txtStoryWidth,txtStoryHeight));
		txtStory.setColumns(33);							//
		// make text scrollable 							//
															//
		JScrollPane scrollex = new JScrollPane(txtStory);	//
															//
		// make text not editable 							//
		txtStory.setEditable(false);						//
															//
		// add auto-scroll to text area						//
		scrollex.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {  
	        public void adjustmentValueChanged(AdjustmentEvent e) {  
	            e.getAdjustable().setValue(e.getAdjustable().getMaximum());  
	        }												//
	    });													//
															//
		// initialize story text							//
		storyPanel.add(scrollex);							//
		String story = "Welcome to the jun... \n"   		//
				+"Uh... dungeon... \n \n \n";				//
		txtStory.setText(story);							//
		//// create text area for story //////////////////////
		
		
		//// populate the control panel ///////////////////////
		controlPanel.add(btnInvent);  controlPanel.add(btnUse);  controlPanel.add(btnLook);
		controlPanel.add(button4);  controlPanel.add(btnNorth);  controlPanel.add(btnPickUp);
		controlPanel.add(btnWest);  controlPanel.add(btnSouth);  controlPanel.add(btnEast);
		controlPanel.add(btnUp);  controlPanel.add(btnDown);  controlPanel.add(btnQuit);
		//// populate the control panel ///////////////////////
		btnQuit.setEnabled(true);
		appWindow.setVisible(true);
		inventoryWindow.setVisible(false);
		
		
		//// inventory window ////////////////////////////////////
		inventoryPanel.add(closeInvent);						//
		closeInvent.addActionListener(new ActionListener(){		//
			public void actionPerformed(ActionEvent e){			//
				inventoryWindow.setVisible(false);				//
			}													//
		});														//
		//// inventory window ////////////////////////////////////
		
	}
	
	
}
