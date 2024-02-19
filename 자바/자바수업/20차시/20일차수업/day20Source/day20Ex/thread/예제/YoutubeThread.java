package javaprj.day0128.day20Ex.thread.예제;

public class YoutubeThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("비디오 재생중: " + i);
		}
	}
}
