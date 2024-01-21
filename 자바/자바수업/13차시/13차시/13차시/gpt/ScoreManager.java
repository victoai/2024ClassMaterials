package gpt;

import java.util.ArrayList;
import java.util.Iterator;

public class ScoreManager {
	
    private ArrayList<Score>   scoreList = new ArrayList<>();

    public ScoreManager() {
      
    }

    // 성적 정보 추가
    public void register(String name, int score) {
        Score newScore = new Score(name, score);
        scoreList.add(newScore);
    }

    // 성적 정보 삭제
    public boolean removeScore(String name) {       
        for (int  i =0; i< scoreList.size() ; i++) {
             
            if (scoreList.get(i).equals(name)) {
                scoreList.remove(i);
                return true;
            }
        }
        return false;
    }

    // 성적 정보 조회
    public void showAllScores() {
        System.out.println("<< 성적 정보 조회 >>");
        for (Score score : scoreList) {
            System.out.println(score.getName() + ": " + score.getScore());
        }
    }

    // 성적 정보 변경
    public boolean updateScore(String name, int newScore) {
        for (Score score : scoreList) {
            if (score.getName().equals(name)) {
                score.setScore(newScore);
                return true;
            }
        }
        return false;
    }
}
