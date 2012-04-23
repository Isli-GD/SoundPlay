import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class SoundPlay {

/**
 * @author slukas96 (slukas96@googlemail.com)
 * @version Beta 0.1
 */
	
	public static void main(String[] args) throws IOException {

		//ResolutionFile Schreibn wenn nciht vorhanden
		
		File dspconfig = new File("dspconfig.sl");
		if(!dspconfig.exists())
		{
			String savSound = "1024,600,";

			String datName = "dspconfig.sl";
			FileOutputStream writeStream = new FileOutputStream(datName);
			for (int i=0; i < savSound.length(); i++) {
				writeStream.write((byte)savSound.charAt(i));
			}
			writeStream.close();
		}
        PlayGUI tplay = new PlayGUI();
    	tplay.start();
	}
	public static void startGUI() {
	    PlayGUI tplay = new PlayGUI();
		tplay.start();
	}
}
