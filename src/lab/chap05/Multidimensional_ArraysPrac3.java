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
        return calendar;
    }

// 해당 년도, 월의 일수를 반환하는 메서드
    private static int getDaysInMonth(int year, int month){
        if (month == 4 || month == 6 || month == 9 || month == 11 ){
            return 30;
        } else if (month == 2) {
            if (isLeapYear(year)){
                return 29;
            } else return  28;
    } else {
        return 31;
    }
}

// 윤년 여부 판단
private static boolean isLeapYear ( int year)  {
        return (year % 4 == 0 && year % 100 !=0 ) || (year % 400 == 0);
}

// 달력 출력 메서드
    private  static void printCalendar(int [][][] calendar, int year)   {
        System.out.println( "<< " + year + "년 달력 >>");

        for (int month = 0 ; month < 12 ; month++ ){
            System.out.println("\n<< " + (month + 1 ) + "월 >>");
            System.out.println("일 월 화 수 목 금 토" );

            int[][] monthCalendar = calendar[year -1900 ][month];
            int firstDayOfWeek = calculateFirstDayOfWeek(year, month +1);

            // 첫 번째 날짜 이전의 빈 칸 출력
            for (int i = 0 ; i < firstDayOfWeek; i++){
                System.out.println("    ");
            }
            
            // 날짜 출력
        }


    }



}