package daalgavar10;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TicTacToe extends JFrame{
    JMenuBar menubar;
    JMenu file;
    JMenuItem newGame,exitGame;
	TicTacPanel panel1;
    boolean player, endGame;  // true bol x toglogch false bol o toglogch toglono 
    JLabel l1;  // ali toglogch yvj bgaag haruulah label
    char ch;
    int count;
    
    public TicTacToe(){
    	
    	count=0;
    	menubar= new JMenuBar();
    	file= new JMenu("file");
    	newGame= new JMenuItem("New Game");
    	exitGame= new JMenuItem("Exit ");
    	panel1= new TicTacPanel();
    	l1= new JLabel("Toglogch 1(X)");
    	EventSection();
    	
    	file.add(newGame);
    	file.add(exitGame);
    	
    	menubar.add(file);
    	this.setJMenuBar(menubar);
    	this.add(panel1, BorderLayout.CENTER);
    	this.add(l1, BorderLayout.SOUTH);
    	
    	panel1.addMouseListener(new CustomMouseListener() );
    	startGame();
    	
    }
    
    public void EventSection(){
    	exitGame.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("exit darsan");
				System.exit(0);
			}
    		
    	});
    	
    	newGame.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				  count=0;
				  panel1.Restart();
				  startGame();
				
			}
    		
    	});
    }
    
    public void startGame(){
    	player=true;
    	endGame=false;
        ch='x';
    }
	
    class CustomMouseListener implements MouseListener{     
		public void mouseClicked(MouseEvent e) {
		////	System.out.println("mouse clicked");
		//	System.out.println("x:"+e.getX());
		//	System.out.println("y:"+e.getY());
			
			
			
			if(endGame==false){
				
			
				if(panel1.checkTalbar(e.getX(), e.getY(),ch)==true ){
				
					if(panel1.checkWin(ch)==1){
					
						if(ch=='o'){ l1.setText("Toglogch 2(O) ylsan****** "); endGame=true;} 
						if(ch=='x') {l1.setText("Toglogch 1(X) ylsan****** "); endGame= true;}
					}
				
					if(count==9 && endGame==false){
						l1.setText("Hen ch ylaagui ");
						endGame=true;
					}
				
					count++;
					if(endGame==false){
						if(!player) {
							ch='x'; 
							player=true;
							l1.setText("Toglogch 1(X)");
						}
				
						else{
							ch='o';   
							player=false;
							l1.setText("Toglogch 2(O)");
						}
				
					}
				}
			
			}
	
		}

		public void mouseEntered(MouseEvent arg0) {

		}

		public void mouseExited(MouseEvent arg0) {

		}

		public void mousePressed(MouseEvent arg0) {

		}


		public void mouseReleased(MouseEvent e) {
		}
		
	    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TicTacToe frame= new TicTacToe();
			frame.setTitle("TicTacToe");
			frame.setSize(500,500);
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

}
