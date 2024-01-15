package day10.Audio;

public class AudioProgram {

	public static void main(String[] args) {
		Audio audio = new Audio();
		audio.ShowAudioSpec();
		
		audio.selectModel("LG", "GramAudio", 500000);
		
		audio.ShowAudioSpec();
		
	}

}
