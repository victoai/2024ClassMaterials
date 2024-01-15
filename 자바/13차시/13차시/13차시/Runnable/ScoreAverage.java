package week04.day3.Runnable;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreAverage implements MyRunnable{

	private int[] scores;
	private double average;
	
	public ScoreAverage() {}
	
	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("평균을 계산할 과목의 개수를 입력해주세요. > ");
		int n = scanner.nextInt();
		scores = new int[n];
		System.out.print("평균을 계산할 점수를 입력해주세요.\n> ");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = scanner.nextInt();
		}
		System.out.println("평균 점수는 "+average(scores)+"점 입니다.");
	}
	
	public double average(int[] scores) {
		int sum=0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		average = (double)sum/scores.length;
		return average;
	}

	public int[] getScores() {
		return scores;
	}

	public double getAverage() {
		return average;
	}

	@Override
	public String toString() {
		return "Average [scores:" + Arrays.toString(scores) + " average:" + average + "]";
	}

	
	
	
}
