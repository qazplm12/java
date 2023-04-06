import java.util.Scanner;
import java.util.Arrays;

public class Quiz {

    public static void Quiz01() {
        System.out.println("-------실습문제 2번-------");
        System.out.print("정수 10개 입력>>");
        int nums = 0;
        int[] inputArr1 = new int[10];
        for (int i = 0; i < inputArr1.length; i++) {
            Scanner sc = new Scanner(System.in);
            inputArr1[i] = sc.nextInt();
        }
        for( int i = 0; i < inputArr1.length; i++){
            if(inputArr1[i] % 3 == 0){
                System.out.print(inputArr1[i] + " ");
            }
        }

    }

    public static void Quiz02() {
        System.out.println("-------실습문제 5번-------");
        System.out.print("정수 10개 입력>>");
        int[] inputArr1 = new int[10];
        for (int i = 0; i < inputArr1.length; i++) {
            Scanner sc = new Scanner(System.in);
            inputArr1[i] = sc.nextInt();
        }
        Arrays.sort(inputArr1);
        for( int i = 0; i < inputArr1.length; i++){
                System.out.print(inputArr1[i] + " ");
        }
    }

    public static void Quiz03() {
        System.out.println("-------실습문제 6번--------");
        String eng[] = {"student", "love", "java", "happy", "future"};
        String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};
        boolean exit = true;

        while(exit){
            System.out.print("영어 단어를 입력하세요>>");
            Scanner sc = new Scanner(System.in);
            String guess = sc.next();
            for(int i = 0; i < eng.length; i++){
                if(guess.equals(eng[i])){
                    System.out.println(kor[i]);
                    break;
                }else if(guess.equals("exit")){
                    System.out.println("종료합니다...");
                    exit = false;
                    break;
                }else{
                    if(i > 3){
                        System.out.println("그런 영어단어가 없습니다.");
                    }
                }
            }
        }
    }

    public static void Quiz04() {
        System.out.println("-------실습문제 7번-------");
        int[] game = new int[100];
        int num1 = 0;
        int num2 = 0;
        for(int i = 1; i < game.length; i++){

            num1 = i / 10;
            num2 = i % 10;
            if(num1 < 1){
                num1 = 1;
            }
            if(num2 == 0){
                num2 = 1;
            }
            if (num1 % 3 == 0 && num2 % 3 == 0){
                System.out.println(i + "박수두번");
            }else if (num1 % 3 != 0 && num2 % 3 == 0){
                System.out.println(i + "박수한번");
            }else if (num1 % 3 == 0 && num2 % 3 != 0){
                System.out.println(i + "박수한번");
            }
        }

    }

    public static void Quiz05() {
        System.out.println("-------실습문제 8번-------");

    }


    public static void main(String[] args) {
//        Quiz01();
//        Quiz02();
        Quiz03();
//        Quiz04();
//        Quiz05();
    }
}
