package Week3.day1.LearnAbstraction;

public class Samsung extends AndroidTV{

	@Override
	public void playVideo() {
		
		System.out.println("Play Video");
	}


	public static void main(String[] args) {
		
		Samsung act = new Samsung();
		act.playVideo();
		act.openApp();
	}

}
