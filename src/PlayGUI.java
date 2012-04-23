import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;



public class PlayGUI extends Thread {


	protected static final String String = null;
	public static SoundPlay Play;
	static String s01, s02, s03, s04, s05, s06, s07, s08, s09, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24;
	static String[] ssound = {s01, s02, s03, s04, s05, s06, s07, s08, s09, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24};
	
	static Label labt01 = new Label("SoundPlay Beta v. 0.1 by slukas96");
	
	static JButton bute01;
	static JButton butp01;
	static JButton butp02;
	static JButton butp03;
	static JButton butp04;
	static JButton butp05;
	static JButton butp06;
	static JButton butp07;
	static JButton butp08;
	static JButton butp09;
	static JButton butp10;
	static JButton butp11;
	static JButton butp12;
	static JButton butp13;
	static JButton butp14;
	static JButton butp15;
	static JButton butp16;
	static JButton butp17;
	static JButton butp18;
	static JButton butp19;
	static JButton butp20;
	static JButton butp21;
	static JButton butp22;
	static JButton butp23;
	static JButton butp24;
	
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

		
		//SoundFile schreiben, wenn nicht vorhanden
		
		File config = new File("sconfig.sl");
		if(!config.exists())
		{
			String savSound = "No Sound,No Sound,No Sound,No Sound,No Sound,No Sound,No Sound,No Sound,No Sound,No Sound,No Sound,No Sound,No Sound,No Sound,No Sound,No Sound,No Sound,No Sound,No Sound,No Sound,No Sound,No Sound,No Sound,No Sound,";

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
		  
		bute01 = new JButton("Edit");
		butp01 = new JButton(ssound[0]);
		butp02 = new JButton(ssound[1]);
		butp03 = new JButton(ssound[2]);
		butp04 = new JButton(ssound[3]);
		butp05 = new JButton(ssound[4]);
		butp06 = new JButton(ssound[5]);
		butp07 = new JButton(ssound[6]);
		butp08 = new JButton(ssound[7]);
		butp09 = new JButton(ssound[8]);
		butp10 = new JButton(ssound[9]);
		butp11 = new JButton(ssound[10]);
		butp12 = new JButton(ssound[11]);
		butp13 = new JButton(ssound[12]);
		butp14 = new JButton(ssound[13]);
		butp15 = new JButton(ssound[14]);
		butp16 = new JButton(ssound[15]);
		butp17 = new JButton(ssound[16]);
		butp18 = new JButton(ssound[17]);
		butp19 = new JButton(ssound[18]);
		butp20 = new JButton(ssound[19]);
		butp21 = new JButton(ssound[20]);
		butp22 = new JButton(ssound[21]);
		butp23 = new JButton(ssound[22]);
		butp24 = new JButton(ssound[23]);

		//Layout
		
		final JFrame f = new JFrame();
		
		Container c = f.getContentPane();
		GridBagLayout gbl = new GridBagLayout();
		c.setLayout( gbl );
		//                            x  y  w  h  wx   wy
		addComponent( c, gbl, labt01, 0, 0, 6, 1, 0  , 0   );
		
		addComponent( c, gbl, bute01, 6, 0, 1, 1, 1  , 0.2   );
		
		addComponent( c, gbl, butp01, 0, 1, 1, 1, 1  , 1   );
		addComponent( c, gbl, butp02, 2, 1, 1, 1, 1  , 1   );
		addComponent( c, gbl, butp03, 4, 1, 1, 1, 1  , 1   );
		addComponent( c, gbl, butp04, 6, 1, 1, 1, 1  , 1   );
		
		addComponent( c, gbl, butp05, 0, 2, 1, 1, 1  , 1   );
		addComponent( c, gbl, butp06, 2, 2, 1, 1, 1  , 1   );
		addComponent( c, gbl, butp07, 4, 2, 1, 1, 1  , 1   );
		addComponent( c, gbl, butp08, 6, 2, 1, 1, 1  , 1   );
		
		addComponent( c, gbl, butp09, 0, 3, 1, 1, 1  , 1   );
		addComponent( c, gbl, butp10, 2, 3, 1, 1, 1  , 1   );
		addComponent( c, gbl, butp11, 4, 3, 1, 1, 1  , 1   );
		addComponent( c, gbl, butp12, 6, 3, 1, 1, 1  , 1   );
		
		addComponent( c, gbl, butp13, 0, 4, 1, 1, 1  , 1   );
		addComponent( c, gbl, butp14, 2, 4, 1, 1, 1  , 1   );
		addComponent( c, gbl, butp15, 4, 4, 1, 1, 1  , 1   );
		addComponent( c, gbl, butp16, 6, 4, 1, 1, 1  , 1   );
		
		addComponent( c, gbl, butp17, 0, 5, 1, 1, 1  , 1   );
		addComponent( c, gbl, butp18, 2, 5, 1, 1, 1  , 1   );
		addComponent( c, gbl, butp19, 4, 5, 1, 1, 1  , 1   );
		addComponent( c, gbl, butp20, 6, 5, 1, 1, 1  , 1   );
		
		addComponent( c, gbl, butp21, 0, 6, 1, 1, 1  , 1   );
		addComponent( c, gbl, butp22, 2, 6, 1, 1, 1  , 1   );
		addComponent( c, gbl, butp23, 4, 6, 1, 1, 1  , 1   );
		addComponent( c, gbl, butp24, 6, 6, 1, 1, 1  , 1   );

		//Resolution laden
		
		
		
		byte dspbytes = 0;
		String dspcontent = "";
		String dspdateiName = "dspconfig.sl";
		FileInputStream dspreadStream = null;
		try {
			dspreadStream = new FileInputStream(dspdateiName);
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		do{
		 	try {
				dspbytes = (byte)dspreadStream.read();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		   	System.out.print(dspbytes+" ");
		   	dspcontent += (char)dspbytes;
		} while (dspbytes !=-1);
		try {
			dspreadStream.close();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		System.out.println();
		System.out.println(dspcontent);
		
		String[] sdsp = dspcontent.split(",");
		  
		final int idspx = Integer.parseInt(sdsp[0]);
		final int idspy = Integer.parseInt(sdsp[1]);
		
		final int screenx = (int) java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		
		if(idspx >= screenx)
			f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		else
			f.setSize( idspx, idspy);
		f.setVisible( true );

		f.addWindowListener(new WindowAdapter(){
		      public void windowClosing(WindowEvent we){
		    	//Resolution speichern
	            	
	            	int nidspx = f.getSize().width;
	                int nidspy = f.getSize().height;
	                
	                String savDSP;
	                if(idspx <= screenx)
	                	savDSP = nidspx + "," + nidspy + ",";
	                else
	                	savDSP = "1024,600,";	
	        		
	               	String dspdatName = "dspconfig.sl";
	               	FileOutputStream dspwriteStream = null;
	               	try {
	               		dspwriteStream = new FileOutputStream(dspdatName);
	               	} catch (FileNotFoundException e1) {
	               		// TODO Auto-generated catch block
	               		e1.printStackTrace();
	               	}
	               	for (int i=0; i < savDSP.length(); i++) {
	               		try {
	               			dspwriteStream.write((byte)savDSP.charAt(i));
	               		} catch (IOException e1) {
	               			// TODO Auto-generated catch block
	               			e1.printStackTrace();
	               		}
	               	}
	               	try {
	               		dspwriteStream.close();
	               	} catch (IOException e1) {
	               		// TODO Auto-generated catch block
	               		e1.printStackTrace();
	               	}
	               	System.exit(0);
		        }
		      });
		
		//ActionListener
		
		bute01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
                //Resolution speichern
            	
            	int nidspx = f.getSize().width;
                int nidspy = f.getSize().height;
                
                String savDSP;
                if(idspx <= screenx)
                	savDSP = nidspx + "," + nidspy + ",";
                else
                	savDSP = "1024,600,";	
        		
               	String dspdatName = "dspconfig.sl";
               	FileOutputStream dspwriteStream = null;
               	try {
               		dspwriteStream = new FileOutputStream(dspdatName);
               	} catch (FileNotFoundException e1) {
               		// TODO Auto-generated catch block
               		e1.printStackTrace();
               	}
               	for (int i=0; i < savDSP.length(); i++) {
               		try {
               			dspwriteStream.write((byte)savDSP.charAt(i));
               		} catch (IOException e1) {
               			// TODO Auto-generated catch block
               			e1.printStackTrace();
               		}
               	}
               	try {
               		dspwriteStream.close();
               	} catch (IOException e1) {
               		// TODO Auto-generated catch block
               		e1.printStackTrace();
               	}

               	f.setVisible(false); // verschwinden lassen
                f.dispose(); // abräumen*/
                EditGUI tedit = new EditGUI();
            	tedit.start();
            }
        });

		
		butp01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
            	new AePlayWave(ssound[0]).start();
            }
        });
		butp02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
            	new AePlayWave(ssound[1]).start();
            }
        });
		butp03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
            	new AePlayWave(ssound[2]).start();
            }
        });
		butp04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
            	new AePlayWave(ssound[3]).start();
            }
        });
		butp05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
            	new AePlayWave(ssound[4]).start();
            }
        });
		butp06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
            	new AePlayWave(ssound[5]).start();
            }
        });
		butp07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
            	new AePlayWave(ssound[6]).start();
            }
        });
		butp08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
            	new AePlayWave(ssound[7]).start();
            }
        });
		butp09.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
            	new AePlayWave(ssound[8]).start();
            }
        });
		butp10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
            	new AePlayWave(ssound[9]).start();
            }
        });
		butp11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
            	new AePlayWave(ssound[10]).start();
            }
        });
		butp12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
            	new AePlayWave(ssound[11]).start();
            }
        });
		butp13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
            	new AePlayWave(ssound[12]).start();
            }
        });
		butp14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
            	new AePlayWave(ssound[13]).start();
            }
        });
		butp15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
            	new AePlayWave(ssound[14]).start();
            }
        });
		butp16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
            	new AePlayWave(ssound[15]).start();
            }
        });
		butp17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
            	new AePlayWave(ssound[16]).start();
            }
        });
		butp18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
            	new AePlayWave(ssound[17]).start();
            }
        });
		butp19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
            	new AePlayWave(ssound[18]).start();
            }
        });
		butp20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
            	new AePlayWave(ssound[19]).start();
            }
        });
		butp21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
            	new AePlayWave(ssound[20]).start();
            }
        });
		butp22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
            	new AePlayWave(ssound[21]).start();
            }
        });
		butp23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
            	new AePlayWave(ssound[22]).start();
            }
        });
		butp24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
            {
            	new AePlayWave(ssound[23]).start();
            }
        });
	}
	public void saveRes() {
		
	}
}

