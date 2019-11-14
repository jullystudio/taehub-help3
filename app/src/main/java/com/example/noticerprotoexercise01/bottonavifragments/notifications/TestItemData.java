package com.example.noticerprotoexercise01.bottonavifragments.notifications;

import java.util.ArrayList;

public class TestItemData {
    public String keyword;
    public String URL;

    //화면에 표시될 문자열 초기화
    public TestItemData(String keyword, String URL) {
        this.keyword = keyword;
        this.URL = URL;
    }

    //입력 받은 숫자의 리스트 생성
    //테스트를 위해 임의로 만들어 놓은 데이터들
    public static ArrayList<TestItemData> createContactList(int numContacts) {
        ArrayList<TestItemData> contacts = new ArrayList<TestItemData>();

        for (int i = 1; i<=numContacts; i++) {
            contacts.add(new TestItemData("키워드"+i, "링크주소#"+i));
        }
        return contacts;
    }
}
