package day5.enumEx;

import java.util.Random;

public class 주사위문제열거형사용 {
    // 주사위 면을 나타내는 enum 정의
	// enum Type 
    enum DiceFace {
        ONE, TWO, THREE, FOUR, FIVE, SIX   //  0  1  2  3  4  5
    }

    public static void main(String[] args) {
        // 무작위로 주사위 던지기
        DiceFace result = rollDice();  // DiceFace 범위에 올 수 있는 값이 정해져 있다.
        
        // 결과 출력
        System.out.println("주사위를 던진 결과: " + result);
    }

    // 주사위를 무작위로 던지는 메서드
    public static DiceFace rollDice() {
        Random random = new Random();
        int randomNumber = random.nextInt(6); // 0부터 5까지의 난수 생성
        switch(randomNumber) {
            case 0:
                return DiceFace.ONE;
            case 1:
                return DiceFace.TWO;
            case 2:
                return DiceFace.THREE;
            case 3:
                return DiceFace.FOUR;
            case 4:
                return DiceFace.FIVE;
            case 5:
                return DiceFace.SIX;
            default:
                return null;
        }
    }
}

