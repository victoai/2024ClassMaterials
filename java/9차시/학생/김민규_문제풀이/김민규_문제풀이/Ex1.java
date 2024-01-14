package java_day8_class자료형;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 작성 
		
		String like [] = new String [5];
		
		int favor ;
		int index = 0;
		
		Scanner sc = new Scanner(System.in);
		
		loop:while(true) {
			
			System.out.println("좋아하는거 5개선택" );
			String  favor_=  sc.nextLine();
			favor = Integer.parseInt(favor_);
		
			 switch(favor){
			case 1: 
				index = inPut(like, index, sc);
			 break;
			case 2:
				 input2(like, index);
				 break;
			case 3:
				input3(like, index, sc);
				break;
				
			case 4:
				System.out.println("삭제");
				
				
				input5(like, index, sc);
				
					break;
			case 5:
				System.out.println("종료");
				break loop;			
				
				default:
					System.out.println("error");
				 }			
			}
	
		
		
		}

	public static void input5(String[] like, int index, Scanner sc) {
		for(int i=0; i<index; i++) {
			System.out.println((i+1)+"."+like[i]);
			String delete_ = sc.nextLine();
			int delete = Integer.parseInt(delete_);
			like[delete-1]=" ";
			System.out.println(delete);}
	}

	public static void input3(String[] like, int index, Scanner sc) {
		System.out.println("변경");
		for(int i=0; i<index;i++) {
			System.out.println((i+1)+"."+like[i]);
		}
		System.out.println("변경순서 내용");
		String update_=sc.nextLine();
		
		int update = Integer.parseInt(update_);
		String update1=sc.nextLine();
		like[update-1]=update1;
	}

	public static void input2(String[] like, int index) {
		System.out.println( "조회");
		 for( int i=0; i< index; i++) {
			 System.out.println( like[i]);
		 }
	}

	public static int inPut(String[] like, int index, Scanner sc) {
		System.out.println("입력");	
		 String likes  =sc.nextLine();
		 like[index]= likes;
		 index++;
		return index;
	}
		
		
	}


