import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{
    private JPanel panel;
    private JTextField tf;
    private JButton[] button;
    private String[] label = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "+", "C", "" , "=", ""};

    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("calculator");
        this.setSize(900,500);

        tf = new JTextField(40);
        panel = new JPanel();
        tf.setText("0");
        panel.setLayout(new GridLayout(0, 3));
        button = new JButton[15];
        int index = 0;
        for (int rows = 0; rows < 3; rows++) {
            for (int cols = 0; cols < 5; cols++) {
                button[index] = new JButton(label[index]);
                button[index].addActionListener(this);
                
                panel.add(button[index]);
                index++;
            }
        }
        add(tf, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
        pack();
        }
    
    protected void calculateInitiate() { 
    	tempName = ""; 
        tempString = ""; 
        num = 0;
        strnum = "";
        after = false; 
        } 
    
    private String tempName; 
    private String tempString; 
    private int num = 0; 
    private String strnum = ""; 
    private boolean after = false; 

    public void actionPerformed(ActionEvent e) {
    	tempName = e.getActionCommand();
    	if (tempName.equals("C")) {
    		tf.setText("");
    		return;
    		}
    	
    	tempString = tf.getText();
    	
    	if (tempString.equals("0")) 
    		tempString = "";
    	
 
    	if ((tempName.equals("+") && !after)) { 
    		num = Integer.parseInt(tempString); 
    		after = true; 
    		tf.setText(tempString + tempName); 
    		} 
    	
    	else if (tempName.equals("=") && after && !strnum.equals("")) {  
    		int temp = Integer.parseInt(strnum); 
    		tf.setText(Integer.toString(Calculate(num, temp))); 
    		calculateInitiate(); 
    		} 

    	else { 
    		tf.setText(tempString + tempName); 
    	}
    	
    	
    	if(after) { 
    		strnum += tempName; 
    		} 
    	}
        
    
    protected int Calculate(int a, int b) {
    	return a+b;
    	}
}