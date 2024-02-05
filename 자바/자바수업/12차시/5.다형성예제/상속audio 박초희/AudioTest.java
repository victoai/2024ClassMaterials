package week04.day1.상속;

public class AudioTest {

	public static void main(String[] args) {

		Audio audio = new Audio();
		audio.sound();
		
		System.out.println("\n===================");
		Audio.volumeUp();
		Audio.volumeUp();
		Audio.printVolume();

		//Audio[] audio = new Audio[2];
		//audio[0] = new Speaker();
		//audio[1] = new Earphone();
		Audio[] audios = {new Speaker(),new Earphone()};
				
		System.out.println("\n====================");
		audios[0].sound();
		audios[1].sound();
				
		System.out.println("\n======다운캐스팅======");
		Audio a = new Speaker();
		Speaker speaker = (Speaker)a;
		speaker.sound();
		
		System.out.println("\n====================");
		print(audio);
		System.out.println("\n====================");
		//audio[0] = new Speaker();
		print(audios[0]);
		System.out.println("\n====================");
		//audio[1] = new Earphone();
		print(audios[1]);
		
		System.out.println("\n==매개변수로 자식클래스==");
		Earphone earphone = new Earphone();
		print(earphone);
	}
	
	public static void print(Audio audio) {
		audio.sound();
		if(audio instanceof Earphone) {    //instanceof : 객체타입 확인 
			((Earphone)audio).leftSound();    //다운캐스팅
		}
	}

	
}
