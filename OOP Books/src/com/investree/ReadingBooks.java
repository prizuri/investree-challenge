package com.investree;

public class ReadingBooks {
   private String genre;
   private String author="";
   private String publisher="";
   private int numberOfPage;
   private int yearRelease=2022;

   public ReadingBooks(String genre, String author,int numberOfPage){
       this.genre=genre;
       this.author=author;
       this.numberOfPage=numberOfPage;
   }
   public void open(){
       System.out.println("You're now opening the "+genre+" book that's released in "+yearRelease);
   }
   public void annotate(){
       System.out.println("You're now annotating the book");
   }
   public void read(){
       System.out.println("You're now reading at "+numberOfPage+" pages");
   }
   public void close(){
       System.out.println("You've closed the book");
   }
   public void hold(){
       System.out.println("You hold a book with genre: "+genre+" ,author: "+author + " ,and have: "+numberOfPage+" pages");
   }
}
