package orga;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import gui.Gui;

public class ShowData {
	
	private String path;
	
	private Gui myGui;
	
	public ShowData(Gui g) {
		myGui = g;
	}
	
	public void showButtonActions() {
		zeigeMix();
	}
	
	public void zeigeMix() {
		
		JFrame parentFrame = new JFrame();

		JFileChooser fileChooser = new JFileChooser(path);
		fileChooser.setDialogTitle("Specify a file to open");

		int userSelection = fileChooser.showOpenDialog(parentFrame);

		if (userSelection == JFileChooser.OPEN_DIALOG) {
			File fileToRead = fileChooser.getSelectedFile();
			System.out.println("You chose to read file: " + fileToRead.getAbsolutePath());
			String buffer = "";
			
			try
			{
				FileInputStream inStream = new FileInputStream(fileToRead.getAbsolutePath());		
				
				byte _byte=0;
				char _char;					
				//Stringbuffer
				//speichern(lesen HashMap)
			
				while(_byte !=-1)//-1 Ende zeichen
				{			
					_byte = (byte)inStream.read(); 	//lese Byte aus inStream			
				
					if(_byte!=-1)
					{
						_char = (char)_byte;			// wandle Byte nach Char
						buffer  += _char;				// anhÃ€ngen an String	
					}
				}
				
			System.out.println("Anzeige Ihrer gewählten Mischung: " + buffer);
					inStream.close();
			 }
			catch (Exception e)
			{
				System.out.println("Fehler beim Laden der Mischungsliste!");
			}	 		 		
		}
		
	}

}