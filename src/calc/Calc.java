package calc;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import gui.Gui;
import orga.SaveData;
import testclasses.Mix;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;


public class Calc {
	
	private DecimalFormat inDezimal = new DecimalFormat("#.##");
	private SaveData sd;
	private Gui myGui;
	private Mix myMix;
	JPanel errorMsg = new JPanel();
	
	private double gesVol;
	private double percAroma;
	private double mgNicPerMl;
	private double mlBase;
	private double mlAroma;
	private double mlNic;

	
	
	public Calc(Gui g) {
		myGui = g;
	}
		
//	public void calcButtonAction2() {
//		orga.feedCalcFromGui();
//
//		orga.feedGuiFromCalcData();
//	}
	
	public Mix calcButtonAction() {

		//Exception abfangen, für wenn das eingegebene Zeichen keine Zahl ist
		try {
		NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
		
		Double GesVol = Double.parseDouble(myGui.getFieldGesVol().getText());
		Double percAroma = Double.parseDouble(myGui.getFieldAromaVol().getText());
		Double mgNic = Double.parseDouble(myGui.getFieldNicVol().getText());
		inDezimal.parse(myGui.getFieldGesVol().getText());
		
			if(myGui.getFieldGesVol().getText().contains(",") || myGui.getFieldAromaVol().getText().contains(",") || myGui.getFieldNicVol().getText().contains(",")) {
				System.out.println("Komma statt Punkt eingegeben");
			}
			
		System.out.println("Eingegebene Werte: " + GesVol + ", " + percAroma + ", " + mgNic);
		Double mlAroma = GesVol / 100 * percAroma;
		Double mlNic = GesVol * mgNic / 20;
		Double baseVol = GesVol - mlAroma - mlNic;

		//Resultate in Gui Fields anzeigen:
			myGui.getResBaseVol().setText("" + inDezimal.format(baseVol));
			myGui.getResAromaVol().setText("" + inDezimal.format(mlAroma));
			myGui.getResNicVol().setText("" + inDezimal.format(mlNic));
		
		
		}catch (Exception e) {
			JOptionPane.showMessageDialog(errorMsg, "Fehler beim Verarbeiten der eingegebenen Zeichen. \n Bitte versuchen Sie es nochmal. \n"
					+ "Bitte beachten Sie: Für Dezimalwerte Punkt statt Komma eingeben.", 
					"Error", JOptionPane.ERROR_MESSAGE);
		}
		return myMix;
	}


	public Mix getMyMix() {
		return myMix;
	}

	
	public double getGesVol() {
		return gesVol;
	}

	
	public void setGesVol(double gesVol) {
		this.gesVol = gesVol;
	}


	public double getPercAroma() {
		return percAroma;
	}


	public void setPercAroma(double percAroma) {
		this.percAroma = percAroma;
	}


	public double getMgNicPerMl() {
		return mgNicPerMl;
	}


	public void setMgNicPerMl(double mgNicPerMl) {
		this.mgNicPerMl = mgNicPerMl;
	}


	public double getMlBase() {
		return mlBase;
	}


	public void setMlBase(double mlBase) {
		this.mlBase = mlBase;
	}


	public double getMlAroma() {
		return mlAroma;
	}


	public void setMlAroma(double mlAroma) {
		this.mlAroma = mlAroma;
	}


	public double getMlNic() {
		return mlNic;
	}


	public void setMlNic(double mlNic) {
		this.mlNic = mlNic;
	}
	

}
