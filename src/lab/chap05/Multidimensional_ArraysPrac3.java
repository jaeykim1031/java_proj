package lab.chap05;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional_ArraysPrac3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("년도를 입력하시오 : " );
        int year = scanner.nextInt();

        // 삼차원 배열을 통해 연도별, 월별, 일별 정보를 저장
        int [][][] calendar = createCalendar(year);
        // 달력 출력
        printCalendar( calendar, year );

        scanner.close();
    }
    // 삼차원 배열 생성하고 초기화 하는 메서드
    private static int [][][] createCalendar(int year){
        int [][]][] calendar = new int [year - 1900][12][];

        for ( int y = 1900 ; y < year; y++) {
            for (int m = 0; m < 12 ; m++) {
                // 각 월의 일수를 계산하여 해당 월의 배열 크기를 정의
                int daysInMonth = getDaysInMonth ( y, m + 1);
                calendar [ y -1900][m] = new int[daysInMonth];
            }
        }

    }











}