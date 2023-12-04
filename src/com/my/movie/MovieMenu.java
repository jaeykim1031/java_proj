package com.my.movie;

import java.util.Scanner;

public class MovieMenu extends MovieMgr{
	
        MovieMgr movieMgr;
        Scanner sc;
        Movie a = new Movie();
        
        void movieMenu() {
                while (true) {
                System.out.println("===== 영화 관리 프로그램 =====");
                System.out.println("1. 영화 추가");
                System.out.println("2. 모든 영화 출력");
                System.out.println("3. 제목으로 영화 검색");
                System.out.println("4. 감독으로 영화 검색");
                System.out.println("5. 장르로 영화 검색");
                System.out.println("6. 영화 삭제");
                System.out.println("0. 프로그램 종료");
                System.out.println("===== 영화 관리 프로그램 =====");

                System.out.print("메뉴를 선택하세요: \n");

                int i = sc.nextInt();

                switch (i) {
                        case 1:
                                add();
                                break;
						case 2:
								search(title);
								break;
						case 3:
								search(title);
								break;
						case 4:
                                searchDirector();
                                break;
                        case 5:
                                searchGenre();
                                break;
                        case 6:
                                delete();
                                break;
                        case 0:
                                System.out.println("프로그램을 종료합니다.");
                                sc.close();
                                return;
                        default:
                                System.out.println("잘못된 메뉴 선택입니다. 다시 선택하세요.");
                        }
                }


        }

        private void delete() {
        }

        private void searchGenre() {
        }

        private void add() {
        }

        private void searchDirector() {

        }

        MovieMenu() {
                this.movieMgr = new MovieMgr();
                this.sc = new Scanner(System.in);
        }
}




