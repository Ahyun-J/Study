package com.example.java_lecture;

public class Day01 {
    public static void main(String[] args){
        //컨트롤 +d
        System.out.println("안녕 world! 1");
        System.out.println("안녕 world! 2");

        //컨트롤 +y

        int emptyBox;

        int Box = 10;

        Box = 1818181818;

        System.out.println(Box);

        int year = 2026;
        int month = 1;

        System.out.println(year + " " + month);

        //my boy friend age
        int myBoyFriendAge = 0;
        System.out.println(myBoyFriendAge);


//        int age = 20;
//        String teenagerInfo = "미성년자이다.";
//        String audltInfo = "성인이다.";
//        if(age <= 19) {
//            System.out.println(teenagerInfo);
//        } else {
//            System.out.println(audltInfo);
//        }


        //- **실습 11: 미션 A - 나이 기준 바꾸기**
        //    - 나이기준 60
        //    - 노인이다
        //    - 노인이 아니다 출력해보기

        int age = 20;
        String young = "노인이아니다.";
        String old = "노인이다.";
        if(age < 60) {
            System.out.println(young);
        } else {
            System.out.println(old);
        }

        //- **실습 12: 미션 B - 변수 두개 사용하기**
        //    - 저의 사촌동생 이름은 OOO 이고 미성년자 입니다.
        //    - 저의 사촌동생 이름은 OOO 이고 성인 입니다.

//        int cousinAge = 13;
//        String cousinName = "홍길동";
//
//        String str = "저의 사촌동생 이름은 ";
//        String teenagerInfo = " 이고 미성년자 입니다.";
//        String audltInfo = " 이고 성인 입니다.";
//        String Info = "";
//
//        if(cousinAge <= 19) {
//            Info = teenagerInfo;
//        } else {
//            Info = audltInfo;
//        }
//
//        System.out.println(str + cousinName + Info);


        //- **실습 13: 미션 C - 자유미션 (아무거나)**
        //    - 출력 문구 바꿔보기
        //    - 변수 이름 바꾸기
        //    - 일단 많이 써보기
        //    - if 문 계속 나와도 됨
        //    - 변수 많아도 됨

        int myAge = 24;
        String myName = "조아현";

        String str = "저의 이름은 ";
        String teenagerInfo = " 이고 미성년자 입니다.";
        String audltInfo = " 이고 성인 입니다.";

        int heightInfo = 161;
        int  weightInfo = 48;

        String mbti = "ISFP";
        String nickname = "예의바른 나무늘보";

        String ageInfo = "";

        if(myAge <= 19) {
            ageInfo = teenagerInfo;
        } else {
            ageInfo = audltInfo;
        }

        String heighInfo = "";

        if(heightInfo < 150) {
            heighInfo = "작다.";
        } else if (heightInfo <= 165) {
            heighInfo = "평균이다.";
        } else {
            heighInfo = "크다";
        }

        System.out.println(str + myName + ageInfo);
        System.out.println("나의 키는 " + heighInfo);
        System.out.println("나의 몸무게는 " + weightInfo + " 이다.");
        System.out.println("나는 " + mbti + " 이다.");
        System.out.println("나의 닉네임은 " + nickname + " 이다.");




    }
}
