package day10;

public class 길드가입신청서 {
	private String 닉네임;
	private int 나이;
	private String 직업;
	private int 레벨;

	public void 신청(String 닉네임, int 나이, String 직업,int 레벨 ) {
		this.닉네임 =닉네임;
		this.나이 =나이;
		this.직업 =직업;
		this.레벨 =레벨;
	}
	
	public String 접수완료() {
		return "접수 정보 [닉네임:"+ 닉네임 +
				" 나이:" + 나이 + 
				"살 직업:"+ 직업 +
				" 레벨:"+레벨 +"Lv]";
	}

}
