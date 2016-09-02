package obekt_and_class;

public class TV {
    int channel=1;   // suvag ni 1deer
    int volumeLevel=1;   /// duunii changa sul ni neg deer
    boolean on=false;    // untraatai bgaa
	
	public TV(){
		
	}
	public void TurnOn(){
		on=true;
	}
	
	public void TurnOff(){
		on=false;
	}
	public void SetChannel(int NewChannel){
		if(on && NewChannel>=1 && NewChannel<120)
			channel=NewChannel;
	}
	public void SetVolume(int NewVolume){
		if(on && NewVolume>=1 && NewVolume<=7)
			volumeLevel=NewVolume;
	}
	public void channelUp(){   // suvag nemeh daraagiin suvagruu ochih funkts
		if(on && channel<120)
			channel++;
	}
	public void channelDown(){  //suvag uhraah umnuh deer awaachih funkts
		if(on && channel>1)
			channel--;
	}
	public void volumeDown(){
		if(on && volumeLevel>1)
			volumeLevel--;
	}
	public void volumeUp(){
		if(on && volumeLevel<7)
			volumeLevel++;
	}
	
	
	/// urgeljleliig ni uur class d hiij ugnu .
	//ene hicheeleer hed heden classaar 1programm buteehiig uznee
	
	
	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
