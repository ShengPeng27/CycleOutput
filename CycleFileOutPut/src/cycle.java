import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class cycle {
	
		static double numberOfWheels;
		static double weight;	
		public cycle(double numberOfWheels,  double weight){
			this.numberOfWheels=numberOfWheels;
			this.weight=weight;
			//constructor of cycle
		}
		@Override
		public String toString() {
			return "Cycle [numberOfWheels=" + numberOfWheels + ", weight=" + weight
					+ "]";
		}

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
	
		String fileName="Cycle.txt";
		File file =new File(fileName);

		PrintWriter output=null;
		try{
			output=new PrintWriter(fileName);
			}
		catch(FileNotFoundException e){
			System.out.println("File not exists");
			//e.printStackTrace();
			throw e;
			}
		JTextField NumberOfWheels = new JTextField(10);
		JTextField Weight = new JTextField(10);
		JLabel label = new JLabel(
				"Enter the number of wheels and weight of cycle.");
		JPanel panel = new JPanel();

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(label);
		panel.add(NumberOfWheels);
		panel.add(Weight);
		
		JOptionPane.showMessageDialog(null, panel);
		//prompt user to enter the number of wheels and weight
		numberOfWheels= Double.parseDouble(NumberOfWheels.getText());
		weight= Double.parseDouble(Weight.getText());
		cycle cycle1=new cycle(numberOfWheels, weight);
		
		
		output.println(cycle1.toString());
		
		output.close();
		//close the file
		
		}
	}
