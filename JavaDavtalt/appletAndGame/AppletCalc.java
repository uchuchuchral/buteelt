package appletAndGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AppletCalc extends JApplet{
	JButton []j= new JButton[16];   
	JTextField jt; //too huleej awaad butsaaj haruulah text talbar
	String str; 
	String iler1; //ehnii operandiig hadgalah string huwisagch
	String iler2;///2dahi operandiig 
	double hariu1; //hargalzan 1 deh operandiig awah double huwisagch
	double hariu2;
	char temdeg;  // ymar uildel hiihiig zaaj ugnu
	
	String hariu;//butsaaj hariu haruulah 
	
	
	public AppletCalc(){
		JPanel p1= new JPanel(); // bguulagch dotroo hed heden panel uusgej bolno
		p1.setLayout(new GridLayout(4,4)); // p1 havtan uur deeree 5,5 hemjeetei gridlayout aguulna
		
		for(int i=0; i<=9; i++){
			j[i]=new JButton(" "+i);  // 1ees 9 hurtelh tsifriin towchiig foroor uusgelee 
		}
	
		j[10]=new JButton(" +");
		j[11]=new JButton(" -");
		j[12]=new JButton(" /");
		j[13]=new JButton(" *");
		j[14]=new JButton(" C");
		j[15]=new JButton(" =");
		
		str="";
		
		for(int i=0; i<16; i++){
			p1.add(j[i]); //p1 havtan deer buh buttonuudaa nemsen
			j[i].setBackground(Color.LIGHT_GRAY);  // buttonii back ungiig ligthGray eer 
		
		}

		

		
		
	JPanel p2= new JPanel(new BorderLayout()); //ene panel uur deeree border aguulna
	jt= new JTextField("Toogoo oruulna uu?");
	
	jt.setHorizontalAlignment(JTextField.LEFT);
	p2.add(jt, BorderLayout.NORTH);  // north hesegt too oruulah talbariig bairshuullaa
	p2.add(p1,BorderLayout.CENTER); // tuw hesegt umnuh p1 havtanaa bairshuullaa
	
	
	add(p2);
	init();
	}

	
	
	   public void init(){		
			
		   j[0].addActionListener(new ActionListener(){

					public void actionPerformed(ActionEvent e) {
					  	// TODO Auto-generated method stub
	                    str+="0";
	                    jt.setText(str);
	                     
					}
					
				  });
				
		   j[1].addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
				  	// TODO Auto-generated method stub
                   str+="1";
                   jt.setText(str);
                    
				}
				
			  });
			
		   j[2].addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
				  	// TODO Auto-generated method stub
                   str+="2";
                   jt.setText(str);
                    
				}
				
			  });
			
		   
		   j[3].addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
				  	// TODO Auto-generated method stub
                   str+="3";
                   jt.setText(str);
                    
				}
				
			  });
			
		   
		   j[4].addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
				  	// TODO Auto-generated method stub
                   str+="4";
                   jt.setText(str);
                    
				}
				
			  });
			
		   
		   j[5].addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
				  	// TODO Auto-generated method stub
                   str+="5";
                   jt.setText(str);
                    
				}
				
			  });
			
		   
		   j[6].addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
				  	// TODO Auto-generated method stub
                   str+="6";
                   jt.setText(str);
                    
				}
				
			  });
			
		   
		   j[7].addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
				  	// TODO Auto-generated method stub
                   str+="7";
                   jt.setText(str);
                    
				}
				
			  });
			
		   j[8].addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
				  	// TODO Auto-generated method stub
                   str+="8";
                   jt.setText(str);
                    
				}
				
			  });
			
		   
		   j[9].addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
				  	// TODO Auto-generated method stub
                   str+="9";
                   jt.setText(str);
                    
				}
				
			  });
		   
		   j[10].addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
				  	// TODO Auto-generated method stub
                   str+="+";         
                   jt.setText(str);   
				}
			  });
			
		   
		   j[11].addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
				  	// TODO Auto-generated method stub
                   str+="-";         
                   jt.setText(str);   
				}
			  });
		   
		   
		   j[12].addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
				  	// TODO Auto-generated method stub
                   str+="/";         
                   jt.setText(str);   
				}
			  });
		   
		   
		   j[13].addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
				  	// TODO Auto-generated method stub
                   str+="*";         
                   jt.setText(str);   
				}
			  });
		   
		   
		   j[14].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				  	// TODO Auto-generated method stub
                   str="";         
                   jt.setText(str);   
				}
			  });
		   
		   j[15].addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
				  	// TODO Auto-generated method stub
                  str+="=";
                  //System.out.println(Calculate());
                  double l=Calculate();
                  str="";
                  str=String.valueOf(l); // butsaagaad double iig string turul rvv hurvuulne 
                  jt.setText(str);  // tgd hereglegchiin talbar luu butsaana
                  
				}
				
			  });
			
			
	   }
	
	   
private double Calculate(){ // 2toog nemj hashiig bodood hariug ni double turluur butsaah method
    // System.out.println(str);
     int y=0;
     iler1="";
     iler2="";
     
     for(int i=0; i<str.length();i++){
    	 // urjih huwaah nemeh hasahiin ali neg temdegt bwal ter hurtelh temdegtiig buyu toog iler1 d awna
    	if(str.charAt(i)=='+' || str.charAt(i)=='-' || str.charAt(i)=='/' || str.charAt(i)=='*' ){
    	       //System.out.println(str.charAt(i)+"temdegt ->"+i+"indexd bn");
    		    y=i;
    		    temdeg=str.charAt(i);
    		    
    		   for(int j=0; j<i; j++){
    			   iler1+=str.charAt(j);
    			   
    		   } 
    	 }
    		
      if(str.charAt(i)=='='){
    	  for(int j=y+1; j<str.length()-1; j++){
    		  iler2+=str.charAt(j);
    	  }
    	  
      }
    	
     }
     
    //System.out.println("iler1 ->"+iler1);
    //System.out.println("iler2 ->"+iler2);
	hariu1=Double.parseDouble(iler1);
	hariu2=Double.parseDouble(iler2);
	
	
	switch(temdeg){
	    case '+':
	    	hariu1=hariu1+hariu2;
	        break;
	     
	    case '-':
	    	hariu1=hariu1-hariu2;
	        break;
	          
	    case '*':
	    	hariu1=hariu1*hariu2;
	        break;
	     	
	    case '/':
	    	hariu1=hariu1/hariu2;
	        break;
	    
	            
	}
	
	
	return hariu1;
	
}
	   
	public static void main(String[] args) {
    JFrame frame= new JFrame("U-Calculator");
    AppletCalc ca= new AppletCalc();
  
   
    frame.add(ca);
    frame.setSize(250, 400);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(1);
    frame.setLocationRelativeTo(null);
	}

}
