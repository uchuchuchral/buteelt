package obekt_and_class;

public class TestTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TV tv1= new TV();
       tv1.TurnOn();
       tv1.SetChannel(30);
       tv1.SetVolume(3);
       
       TV tv2= new TV();
       tv2.TurnOn();
       tv2.channelUp();
       tv2.channelUp();
       tv2.volumeUp();
       
    //   TV tv3 = null;
    //  tv3.TurnOn();  // ingej uusgej bas bolno
      
      
       System.out.println("tv1 iin suvag ni "+tv1.channel+"bas duunii changa sul ni "+tv1.volumeLevel);
       System.out.println("tv2 iin suvag ni "+tv2.channel+"bas duunii changa sul ni "+tv2.volumeLevel);
       
	}

}
/// huudas 302 deer bgaa.
// huudas 309 deer bgaa.
