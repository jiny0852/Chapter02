package com.javaex.ex05;

import java.util.Scanner;

public class SongApp {

	public static void main(String[] args) {
		
		 Song s1 = new Song();
		 Song s2 = new Song();
		 Song s3 = new Song();
		 
		 s1.setTitle("좋은날");
		 s1.setArtist("아이유");
		 s1.setAlbum("Real");
		 s1.setComposer("이민수");
		 s1.setYear(2010);
		 s1.setTrack(3);
		 
		 System.out.println(s1.toString());
		 
		 s2.setTitle("거짓말");
		 s2.setArtist("BIGBANG");
		 s2.setAlbum("Always");
		 s2.setComposer("G-DRAGON ");
		 s2.setYear(2007);
		 s2.setTrack(2);
		 
		 s3.setTitle("벚꽃엔딩");
		 s3.setArtist("버스커버스커");
		 s3.setAlbum("버스커버스커1집");
		 s3.setComposer("장범준");
		 s3.setYear(2012);
		 s3.setTrack(4);
		 
		 
		 
		 s1.showInfo();
		 s2.showInfo();
		 s3.showInfo();
		 
		 /////////////
		 Scanner sc = new Scanner(System.in);
		 Song s = new Song();
		 String[] arr = new String[4];
		 
		 String[] ccc = {"가수", "제목", "앨범", "작곡가"};
		 
		 //String[] jjj = new String[4];
		 
		 
		 for (int i = 0 ; i < arr.length ; i++) {
			 
			 System.out.print(ccc[i] + " 입력 : ");
			 arr[i] = sc.nextLine();
			 
			 /*
			 뭐하니 제정신이니
			 for ( int k = 0; k<=i && k==i ; k++) {
				 System.out.print(ccc[i] + " 입력 : ");
				 arr[i] = sc.nextLine();
			 }
			 
			 for (int j = 0; j <= i ; j++) {
				 jjj[i] = arr[j];
				 		 
			 }	*/		 
		 }
		 
		 s.setArtist(arr[0]);
		 s.setTitle(arr[1]);
		 s.setAlbum(arr[2]);
		 s.setComposer(arr[3]);
		 //s.setTrack(arr[4]);
		 
		 s.showInfo();
		 		
		 sc.close();
		

	}

}
