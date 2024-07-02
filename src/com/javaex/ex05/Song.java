package com.javaex.ex05;

public class Song {
	
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	
	//생성자
	public Song () {}
	public Song (String title, String artist, String album, String composer, 
			     int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	
	//메소드-일반
	
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
	
	public void showInfo() {
		System.out.println(artist + ", " + title + " ( " + album + ", " + track 
				+ "번 track, " + composer + " 작곡 )"); 	}
	
	//메소드-gs
	
	

	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getArtist() {
		return artist;
	}



	public void setArtist(String artist) {
		this.artist = artist;
	}



	public String getAlbum() {
		return album;
	}



	public void setAlbum(String album) {
		this.album = album;
	}



	public String getComposer() {
		return composer;
	}



	public void setComposer(String composer) {
		this.composer = composer;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public int getTrack() {
		return track;
	}



	public void setTrack(int track) {
		this.track = track;
	}
	/*
	public void setTitle (String title) {
			this.title = title; }
	public String getTitle() {
		return this.title;	}
	
	public void setArtist(String artist) {
		this.artist = artist; }
	public String getArtist() {
		return this.artist;	}
	
	public void setAlbum(String album) {
		this.album = album; }
	public String getAlbum() {
		return this.album;	}
	
	public void setComposer(String composer) {
		this.composer = composer; }
	public String getComposer() {
		return this.composer;	}
	
	public void setYear(int year) {
		this.year = year; }
	public int getYear() {
		return this.year;	}
	
	public void setTrack(int track) {
		this.track = track; }
	public int getTrack() {
		return this.track;	}
	
	*/
	
	
	
	
	

}
