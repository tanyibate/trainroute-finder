


import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class trainline {
	
	public static class bubbleSort
	{
	     

	      public static String[] sortStringBubble( String  x [ ] )
	      {
	            int j;
	            boolean flag = true;  // will determine when the sort is finished
	            String temp;

	            while ( flag )
	            {
	                  flag = false;
	                  for ( j = 0;  j < x.length - 1;  j++ )
	                  {
	                          if ( x [ j ].compareToIgnoreCase( x [ j+1 ] ) > 0 )
	                          {                                             // ascending sort
	                                      temp = x [ j ];
	                                      x [ j ] = x [ j+1];     // swapping
	                                      x [ j+1] = temp; 
	                                      flag = true;
	                           } 
	                   } 
	            }
				return x; 
	      } 
	}

	public static class intermediateStops {
		 static ArrayList<String> leitolboro = new  ArrayList<>();
		 static ArrayList<String> leitonott = new  ArrayList<>();
		 static ArrayList<String> leitoderby = new  ArrayList<>();
		 static ArrayList<String> leitoyork = new  ArrayList<>();
		 static ArrayList<String> lborotolei = new  ArrayList<>();
		 static ArrayList<String> lborotonott = new  ArrayList<>();
		 static ArrayList<String> lborotoderby = new  ArrayList<>();
		 static ArrayList<String> lborotoyork = new  ArrayList<>();
		 static ArrayList<String> notttolei = new  ArrayList<>();
		 static ArrayList<String> notttolboro = new  ArrayList<>();
		 static ArrayList<String> notttoderby = new  ArrayList<>();
		 static ArrayList<String> notttoyork = new  ArrayList<>();
		 static ArrayList<String> derbytolei = new  ArrayList<>();
		 static ArrayList<String> derbytolboro = new  ArrayList<>();
		 static ArrayList<String> derbytonott = new  ArrayList<>();
		 static ArrayList<String> derbytoyork = new  ArrayList<>();
		 static ArrayList<String> yorktolei = new  ArrayList<>();
		 static ArrayList<String> yorktolboro = new  ArrayList<>();
		 static ArrayList<String> yorktonott = new  ArrayList<>();
		 static ArrayList<String> yorktoderby = new  ArrayList<>();
		 static ArrayList<String> savedleitolboro = new  ArrayList<>();
		 static ArrayList<String> savedleitonott = new  ArrayList<>();
		 static ArrayList<String> savedleitoderby = new  ArrayList<>();
		 static ArrayList<String> savedleitoyork = new  ArrayList<>();
		 static ArrayList<String> savedlborotolei = new  ArrayList<>();
		 static ArrayList<String> savedlborotonott = new  ArrayList<>();
		 static ArrayList<String> savedlborotoderby = new  ArrayList<>();
		 static ArrayList<String> savedlborotoyork = new  ArrayList<>();
		 static ArrayList<String> savednotttolei = new  ArrayList<>();
		 static ArrayList<String> savednotttolboro = new  ArrayList<>();
		 static ArrayList<String> savednotttoderby = new  ArrayList<>();
		 static ArrayList<String> savednotttoyork = new  ArrayList<>();
		 static ArrayList<String> savedderbytolei = new  ArrayList<>();
		 static ArrayList<String> savedderbytolboro = new  ArrayList<>();
		 static ArrayList<String> savedderbytonott = new  ArrayList<>();
		 static ArrayList<String> savedderbytoyork = new  ArrayList<>();
		 static ArrayList<String> savedyorktolei = new  ArrayList<>();
		 static ArrayList<String> savedyorktolboro = new  ArrayList<>();
		 static ArrayList<String> savedyorktonott = new  ArrayList<>();
		 static ArrayList<String> savedyorktoderby = new  ArrayList<>();
		 static ArrayList<String> arrayToDisplay = new  ArrayList<>();
		 static ArrayList<String> alphabeticArrayToDisplay = new  ArrayList<>();
		 static String alphabeticalListString;
		 
		 
		 
		 
		 static String firstStop;
		 static String lastStop;
		 
			
		
	}
	
	public class trainStations {
		String[] trainStations = {
		         "Select a Station",
				 "Leicester",
		         "Loughborough",
		         "Nottingham",
		         "Derby",
		         "York"
		         
		};
		
	};
	
	//Jounrney Times and prices x before an array signifies that revere journey costs the same

	int date[];
	
	public static class pricesandtime {
		
		static Double xleitolboro []= {2.50,4.00,10.00};
		static Double xleitonott[] = {3.50,6.20,30.00};
		static Double xleitoderby[] = {3.70,7.00,48.00};
		static Double leitoyork []= {23.50,25.00,65.00};
		static Double xlborotonott []= {1.50,2.50,15.00};
		static Double lborotoderby []= {1.25,2.50,23.00};
		static Double lborotoyork []= {11.50,20.00,60.00};
		static Double notttoderby []= {2.50,3.00,12.00};
		static Double notttoyork []= {11.50,16.00,40.00};
		static Double derbytolboro []= {2.00,2.50,25.00};
		static Double derbytonott []= {1.50,3.00,10.00};
		static Double derbytoyork []= {7.20,16.00,85.00};
		static Double yorktolei []= {12.20,25.00,70.00};
		static Double yorktolboro []= {12.00,20.00,60.00};
		static Double yorktonott []=  {8.20,16.00,40.00};
		static Double yorktoderby []=  {11.20,16.00,75.00};

		
	};
	
	
	public static class time {
		static String time = "80";
	}
	
	

	

	
	//store trainstop selections and results
	public static class trainstopselections {
		static String selectionOne;
		static String selectionTwo;
		static Double trainTime;
		
		
		static Double trainPrice;
		static String hello ;
		static String stringMin = String.valueOf(trainstopselections.trainTime);
		static Double trainPriceReturn;
		static Boolean returnTrueOrFalse;
		static Integer selectedDay;
		static Integer selectedMonth;
		static String hello2 = "85" ;
		static String adminSelectionOne;
		static String adminSelectionTwo;
		

	
		
		
		
	};
	
	//function to get data of journeytime
	

	public static class journeytimefunction {
		

		public static void function() {
			
			if (trainstopselections.selectionOne == "Leicester"  && trainstopselections.selectionTwo == "Loughborough"  )
			{
				trainstopselections.trainTime = pricesandtime.xleitolboro[2];
				trainstopselections.trainPrice = pricesandtime.xleitolboro[0];
				trainstopselections.trainPriceReturn = pricesandtime.xleitolboro[1];
				//trainstopselections.hello = Double.toString(pricesandtime.xleitolboro[2]);
				trainstopselections.hello = time.time;
				
			}
			
			else if (trainstopselections.selectionOne == "Leicester"  && trainstopselections.selectionTwo == "Nottingham"  ){
				trainstopselections.trainTime = pricesandtime.xleitonott[2];
				trainstopselections.trainPrice = pricesandtime.xleitonott[0];
				trainstopselections.trainPriceReturn = pricesandtime.xleitonott[1];
			}
			
			else if (trainstopselections.selectionOne == "Leicester"  && trainstopselections.selectionTwo == "Derby"  ){
				trainstopselections.trainTime = pricesandtime.xleitoderby[2];
				trainstopselections.trainPrice = pricesandtime.xleitoderby[0];
				trainstopselections.trainPriceReturn = pricesandtime.xleitoderby[1];
			}
			else if (trainstopselections.selectionOne == "Leicester"  && trainstopselections.selectionTwo == "York"  ){
				trainstopselections.trainTime = pricesandtime.leitoyork[2];
				trainstopselections.trainPrice = pricesandtime.leitoyork[0];
				trainstopselections.trainPriceReturn = pricesandtime.leitoyork[1];
			}
			else if (trainstopselections.selectionOne == "Loughborough"  && trainstopselections.selectionTwo == "Leicester"  ){
				trainstopselections.trainTime = pricesandtime.xleitolboro[2];
				trainstopselections.trainPrice = pricesandtime.xleitolboro[0];
				trainstopselections.trainPriceReturn = pricesandtime.xleitolboro[1];
			}
			else if (trainstopselections.selectionOne == "Loughborough"  && trainstopselections.selectionTwo == "Nottingham"  ){
				trainstopselections.trainTime = pricesandtime.xlborotonott[2];
				trainstopselections.trainPrice = pricesandtime.xlborotonott[0];
				trainstopselections.trainPriceReturn = pricesandtime.xlborotonott[1];
			}
			else if (trainstopselections.selectionOne == "Loughborough"  && trainstopselections.selectionTwo == "Derby"  ){
				trainstopselections.trainTime = pricesandtime.lborotoderby[2];
				trainstopselections.trainPrice = pricesandtime.lborotoderby[0];
				trainstopselections.trainPriceReturn = pricesandtime.lborotoderby[1];
			}
			else if (trainstopselections.selectionOne == "Loughborough"  && trainstopselections.selectionTwo == "York"  ){
				trainstopselections.trainTime = pricesandtime.lborotoyork[2];
				trainstopselections.trainPrice = pricesandtime.lborotoyork[0];
				trainstopselections.trainPriceReturn = pricesandtime.lborotoyork[1];
			}
			else if (trainstopselections.selectionOne == "Nottingham"  && trainstopselections.selectionTwo == "Leicester"  ){
				trainstopselections.trainTime = pricesandtime.xleitonott[2];
				trainstopselections.trainPrice = pricesandtime.xleitonott[0];
				trainstopselections.trainPriceReturn = pricesandtime.xleitonott[1];
			}
			else if (trainstopselections.selectionOne == "Nottingham"  && trainstopselections.selectionTwo == "Loughborough"  ){
				trainstopselections.trainTime = pricesandtime.xlborotonott[2];
				trainstopselections.trainPrice = pricesandtime.xlborotonott[0];
				trainstopselections.trainPriceReturn = pricesandtime.xlborotonott[1];
			}
			else if (trainstopselections.selectionOne == "Nottingham"  && trainstopselections.selectionTwo == "Derby"  ){
				trainstopselections.trainTime = pricesandtime.notttoderby[2];
				trainstopselections.trainPrice = pricesandtime.notttoderby[0];
				trainstopselections.trainPriceReturn = pricesandtime.notttoderby[1];
			}
			else if (trainstopselections.selectionOne == "Nottingham"  && trainstopselections.selectionTwo == "York"  ){
				trainstopselections.trainTime = pricesandtime.notttoyork[2];
				trainstopselections.trainPrice = pricesandtime.notttoyork[0];
				trainstopselections.trainPriceReturn = pricesandtime.notttoyork[1];
			}
			else if (trainstopselections.selectionOne == "Derby"  && trainstopselections.selectionTwo == "Leicester"  ){
				trainstopselections.trainTime = pricesandtime.xleitoderby[2];
				trainstopselections.trainPrice = pricesandtime.xleitoderby[0];
				trainstopselections.trainPriceReturn = pricesandtime.xleitoderby[1];
			}
			else if (trainstopselections.selectionOne == "Derby"  && trainstopselections.selectionTwo == "Loughborough"  ){
				trainstopselections.trainTime = pricesandtime.derbytolboro[2];
				trainstopselections.trainPrice = pricesandtime.derbytolboro[0];
				trainstopselections.trainPriceReturn = pricesandtime.derbytolboro[1];
			}
			else if (trainstopselections.selectionOne == "Derby"  && trainstopselections.selectionTwo == "Nottingham"  ){
				trainstopselections.trainTime = pricesandtime.derbytonott[2];
				trainstopselections.trainPrice = pricesandtime.derbytonott[0];
				trainstopselections.trainPriceReturn = pricesandtime.derbytonott[1];
			}
			else if (trainstopselections.selectionOne == "Derby"  && trainstopselections.selectionTwo == "York"  ){
				trainstopselections.trainTime = pricesandtime.xleitoderby[2];
				trainstopselections.trainPrice = pricesandtime.xleitoderby[0];
				trainstopselections.trainPriceReturn = pricesandtime.xleitoderby[1];
			}
			else if (trainstopselections.selectionOne == "York"  && trainstopselections.selectionTwo == "Leicester"  ){
				trainstopselections.trainTime = pricesandtime.yorktolei[2];
				trainstopselections.trainPrice = pricesandtime.yorktolei[0];
				trainstopselections.trainPriceReturn = pricesandtime.yorktolei[1];
			}
			else if (trainstopselections.selectionOne == "York"  && trainstopselections.selectionTwo == "Loughborough"  ){
				trainstopselections.trainTime = pricesandtime.yorktolboro[2];
				trainstopselections.trainPrice = pricesandtime.yorktolboro[0];
				trainstopselections.trainPriceReturn = pricesandtime.yorktolboro[1];
			}
			else if (trainstopselections.selectionOne == "York"  && trainstopselections.selectionTwo == "Nottingham"  ){
				trainstopselections.trainTime = pricesandtime.yorktonott[2];
				trainstopselections.trainPrice = pricesandtime.yorktonott[0];
				trainstopselections.trainPriceReturn = pricesandtime.yorktonott[1];
			}
			else if (trainstopselections.selectionOne == "York"  && trainstopselections.selectionTwo == "Derby"  ){
				trainstopselections.trainTime = pricesandtime.yorktoderby[2];
				trainstopselections.trainPrice = pricesandtime.yorktoderby[0];
				trainstopselections.trainPriceReturn = pricesandtime.yorktoderby[1];
			}
			else return;
		};

	};
	
	public static class checkOffer {
	public static void checkforOffer() {
		journeytimefunction.function();
		if (trainstopselections.selectedDay ==30 && trainstopselections.selectedMonth ==4  ) {
			trainstopselections.trainPrice = trainstopselections.trainPrice * 0.9 ;
			trainstopselections.trainPriceReturn = trainstopselections.trainPriceReturn * 0.9;
			JOptionPane.showMessageDialog(frame, "As you have selected the last day of the month, your ticket price has been reduced by 10 percent");
			
			
			
		}
		
		else if (trainstopselections.selectedDay ==30 && trainstopselections.selectedMonth ==6  ) {
			trainstopselections.trainPrice = trainstopselections.trainPrice * 0.9 ;
			trainstopselections.trainPriceReturn = trainstopselections.trainPriceReturn * 0.9; 
			JOptionPane.showMessageDialog(frame, "As you have selected the last day of the month, your ticket price has been reduced by 10 percent");
			
		}
		
		else if (trainstopselections.selectedDay ==30 && trainstopselections.selectedMonth ==9  ) {
			trainstopselections.trainPrice = trainstopselections.trainPrice * 0.9 ;
			trainstopselections.trainPriceReturn = trainstopselections.trainPriceReturn * 0.9; 
			JOptionPane.showMessageDialog(frame, "As you have selected the last day of the month, your ticket price has been reduced by 10 percent");
			
		}
		
		else if (trainstopselections.selectedDay ==30 && trainstopselections.selectedMonth ==11  ) {
			trainstopselections.trainPrice = trainstopselections.trainPrice * 0.9 ;
			trainstopselections.trainPriceReturn = trainstopselections.trainPriceReturn * 0.9; 
			JOptionPane.showMessageDialog(frame, "As you have selected the last day of the month, your ticket price has been reduced by 10 percent");
			
		}
		
		else if (trainstopselections.selectedDay ==31 && trainstopselections.selectedMonth ==1  ) {
			trainstopselections.trainPrice = trainstopselections.trainPrice * 0.9 ;
			trainstopselections.trainPriceReturn = trainstopselections.trainPriceReturn * 0.9; 
			JOptionPane.showMessageDialog(frame, "As you have selected the last day of the month, your ticket price has been reduced by 10 percent");
			
		}
		
		else if (trainstopselections.selectedDay ==31 && trainstopselections.selectedMonth ==3  ) {
			trainstopselections.trainPrice = trainstopselections.trainPrice * 0.9 ;
			trainstopselections.trainPriceReturn = trainstopselections.trainPriceReturn * 0.9; 
			JOptionPane.showMessageDialog(frame, "As you have selected the last day of the month, your ticket price has been reduced by 10 percent");
			
		}
		
		else if (trainstopselections.selectedDay ==31 && trainstopselections.selectedMonth ==5  ) {
			trainstopselections.trainPrice = trainstopselections.trainPrice * 0.9 ;
			trainstopselections.trainPriceReturn = trainstopselections.trainPriceReturn * 0.9; 
			JOptionPane.showMessageDialog(frame, "As you have selected the last day of the month, your ticket price has been reduced by 10 percent");
			
		}
		
		else if (trainstopselections.selectedDay ==31 && trainstopselections.selectedMonth ==7  ) {
			trainstopselections.trainPrice = trainstopselections.trainPrice * 0.9 ;
			trainstopselections.trainPriceReturn = trainstopselections.trainPriceReturn * 0.9; 
			JOptionPane.showMessageDialog(frame, "As you have selected the last day of the month, your ticket price has been reduced by 10 percent");
			
		}
		else if (trainstopselections.selectedDay ==31 && trainstopselections.selectedMonth ==8  ) {
			trainstopselections.trainPrice = trainstopselections.trainPrice * 0.9 ;
			trainstopselections.trainPriceReturn = trainstopselections.trainPriceReturn * 0.9; 
			JOptionPane.showMessageDialog(frame, "As you have selected the last day of the month, your ticket price has been reduced by 10 percent");
			
		}
		else if (trainstopselections.selectedDay ==31 && trainstopselections.selectedMonth ==10  ) {
			trainstopselections.trainPrice = trainstopselections.trainPrice * 0.9 ;
			trainstopselections.trainPriceReturn = trainstopselections.trainPriceReturn * 0.9; 
			JOptionPane.showMessageDialog(frame, "As you have selected the last day of the month, your ticket price has been reduced by 10 percent");
			
		}
		
		else if (trainstopselections.selectedDay ==31 && trainstopselections.selectedMonth ==12  ) {
			trainstopselections.trainPrice = trainstopselections.trainPrice * 0.9 ;
			trainstopselections.trainPriceReturn = trainstopselections.trainPriceReturn * 0.9; 
			JOptionPane.showMessageDialog(frame, "As you have selected the last day of the month, your ticket price has been reduced by 10 percent");
			
		}
		else if (trainstopselections.selectedDay ==28 && trainstopselections.selectedMonth ==2  ) {
			trainstopselections.trainPrice = trainstopselections.trainPrice * 0.9 ;
			trainstopselections.trainPriceReturn = trainstopselections.trainPriceReturn * 0.9; 
			JOptionPane.showMessageDialog(frame, "As you have selected the last day of the month, your ticket price has been reduced by 10 percent");
			
		}
		
		else if (trainstopselections.selectedDay ==29 && trainstopselections.selectedMonth ==2  ) {
			trainstopselections.trainPrice = trainstopselections.trainPrice * 0.9 ;
			trainstopselections.trainPriceReturn = trainstopselections.trainPriceReturn * 0.9; 
			JOptionPane.showMessageDialog(frame, "As you have selected the last day of the month, your ticket price has been reduced by 10 percent");
			
		}
		else return;
	}
	}
	
	
	
	private static JFrame frame;
	private JTextField addStopTextField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("static-access")
			public void run() {
				try {
					trainline window = new trainline();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	///////////create the application
	
	public trainline() {
		initialize();
	}
    
	
	///////initialise the contents of the frame
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialize() {
		
	//initialise array of trainstations
		
		
	
		
			String[] trainStations = {
		         "Select",
				 "Leicester",
		         "Loughborough",
		         "Nottingham",
		         "Derby",
		         "York"
		         
		};
		
		
		//decalre panels
		frame = new JFrame();
		frame.setBounds(100, 100, 625, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel mainmenu = new JPanel();
		mainmenu.setLayout(null);
		mainmenu.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(mainmenu, "mainmenupanel");
		mainmenu.setVisible(true);
		
		JPanel pricePanel = new JPanel();
		pricePanel.setLayout(null);
		pricePanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(pricePanel, "pricepanel");
		pricePanel.setVisible(false);
		
		JPanel timePanel = new JPanel();
		timePanel.setLayout(null);
		timePanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(timePanel, "timepanel");
		timePanel.setVisible(false);
		
		JPanel adminPanel = new JPanel();
		frame.getContentPane().add(adminPanel, "adminpanel");
		
		JPanel routePanel = new JPanel();
		frame.getContentPane().add(routePanel, "routepanel");
		routePanel.setLayout(null);
		
		//end of starting panel components

		

		//pricepanel components
		JLabel lblReturnIncluded = new JLabel("Return to be included in ticket ?");
		lblReturnIncluded.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblReturnIncluded.setBounds(10, 25, 275, 35);
		pricePanel.add(lblReturnIncluded);

		JCheckBox chckBxReturn = new JCheckBox("YES");
		chckBxReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckBxReturn.setBounds(20, 65, 95, 25);
		pricePanel.add(chckBxReturn);

		JLabel lblTotalPrice = new JLabel("TOTAL PRICE:");
		lblTotalPrice.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTotalPrice.setBounds(20, 150, 130, 15);
		pricePanel.add(lblTotalPrice);

		JLabel lblPriceDisplayed = new JLabel("New label");
		lblPriceDisplayed.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPriceDisplayed.setBounds(170, 150, 100, 15);
		pricePanel.add(lblPriceDisplayed);

		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainmenu.setVisible(true);
				pricePanel.setVisible(false);
			}
		});
		btnReturn.setBounds(400, 260, 89, 23);
		pricePanel.add(btnReturn);
		
		JLabel lblGdp = new JLabel("GDP");
		lblGdp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGdp.setBounds(280, 150, 45, 15);
		pricePanel.add(lblGdp);

		chckBxReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckBxReturn.isSelected()) {
					lblPriceDisplayed.setText(String.valueOf(trainstopselections.trainPriceReturn));
				} else {
					lblPriceDisplayed.setText(String.valueOf(trainstopselections.trainPrice));
				}
			}
		});

		//end of price panel components///////////////////////////////////////////////////////////////////////////////////////////////
		
		
		//mainmenu components///////////////////////////////////////////////////////////////////////////////////////////////////////
		JLabel lblDisplayTime = new JLabel();
		lblDisplayTime.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDisplayTime.setBounds(10, 110, 280, 30);
		timePanel.add(lblDisplayTime);
		
		JButton timeButton = new JButton("TIME");
		timeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (trainstopselections.selectionOne==null	|| trainstopselections.selectionTwo==null || trainstopselections.selectionOne=="Select" || trainstopselections.selectionTwo=="Select" ||trainstopselections.selectionOne==trainstopselections.selectionTwo || trainstopselections.selectedDay==null ){
					JOptionPane.showMessageDialog(frame,
						    "Please select two different trainstations and a date",
						    "Error",
						    JOptionPane.ERROR_MESSAGE);
				}
				else {
				//Set text of label before showing it
				lblDisplayTime.setText(String.valueOf(Math.floor(trainstopselections.trainTime/60))+" Hours and "+String.valueOf(trainstopselections.trainTime%60)+" Minutes");
				
				mainmenu.setVisible(false);
				timePanel.setVisible(true);
				journeytimefunction.function();
				}
			}
		});
		timeButton.setBounds(160, 30, 100, 50);
		mainmenu.add(timeButton);
		
		JButton priceButton = new JButton("PRICE");
		priceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (trainstopselections.selectionOne==null	|| trainstopselections.selectionTwo==null || trainstopselections.selectionOne=="Select" || trainstopselections.selectionTwo=="Select" ||trainstopselections.selectionOne==trainstopselections.selectionTwo || trainstopselections.selectedDay==null ){
					JOptionPane.showMessageDialog(frame,
						    "Please select two different trainstations and a date",
						    "Error",
						    JOptionPane.ERROR_MESSAGE);
				}
				else {
					checkOffer.checkforOffer();
				if (chckBxReturn.isSelected()) {
					lblPriceDisplayed.setText(String.valueOf(trainstopselections.trainPriceReturn));
				} else {
					lblPriceDisplayed.setText(String.valueOf(trainstopselections.trainPrice));
				}
				
				System.out.println(trainstopselections.selectedMonth);
				mainmenu.setVisible(false);
				pricePanel.setVisible(true);
				}
			}
		});
		priceButton.setBounds(30, 30, 100, 50);
		mainmenu.add(priceButton);
		
		JLabel routesOfJourney = new JLabel("");
		routesOfJourney.setBounds(50, 70, 540, 100);
		routePanel.add(routesOfJourney);
		
		
		JButton routeButton = new JButton("ROUTE");
		routeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (trainstopselections.selectionOne==null	|| trainstopselections.selectionTwo==null || trainstopselections.selectionOne=="Select" || trainstopselections.selectionTwo=="Select" ||trainstopselections.selectionOne==trainstopselections.selectionTwo){
				JOptionPane.showMessageDialog(frame,
					    "Please select two different trainstations",
					    "Error",
					    JOptionPane.ERROR_MESSAGE);
			}
				   
				else{
				    if (trainstopselections.selectionOne == "Leicester"  && trainstopselections.selectionTwo == "Loughborough"  )
					{
					  intermediateStops.arrayToDisplay = intermediateStops.leitolboro;	
						
					}
					
					else if (trainstopselections.selectionOne == "Leicester"  && trainstopselections.selectionTwo == "Nottingham"  ){
						intermediateStops.arrayToDisplay = intermediateStops.leitonott;	
					}
					
					else if (trainstopselections.selectionOne == "Leicester"  && trainstopselections.selectionTwo == "Derby"  ){
						intermediateStops.arrayToDisplay = intermediateStops.leitoderby;	
					}
					else if (trainstopselections.selectionOne == "Leicester"  && trainstopselections.selectionTwo == "York"  ){
						intermediateStops.arrayToDisplay = intermediateStops.leitoyork;	
					}
					else if (trainstopselections.selectionOne == "Loughborough"  && trainstopselections.selectionTwo == "Leicester"  ){
						intermediateStops.arrayToDisplay = intermediateStops.lborotolei;	
					}
					else if (trainstopselections.selectionOne == "Loughborough"  && trainstopselections.selectionTwo == "Nottingham"  ){
						intermediateStops.arrayToDisplay = intermediateStops.lborotonott;	
					}
					else if (trainstopselections.selectionOne == "Loughborough"  && trainstopselections.selectionTwo == "Derby"  ){
						intermediateStops.arrayToDisplay = intermediateStops.lborotoderby;	
					}
					else if (trainstopselections.selectionOne == "Loughborough"  && trainstopselections.selectionTwo == "York"  ){
						intermediateStops.arrayToDisplay = intermediateStops.lborotoyork;	
					}
					else if (trainstopselections.selectionOne == "Nottingham"  && trainstopselections.selectionTwo == "Leicester"  ){
						intermediateStops.arrayToDisplay = intermediateStops.notttolei;	
					}
					else if (trainstopselections.selectionOne == "Nottingham"  && trainstopselections.selectionTwo == "Loughborough"  ){
						intermediateStops.arrayToDisplay = intermediateStops.notttolboro;
					}
					else if (trainstopselections.selectionOne == "Nottingham"  && trainstopselections.selectionTwo == "Derby"  ){
						intermediateStops.arrayToDisplay = intermediateStops.notttoderby;
					}
					else if (trainstopselections.selectionOne == "Nottingham"  && trainstopselections.selectionTwo == "York"  ){
						intermediateStops.arrayToDisplay = intermediateStops.notttoyork;
					}
					else if (trainstopselections.selectionOne == "Derby"  && trainstopselections.selectionTwo == "Leicester"  ){
						intermediateStops.arrayToDisplay = intermediateStops.derbytolei;
					}
					else if (trainstopselections.selectionOne == "Derby"  && trainstopselections.selectionTwo == "Loughborough"  ){
						intermediateStops.arrayToDisplay = intermediateStops.derbytolboro;
					}
					else if (trainstopselections.selectionOne == "Derby"  && trainstopselections.selectionTwo == "Nottingham"  ){
						intermediateStops.arrayToDisplay = intermediateStops.derbytonott;
					}
					else if (trainstopselections.selectionOne == "Derby"  && trainstopselections.selectionTwo == "York"  ){
						intermediateStops.arrayToDisplay = intermediateStops.derbytoyork;
					}
					else if (trainstopselections.selectionOne == "York"  && trainstopselections.selectionTwo == "Leicester"  ){
						intermediateStops.arrayToDisplay = intermediateStops.yorktolei;
					}
					else if (trainstopselections.selectionOne == "York"  && trainstopselections.selectionTwo == "Loughborough"  ){
						intermediateStops.arrayToDisplay = intermediateStops.yorktolboro;
					}
					else if (trainstopselections.selectionOne == "York"  && trainstopselections.selectionTwo == "Nottingham"  ){
						intermediateStops.arrayToDisplay = intermediateStops.yorktonott;
					}
					else if (trainstopselections.selectionOne == "York"  && trainstopselections.selectionTwo == "Derby"  ){
						intermediateStops.arrayToDisplay = intermediateStops.yorktoderby;
					}
				String listString = String.join(", ", intermediateStops.arrayToDisplay);
				routesOfJourney.setText( "The intermediate stops are "+ listString );
				String[] stringArray = intermediateStops.arrayToDisplay.toArray(new String[0]);
				String [] alphabeticalArrayToDisplay = bubbleSort.sortStringBubble(stringArray);
				intermediateStops.alphabeticalListString = String.join(", ",alphabeticalArrayToDisplay );
				
				
				
				mainmenu.setVisible(false);
				routePanel.setVisible(true);
			}}
		});
		routeButton.setBounds(160, 85, 100, 50);
		mainmenu.add(routeButton);
		
		JButton adminButton = new JButton("ADMIN");
		adminButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainmenu.setVisible(false);
				adminPanel.setVisible(true);
			
				
				
			}
		});
		adminButton.setBounds(30, 85, 100, 50);
		mainmenu.add(adminButton);
		
		//trainstopselection panel with mainpanel
		JPanel trainstopSelections = new JPanel();
		trainstopSelections.setLayout(null);
		trainstopSelections.setBounds(265, 10, 330, 235);
		mainmenu.add(trainstopSelections);

		JLabel lblCurrentDate = new JLabel();
		lblCurrentDate.setText("dd/mm/yyyy");
		lblCurrentDate.setLocation(175, 135);
		lblCurrentDate.setSize(95, 20);
		trainstopSelections.add(lblCurrentDate);;

		
		JComboBox first = new JComboBox(trainStations);
		first.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstTrainStation = (String) first.getSelectedItem();
				trainstopselections.selectionOne =  firstTrainStation;
				journeytimefunction.function();	
				
			}
		});
		
				JButton btnChangeDate = new JButton("Change Date");
				btnChangeDate.setLocation(30, 135);
				btnChangeDate.setSize(120, 20);
				btnChangeDate.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JTextField textDate = new JTextField();
						final JComponent[] inputs = new JComponent[] {
								new JLabel("Enter the date in the following format: dd/mm/yyyy."),
								textDate
						};

						int result = JOptionPane.showConfirmDialog(null, inputs, "Change Date", JOptionPane.PLAIN_MESSAGE);
						if (result == JOptionPane.OK_OPTION) {

							SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
							dateformat.setLenient(false); //Make checking more strict

							//Validate the date
							boolean illegaldate = false;
							boolean pastdate = false;
							int[] dateAttempt = {};

							try {
								Date date = dateformat.parse(textDate.getText());

								Calendar cal1 = Calendar.getInstance();
								cal1.setTime(date);
								Calendar cal2 = Calendar.getInstance();
								cal2.setTime(new Date());

								if (cal1.get(Calendar.ERA) < cal2.get(Calendar.ERA)) {
									pastdate = true;
								} else if (cal1.get(Calendar.ERA) > cal2.get(Calendar.ERA)) {
									pastdate = false;
								} else if (cal1.get(Calendar.YEAR) < cal2.get(Calendar.YEAR)) {
									pastdate = true;
								} else if (cal1.get(Calendar.YEAR) > cal2.get(Calendar.YEAR)) {
									pastdate = false;
								} else {
									pastdate = cal1.get(Calendar.DAY_OF_YEAR) < cal2.get(Calendar.DAY_OF_YEAR);
								}

								int[] jlabelReturnArray = new int[3];

								Calendar cal = Calendar.getInstance();
								cal.setTime(date);

								jlabelReturnArray[0] = cal.get(Calendar.DAY_OF_MONTH);
								jlabelReturnArray[1] = cal.get(Calendar.MONTH);
								jlabelReturnArray[2] = cal.get(Calendar.YEAR);
								dateAttempt = jlabelReturnArray;
								//save date to variable
								trainstopselections.selectedDay = cal1.get(Calendar.DAY_OF_MONTH);
								trainstopselections.selectedMonth = cal1.get(Calendar.MONTH) + 1;
								

								

							} catch (ParseException ex) {
								//If parse fails then regard as invalid input
								illegaldate = true;
							}

							if (illegaldate) {
								JOptionPane.showMessageDialog(null,"The date you entered was invalid.");
							} else if (pastdate) {
								JOptionPane.showMessageDialog(null,"You cannot enter a date in the past.");
							} else {

								
							

								lblCurrentDate.setText(textDate.getText());
								date = dateAttempt;
							}
						}
					}
				});
				trainstopSelections.add(btnChangeDate);
		first.setBounds(35, 20, 120, 35);
		trainstopSelections.add(first);
		
		JComboBox second = new JComboBox(trainStations);
		second.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String secondTrainStation = (String) second.getSelectedItem();
				trainstopselections.selectionTwo =  secondTrainStation;
				journeytimefunction.function();
				
			}
		});
		second.setBounds(190, 20, 120, 35);
		trainstopSelections.add(second);
		
		JLabel lbFrom = new JLabel("FROM");
		lbFrom.setBounds(0, 30, 45, 15);
		trainstopSelections.add(lbFrom);
		
		JLabel lbToTrainStation = new JLabel("TO");
		lbToTrainStation.setBounds(165, 30, 25, 15);
		trainstopSelections.add(lbToTrainStation);
		
		/*JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (trainstopselections.selectionOne==null	|| trainstopselections.selectionTwo==null || trainstopselections.selectionOne=="Select" || trainstopselections.selectionTwo=="Select" ||trainstopselections.selectionOne==trainstopselections.selectionTwo || trainstopselections.selectedDay==0 ){
					JOptionPane.showMessageDialog(frame,
						    "Please select two different trainstations and a date",
						    "Error",
						    JOptionPane.ERROR_MESSAGE);
				}
				else{
				
				journeytimefunction.function();
				}
				
			}
		});//
		btnSubmit.setBounds(230, 200, 90, 25);
		trainstopSelections.add(btnSubmit);*/
		
		JButton exitButton = new JButton("EXIT");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		exitButton.setBounds(30, 195, 100, 50);
		mainmenu.add(exitButton);
		//end of trainselection panel////////////////////////////////////////////////////////////////////////////////////////////////////
		//end of mainmenu components/////////////////////////////////////////////////////////////////////////////////////////////////////
		
	

		
		
		
		//timepanel components////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btnReturnFromTime = new JButton("Return");
		btnReturnFromTime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainmenu.setVisible(true);
				timePanel.setVisible(false);
			}
		});
		btnReturnFromTime.setBounds(415, 275, 90, 25);
		timePanel.add(btnReturnFromTime);
		
		JLabel lblTotalTimeRequired = new JLabel("Total Time Required for the Journey:");
		lblTotalTimeRequired.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTotalTimeRequired.setBounds(10, 65, 300, 30);
		timePanel.add(lblTotalTimeRequired);
		adminPanel.setLayout(null);
		//////////////////////////////////////////////////admin panel components////////////////////////////////////////////////////////////////
		JButton saveRoute = new JButton("SAVE ROUTE");
		saveRoute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (trainstopselections.adminSelectionOne==null	|| trainstopselections.adminSelectionTwo==null || trainstopselections.adminSelectionOne=="Select" || trainstopselections.adminSelectionTwo=="Select" ||trainstopselections.adminSelectionOne==trainstopselections.adminSelectionTwo  ){
					JOptionPane.showMessageDialog(frame,
						    "Please select two different trainstations",
						    "Error",
						    JOptionPane.ERROR_MESSAGE);
				}
				else {
				if (trainstopselections.adminSelectionOne == "Leicester"  && trainstopselections.adminSelectionTwo == "Loughborough"  )
				{
					try {
					    FileOutputStream fos = new FileOutputStream("leitolboro.txt");
					    ObjectOutputStream oos = new ObjectOutputStream(fos);   
					    oos.writeObject(intermediateStops.leitolboro); // write Array to ObjectOutputStream
					    oos.close(); 
					} catch(Exception ex) {
					    ex.printStackTrace();
					}
					
				}
				
				else if (trainstopselections.adminSelectionOne == "Leicester"  && trainstopselections.adminSelectionTwo == "Nottingham"  ){
					
				
					try {
					    FileOutputStream fos = new FileOutputStream("leitonott.txt");
					    ObjectOutputStream oos = new ObjectOutputStream(fos);   
					    oos.writeObject(intermediateStops.leitonott); // write Array to ObjectOutputStream
					    oos.close(); 
					} catch(Exception ex) {
					    ex.printStackTrace();
					}
					
				}
				
				
				
				else if (trainstopselections.adminSelectionOne == "Leicester"  && trainstopselections.adminSelectionTwo == "Derby"  ){
					try {
					    FileOutputStream fos = new FileOutputStream("leitoderby.txt");
					    ObjectOutputStream oos = new ObjectOutputStream(fos);   
					    oos.writeObject(intermediateStops.leitoderby); // write Array to ObjectOutputStream
					    oos.close(); 
					} catch(Exception ex) {
					    ex.printStackTrace();
					}
				}
				else if (trainstopselections.adminSelectionOne == "Leicester"  && trainstopselections.adminSelectionTwo == "York"  ){
					try {
					    FileOutputStream fos = new FileOutputStream("leitoyork.txt");
					    ObjectOutputStream oos = new ObjectOutputStream(fos);   
					    oos.writeObject(intermediateStops.leitoyork); // write Array to ObjectOutputStream
					    oos.close(); 
					} catch(Exception ex) {
					    ex.printStackTrace();
					}
				}
				else if (trainstopselections.adminSelectionOne == "Loughborough"  && trainstopselections.adminSelectionTwo == "Leicester"  ){
					try {
					    FileOutputStream fos = new FileOutputStream("lborotolei.txt");
					    ObjectOutputStream oos = new ObjectOutputStream(fos);   
					    oos.writeObject(intermediateStops.lborotolei); // write Array to ObjectOutputStream
					    oos.close(); 
					} catch(Exception ex) {
					    ex.printStackTrace();
					}
				}
				else if (trainstopselections.adminSelectionOne == "Loughborough"  && trainstopselections.adminSelectionTwo == "Nottingham"  ){
					try {
					    FileOutputStream fos = new FileOutputStream("lborotonott.txt");
					    ObjectOutputStream oos = new ObjectOutputStream(fos);   
					    oos.writeObject(intermediateStops.lborotonott); // write Array to ObjectOutputStream
					    oos.close(); 
					} catch(Exception ex) {
					    ex.printStackTrace();
					}
				}
				else if (trainstopselections.adminSelectionOne == "Loughborough"  && trainstopselections.adminSelectionTwo == "Derby"  ){
					try {
					    FileOutputStream fos = new FileOutputStream("lborotoderby.txt");
					    ObjectOutputStream oos = new ObjectOutputStream(fos);   
					    oos.writeObject(intermediateStops.lborotoderby); // write Array to ObjectOutputStream
					    oos.close(); 
					} catch(Exception ex) {
					    ex.printStackTrace();
					}
				}
				else if (trainstopselections.adminSelectionOne == "Loughborough"  && trainstopselections.adminSelectionTwo == "York"  ){
					try {
					    FileOutputStream fos = new FileOutputStream("lborotoyork.txt");
					    ObjectOutputStream oos = new ObjectOutputStream(fos);   
					    oos.writeObject(intermediateStops.lborotoyork); // write Array to ObjectOutputStream
					    oos.close(); 
					} catch(Exception ex) {
					    ex.printStackTrace();
					}
					
				}
				else if (trainstopselections.adminSelectionOne == "Nottingham"  && trainstopselections.adminSelectionTwo == "Leicester"  ){
					try {
					    FileOutputStream fos = new FileOutputStream("notttolei.txt");
					    ObjectOutputStream oos = new ObjectOutputStream(fos);   
					    oos.writeObject(intermediateStops.notttolei); // write Array to ObjectOutputStream
					    oos.close(); 
					} catch(Exception ex) {
					    ex.printStackTrace();
					}
				}
				else if (trainstopselections.adminSelectionOne == "Nottingham"  && trainstopselections.adminSelectionTwo == "Loughborough"  ){
					try {
					    FileOutputStream fos = new FileOutputStream("notttolboro.txt");
					    ObjectOutputStream oos = new ObjectOutputStream(fos);   
					    oos.writeObject(intermediateStops.notttolboro); // write Array to ObjectOutputStream
					    oos.close(); 
					} catch(Exception ex) {
					    ex.printStackTrace();
					}
				}
				else if (trainstopselections.adminSelectionOne == "Nottingham"  && trainstopselections.adminSelectionTwo == "Derby"  ){
					try {
					    FileOutputStream fos = new FileOutputStream("notttoderby.txt");
					    ObjectOutputStream oos = new ObjectOutputStream(fos);   
					    oos.writeObject(intermediateStops.notttoderby); // write Array to ObjectOutputStream
					    oos.close(); 
					} catch(Exception ex) {
					    ex.printStackTrace();
					}
				}
				else if (trainstopselections.adminSelectionOne == "Nottingham"  && trainstopselections.adminSelectionTwo == "York"  ){
					try {
					    FileOutputStream fos = new FileOutputStream("notttoyork.txt");
					    ObjectOutputStream oos = new ObjectOutputStream(fos);   
					    oos.writeObject(intermediateStops.notttoyork); // write Array to ObjectOutputStream
					    oos.close(); 
					} catch(Exception ex) {
					    ex.printStackTrace();
					}
				}
				else if (trainstopselections.adminSelectionOne == "Derby"  && trainstopselections.adminSelectionTwo == "Leicester"  ){
					try {
					    FileOutputStream fos = new FileOutputStream("derbytolei.txt");
					    ObjectOutputStream oos = new ObjectOutputStream(fos);   
					    oos.writeObject(intermediateStops.derbytolei); // write Array to ObjectOutputStream
					    oos.close(); 
					} catch(Exception ex) {
					    ex.printStackTrace();
					}
				}
					
				else if (trainstopselections.adminSelectionOne == "Derby"  && trainstopselections.adminSelectionTwo == "Loughborough"  ){
					try {
					    FileOutputStream fos = new FileOutputStream("derbytolboro.txt");
					    ObjectOutputStream oos = new ObjectOutputStream(fos);   
					    oos.writeObject(intermediateStops.derbytolboro); // write Array to ObjectOutputStream
					    oos.close(); 
					} catch(Exception ex) {
					    ex.printStackTrace();
					}
				}
				else if (trainstopselections.adminSelectionOne == "Derby"  && trainstopselections.adminSelectionTwo == "Nottingham"  ){
					try {
					    FileOutputStream fos = new FileOutputStream("derbytonott.txt");
					    ObjectOutputStream oos = new ObjectOutputStream(fos);   
					    oos.writeObject(intermediateStops.derbytonott); // write Array to ObjectOutputStream
					    oos.close(); 
					} catch(Exception ex) {
					    ex.printStackTrace();
					}
				}
				else if (trainstopselections.adminSelectionOne == "Derby"  && trainstopselections.adminSelectionTwo == "York"  ){
					try {
					    FileOutputStream fos = new FileOutputStream("derbytoyork.txt");
					    ObjectOutputStream oos = new ObjectOutputStream(fos);   
					    oos.writeObject(intermediateStops.derbytoyork); // write Array to ObjectOutputStream
					    oos.close(); 
					} catch(Exception ex) {
					    ex.printStackTrace();
					}
				}
				else if (trainstopselections.adminSelectionOne == "York"  && trainstopselections.adminSelectionTwo == "Leicester"  ){
					try {
					    FileOutputStream fos = new FileOutputStream("yorktolei.txt");
					    ObjectOutputStream oos = new ObjectOutputStream(fos);   
					    oos.writeObject(intermediateStops.yorktolei); // write Array to ObjectOutputStream
					    oos.close(); 
					} catch(Exception ex) {
					    ex.printStackTrace();
					}
				}
				else if (trainstopselections.adminSelectionOne == "York"  && trainstopselections.adminSelectionTwo == "Loughborough"  ){
					try {
					    FileOutputStream fos = new FileOutputStream("yorktolboro.txt");
					    ObjectOutputStream oos = new ObjectOutputStream(fos);   
					    oos.writeObject(intermediateStops.yorktolboro); // write Array to ObjectOutputStream
					    oos.close(); 
					} catch(Exception ex) {
					    ex.printStackTrace();
					}
				}
				else if (trainstopselections.adminSelectionOne == "York"  && trainstopselections.adminSelectionTwo == "Nottingham"  ){
					try {
					    FileOutputStream fos = new FileOutputStream("yorktonott.txt");
					    ObjectOutputStream oos = new ObjectOutputStream(fos);   
					    oos.writeObject(intermediateStops.yorktonott); // write Array to ObjectOutputStream
					    oos.close(); 
					} catch(Exception ex) {
					    ex.printStackTrace();
					}
				}
				else if (trainstopselections.adminSelectionOne == "York"  && trainstopselections.adminSelectionTwo == "Derby"  ){
					try {
					    FileOutputStream fos = new FileOutputStream("yorktoderby.txt");
					    ObjectOutputStream oos = new ObjectOutputStream(fos);   
					    oos.writeObject(intermediateStops.yorktoderby); // write Array to ObjectOutputStream
					    oos.close(); 
					} catch(Exception ex) {
					    ex.printStackTrace();
					}
				
				}}
				
				
			}
		});
		saveRoute.setBounds(185, 275, 125, 35);
		adminPanel.add(saveRoute);
		
		JButton returnToMenuFromAdmin = new JButton("Return");
		returnToMenuFromAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminPanel.setVisible(false);
				mainmenu.setVisible(true);
			}
		});
		returnToMenuFromAdmin.setBounds(495, 330, 100, 35);
		adminPanel.add(returnToMenuFromAdmin);
		
		JButton retrieveRoute = new JButton("RETRIEVE ROUTE");
		retrieveRoute.addActionListener(new ActionListener() {//////////code for retrieving route
			public void actionPerformed(ActionEvent e) {
				/////////////////lei to lboro//////////////////////////////////
				FileInputStream fis = null;
				try {
					fis = new FileInputStream("leitolboro.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ObjectInputStream ois = null;
				try {
					ois = new ObjectInputStream(fis);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					intermediateStops.leitolboro =  (ArrayList<String>) ois.readObject();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					ois.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				///////////////////////////////////////
				//leitonott/////////////////////////////
				FileInputStream fis1 = null;
				try {
					fis1 = new FileInputStream("leitonott.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ObjectInputStream ois1 = null;
				try {
					ois1 = new ObjectInputStream(fis1);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					intermediateStops.leitonott =  (ArrayList<String>) ois1.readObject();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					ois1.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				////////////////////////////
				/////////leitoderby
				FileInputStream fis11 = null;
				try {
					fis11 = new FileInputStream("leitoderby.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ObjectInputStream ois11 = null;
				try {
					ois11 = new ObjectInputStream(fis11);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					intermediateStops.leitoderby =  (ArrayList<String>) ois11.readObject();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					ois11.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//////////////
				//////////leitoyork
				FileInputStream fis111 = null;
				try {
					fis111 = new FileInputStream("leitoyork.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ObjectInputStream ois111 = null;
				try {
					ois111 = new ObjectInputStream(fis111);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					intermediateStops.leitoyork =  (ArrayList<String>) ois111.readObject();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					ois111.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				///////////////////////
				////////lborotolei
				FileInputStream fis1111 = null;
				try {
					fis1111 = new FileInputStream("lborotolei.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ObjectInputStream ois1111 = null;
				try {
					ois1111 = new ObjectInputStream(fis1111);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					intermediateStops.lborotolei =  (ArrayList<String>) ois1111.readObject();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					ois1111.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				///////////
				/////////lborotonott///////////
				FileInputStream fis11111 = null;
				try {
					fis11111 = new FileInputStream("lborotonott.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ObjectInputStream ois11111 = null;
				try {
					ois11111 = new ObjectInputStream(fis11111);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					intermediateStops.lborotonott =  (ArrayList<String>) ois11111.readObject();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					ois11111.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				////////////////////////
				//////////lbororoderby
				FileInputStream fis111111 = null;
				try {
					fis111111 = new FileInputStream("lborotoderby.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ObjectInputStream ois111111 = null;
				try {
					ois111111 = new ObjectInputStream(fis111111);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					intermediateStops.lborotoderby =  (ArrayList<String>) ois111111.readObject();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					ois111111.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				///////////////////////////////////////
				////////lborotoyork///////////////////
				FileInputStream fis5 = null;
				try {
					fis5 = new FileInputStream("lborotoyork.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ObjectInputStream ois5 = null;
				try {
					ois5 = new ObjectInputStream(fis5);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					intermediateStops.lborotoyork =  (ArrayList<String>) ois5.readObject();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					ois5.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				///////////////////////////////////////////////////
				//////////nott to lei/////////////////////////////
				FileInputStream fis6 = null;
				try {
					fis6 = new FileInputStream("notttolei.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ObjectInputStream ois6 = null;
				try {
					ois6 = new ObjectInputStream(fis6);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					intermediateStops.notttolei =  (ArrayList<String>) ois6.readObject();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					ois6.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				/////////////////////////
				//////////////nott to lboro///////////////////////////
				FileInputStream fis7 = null;
				try {
					fis7 = new FileInputStream("notttolboro.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ObjectInputStream ois7 = null;
				try {
					ois7 = new ObjectInputStream(fis7);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					intermediateStops.notttolei =  (ArrayList<String>) ois7.readObject();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					ois7.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//////////////////////////////////////////
				////////////nott to derby//////////////////
				FileInputStream fis71 = null;
				try {
					fis71 = new FileInputStream("notttoderby.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ObjectInputStream ois8 = null;
				try {
					ois8 = new ObjectInputStream(fis71);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					intermediateStops.notttoderby =  (ArrayList<String>) ois8.readObject();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					ois8.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				/////////////////////////////
				///////nott to york/////////////
				FileInputStream fis9 = null;
				try {
					fis9 = new FileInputStream("notttoyork.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ObjectInputStream ois9 = null;
				try {
					ois9 = new ObjectInputStream(fis9);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					intermediateStops.notttoyork =  (ArrayList<String>) ois9.readObject();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					ois9.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//////////////////////////
				////////////derby to lei////////////
				FileInputStream fis10 = null;
				try {
					fis10 = new FileInputStream("derbytolei.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ObjectInputStream ois10 = null;
				try {
					ois10 = new ObjectInputStream(fis10);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					intermediateStops.derbytolei =  (ArrayList<String>) ois10.readObject();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					ois10.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				/////////////////////////////
				///////////derby to lboro////////////
				FileInputStream fis13 = null;
				try {
					fis13 = new FileInputStream("derbytolboro.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ObjectInputStream ois13 = null;
				try {
					ois13 = new ObjectInputStream(fis13);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					intermediateStops.derbytolboro =  (ArrayList<String>) ois13.readObject();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					ois13.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				/////////////////////////
				////////////derby  to nott//////////////////////
				FileInputStream fis131 = null;
				try {
					fis131 = new FileInputStream("derbytonott.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ObjectInputStream ois131 = null;
				try {
					ois131 = new ObjectInputStream(fis131);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					intermediateStops.derbytonott =  (ArrayList<String>) ois131.readObject();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					ois131.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				/////////////////////
				/////////////////////////////derby to york//////////////////////////////////////
				FileInputStream fis14 = null;
				try {
					fis14 = new FileInputStream("derbytoyork.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ObjectInputStream ois14 = null;
				try {
					ois14 = new ObjectInputStream(fis14);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					intermediateStops.derbytoyork =  (ArrayList<String>) ois14.readObject();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					ois14.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				///////////////////////////////////////////////////////////////////
				///////////york to lei////////////////////////
				FileInputStream fis15 = null;
				try {
					fis15 = new FileInputStream("yorktolei.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ObjectInputStream ois15 = null;
				try {
					ois15 = new ObjectInputStream(fis15);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					intermediateStops.yorktolei =  (ArrayList<String>) ois15.readObject();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					ois15.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				////////////////////////////////////
				//////////york to lboro////////////
				FileInputStream fis151 = null;
				try {
					fis151 = new FileInputStream("yorktolboro.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ObjectInputStream ois151 = null;
				try {
					ois151 = new ObjectInputStream(fis151);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					intermediateStops.yorktolboro =  (ArrayList<String>) ois151.readObject();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					ois151.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				///////////////////////////////////////////////////////////////////
				///////////////york to nott///////////////////////////////////////
				FileInputStream fis17 = null;
				try {
					fis17 = new FileInputStream("yorktonott.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ObjectInputStream ois1311 = null;
				try {
					ois1311 = new ObjectInputStream(fis17);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					intermediateStops.yorktonott =  (ArrayList<String>) ois1311.readObject();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					ois1311.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				/////////////////////////////////////////////////////////////
				//////////////////york to derby//////////////////////////////
				FileInputStream fis19 = null;
				try {
					fis19 = new FileInputStream("yorktoderby.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ObjectInputStream ois19 = null;
				try {
					ois19 = new ObjectInputStream(fis19);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					intermediateStops.yorktoderby =  (ArrayList<String>) ois19.readObject();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					ois19.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				/////////////////////////////////////////////////////////////////////////
				System.out.println(intermediateStops.yorktolei);
			}
		});
		retrieveRoute.setBounds(360, 275, 150, 35);
		adminPanel.add(retrieveRoute);
		
		JComboBox fromAdmin = new JComboBox(trainStations);
		fromAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			trainstopselections.adminSelectionOne = (String)fromAdmin.getSelectedItem();
			}
		});
		fromAdmin.setBounds(90, 45, 140, 20);
		adminPanel.add(fromAdmin);
		
		JComboBox toAdmin = new JComboBox(trainStations);
		toAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trainstopselections.adminSelectionTwo = (String)toAdmin.getSelectedItem();
			}
		});
		toAdmin.setBounds(310, 45, 140, 20);
		adminPanel.add(toAdmin);
		
		JLabel lblFrom = new JLabel("FROM");
		lblFrom.setBounds(35, 45, 45, 20);
		adminPanel.add(lblFrom);
		
		JLabel lblTo = new JLabel("TO");
		lblTo.setBounds(255, 45, 45, 20);
		adminPanel.add(lblTo);
		
		addStopTextField = new JTextField();
		addStopTextField.setBounds(90, 90, 140, 20);
		adminPanel.add(addStopTextField);
		addStopTextField.setColumns(10);
		
		JButton btnAddStop = new JButton("ADD STOP");
		btnAddStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            if (trainstopselections.adminSelectionOne == "Leicester"  && trainstopselections.adminSelectionTwo == "Loughborough"  )
				{
					
	                intermediateStops.leitolboro.add(addStopTextField.getText());
	                System.out.println(intermediateStops.leitolboro);
				}
				
				else if (trainstopselections.adminSelectionOne == "Leicester"  && trainstopselections.adminSelectionTwo == "Nottingham"  ){
					  intermediateStops.leitonott.add(addStopTextField.getText());
		                System.out.println(intermediateStops.leitonott);
				}
				
				else if (trainstopselections.adminSelectionOne == "Leicester"  && trainstopselections.adminSelectionTwo == "Derby"  ){
					  intermediateStops.leitoderby.add(addStopTextField.getText());
		                System.out.println(intermediateStops.leitoderby);
				}
				else if (trainstopselections.adminSelectionOne == "Leicester"  && trainstopselections.adminSelectionTwo == "York"  ){
					  intermediateStops.leitoyork.add(addStopTextField.getText());
		                System.out.println(intermediateStops.leitoyork);
				}
				else if (trainstopselections.adminSelectionOne == "Loughborough"  && trainstopselections.adminSelectionTwo == "Leicester"  ){
					  intermediateStops.lborotolei.add(addStopTextField.getText());
		                System.out.println(intermediateStops.lborotolei);
				}
				else if (trainstopselections.adminSelectionOne == "Loughborough"  && trainstopselections.adminSelectionTwo == "Nottingham"  ){
					 intermediateStops.lborotonott.add(addStopTextField.getText());
		                System.out.println(intermediateStops.lborotonott);
				}
				else if (trainstopselections.adminSelectionOne == "Loughborough"  && trainstopselections.adminSelectionTwo == "Derby"  ){
					 intermediateStops.lborotoderby.add(addStopTextField.getText());
		                System.out.println(intermediateStops.lborotoderby);
				}
				else if (trainstopselections.adminSelectionOne == "Loughborough"  && trainstopselections.adminSelectionTwo == "York"  ){
					intermediateStops.lborotoyork.add(addStopTextField.getText());
	                System.out.println(intermediateStops.lborotoyork);
				}
				else if (trainstopselections.adminSelectionOne == "Nottingham"  && trainstopselections.adminSelectionTwo == "Leicester"  ){
					intermediateStops.notttolei.add(addStopTextField.getText());
	                System.out.println(intermediateStops.notttolei);
				}
				else if (trainstopselections.adminSelectionOne == "Nottingham"  && trainstopselections.adminSelectionTwo == "Loughborough"  ){
					intermediateStops.notttolboro.add(addStopTextField.getText());
	                System.out.println(intermediateStops.notttolboro);
				}
				else if (trainstopselections.adminSelectionOne == "Nottingham"  && trainstopselections.adminSelectionTwo == "Derby"  ){
					intermediateStops.notttoderby.add(addStopTextField.getText());
	                System.out.println(intermediateStops.notttoderby);
				}
				else if (trainstopselections.adminSelectionOne == "Nottingham"  && trainstopselections.adminSelectionTwo == "York"  ){
					intermediateStops.notttoyork.add(addStopTextField.getText());
	                System.out.println(intermediateStops.notttoyork);
				}
				else if (trainstopselections.adminSelectionOne == "Derby"  && trainstopselections.adminSelectionTwo == "Leicester"  ){
					intermediateStops.derbytolei.add(addStopTextField.getText());
	                System.out.println(intermediateStops.derbytolei);
				}
					
				else if (trainstopselections.adminSelectionOne == "Derby"  && trainstopselections.adminSelectionTwo == "Loughborough"  ){
					intermediateStops.derbytolboro.add(addStopTextField.getText());
	                System.out.println(intermediateStops.derbytolboro);
				}
				else if (trainstopselections.adminSelectionOne == "Derby"  && trainstopselections.adminSelectionTwo == "Nottingham"  ){
					intermediateStops.derbytonott.add(addStopTextField.getText());
	                System.out.println(intermediateStops.derbytonott);
				}
				else if (trainstopselections.adminSelectionOne == "Derby"  && trainstopselections.adminSelectionTwo == "York"  ){
					intermediateStops.derbytoyork.add(addStopTextField.getText());
	                System.out.println(intermediateStops.derbytoyork);
				}
				else if (trainstopselections.adminSelectionOne == "York"  && trainstopselections.adminSelectionTwo == "Leicester"  ){
					intermediateStops.yorktolei.add(addStopTextField.getText());
	                System.out.println(intermediateStops.yorktolei);
				}
				else if (trainstopselections.adminSelectionOne == "York"  && trainstopselections.adminSelectionTwo == "Loughborough"  ){
					intermediateStops.yorktolboro.add(addStopTextField.getText());
	                System.out.println(intermediateStops.yorktolboro);
				}
				else if (trainstopselections.adminSelectionOne == "York"  && trainstopselections.adminSelectionTwo == "Nottingham"  ){
					intermediateStops.yorktonott.add(addStopTextField.getText());
	                System.out.println(intermediateStops.yorktonott);
				}
				else if (trainstopselections.adminSelectionOne == "York"  && trainstopselections.adminSelectionTwo == "Derby"  ){
					intermediateStops.yorktoderby.add(addStopTextField.getText());
	                System.out.println(intermediateStops.yorktoderby);
				}
			}
		});
		btnAddStop.setBounds(310, 90, 100, 20);
		adminPanel.add(btnAddStop);
		
		JButton btnAddAnotherStop = new JButton("ADD ANOTHER STOP");
		btnAddAnotherStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addStopTextField.setText("");
			}
		});
		btnAddAnotherStop.setBounds(430, 90, 160, 20);
		adminPanel.add(btnAddAnotherStop);
		/////////////////////route panel components//////////////////////////////////////////////////////////////////////////////
		
		
		JButton returnToMainMenuFromRoute = new JButton("Return");
		returnToMainMenuFromRoute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				routePanel.setVisible(false);
				mainmenu.setVisible(true);
			}
		});
		returnToMainMenuFromRoute.setBounds(506, 344, 89, 23);
		routePanel.add(returnToMainMenuFromRoute);
		
		JCheckBox chckbxSequentialOrder = new JCheckBox("Sequential Order");
		chckbxSequentialOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxSequentialOrder.isSelected()) {
					String listString = String.join(", ", intermediateStops.arrayToDisplay);
					routesOfJourney.setText( "The intermediate stops are "+ listString );
				}
			}
		});
		buttonGroup.add(chckbxSequentialOrder);
		chckbxSequentialOrder.setBounds(30, 40, 160, 25);
		routePanel.add(chckbxSequentialOrder);
		
		JCheckBox chckbxAlphabeticalOrder = new JCheckBox("Alphabetical Order");
		chckbxAlphabeticalOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxAlphabeticalOrder.isSelected()) {
					routesOfJourney.setText( "The intermediate stops are "+ intermediateStops.alphabeticalListString );
				} 
				
			}
		});
		buttonGroup.add(chckbxAlphabeticalOrder);
		chckbxAlphabeticalOrder.setBounds(250, 40, 160, 25);
		routePanel.add(chckbxAlphabeticalOrder);
		
		
		//end of panel comp
	}
}
