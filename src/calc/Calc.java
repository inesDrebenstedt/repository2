package calc;

import gui.Gui;
import orga.SaveData;
import other.Mix;


public class Calc {
	
	private SaveData sd;
	private Gui myGui;
	private Mix myMix;
	
	private double gesVol;
	private double percAroma;
	private double mgNicPerMl;
	private double mlBase;
	private double mlAroma;
	private double mlNic;

	
	
	public Calc(Gui g) {
		myGui = g;
	}
	
//	
//	
//	
//	public void calcButtonAction2() {
//		orga.feedCalcFromGui();
//
//		orga.feedGuiFromCalcData();
//	}
	
	public Mix calcButtonAction() {

		Double GesVol = Double.parseDouble(myGui.getFieldGesVol().getText());
		Double percAroma = Double.parseDouble(myGui.getFieldAromaVol().getText());
		Double mgNic = Double.parseDouble(myGui.getFieldNicVol().getText());
		System.out.println("Eingegebene Werte: " + GesVol + ", " + percAroma + ", " + mgNic);
		Double mlAroma = GesVol / 100 * percAroma;
		Double mlNic = GesVol * mgNic / 20;
		Double baseVol = GesVol - mlAroma - mlNic;

		//Resultate in Gui Fields anzeigen:
			myGui.getResBaseVol().setText("" + baseVol);
			myGui.getResAromaVol().setText("" + mlAroma);
			myGui.getResNicVol().setText("" + mlNic);
		
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