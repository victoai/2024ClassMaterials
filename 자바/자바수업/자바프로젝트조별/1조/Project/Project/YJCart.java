package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class YJCart {

		YJGoods [][] productList;
		
		Scanner sc = new Scanner(System.in);
		YJCart() {
			
			productList = new YJGoods[4][];
			productList[0]= new YJGoods[8];
			productList[1]= new YJGoods[8];
			productList[2]= new YJGoods[4];
			productList[3]= new YJGoods[4];
			
			
//			메이크업
			productList[0][0] = new YJGoods(1,"에스쁘아 프로테일러 파운데이션 비벨벳", 34000);
			productList[0][1] = new YJGoods(2,"파넬 시카마누 세럼쿠션 (2종 중 택1)", 29800);
			productList[0][2] = new YJGoods(3,"클리오 킬커버 파운웨어 파운데이션",23800);
			productList[0][3] = new YJGoods(4,"네이밍 레이어드 핏 쿠션 12g", 22400);
			productList[0][4] = new YJGoods(5,"롬앤쥬시래스팅틴트",8400);
			productList[0][5] = new YJGoods(6,"베네피트 프리사이슬리 마이브로우펜슬",34000);
			productList[0][6] = new YJGoods(7,"힌스뉴뎁스아이섀도우",14400);
			productList[0][7] = new YJGoods(8,"홀리카홀리카 젤리도우블러셔",6500);
			
//			스킨케어
			productList[1][0] = new YJGoods(9,"AHC 마스터즈 에어리치 선스틱 22g",14060);
			productList[1][1] = new YJGoods(10,"식물나라 산소수 워터프루프 선스프레이 SPF50+PA++++1+1 기획",13900);
			productList[1][2] = new YJGoods(11,"닥터지 그린 마일드 업 선플러스 50ml 1+1 기획세트", 26100);
			productList[1][3] = new YJGoods(12,"라운드랩 자작나무 무기자차 선크림 50ml 1+1 기획", 25000);
			productList[1][4] = new YJGoods(13,"아누아 어성초 77 수딩 토너 350ML 리필 기획세트", 31900);
			productList[1][5] = new YJGoods(14,"토리든 다이브인 저분자 히알루론산 토너 500ml 기획",19800);
			productList[1][6] = new YJGoods(15,"라운드랩 1025 독도 토너 500ml+200ml 기획",29800);
			productList[1][7] = new YJGoods(16,"브링그린 티트리시카수딩토너 대용량증정기획", 20520);
			
//			향수
			productList[2][0] = new YJGoods(17,"클린 웜코튼",58590);
			productList[2][1] = new YJGoods(18,"포맨트 시그니처 퍼퓸",37000);
			productList[2][2] = new YJGoods(19,"랑방에끌라드 아르페쥬", 44800);
			productList[2][3] = new YJGoods(20,"안나수이 스카이", 46500);
			
//			기타
			productList[3][0] = new YJGoods(21,"닥터아토 손소독티슈 20매",1600);
			productList[3][1] = new YJGoods(22,"필리밀리 듀얼 라운드 화장솜 60P",3300);
			productList[3][2] = new YJGoods(23,"디어달리아 블루밍에디션 프로페탈 브러쉬", 19000);
			productList[3][3] = new YJGoods(24,"메디힐 비타 에센셜 마스크 10매입", 10000);
			
		}
		public void showMakeupItem() {
			for(int i=0; i<productList.length;i++) {
				if(productList[0][i] == null) break;
				System.out.println(productList[0][i]);
			}
		}
		
		public void showSkinItemp() {
			for(int i=0; i<productList.length;i++) {
				if(productList[0][i] == null) break;
				System.out.println(productList[1][i]);
			}
		}
		public void showPerfumeItem() {
			for(int i=0; i<productList.length;i++) {
				if(productList[0][i] == null) break;
				System.out.println(productList[2][i]);
			}
		}
		
		public void showEtcItem() {
			for(int i=0; i<productList.length;i++) {
				if(productList[0][i] == null) break;
				System.out.println(productList[3][i]);
			}
		}
		
		
		public YJGoods searchItem(int no) {				
			YJGoods goods=null;
			for( int i=0 ; i< productList.length; i++) {
				for( int j=0 ; j< productList[i].length; j++) {
					
//						System.out.println(productList[i][j].getName());
					if( productList[i][j].getNum()==no ) {
						 goods=  productList[i][j]; 
					}
				}
			}
			return goods;
		}
		
			
			
			
		
			
			
	}
	

