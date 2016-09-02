package java1;

import javax.swing.JOptionPane;
public class Dun {
	public static void main(String[] args) {
		String b,c,d,n,m,a;
		int g,gpa,h,numd,numn,numm,numa,numb, numc;
		d=JOptionPane.showInputDialog("Эхний хичээлийн дүнгээ оруулна уу?");
		n=JOptionPane.showInputDialog("Тухайн хичээл хэдэн кредит бэ?");
		b=JOptionPane.showInputDialog("Дараагийн хичээлийн дүнгээ оруулна уу?");
		m=JOptionPane.showInputDialog("Тухайн хичээл хэдэн кредит бэ?");
		c=JOptionPane.showInputDialog("Дараагийн хичээлийн дүнгээ оруулна уу?");
		a=JOptionPane.showInputDialog("Тухайн хичээл хэдэн кредит бэ?");
		numd=Integer.parseInt(d);
		numb=Integer.parseInt(b);
		numn=Integer.parseInt(n);
		numc=Integer.parseInt(c);
		numm=Integer.parseInt(m);
		numa=Integer.parseInt(a);
		gpa=(numd*numn+numb*numm+numc*numa)/(numn+numm+numa);

		if(gpa>=96){        
			JOptionPane.showMessageDialog(null,"3 хичээлийн Нийт голч нь 4.0, А үсгэн үнэлгээтэй, үнэлгээний голч нь"+gpa+"байна.","Results",JOptionPane.PLAIN_MESSAGE);
		}
		else if(gpa>=91 && gpa<=95){
			JOptionPane.showMessageDialog(null,"3 хичээлийн Нийт голч нь 3.7, A- үсгэн үнэлгээтэй, үнэлгээний голч нь"+gpa+"байна.","Results",JOptionPane.PLAIN_MESSAGE);
		}
		else if(gpa>=88&&gpa<=90){
			JOptionPane.showMessageDialog(null,"3 хичээлийн Нийт голч нь 3.4, B+ үсгэн үнэлгээтэй, үнэлгээний голч нь"+gpa+"байна.","Results",JOptionPane.PLAIN_MESSAGE);
		}
		else if(gpa>=84&&gpa<=87){
			JOptionPane.showMessageDialog(null,"3 хичээлийн Нийт голч нь 3.0, B үсгэн үнэлгээтэй, үнэлгээний голч нь"+gpa+"байна.","Results",JOptionPane.PLAIN_MESSAGE);
		}
		else if(gpa>=81&&gpa<=83){
			JOptionPane.showMessageDialog(null,"3 хичээлийн Нийт голч нь 2.7, B- үсгэн үнэлгээтэй, үнэлгээний голч нь"+gpa+"байна.","Results",JOptionPane.PLAIN_MESSAGE);
		} 
		else if(gpa>=78&&gpa<=80){
			JOptionPane.showMessageDialog(null,"3 хичээлийн Нийт голч нь 2.4, C+ үсгэн үнэлгээтэй, үнэлгээний голч нь"+gpa+"байна.","Results",JOptionPane.PLAIN_MESSAGE);
		}
		else if(gpa>=74&&gpa<=77){
			JOptionPane.showMessageDialog(null,"3 хичээлийн Нийт голч нь 2.0, C үсгэн үнэлгээтэй, үнэлгээний голч нь"+gpa+"байна.","Results",JOptionPane.PLAIN_MESSAGE);
		}
		else if(gpa>=71&&gpa<=73){
			JOptionPane.showMessageDialog(null,"3 хичээлийн Нийт голч нь 1.7, C- үсгэн үнэлгээтэй, үнэлгээний голч нь"+gpa+"байна.","Results",JOptionPane.PLAIN_MESSAGE);
		}
		else if(gpa>=68&&gpa<=70){
			JOptionPane.showMessageDialog(null,"3 хичээлийн Нийт голч нь 1.3, D+ үсгэн үнэлгээтэй, үнэлгээний голч нь"+gpa+"байна.","Results",JOptionPane.PLAIN_MESSAGE);
		}
		else if(gpa>=64&&gpa<=67){
			JOptionPane.showMessageDialog(null,"3 хичээлийн Нийт голч нь 1.0, D үсгэн үнэлгээтэй, үнэлгээний голч нь"+gpa+"байна.","Results",JOptionPane.PLAIN_MESSAGE);
		}
		else if(gpa>=60&&gpa<=63){
			JOptionPane.showMessageDialog(null,"3 хичээлийн Нийт голч нь 0.7, D- үсгэн үнэлгээтэй, үнэлгээний голч нь"+gpa+"байна.","Results",JOptionPane.PLAIN_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null,"3 хичээлийн Нийт голч нь 0.0, F үсгэн үнэлгээтэй, үнэлгээний голч нь"+gpa+"байна.","Results",JOptionPane.PLAIN_MESSAGE);
		}
		System.exit(0);



	}

}
