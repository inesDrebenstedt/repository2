package orga;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import gui.Gui;

public class SaveData {

	private String path;
	private String txtToSave;
	
//usage counter?;
	private Gui myGui;
	
	public SaveData(Gui g) {
		myGui = g;
	}

	public void saveButtonActions() {
		saveDialog();	
	}

	public void saveDialog() {
		
		txtToSave = "Fuer ein Gesamtvolumen von " + myGui.getFieldGesVol().getText() +" ml: zuzugebende Base in ml: " + myGui.getResBaseVol().getText() + ", "
				+  "ml Aroma: " + myGui.getResAromaVol().getText() + ", "						
				+  "ml Nikotinloesung: " + myGui.getResNicVol().getText() + "\n\n";
		
		
		JFrame parentFrame = new JFrame();

		JFileChooser fileChooser = new JFileChooser(path);
		fileChooser.setDialogTitle("Specify a file to save");

		int userSelection = fileChooser.showSaveDialog(parentFrame);

		if (userSelection == JFileChooser.APPROVE_OPTION) {
			File fileToSave = fileChooser.getSelectedFile();
			System.out.println("Save as file: " + fileToSave.getAbsolutePath());

			try {
				FileOutputStream outStream = new FileOutputStream(fileToSave.getAbsolutePath()); // file objekt

				for (int i = 0; i < txtToSave.length(); i++) // fÃŒr jedes Zeichen von Text ...
				{
					byte c = (byte) txtToSave.charAt(i); // nimm Zeichen und wandle nach Byte
					outStream.write(c); // schreibe Byte ins File ...
				}
				outStream.close(); // endgültiges Schreiben auf den Datenträger, wie beim USB abstöpseln
			}

			catch (IOException e) {
				System.out.println("Beim FileOutputStream ist was schiefgelaufen");
				e.printStackTrace();
			}
		}

	}

	// ------------------------ SAVE ------------------------------------------
//	public void saveFile(String pathname, String txt) {
//		try {
//			System.out.println("in try block");
//			FileOutputStream outStream = new FileOutputStream(pathname); // file objekt erstellen, mit Name als
//																			// Parameter
//
//			for (int i = 0; i < txt.length(); i++) // fÃŒr jedes Zeichen von Text ...
//			{
//				byte c = (byte) txt.charAt(i); // nimm Zeichen und wandle nach Byte
//				outStream.write(c); // schreibe Byte ins File ...
//			}
//			outStream.close(); // endgültiges Schreiben auf den Datenträger, wie beim USB abstöpseln
//		}
//
//		catch (IOException e) {
//			System.out.println("Beim FileOutputStream ist was schiefgelaufen");
//			e.printStackTrace();
//		}
//	}

}