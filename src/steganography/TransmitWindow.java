package steganography;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TransmitWindow extends javax.swing.JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * @param args
	 */

	public TransmitWindow() {
		go();
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TransmitWindow().setVisible(true);
			}
		});
	}
	JFrame frame;
	private JLabel label1;
	private JFileChooser filechooser1, filechooser2, filechooser3, filechooser4;
	File tempfilename, selectedFile;
	JTextArea textarea;
	JPanel panel7;
	private String str1 = "",str2 = "",strr="";
	private String OK="";

	private JRadioButton b1;
	private JRadioButton b2;
	private JRadioButton b3;
	private JRadioButton b4;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button5;
	private JButton jButton6;
	private ButtonGroup buttonGroup1;
	private ButtonGroup buttonGroup2;
	private ButtonGroup buttonGroup3;
	private JButton jButton5;
	private JButton jButton7;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JPanel jPanel1;
	private JPanel jPanel2;
	private JRadioButton jRadioButton5;
	private JRadioButton jRadiojButton6;
	private byte[] hiddenBytes;
	private byte[] encryptedMessage;
	private byte[] encryptedMsg;
	private File encryptedFile;
	public JButton button11;
	private static JPasswordField passwordField1;
	private static JPasswordField passwordField2;
	private static JPasswordField passwordField3;
	private static JPasswordField passwordField4;



	public void go() {



		buttonGroup1 = new ButtonGroup();
		buttonGroup2 = new ButtonGroup();
		buttonGroup3 = new ButtonGroup();
		jPanel1 = new JPanel();
		jLabel1 = new JLabel();
		b1 = new javax.swing.JRadioButton();
		b1.setSelected(true);
		b2 = new JRadioButton();
		jLabel2 = new JLabel();
		b3 = new JRadioButton();
		b3.setSelected(true);
		b4 = new JRadioButton();
		button1 = new JButton();
		button5 = new JButton();
		jLabel3 = new JLabel();
		jLabel4 = new JLabel();
		jLabel6 = new JLabel();
		jLabel7 = new JLabel();
		button11 = new JButton("OK");
		passwordField1 = new JPasswordField(12);
		passwordField2 = new JPasswordField(12);
		passwordField3 = new JPasswordField(12);
		passwordField4 = new JPasswordField(12);
		button2 = new JButton();
		button3 = new JButton();
		jPanel2 = new JPanel();
		jLabel5 = new JLabel();
		jRadioButton5 = new JRadioButton();
		jRadioButton5.setSelected(true);
		jRadiojButton6 = new JRadioButton();
		jButton5 = new JButton();
		jButton6 = new JButton();
		jButton7 = new JButton();


		button1.addActionListener(this);
		button2.setActionCommand(OK);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button5.addActionListener(this);
		jButton5.addActionListener(this);
		jButton6.addActionListener(this);
		jButton7.addActionListener(this);
		button11.addActionListener(this);
		jButton7.setActionCommand(OK);
		passwordField1.setActionCommand(OK);
		passwordField2.setActionCommand(OK);
		passwordField3.setActionCommand(OK);
		passwordField4.setActionCommand(OK);


		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153)), "Transmitter")); // NOI18N

		jLabel1.setText("Select Career Type");

		buttonGroup1.add(b1);
		b1.setText("Image");

		buttonGroup1.add(b2);
		b2.setText("Audio");

		jLabel2.setText("Select Message");

		buttonGroup2.add(b3);
		b3.setText("Enter Text");

		buttonGroup2.add(b4);
		b4.setText("Select File");

		buttonGroup3.add(jRadioButton5);


		buttonGroup3.add(jRadiojButton6);

		button1.setText("Browse");

		button5.setText("Next");

		jLabel3.setText("Enter Password");

		jLabel4.setText("Re-Enter Password");



		button2.setText("Encrypt Message");

		button3.setText("Embed Message");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLabel2)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addComponent(b1, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
								.addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(b3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(b2)
										.addComponent(b4))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(button1, javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(button5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(16, 16, 16))
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(jLabel3)
																.addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(36, 36, 36)
																.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(jLabel4))
																		.addGap(26, 26, 26))
																		.addGroup(jPanel1Layout.createSequentialGroup()
																				.addGap(52, 52, 52)
																				.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																						.addComponent(button3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																						.addComponent(button2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
																						.addContainerGap(95, Short.MAX_VALUE))
		);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addComponent(jLabel1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(b1)
								.addComponent(b2)
								.addComponent(button1))
								.addGap(18, 18, 18)
								.addComponent(jLabel2)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(b3)
										.addComponent(b4)
										.addComponent(button5))
										.addGap(18, 18, 18)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel3)
												.addComponent(jLabel4))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGap(18, 18, 18)
														.addComponent(button2)
														.addGap(18, 18, 18)
														.addComponent(button3)
														.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);



		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null,"", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153)),"Reciever")); // NOI18N

		jLabel5.setText("Select file Type");

		jLabel6.setText("Enter Password");

		jLabel7.setText("Re-enter Password");

		jRadioButton5.setText("Image");

		jRadiojButton6.setText("Audio");

		jButton5.setText("Browse");

		jButton6.setText("Decode Message");

		jButton7.setText("Decrypt Message");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addComponent(jLabel5)
										.addContainerGap(196, Short.MAX_VALUE))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
												.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(jPanel2Layout.createSequentialGroup()
																.addComponent(jRadioButton5)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
																.addComponent(jRadiojButton6)))
																.addGap(41, 41, 41))))
																.addGroup(jPanel2Layout.createSequentialGroup()
																		.addGap(24, 24, 24)
																		.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
																				.addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																				.addGap(16, 16, 16)
																				.addGroup(jPanel2Layout.createSequentialGroup()
																						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																								.addComponent(jLabel6)
																								.addComponent(passwordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
																								.addGap(36, 36, 36)
																								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																										.addComponent(passwordField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addComponent(jLabel7))
																										.addGap(26, 26, 26))
																										.addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
																										.addContainerGap(85, Short.MAX_VALUE))
		);
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addComponent(jLabel5)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jRadioButton5)
								.addComponent(jRadiojButton6))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jButton5)
								.addGap(23, 23, 23)
								.addComponent(jButton6)
								.addGap(38, 38, 38)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel6)
										.addComponent(jLabel7))  
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(passwordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(passwordField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(18, 18, 18)
												.addComponent(jButton7)
												.addContainerGap(114, Short.MAX_VALUE))
		);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);

		pack();

		// file chooser
		filechooser1 = new JFileChooser();
		filechooser1.setFileSelectionMode(JFileChooser.FILES_ONLY);
		filechooser2 = new JFileChooser();
		filechooser2.setFileSelectionMode(JFileChooser.FILES_ONLY);
		filechooser3 = new JFileChooser();
		filechooser3.setFileSelectionMode(JFileChooser.FILES_ONLY);
		filechooser4 = new JFileChooser();
		filechooser4.setFileSelectionMode(JFileChooser.FILES_ONLY);


	}

	/*class MyDialog extends JDialog {
		*//**
		 * 
		 *//*
		
		private static final long serialVersionUID = 1L;
		
		private JTextArea textArea;
		
		
		

		
		MyDialog(Frame frame, String title) {
			super(frame, title, true);
			textArea = new JTextArea();

			JScrollPane scrollPane = new JScrollPane(textArea);
			getContentPane().add(scrollPane);
			getContentPane().add(BorderLayout.SOUTH,button11);

			setSize(400, 400);
			setLocationRelativeTo(frame);
		}
		public String getText() {
			return textArea.getText();
		}
	}
*/

	public byte[] getHash(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		digest.reset();
		return digest.digest(password.getBytes("UTF-8"));
	}


	/**
	 * @param msgs
	 * @return
	 */
	public byte[] encryptMessage(String msgs,String key) {
		try{
			/*byte[] encodedkey = getHash(key);
                System.out.println("encodedKey: " +encodedkey[0]+ "encodedkey length:" +encodedkey.length);
			 */
			System.out.println(key);
			byte[] encodedkey = getHash(key);
			for(int i = 0; i < encodedkey.length; i++){
				System.out.print(encodedkey[i]);
			}
			System.out.println();

			//convert the byte to hex format
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < encodedkey.length; i++) {
				sb.append(Integer.toString((encodedkey[i] & 0xff) + 0x100, 16).substring(1));
			}
			System.out.println("Hex format : " + sb.toString());


			SecretKeySpec k = new SecretKeySpec(encodedkey, "AES");
			Cipher c = Cipher.getInstance("AES");
			c.init(Cipher.ENCRYPT_MODE, k);
			byte[] dataToSend = msgs.getBytes();
			System.out.println("Length of message : "+dataToSend.length);
			byte[] encryptedData = c.doFinal(dataToSend);
			System.out.println("hello5");

			str2 = bytesToString(encryptedData);

			System.out.println("Message is:\n" + msgs + "\n"); 
			System.out.println("Encoded message is:\n" + str2 + "\n");


			return encryptedData;

		} 

		catch (Exception e) { 
			throw new RuntimeException("Encryption failed!", e); 
		} 

	}     	      


	public static String bytesToString(byte[] bytes) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < bytes.length; i++) {
			sb.append((char) (bytes[i] + 128));
		}
		return sb.toString();
	}

	public static byte[] stringToBytes(String str) {
		int length = str.length();
		byte[] b = new byte[length];
		for (int i = 0; i < length; i++) {
			b[i] = (byte) (str.charAt(i) - 128);
		}
		return b;
	}

	// There are two decryption methods written below. In first method byte array is passed as
	// argument and in second method string is passed as argument. Now the point to be Noted is 
	// string passed in second method is generated from the conversion of byte array to string using
	// method written above namely "byteToString()". Similarly we have to convert this string to 
	// byteArray before using it for decryption in second method. Well this whole step is done only to
	// show the encrypted string, so the second method is only used if we want to do something with
	// the encrypted string or else first method is used... their no conversion is done.

	public String decryptMessage(byte[] encodedData, String key) throws BadPaddingException{ 
		try{ 


			byte[] encodedKey = getHash(key);
			System.out.println("Length of EncodedKey : "+encodedKey.length);
			System.out.println("Length of EncodedData : "+encodedData.length);

			SecretKeySpec k = new SecretKeySpec(encodedKey, "AES");
			Cipher c = Cipher.getInstance("AES");
			c.init(Cipher.DECRYPT_MODE, k);           
			byte[] originalData = c.doFinal(encodedData);

			strr = new String(originalData); 
			System.out.println(strr); 
			return strr; 
		} 

		catch (BadPaddingException e){
			Component veiw = null;
			JOptionPane.showMessageDialog(veiw,
					"Entered Password is incorrect. Please Try Again.", "Error!",
					JOptionPane.ERROR_MESSAGE);
			throw new BadPaddingException();
		}
		catch (Exception e) { 
			throw new RuntimeException("Decryption failed!", e); 
		} 
		
	} 


	public String decryptMessage(String str, String key1) {
		try{
			String key = key1;//... secret sequence of bytes

			byte[] encodedKey = getHash(key); 

			byte[] encryptedData = stringToBytes(str);

			//byte[] encodedData = msgs.getBytes();
			Cipher c = Cipher.getInstance("AES");
			SecretKeySpec k = new SecretKeySpec(encodedKey, "AES");
			c.init(Cipher.DECRYPT_MODE, k); 
			byte[] decryptedData = c.doFinal(encryptedData);

			System.out.println("Decrypted message:\n" + new String(decryptedData) + "\n");

			return str;
		}

		catch (Exception e) {
			throw new RuntimeException("Decryption failed!", e);
		}
	}


	public File hideMessage(byte[] msg, File imgFile) {
		BufferedImage im = null;
		int r=filechooser4.showSaveDialog(null);
		File encryptedFile = null;
		if (r==JFileChooser.APPROVE_OPTION){
			encryptedFile = filechooser4.getSelectedFile();
		}
		//File encryptedFile = new File("C:\\Documents and Settings\\abhi\\Desktop\\abhi\\hidden.png");
		try {
			im = ImageIO.read(imgFile);
			WritableRaster raster = im.getRaster();
			DataBufferByte buffer = (DataBufferByte) raster.getDataBuffer();

			byte[] writableBytes = buffer.getData();


			System.out.println("msgBytes : "+msg);

			int header = msg.length;
			byte[] lenBytes = intToBytes(header, 4);
			int totalLen = 4 + msg.length;
			byte[] bytesToHide = new byte[totalLen];

			System.arraycopy(lenBytes, 0, bytesToHide, 0, lenBytes.length);
			System.arraycopy(msg, 0, bytesToHide, lenBytes.length,
					msg.length);

			if (bytesToHide.length * 8 > writableBytes.length) {
				throw new RuntimeException("Image too small to hide message");
			}

			System.out.println("Writing bytes:");
			int offset = 0;
			for (int i = 0; i < bytesToHide.length; i += 1) {
				byte b = bytesToHide[i];
				System.out.print(b);
				System.out.print(' ');
				for (int j = 0; j < 8; j += 1) {
					int bit = (b >> j) & 1;
					writableBytes[offset] = (byte) ((writableBytes[offset] & 0xFE) | bit);
					offset += 1;
				}
			}
			System.out.println();
			System.out.println("Message length: " + msg.length);
			ImageIO.write(im, "png", encryptedFile);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return encryptedFile;
	}

	public byte[] showMessage(File imgFile) {
		BufferedImage im = null;
		try {
			im = ImageIO.read(imgFile);
			WritableRaster raster = im.getRaster();
			DataBufferByte buffer = (DataBufferByte) raster.getDataBuffer();
			byte[] data = buffer.getData();

			int len = 0;
			int offset = 0;

			System.out.println("Message header is:");
			for (int i = 0; i < 4; i += 1) { // read length header (4 bytes)
				byte b = 0;
				for (int j = 0; j < 8; j += 1) {
					b |= (data[offset] & 1) << j;
					offset += 1;
				}
				System.out.print(b);
				System.out.print(' ');
				len |= b << (8 * i);
			}
			System.out.println();

			System.out.println("Decoding message:");
			hiddenBytes = new byte[len];
			for (int i = 0; i < len; i += 1) {
				byte b = 0;
				for (int j = 0; j < 8; j += 1) {
					b |= (data[offset] & 1) << j;
					offset += 1;
				}
				hiddenBytes[i] = b;
				System.out.print(b);                
				System.out.print(' ');
			}


			System.out.println();
			System.out.println("Encrypted data length is: " + len);
			System.out.println("hiddenbytes"+hiddenBytes);

		} catch (Exception e) {
			Component veiw = null;
			JOptionPane.showMessageDialog(veiw,
					"Selected file has no hidden meassage", "Error!",
					JOptionPane.ERROR_MESSAGE);
			throw new NegativeArraySizeException("ERROR! Please Try Again");
		}
		return hiddenBytes;
	}

	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == button1) {
			if (b1.isSelected()) {
				FileFilter filter = new FileNameExtensionFilter("PNG", "PNG");
				filechooser1.addChoosableFileFilter(filter);
				int r = filechooser1.showDialog(null, "Open file");
				if (r == JFileChooser.APPROVE_OPTION) {
					selectedFile = filechooser1.getSelectedFile();


				}
			} else if (b2.isSelected()) {
				Component view = null;
				JOptionPane.showMessageDialog(view,
						"           Option Disabled!", "Sorry!",
						JOptionPane.INFORMATION_MESSAGE);
				// FileFilter filter = new FileNameExtensionFilter("wav",
				// "wav files");
				// filechooser1.addChoosableFileFilter(filter);
			}

		}
		// for button 5(Next)
		else if (event.getSource() == button5) {
			// for radio button b3
			if (b3.isSelected()) {
				
				MyDialog d = new MyDialog(frame, "Dialog");
				d.setVisible(true);
				try{
					str1 = d.getText();
				}
			
				catch (Exception e){
					Component veiw = null;
					JOptionPane.showMessageDialog(veiw,
							"Please Enter Your Message", "Error!",
							JOptionPane.ERROR_MESSAGE);
					throw new NullPointerException("Please enter message");
				}
				System.out.println(str1.getBytes());
				System.out.println(str1);

				
				/* We can use Another way of getting password given bolow 
				 * instead of using the class "MyDialog"
				  
				   str1 = JOptionPane.showInputDialog(null,
				   "Enter your message:",
				   "Message Box",
				   JOptionPane.PLAIN_MESSAGE);*/
				
			} // end of b3

			// for radio button b4
			else if (b4.isSelected()) {
				int p = filechooser2.showDialog(null, "Open file");
				if (p == JFileChooser.APPROVE_OPTION) {
					File selectedFile = filechooser2.getSelectedFile();

					// read file content
					// System.out.println(selectedFile);
					FileReader fin = null;

					try {
						fin = new FileReader(selectedFile);
						StreamTokenizer stok = new StreamTokenizer(fin);
						int tok = stok.nextToken();
						while (tok != StreamTokenizer.TT_EOF) {
							str1 = str1+" "+stok.sval;                            
							tok = stok.nextToken();
						}
						System.out.println(str1);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {
						if (fin != null) {
							try {
								fin.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}

				}
			}// end of b4

		}// end of button5

		//for Message Encryption
		else if(event.getSource() == button2){
			String cmd = event.getActionCommand();
			if (OK.equals(cmd)) { //Process the password.
				char[] input = passwordField1.getPassword();
				char[] input2 = passwordField2.getPassword();
				String key1= new String(input);
				Component view = null;
				if (isPasswordCorrect(input,input2)) {
					if(input.length<6){
						JOptionPane.showMessageDialog(view,
								"Password must contain atleast 6 characters.",
								"Weak Password",
								JOptionPane.INFORMATION_MESSAGE);		
					}
					else {encryptedMsg=encryptMessage(str1,key1);}
				} else {
					JOptionPane.showMessageDialog(view,
							"Passwords entered does not match. Try again.",
							"Error Message",
							JOptionPane.ERROR_MESSAGE);
					passwordField1.setText("");
					passwordField2.setText("");
				}
			}

		}

		else if (event.getSource() == button3) {

			File encryptedFile = this.hideMessage(encryptedMsg ,this.selectedFile);
		}

		else if (event.getSource() == jButton5) {
			if (jRadioButton5.isSelected()) {
				FileFilter filter = new FileNameExtensionFilter("PNG", "PNG");
				filechooser3.addChoosableFileFilter(filter);
				int r = filechooser1.showDialog(null, "Open file");
				if (r == JFileChooser.APPROVE_OPTION) {
					encryptedFile = filechooser1.getSelectedFile();
					/* FileFilter filter = new FileNameExtensionFilter("PNG", "PNG");
                filechooser1.addChoosableFileFilter(filter);
                int r = filechooser1.showDialog(null, "Open file");
                if (r == JFileChooser.APPROVE_OPTION) {
                    selectedFile = filechooser1.getSelectedFile();*/


				}
			} else if (jRadiojButton6.isSelected()) {
				Component view = null;
				JOptionPane.showMessageDialog(view,
						"           Option Disabled!", "Sorry!",
						JOptionPane.INFORMATION_MESSAGE);
				// FileFilter filter = new FileNameExtensionFilter("wav",
				// "wav files");
				// filechooser1.addChoosableFileFilter(filter);
			}
		}


		else if (event.getSource()== jButton6){


			encryptedMessage = this.showMessage(encryptedFile);
			System.out.println("msbBytes : "+encryptedMessage);

		}

		else if (event.getSource () == jButton7){
			String cmd = event.getActionCommand();
			if (OK.equals(cmd)) { //Process the password.
				char[] input = passwordField3.getPassword();
				char[] input2 = passwordField4.getPassword();
				String key1= new String(input);
				Component view = null;
				if (isPasswordCorrect(input,input2)) {
					//String str=bytesToString(encryptedMessage);
					//strr=decryptMessage(str,key1);
						try {
							strr=decryptMessage(encryptedMessage,key1);
						} catch (BadPaddingException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
					Component view1 = null;
					JOptionPane.showMessageDialog(view1,
							"message is: "+ strr, "Message",
							JOptionPane.INFORMATION_MESSAGE);
					System.out.println("message is:" + strr);

				} else {
					JOptionPane.showMessageDialog(view,
							"Passwords entered does not match. Try again.",
							"Error Message",
							JOptionPane.ERROR_MESSAGE);
					passwordField3.setText("");
					passwordField4.setText("");
				}
			}
		}
	}   // end of actionPerformer()

	private static byte[] intToBytes(int num, int numBytes) {
		byte[] bytes = new byte[numBytes];
		for (int i = 0; i < numBytes; i += 1) {
			bytes[i] = (byte) ((num >> (8 * i)) & 0xFF);
		}
		return bytes;
	}

	private static int bytesToInt(byte[] bytes, int numBytes) {
		int num = 0;
		for (int i = 0; i < numBytes; i += 1) {
			num |= (bytes[i] & 0xFF) << (8 * i);
		}
		return num;
	}


	private static boolean isPasswordCorrect(char[] input,char[] input2) {
		boolean isCorrect = true;


		if (input.length != input2.length) {
			isCorrect = false;
			passwordField1.setText("");
			passwordField2.setText("");
		} else {
			isCorrect = Arrays.equals (input, input2);
			Arrays.fill(input, '0');
			Arrays.fill(input2,'0');
			passwordField1.selectAll();
			passwordField2.selectAll();
		}

		//Zero out the password.
		
		return isCorrect;
	}





}// end of Class


