import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class EditGUI extends Thread {
	
	static String s01, s02, s03, s04, s05, s06, s07, s08, s09, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24;
	static String[] ssound = {s01, s02, s03, s04, s05, s06, s07, s08, s09, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24};
	
	int number;
	
	static Label labt01 = new Label("Edit");
	
	static JButton texi01 = new JButton();
	static JButton texi02 = new JButton();
	static JButton texi03 = new JButton();
	static JButton texi04 = new JButton();
	static JButton texi05 = new JButton();
	static JButton texi06 = new JButton();
	static JButton texi07 = new JButton();
	static JButton texi08 = new JButton();
	static JButton texi09 = new JButton();
	static JButton texi10 = new JButton();
	static JButton texi11 = new JButton();
	static JButton texi12 = new JButton();
	static JButton texi13 = new JButton();
	static JButton texi14 = new JButton();
	static JButton texi15 = new JButton();
	static JButton texi16 = new JButton();
	static JButton texi17 = new JButton();
	static JButton texi18 = new JButton();
	static JButton texi19 = new JButton();
	static JButton texi20 = new JButton();
	static JButton texi21 = new JButton();
	static JButton texi22 = new JButton();
	static JButton texi23 = new JButton();
	static JButton texi24 = new JButton();
	
	static JButton buts01 = new JButton("Save");
	
	
	static void addComponent(	Container cont,
						GridBagLayout gbl,
						Component c,
						int x, int y,
						int width, int height,
						double weightx, double weighty ) {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = x; gbc.gridy = y;
		gbc.gridwidth = width; gbc.gridheight = height;
		gbc.weightx = weightx; gbc.weighty = weighty;
		gbl.setConstraints( c, gbc );
		cont.add( c );
		}
	
	
	
	public void run()
	{	
		//Soundspeicher laden
		
		byte bytes = 0;
		String content = "";
		String dateiName = "sconfig.sl";
		FileInputStream readStream = null;
		try {
			readStream = new FileInputStream(dateiName);
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		do{
		 	try {
				bytes = (byte)readStream.read();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		   	System.out.print(bytes+" ");
		   	content += (char)bytes;
		} while (bytes !=-1);
		try {
			readStream.close();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		System.out.println();
		System.out.println(content);
		
		ssound = content.split(",");
		
		texi01 = new JButton(ssound[0]);
		texi02 = new JButton(ssound[1]);
		texi03 = new JButton(ssound[2]);
		texi04 = new JButton(ssound[3]);
		texi05 = new JButton(ssound[4]);
		texi06 = new JButton(ssound[5]);
		texi07 = new JButton(ssound[6]);
		texi08 = new JButton(ssound[7]);
		texi09 = new JButton(ssound[8]);
		texi10 = new JButton(ssound[9]);
		texi11 = new JButton(ssound[10]);
		texi12 = new JButton(ssound[11]);
		texi13 = new JButton(ssound[12]);
		texi14 = new JButton(ssound[13]);
		texi15 = new JButton(ssound[14]);
		texi16 = new JButton(ssound[15]);
		texi17 = new JButton(ssound[16]);
		texi18 = new JButton(ssound[17]);
		texi19 = new JButton(ssound[18]);
		texi20 = new JButton(ssound[19]);
		texi21 = new JButton(ssound[20]);
		texi22 = new JButton(ssound[21]);
		texi23 = new JButton(ssound[22]);
		texi24 = new JButton(ssound[23]);
		
		//Layout
	
		final JFrame f = new JFrame();
		f.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE );
		Container c = f.getContentPane();
		GridBagLayout gbl = new GridBagLayout();
		c.setLayout( gbl );
		//                            x  y  w  h  wx   wy
		addComponent( c, gbl, labt01, 1, 0, 1, 1, 0  , 0   );
		
		addComponent( c, gbl, texi01, 1, 1, 1, 1, 1  , 1   );
		addComponent( c, gbl, texi02, 3, 1, 1, 1, 1  , 0   );
		addComponent( c, gbl, texi03, 5, 1, 1, 1, 1  , 0   );
		addComponent( c, gbl, texi04, 7, 1, 1, 1, 1  , 0   );
		
		addComponent( c, gbl, texi05, 1, 2, 1, 1, 0  , 1   );
		addComponent( c, gbl, texi06, 3, 2, 1, 1, 0  , 0   );
		addComponent( c, gbl, texi07, 5, 2, 1, 1, 0  , 0   );
		addComponent( c, gbl, texi08, 7, 2, 1, 1, 0  , 0   );
		
		addComponent( c, gbl, texi09, 1, 3, 1, 1, 0  , 1   );
		addComponent( c, gbl, texi10, 3, 3, 1, 1, 0  , 0   );
		addComponent( c, gbl, texi11, 5, 3, 1, 1, 0  , 0   );
		addComponent( c, gbl, texi12, 7, 3, 1, 1, 0  , 0   );
		
		addComponent( c, gbl, texi13, 1, 4, 1, 1, 0  , 1   );
		addComponent( c, gbl, texi14, 3, 4, 1, 1, 0  , 0   );
		addComponent( c, gbl, texi15, 5, 4, 1, 1, 0  , 0   );
		addComponent( c, gbl, texi16, 7, 4, 1, 1, 0  , 0   );
		
		addComponent( c, gbl, texi17, 1, 5, 1, 1, 0  , 1   );
		addComponent( c, gbl, texi18, 3, 5, 1, 1, 0  , 0   );
		addComponent( c, gbl, texi19, 5, 5, 1, 1, 0  , 0   );
		addComponent( c, gbl, texi20, 7, 5, 1, 1, 0  , 0   );
		
		addComponent( c, gbl, texi21, 1, 6, 1, 1, 0  , 1   );
		addComponent( c, gbl, texi22, 3, 6, 1, 1, 0  , 0   );
		addComponent( c, gbl, texi23, 5, 6, 1, 1, 0  , 0   );
		addComponent( c, gbl, texi24, 7, 6, 1, 1, 0  , 0   );
		
		addComponent( c, gbl, buts01, 5, 7, 3, 1, 0  , 0.5   );
		
		f.setResizable(false);
		f.setSize(1024, 600);		
		f.setVisible( true );

		//ActionListener
		
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
				// JFileChooser-Objekt erstellen
		        JFileChooser chooser = new JFileChooser();
		        // Dialog zum Oeffnen von Dateien anzeigen
		        int rueckgabeWert = chooser.showOpenDialog(null);
		        
		        /* Abfrage, ob auf "Öffnen" geklickt wurde */
		        if(rueckgabeWert == JFileChooser.APPROVE_OPTION)
		        {
		             // Ausgabe der ausgewaehlten Datei
		            ssound[number] = chooser.getSelectedFile().getPath();
		        }
		        
            }

        };
		
		ActionListener al2 = new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
				f.setVisible(false); // verschwinden lassen
                f.dispose(); // abräumen
                
                //Soundspeicher speichern
        		
        		String savSound = 	ssound[0] + "," +
        							ssound[1] + "," +
        							ssound[2] + "," +
        							ssound[3] + "," +
        							ssound[4] + "," +
        							ssound[5] + "," +
        							ssound[6] + "," +
        							ssound[7] + "," +
        							ssound[8] + "," +
        							ssound[9] + "," +
        							ssound[10] + "," +
        							ssound[11] + "," +
        							ssound[12] + "," +
        							ssound[13] + "," +
        							ssound[14] + "," +
        							ssound[15] + "," +
        							ssound[16] + "," +
        							ssound[17] + "," +
        							ssound[18] + "," +
        							ssound[19] + "," +
        							ssound[20] + "," +
        							ssound[21] + "," +
        							ssound[22] + "," +
        							ssound[23] + ",";
        		
        	    String datName = "sconfig.sl";
        	    FileOutputStream writeStream = null;
				try {
					writeStream = new FileOutputStream(datName);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        	    for (int i=0; i < savSound.length(); i++) {
        	    	try {
						writeStream.write((byte)savSound.charAt(i));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
        	    }
        	    try {
					writeStream.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }

        };

		buts01.addActionListener(al2);

		texi01.addActionListener(al);
		texi02.addActionListener(al);
		texi03.addActionListener(al);
		texi04.addActionListener(al);
		texi05.addActionListener(al);
		texi06.addActionListener(al);
		texi07.addActionListener(al);
		texi08.addActionListener(al);
		texi09.addActionListener(al);
		texi10.addActionListener(al);
		texi11.addActionListener(al);
		texi12.addActionListener(al);
		texi13.addActionListener(al);
		texi14.addActionListener(al);
		texi15.addActionListener(al);
		texi16.addActionListener(al);
		texi17.addActionListener(al);
		texi18.addActionListener(al);
		texi19.addActionListener(al);
		texi20.addActionListener(al);
		texi21.addActionListener(al);
		texi22.addActionListener(al);
		texi23.addActionListener(al);
		texi24.addActionListener(al);
	}

	public void MyAction(int theNumber) {
        number = theNumber;
    }
}
