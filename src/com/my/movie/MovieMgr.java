package com.my.movie;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MovieMgr extends Movie {

    List<Movie> movies;
    int index = 0;
    Scanner sc = new Scanner(System.in);
    
    
    MovieMgr() {
        this.movies = new ArrayList<>();
        index = 0;
    }

    
    void add(Movie m) {
    	for (int i = 0 ; i < movies.lastIndexOf(m) ; i++ )
    	System.out.println("영화의 제목을 입력하세요 : ");
    	title = sc.next();
    	System.out.println("영화 감독의 이름을 입력하세요 : ");
    	director = sc.next();
    	System.out.println("영화의 장르를 입력하세요 : ");
    	genre = sc.next();
    	
    }


    void search(String title) {
    	
        if (movies.isEmpty()) {
            System.out.println("저장된 영화 정보가 없습니다");
            
        } else {
            System.out.println("저장된 영화 정보: ");
            
            for (Movie movie : movies) {
                if (title == null || movie.getTitle().equals(title)) {
                    System.out.println(movie);
                }
            }
        }
    }

    

    void searchDirector (String director) {
        for (Movie movie : movies){
            if(movie.getDirector().equals(director)){
                System.out.println("검색 결과: " + movie);
            }
        }

    }

    List<Movie> searchGenre (String genre) {
        List<Movie> result = new ArrayList<>();
        for (Movie movie : movies) {
            if(movie.getGenre().equals(genre)) {
                result.add(movie);
            }
        }
        return result;
    }

    void delete (String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equals(title)) {
                movies.remove(movie);
                System.out.println(title + " 영화가 삭제되었습니다. ");
            }
        }
        System.out.println("입력하신 영화가 없습니다");
    }

}