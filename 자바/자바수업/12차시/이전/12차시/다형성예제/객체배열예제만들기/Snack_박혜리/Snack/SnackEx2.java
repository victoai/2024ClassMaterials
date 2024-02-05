package Snack;

public class SnackEx2 {

	public static void main(String[] args) {
		
		Snack[] snackList = new Snack[3];
		snackList[0]=new Snack("빼빼로",1200,"달콤한",40);
		snackList[1]=new Snack("맛동산",2300,"달콤한",100);
		snackList[2]=new Snack("프링글스",1700,"어니언",50);
		
		for(int i=0;i<snackList.length;i++) {
			System.out.println(snackList[i]);
		}
	}

}
