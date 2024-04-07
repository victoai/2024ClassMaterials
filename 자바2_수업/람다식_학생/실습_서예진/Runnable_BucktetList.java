package java2prj1.lamda.practice;

public class Runnable_BucktetList {

	public static void main(String[] args) {
		
		String [] BucketList = {"운전연수","이직하기","춤배우기","마지막20대 기록하기"};
		
		Runnable yjbucketlist = ()->{
			for(int i=1;i<BucketList.length;i++) {
				System.out.println(i+"."+BucketList[i]);
			}
			
		};
		yjbucketlist.run();

	}

}
