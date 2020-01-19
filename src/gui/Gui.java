package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import calc.Calc;
import orga.SaveData;
import orga.ShowData;
import other.Mix;

public class Gui extends JFrame implements ActionListener{
	
	private JPanel myPanel = new JPanel();

	private JButton calcButton = new JButton("Berechne!");
	private JButton buttonSaveMix = new JButton("Speichere Mischung");
	private JButton buttonShowMix = new JButton("Zeige + lade gespeicherte Mischungen");

	private JLabel labelGesVol = new JLabel("Gesamtvolumen soll sein (in ml):");
	private JLabel labelAroma = new JLabel("gewünschte % Aroma:");
	private JLabel labelNikotin = new JLabel("Nikotinmenge in mg/ml soll sein:");

	private JTextField fieldGesVol = new JTextField(8);
	private JTextField fieldAromaVol = new JTextField(8);
	private JTextField fieldNicVol = new JTextField(8);

	private JLabel labelResGesVol = new JLabel("Menge an Base (in ml):");
	private JLabel labelResAroma = new JLabel("Ergebnis ml Aroma:");
	private JLabel labelResNikotin = new JLabel("zuzugebende Nikotinlösung ml:");

	private JTextField resBaseVol = new JTextField(8);
	private JTextField resAromaVol = new JTextField(8);
	private JTextField resNicVol = new JTextField(8);
	
	
	private Mix myMix;
//	private SaveActions mygf;// = new SaveActions(this);
	private Calc myRechner ;//= new Calc(this, mygf);
	private SaveData mySaver = new SaveData(this);
	private ShowData myAnzeiger;

	public Gui() {
		myRechner = new Calc(this);
		mySaver = new SaveData(this);
		myAnzeiger = new ShowData(this);
		setSize(900, 320);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	
		buildWindow();
	}

	
	public void buildWindow() {
		setTitle("E-Zigaretten Mischungsrechner");
		myPanel.setLayout(null);

		fieldGesVol.setBounds(280, 15, 100, 30);
		fieldGesVol.addActionListener(event -> actionPerformed(event));
		myPanel.add(fieldGesVol);		
		fieldAromaVol.setBounds(280, 65, 100, 30); 
		fieldAromaVol.addActionListener(event -> actionPerformed(event));
		myPanel.add(fieldAromaVol);
		fieldNicVol.setBounds(280, 115, 100, 30); 
		fieldNicVol.addActionListener(event -> actionPerformed(event));
		myPanel.add(fieldNicVol);
		
		labelGesVol.setBounds(45, 5, 250, 50);
		myPanel.add(labelGesVol);
		labelAroma.setBounds(45, 55, 250, 50);
		myPanel.add(labelAroma);
		labelNikotin.setBounds(45, 105, 250, 50); 
		myPanel.add(labelNikotin);
		
		resBaseVol.setBounds(670, 15, 100, 30); 
		myPanel.add(resBaseVol);
		resAromaVol.setBounds(670, 65, 100, 30); 
		myPanel.add(resAromaVol);
		resNicVol.setBounds(670, 115, 100, 30); 
		myPanel.add(resNicVol);
		
		labelResGesVol.setBounds(420, 5, 250, 50);
		myPanel.add(labelResGesVol);
		labelResAroma.setBounds(420, 55, 250, 50);
		myPanel.add(labelResAroma);
		labelResNikotin.setBounds(420, 105, 250, 50); 
		myPanel.add(labelResNikotin);
		
		calcButton.setBounds(180, 170, 120, 25); 
		calcButton.addActionListener(event -> actionPerformed(event));
		myPanel.add(calcButton);
		buttonSaveMix.setBounds(525, 170, 180, 25);
		buttonSaveMix.addActionListener(event -> actionPerformed(event));
		myPanel.add(buttonSaveMix);
		buttonShowMix.setBounds(270, 220, 320, 25); 
		buttonShowMix.addActionListener(event -> actionPerformed(event));
		myPanel.add(buttonShowMix);
		
		add(myPanel);

		setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent event) {

		if (event.getSource() == calcButton) {
			myRechner.calcButtonAction();
//			mygf.feedGui();
		}
		if (event.getSource() == buttonSaveMix) {
			mySaver.saveButtonActions();
		}

		if (event.getSource() == buttonShowMix) {
			myAnzeiger.showButtonActions();
		}
		
	}

// ------------------------- GETTER: -------------------------------------------
	public Mix getMyMix() {
		return myMix;
	}

	
	public Calc getMyRechner() {
		return myRechner;
	}

	
	public JPanel getMyPanel() {
		return myPanel;
	}


	public JButton getCalcButton() {
		return calcButton;
	}

	public JButton getButtonSaveMix() {
		return buttonSaveMix;
	}


	public JButton getButtonShowMix() {
		return buttonShowMix;
	}


	public JTextField getFieldGesVol() {
		return fieldGesVol;
	}


	public JTextField getFieldAromaVol() {
		return fieldAromaVol;
	}


	public JTextField getFieldNicVol() {
		return fieldNicVol;
	}


	public JTextField getResBaseVol() {
		return resBaseVol;
	}

	public JTextField getResAromaVol() {
		return resAromaVol;
	}


	public JTextField getResNicVol() {
		return resNicVol;
	}


	
	

}