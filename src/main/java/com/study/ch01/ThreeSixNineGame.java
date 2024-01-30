package com.study.ch01;

public class ThreeSixNineGame {
    /**
     number 에 3,6,9가 포함되면 "clap", 아니면 입력받은 숫자를 String으로 리턴
     do369(16) -> "clap"
     do369(12) -> "12"
     do369(33) -> "clap"
     */
    public static String do369(int number) {

        boolean calp = true;
        if(number / 10 == 3 || number / 10 == 6 || number / 10 == 9) {
            calp = false;
        }
        if(number % 10 == 3 || number % 10 == 6 || number % 10 == 9) {
            calp = false;
        }

        if(!calp) {
            return "clap";
        }
        return Integer.toString(number);
    }

    /**
     게임에 참가하는 플레이어의 이름 배열을 받아서 게임을 진행.
     결과를 sout 으로 화면에 출력해주세요.
     정확히 100회의 게임이 진행 되도록 해주세요.
     예제. "영수", "광수", "영철", "영기" 가 입력된경우
     영수: 1
     광수: 2
     영철: clap
     영기: 4
     ..중략..
     영기: 100
     */
    public void playGame(String[] players) {

    }

    public static void main(String[] args) {

        String[] players = new String[]{"영수", "광수", "영철", "영기"};
        new ThreeSixNineGame().playGame(players);
        for (int i = 0; i < 100; i++) {
            System.out.println(players[i % 4] + ": " +do369(i+1));
        }

    }
}
