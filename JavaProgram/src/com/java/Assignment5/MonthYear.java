package com.java.Assignment5;

import java.util.Scanner;

public class MonthYear {

	public static void main(String[] args) {
		
        System.out.println("Enter a no to print month");
        Scanner sc=new Scanner(System.in);
        
        int num =sc.nextInt();
        
        String month= "";
        
        switch(num) {
        case 1:
        	  month ="Jan";
              break;
        case 2:
              month ="feb";
              break;
        case 3:
               month ="mar";
               break;
        case 4:
                month ="apr";
                break;
        case 5:
              month ="may";
                break;
         case 6:
                 month ="June";
                break;
         case 7:
              month ="July";
                break;
         case 8:
             month ="Aug";
                break;
         case 9:
               month ="Sep";
               break;
         case 10:
               month ="Oct";
               break;
          case 11:
                 month ="Nov";
                break;
          case 12:
               month ="Dec";
                break;
        default:                                                 
        	System.out.println("Enter a valid no");
        }
        System.out.println(month);
              
        }
	}

