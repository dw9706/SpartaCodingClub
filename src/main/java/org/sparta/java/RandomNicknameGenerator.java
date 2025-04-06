package org.sparta.java;

import java.util.*;

public class RandomNicknameGenerator {
    private ArrayList<String> firstWords = new ArrayList<>(List.of("기절초풍", "멋있는","재미있는"));
    private ArrayList<String> secondWords = new ArrayList<>(List.of("도전적인", "노란색의","바보같은"));
    private ArrayList<String> thirdWords = new ArrayList<>(List.of("돌고래", "개발자","오랑우탄"));
    private Random random = new Random();

    public void addFirstWord(String s) {
        firstWords.add(s);
    }
    public void addSecondWord(String s) {
        secondWords.add(s);
    }
    public void addThirdWord(String s) {
        thirdWords.add(s);
    }

    public String generateNickName() {
        StringBuilder nickName = new StringBuilder();
        nickName.append(firstWords.get(random.nextInt(firstWords.size())));
        nickName.append(" ");
        nickName.append(secondWords.get(random.nextInt(secondWords.size())));
        nickName.append(" ");
        nickName.append(thirdWords.get(random.nextInt(thirdWords.size())));
        return nickName.toString();
    }

    public static void main(String[] args) {
        RandomNicknameGenerator generator = new RandomNicknameGenerator();
        System.out.println(generator.generateNickName());
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
    }
}

