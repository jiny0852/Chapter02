package com.javaex.ex19;

import java.io.IOException;

public class MyFileApp {

	public static void main(String[] args) {
		
		MyFile mf = new MyFile();
		String str = mf.read("c:/school.txt");
		
		System.out.println(str);
		
		//예외발생 상황극
		String str2 = mf.read2("c:/schoolㅐㅐㅐ.txt");

		//예외발생 상황극
		try {
			mf.read3("c:/schoolㅐㅐㅐ.txt");
		} catch (IOException e) {
			System.out.println("기본 파일 강제로 만들기 로직");
		}
			
		
		
		System.out.println("정상종료");
		
	}

}
