import java.util.Scanner;

public class Quiz {

    // 84p의 open challenge 문제
    public static void Quiz01() {
        System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요>>");
        System.out.println("철수>>");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("영희>>");
        Scanner sc2 = new Scanner(System.in);
        String chul = sc1.next();
        String young = sc2.next();

        if (chul.equals("가위") && young.equals("보")) {
            System.out.println("철수가 이겼습니다.");
        } else if (chul.equals("바위") && young.equals("가위")) {
            System.out.println("철수가 이겼습니다.");
        } else if (chul.equals("보") && young.equals("바위")) {
            System.out.println("철수가 이겼습니다.");
        } else if (young.equals("가위") && chul.equals("보")) {
            System.out.println("영희가 이겼습니다.");
        } else if (young.equals("바위") && chul.equals("가위")) {
            System.out.println("영희가 이겼습니다.");
        } else if (young.equals("보") && chul.equals("바위")) {
            System.out.println("영희가 이겼습니다.");
        }
    }


    // 실습문제 2번
    public static void Quiz02() {

        System.out.print("몇 층인지 입력하세요>>");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        System.out.println(height * 5 + "m 입니다.");
    }

    // 실습문제 3번
    public static void Quiz03() {
        System.out.print("x 값을 입력하세요>>");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("x=" + x + ",y=" + (x * x + (x * -3) + 7));

    }

    // 실습문제 4번
    public static void Quiz04() {

        System.out.print("점(x,y)의 좌표를 입력하세요>>");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int x = sc1.nextInt();
        int y = sc2.nextInt();
        if ((x >= 50 && x <= 100) && (y >= 50 && y <= 100)) {
            System.out.println("점(" + x + "," + y + ")" + "은 (50, 50)과 (100,100)의 사각형 내에 있습니다.");
        } else {
            System.out.println("점(" + x + "," + y + ")" + "은 (50, 50)과 (100,100)의 사각형 내에 없습니다.");
        }
    }

    // 실습문제 5번
    public static void Quiz05() {

//        System.out.print("논리 연산을 입력하세요>>");
//        Scanner sc1 = new Scanner(System.in);
//        Scanner sc2 = new Scanner(System.in);
//        Scanner sc3 = new Scanner(System.in);
//        boolean logic1 = sc1.nextBoolean();
//        String logic2 = sc2.next();
//        boolean logic3 = sc3.nextBoolean();
//
//        switch(logic2){
//            case "OR":
//                switch (logic1){
//                    case true:
//                }
//        };
    }

    // 실습문제 6번
    public static void Quiz06() {
        System.out.print("돈의 액수를 입력하세요>>");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int sinsa = 0;
        int sejong = 0;
        int ee = 0;
        int hak = 0;
        int soonsin = 0;
        int sib = 0;
        int won = 0;

        if (money >= 50000) {
            sinsa = money / 50000;
            money -= 50000 * sinsa;
        }
        if (money >= 10000) {
            sejong = money / 10000;
            money -= 10000 * sejong;
        }
        if (money >= 1000) {
            ee = money / 1000;
            money -= 1000 * ee;
        }
        if (money >= 500) {
            hak = money / 500;
            money -= 500 * hak;
        }
        if (money >= 100) {
            soonsin = money / 100;
            money -= 100 * soonsin;
        }
        if (money >= 10) {
            sib = money / 10;
            money -= 10 * sib;
        }
        if (money >= 1) {
            won = money / 1;
        }
        System.out.println("오만원" + sinsa + "개, 만원" + sejong + "개, 천원" + ee + "개, 500원" + hak + "개, 100원" + soonsin + "개, 10원" + sib + "개, 1원" + won + "개");

    }

    // 실습문제 7번
    public static void Quiz07() {
        System.out.print("학점을 입력하세요");
        Scanner sc = new Scanner(System.in);
        String grade = sc.next();

        switch (grade) {
//            case "A":
//            case "B":
//                System.out.println("Excellent");
//                break;
//            case "C":
//            case "D":
//                System.out.println("Good");
//                break;
//            case "F":
//                System.out.println("Bye");
//                break;

            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Excellent");
                break;
            case "C":
                System.out.println("Good");
                break;
            case "D":
                System.out.println("Good");
                break;
            case "F":
                System.out.println("Bye");
                break;
        }
    }

    // 실습문제 8번
    public static void Quiz08() {
        System.out.print("커피 주문하세요>>");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String coffee = sc1.next();
        int price = 0;
        int cup = sc2.nextInt();

        switch (coffee) {
            case "에스프레소":
                price = 2000;
                break;

            case "아메리카노":
                price = 2500;
                break;

            case "카푸치노":
                price = 3000;
                break;

            case "카페라떼":
                price = 3500;
                break;
        }
        if (cup > 0) {
            System.out.println(price * cup + "원입니다.");
        }

    }

    // 실습문제 9번
    public static void Quiz09() {
        System.out.print("1~99 사이의 정수를 입력하세요>>");
        Scanner sc = new Scanner(System.in);
        int game = sc.nextInt();
        int first = game / 10;
        int second = game % 10;

        // 10자리가 경우를 걸러주기
        if (first == 0) {
            first = 1;
        }
        // 1자리가 0일 경우를 걸러주기
        if (second == 0) {
            second = 1;
        }

        if (first % 3 == 0 && second % 3 == 0) {
            System.out.println("박수짝짝");
        } else if (first % 3 == 0 || second % 3 == 0) {
            System.out.println("박수짝");
        } else {
            System.out.println("박수없음");
        }
    }

    // 실습문제 10번
    public static void Quiz10() {

        System.out.print("커피 주문하세요>>");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String coffee = sc1.next();
        int price = 0;
        int cup = sc1.nextInt();

        switch (coffee) {
            case "에스프레소":
                price = 2000;
                break;

            case "아메리카노":
                price = 2500;
                break;

            case "카푸치노":
                price = 3000;
                break;

            case "카페라떼":
                price = 3500;
                break;
        }
        if (coffee.equals("에스프레소") && cup >= 10) {
            price *= 0.95;
        }
        if (cup > 0) {
            System.out.println(price * cup + "원입니다.");
        }

    }


    public static void main(String[] args) {
//        Quiz01();
//        Quiz02();
//        Quiz03();
//        Quiz04();
//        Quiz06();
//        Quiz07();
//        Quiz08();
        Quiz09();
//        Quiz10();
    }
}
