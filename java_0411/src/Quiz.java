import java.util.Scanner;

public class Quiz {

    //    1, 2, 5, 6
    public static void Quiz01() {
        Song mySong = new Song("Nessun Dorma");
        Song yourSong = new Song("공주는 잠 못 이루고");
        System.out.println("내 노래는 " + mySong.getTitle());
        System.out.println("너 노래는 " + yourSong.getTitle());
    }

    public static void Quiz02() {
        System.out.print("이름과 전화번호 입력 >>");
        Scanner sc11 = new Scanner(System.in);
        Scanner sc12 = new Scanner(System.in);
        String firName = sc11.next();
        String firTel = sc12.next();
        System.out.print("이름과 전화번호 입력 >>");
        Scanner sc21 = new Scanner(System.in);
        Scanner sc22 = new Scanner(System.in);
        String secName = sc21.next();
        String secTel = sc22.next();

        Phone fir = new Phone(firName, firTel);
        Phone sec = new Phone(secName, secTel);

        System.out.println(fir.getName() + "의 번호" + fir.getTel());
        System.out.println(sec.getName() + "의 번호" + sec.getTel());

    }

    public static void main(String[] args) {
//        Quiz01();
//        Quiz02();
    }

}
