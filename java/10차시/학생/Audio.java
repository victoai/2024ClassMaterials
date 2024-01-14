package day10.Audio;

public class Audio {
	private String brandName = "삼성";
	private String modelName = "GalaxyAudio";
	private int price = 350000; 
	private int volume = 0;
	
	public void ShowAudioSpec() {
		System.out.println("브랜드 : " + this.brandName);
		System.out.println("모델 : " + this.modelName);
		System.out.println("가격 : " + this.price);
		System.out.println("음량 : " + this.volume);
	}
	
	public void selectModel(String brandName, String modelName, int price){
		this.brandName = brandName;
		this.modelName = modelName;
		this.price = price;
	}
	
	
}
