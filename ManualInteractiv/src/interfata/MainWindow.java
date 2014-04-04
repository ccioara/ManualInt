package interfata;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import obiecte.Capitol;
import servicii.DataBaseConnection;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import javax.swing.BoxLayout;

public class MainWindow {

	private Frame mainFrame;
	private Label headerLabel;
	private Label statusLabel;
	private Panel controlPanel;

	public MainWindow(){
		prepareGUI();
	}

	public static void main(String[] args){
		MainWindow  awtControlDemo = new MainWindow();
		awtControlDemo.showMainWindow();
	}

	private void prepareGUI(){
		mainFrame = new Frame("Manual Interactiv");
		mainFrame.setSize(900,600);
		mainFrame.setLayout(new GridLayout(3, 1));
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}        
		});    
		headerLabel = new Label();
		headerLabel.setFont(new Font("Adobe Devanagari", Font.BOLD, 18));
		headerLabel.setAlignment(Label.CENTER);
//		headerLabel.setBackground(Color.cyan);
		headerLabel.setSize(100, 30);
		statusLabel = new Label();        
//		statusLabel.setBackground(Color.YELLOW);
		statusLabel.setAlignment(Label.CENTER);
		statusLabel.setSize(350,50);

		controlPanel = new Panel();

		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);  
	}

	private void showMainWindow(){
		headerLabel.setText("Procesoare de semnale");

		Panel panel = new Panel();
		panel.setBackground(Color.darkGray);
		panel.setLocation(50, 100);
//		panel.setSize(400,500);
		GridBagLayout layout = new GridBagLayout();

		panel.setLayout(layout);        
		GridBagConstraints gbc = new GridBagConstraints();

//		gbc.fill = GridBagConstraints.NONE;
		
		DataBaseConnection dataBaseConnection = new DataBaseConnection();
		try {
			dataBaseConnection.connectToDataBase();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ArrayList<Capitol> capitole = dataBaseConnection.getCapitole();
		// comment
//		for (int i = 0; i < capitole.size(); i++) {
//			Button capitolButoon = new Button(capitole.get(i).getNume());
//			capitolButoon.setActionCommand(capitole.get(i).getNume());
//			capitolButoon.addActionListener(new ButtonClickListener());
//			controlPanel.add(capitolButoon, i);
//		}
		
		for (int i = 0; i < capitole.size(); i++) {
			gbc.gridx = 0;
			gbc.gridy = i;
			Button capitolButoon = new Button(capitole.get(i).getNume());
			capitolButoon.setSize(40, 15);
			capitolButoon.setActionCommand(capitole.get(i).getNume());
			capitolButoon.addActionListener(new ButtonClickListener());
			panel.add(capitolButoon,gbc);
		}
		controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.X_AXIS));
		
		controlPanel.add(panel);
		mainFrame.setVisible(true);  
	}

	private class ButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();  
			if( command.equals( "Capitolul 1" ))  {
				statusLabel.setText("Capitolul 1 Button clicked.");
			}
			else if( command.equals( "Capitolul 2" ) )  {
				statusLabel.setText("Capitolul 2 Button clicked."); 
			}
			else if( command.equals( "Capitolul 3" ) )  {
				statusLabel.setText("Capitolul 3 Button clicked."); 
			}
			else if( command.equals( "Capitolul 4" ) )  {
				statusLabel.setText("Capitolul 4 Button clicked."); 
			}
			else if( command.equals( "Capitolul 5" ) )  {
				statusLabel.setText("Capitolul 5 Button clicked."); 
			}
		}		
	}
}