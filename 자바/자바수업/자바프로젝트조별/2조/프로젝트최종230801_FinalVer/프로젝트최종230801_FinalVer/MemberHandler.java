package 프로젝트최종230801_FinalVer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import 프로젝트최종230801_FinalVer.Booking;

public class MemberHandler {

	static Scanner sc = new Scanner(System.in);

	String insert_id;
	String insert_pw;
	String insert_name;
	String insert_phoneNum;

	String login_id;
	String login_pw;
	String login_name;
	String login_phoneNum;

	public ArrayList<MemberInfo> memberInfos = new ArrayList<>();

	public void memberInsert() {
		System.out.println("아이디 : ");
		insert_id = sc.nextLine();
		if (!isUniqueID(insert_id)) {
			System.out.println("이미 사용중인 아이디입니다.");
			return;
		}

		System.out.println("암호 : ");
		insert_pw = sc.nextLine();
		System.out.println("이름 : ");
		insert_name = sc.nextLine();
		System.out.println("전화번호 : ");
		insert_phoneNum = sc.nextLine();

		MemberInfo member = new MemberInfo(insert_id, insert_pw, insert_name, insert_phoneNum);
		memberInfos.add(member);
		System.out.println("가입 완료! \n");
		

	}
	
	

	private boolean isUniqueID(String id) {
		for (int i = 0; i < memberInfos.size(); i++) {
			if (memberInfos.get(i).getId().equals(id)) {
				return false;
			}
		}
		return true;
	}

	public String memberLogin() throws IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 : ");
		login_id = sc.nextLine();
		System.out.println("패스워드 : ");
		login_pw = sc.nextLine();
		String error = "fail";

		for (int i = 0; i < memberInfos.size(); i++) {
			MemberInfo member = memberInfos.get(i);
			if (member.getId().equals(login_id)) {
				if(member.getPw().equals(login_pw)) {
					System.out.println("로그인에 성공하셨습니다.");
					return login_id;
				}else {
					System.out.println("암호가 잘못되었습니다.");
					System.out.println("다시 로그인을 하세요");
					return error;
				}
			}
		}
		System.out.println("존재하지 않는 아이디입니다.");
		System.out.println("회원가입하세요.");
		return error;
	}

	public void ShowMyInfo() {
		for (int i = 0; i < memberInfos.size(); i++) {
			if (memberInfos.get(i).getId().equals(login_id) && memberInfos.get(i).getPw().equals(login_pw)) {
				login_id = memberInfos.get(i).getId();
				login_pw = memberInfos.get(i).getPw();
				login_name = memberInfos.get(i).getName();
				login_phoneNum = memberInfos.get(i).getPhonNum();
			}
		}
		System.out.println("이름 : " + login_name);
		System.out.println("아이디 : " + login_id);
		System.out.println("비밀번호 : " + login_pw);
		System.out.println("전화번호 : " + login_phoneNum);
	}

	public void ChangeMyName() {
		System.out.println("변경할 이름을 입력해주세요.");
		String newName = sc.next();
		for (int i = 0; i < memberInfos.size(); i++) {
			if (memberInfos.get(i).getId().equals(login_id)) {
				login_name = newName;
				memberInfos.get(i).setName(newName);
			} else if (login_name == newName) {
				System.out.println("이름이 같습니다.");
			}
		}

	}

	public void ChangeMyPw() {
		System.out.println("변경할 비밀번호를 입력해주세요.");
		String newPw = sc.next();
		for (int i = 0; i < memberInfos.size(); i++) {
			if (memberInfos.get(i).getId().equals(login_id)) {
				login_pw = newPw;
				memberInfos.get(i).setPw(login_pw);
			} else if (login_pw == newPw) {
				System.out.println("비밀번호가 같습니다.");
			}
		}
	}

	public void ChangeMyPhonNum() {
		System.out.println("변경할 전화번호를 입력해주세요.");
		String newPhoneNum = sc.next();
		for (int i = 0; i < memberInfos.size(); i++) {
			if (memberInfos.get(i).getId().equals(login_id)) {
				login_phoneNum = newPhoneNum;
				memberInfos.get(i).setPhonNum(login_phoneNum);
			} else if (login_phoneNum == newPhoneNum) {
				System.out.println("전화번호가 같습니다.");
			}
		}
	}
	
	// 로그인 정보 파일에 저장
	public static void FileInput(ArrayList<MemberInfo> item, String list) {
		try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("res/"+list+".txt"));
            // 문자열을 파일에 쓰기
            for(int i=0; i<item.size(); i++) {
            	writer.write(item.get(i).toString()+"\n");
            }
            // 파일 쓰기 완료 후 닫기
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	// 파일내용 다시 배열에 저장
	public static void FileOutput(ArrayList<MemberInfo> item, String list) {
		try {
			BufferedReader bf = new BufferedReader(new FileReader("res/"+list+".txt"));
			int cnt=0;
			while(true) {
				String data = bf.readLine();
				if( data == null) break;
				cnt++;
			}
			String[][] arr = new String[cnt][4]; 
			int index =0;
			bf = new BufferedReader(new FileReader("res/"+list+".txt"));
			while(true) {
				String data = bf.readLine();
				if( data == null) break;
				arr[index] = data.split(" ");
				item.add(  new MemberInfo(arr[index][0], arr[index][1], arr[index][2], arr[index][3]) );
				index++;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}