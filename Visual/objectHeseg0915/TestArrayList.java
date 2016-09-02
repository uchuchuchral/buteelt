package objectHeseg0915;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList1 list= new ArrayList1();
       list.add("Ulaanbaatar");
       list.add("Darhan");
       list.add("Erdenet");
       list.showList();
       list.add(0, "Baynhongor");
       list.showList();
       System.out.println("2dahi element ni :"+list.get(2));
       
       System.out.println("Darhan gedeg element ene jagsaaltiin urdaasaa hed deh bairand bn we ?"+list.indexOf("Darhan"));
       System.out.println("Darhan gedeg element ene jagsaaltiin ardaasaa hed deh bairand bn we ?"+list.lastIndexOf("Darhan"));
       
       list.remove(1);
       list.showList();
       
       System.out.println("list hoosonuu ?"+list.isEmpty());
	}

}
