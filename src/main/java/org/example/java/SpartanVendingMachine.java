package org.example.java;

import java.util.*;

public class SpartanVendingMachine {
    Scanner sc = new Scanner(System.in);
    HashMap<String, Integer> items = new HashMap<>(Map.of(
            "사이다",1700,
            "콜라",1900,
            "식혜",2500,
            "솔의눈",3000
    ));


    public void start() {
        printItems(); // 음료 목록 출력

        String itemName = selectItem(); // 음료 이름을 입력 받음

        int amount = pay(itemName); // 금액을 지불

        System.out.println("남은 금액 : " + (amount - items.get(itemName)));
    }

    private void printItems() {
        for (String key : items.keySet()) {
            System.out.println(key+" "+items.get(key)+"원");
        }
    }

    private String selectItem() {
        System.out.print("어떤 음료를 드시겠습니까? 음료 이름을 입력해주세요 : ");
        String itemName = sc.nextLine().trim(); //음료를 받음
        if (!items.containsKey(itemName)) { //음료가 목록에 있는지 확인
            System.out.print("목록에 없는 음료를 선택했습니다. 자판기를 종료합니다.");
            System.exit(0);
        }
        return itemName;
    }

    private int pay(String itemName) {
        System.out.print("지불할 금액을 입력해주세요 : ");
        int amount = sc.nextInt();
        sc.nextLine();
        if (items.get(itemName) > amount) {
            System.out.println("돈이 부족합니다.");
            System.exit(0);
        }
        return amount;
    }

    public static void main(String[] args) {
        SpartanVendingMachine mc = new SpartanVendingMachine();
        mc.start();
    }
}
