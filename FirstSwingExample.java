import javax.swing.*; 
public class FirstSwingExample 
{ 
public static void main(String[] args) 
	{ 
		JFrame f=new JFrame("Button example");//creating instance of JFrame 
		JButton b=new JButton("click");//creating instance of JButton 
		b.setBounds(130,100,100, 40);//x axis, y axis, width, height 
		f.add(b);//adding button in JFrame 
		f.setSize(400,400);//400 width and 500 height 
		f.setLayout(null);//using no layout managers 
		f.setVisible(true);//making the frame visible 
	} 
} 