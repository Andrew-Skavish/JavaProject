import javax.swing.*; 
import java.awt.event.*;  
public class CheckBoxExample extends JFrame implements ActionListener{   
	JCheckBox 
	checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,
	checkBox6,checkBox7,checkBox8,checkBox9,checkBox10,
	checkBox11,checkBox12,checkBox13,checkBox14,checkBox15,
	checkBox16,checkBox17,checkBox18,checkBox19,checkBox20,checkBox21;
	boolean[][] twoD_arr = new boolean[3][7];
     CheckBoxExample(){  
    checkBox1 = new JCheckBox("OneByOne",twoD_arr[0][0]);  
     	checkBox1.setBounds(0,0, 150,40);  
    checkBox2 = new JCheckBox("OneByTwo",twoD_arr[0][1]);  
     	checkBox2.setBounds(0,30, 150,40);  
    checkBox3 = new JCheckBox("OneByThree",twoD_arr[0][2]);  
     	checkBox3.setBounds(0,60, 150,40);  
    checkBox4 = new JCheckBox("ThreeCorner",twoD_arr[0][3]);  
     	checkBox4.setBounds(0,90, 150,40);  
    checkBox5 = new JCheckBox("OneByFour",twoD_arr[0][4]);  
     	checkBox5.setBounds(0,120, 150,40);  
    checkBox6 = new JCheckBox("FourCorner",twoD_arr[0][5]);  
     	checkBox6.setBounds(0,150, 150,40);  
    checkBox7 = new JCheckBox("FourT",twoD_arr[0][6]);  
     	checkBox7.setBounds(0,180, 150,40); 
     	
    checkBox8 = new JCheckBox("Square",twoD_arr[1][0]);  
     	checkBox8.setBounds(0,210, 150,40); 
    checkBox9 = new JCheckBox("FourZigZag",twoD_arr[1][1]);  
     	checkBox9.setBounds(0,240, 150,40); 
    checkBox10 = new JCheckBox("OneByFive",twoD_arr[1][2]);  
     	checkBox10.setBounds(0,270, 150,40); 
   checkBox11 = new JCheckBox("FiveCorner",twoD_arr[1][3]);  
     	checkBox11.setBounds(0,300, 150,40); 
   checkBox12 = new JCheckBox("FourandOne",twoD_arr[1][4]);  
     	checkBox12.setBounds(0,330, 150,40); 
   checkBox13 = new JCheckBox("FiveL",twoD_arr[1][5]);  
     	checkBox13.setBounds(0,360, 150,40); 
   checkBox14 = new JCheckBox("FiveZigZag",twoD_arr[1][6]);  
     	checkBox14.setBounds(0,390, 150,40); 
     	
   checkBox15 = new JCheckBox("Cross",twoD_arr[2][0]);  
     	checkBox15.setBounds(0,420, 150,40); 
   checkBox16 = new JCheckBox("ThreeAndTwo",twoD_arr[2][1]);  
     	checkBox16.setBounds(0,450, 150,40); 
   checkBox17 = new JCheckBox("OneThreeOne",twoD_arr[2][2]);  
     	checkBox17.setBounds(0,480, 150,40); 
   checkBox18 = new JCheckBox("BackZ",twoD_arr[2][3]);  
     	checkBox18.setBounds(0,510, 150,40); 
   checkBox19 = new JCheckBox("SquareAndOne",twoD_arr[2][4]);  
     	checkBox19.setBounds(0,540, 150,40); 
   checkBox20 = new JCheckBox("Phone",twoD_arr[2][5]);  
     	checkBox20.setBounds(0,570, 150,40); 
   checkBox21 = new JCheckBox("FiveT",twoD_arr[2][6]);
     	checkBox21.setBounds(0,600,150,40);
     	add(checkBox1);add(checkBox2);add(checkBox3);add(checkBox4);add(checkBox5);add(checkBox6);add(checkBox7);
     	add(checkBox8);add(checkBox9);add(checkBox10);add(checkBox11);add(checkBox12);add(checkBox13);add(checkBox14);
     	add(checkBox15);add(checkBox16);add(checkBox17);add(checkBox18);add(checkBox19);add(checkBox20);add(checkBox21);
     	setSize(200,650);  
        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
 

     }  

public void actionPerformed(ActionEvent e){ 

	
	
if(checkBox1.isSelected()) {
	
	twoD_arr[0][0] = true;
	}
if(checkBox2.isSelected()) {
	
	twoD_arr[0][1] = true;
}
if(checkBox3.isSelected()) {
	
	twoD_arr[0][2] = true;
}
if(checkBox4.isSelected()) {
	
	twoD_arr[0][3] = true;
}
if(checkBox5.isSelected()) {
	
	twoD_arr[0][4] = true;
}
if(checkBox6.isSelected()) {
	
	twoD_arr[0][5] = true;
}
if(checkBox7.isSelected()) {
	
	twoD_arr[0][6] = true;
}
if(checkBox8.isSelected()) {
	
	twoD_arr[1][0] = true;
}
if(checkBox9.isSelected()) {
	
	twoD_arr[1][1] = true;
}
if(checkBox10.isSelected()) {
	
	twoD_arr[1][2] = true;
}
if(checkBox11.isSelected()) {
	
	twoD_arr[1][3] = true;
}
if(checkBox12.isSelected()) {
	
	twoD_arr[1][4] = true;
}
if(checkBox13.isSelected()) {
	
	twoD_arr[1][5] = true;
}
if(checkBox14.isSelected()) {
	
	twoD_arr[1][6] = true;
}
if(checkBox15.isSelected()) {
	
	twoD_arr[2][0] = true;
}
if(checkBox16.isSelected()) {
	
	twoD_arr[2][1] = true;
}
if(checkBox17.isSelected()) {
	
	twoD_arr[2][2] = true;
}
if(checkBox18.isSelected()) {
	
	twoD_arr[2][3] = true;
}
if(checkBox19.isSelected()) {
	
	twoD_arr[2][4] = true;
}
if(checkBox20.isSelected()) {
	
	twoD_arr[2][5] = true;
}
if(checkBox21.isSelected()) {
	
	twoD_arr[2][6] = true;
}
	}
public void itemStateChanged(ItemEvent e) {    
	
}
public static void main(String args[])  
{  
new CheckBoxExample();  
} 
}



