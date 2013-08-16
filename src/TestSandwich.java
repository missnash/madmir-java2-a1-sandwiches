import javax.swing.JOptionPane;


public class TestSandwich {

	public static void main(String[] args) {
		
	//Instantiating two sandwich objects
	Sandwich mySandwich = new Sandwich();
	Sandwich yourSandwich = new Sandwich();
	String mainIngred, breadType;
	double price;
	
	//Setting values of fields in Sandwich
	mainIngred = JOptionPane.showInputDialog("what do you want as a main ingredient?");
	mySandwich.setMainIngred(mainIngred);
	
	breadType = JOptionPane.showInputDialog("what kind of bread would you prefer?");
	mySandwich.setBreadType(breadType);
	
	price = Double.parseDouble(JOptionPane.showInputDialog("What is the price of the sandwich?"));
	mySandwich.setPrice(price);
	
	//Output the details of the sandwich
	JOptionPane.showMessageDialog(null, "You are getting a " + mySandwich.getMainIngred() 
			+ " sandwich on "+ mySandwich.getBreadType() + " at " + mySandwich.getPrice());
	
	//Setting the values of fields in Sandwich
	mainIngred = JOptionPane.showInputDialog("What do you want for your main ingredient?");
	yourSandwich.setMainIngred(mainIngred);
	
	breadType = JOptionPane.showInputDialog("What type of bread would you like?");
	yourSandwich.setBreadType(breadType);
	
	price = Double.parseDouble(JOptionPane.showInputDialog("What is the price of your sandwich?"));
	yourSandwich.setPrice(price);
	
	//Output the details of the sandwich
	JOptionPane.showMessageDialog(null, "you are getting a " + "sandwich on" + 
	yourSandwich.getBreadType() + " at " + yourSandwich.getPrice());
	}

}
