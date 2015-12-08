package com.coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.lang.Exception;
import java.math.BigInteger;

public class Main
{    
    public static void main(String [] args){  
    	palindrome("89");
        /*try{
            Main instance = new Main(); // create an instance to access non-static
                                        // variables

            // Use java.util.Scanner to scan the get the input and initialise the
            // variable
            Scanner sc=null;

            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

            String input = "";

            int numberOfTests = 0;

            String k; // declare any other variables here

            if((input = r.readLine()) != null){
                sc = new Scanner(input);
                numberOfTests = sc.nextInt();
            }

            for (int i = 0; i < numberOfTests; i++){
                if((input = r.readLine()) != null){
                    sc = new Scanner(input);
                    k=sc.next(); // initialise the remainder of the variables sc.next()
                    instance.palindrome(k);
                } //if
            }// for
        }// try

        catch (Exception e)
        {
            e.printStackTrace();
        }*/
    }// main

    public static void palindrome(String number){

        StringBuffer theNumber = new StringBuffer(number);
        int length = theNumber.length();
        int left, right, leftPos, rightPos;
        // if incresing a value to more than 9 the value to left (offset) need incrementing
        int offset, offsetPos;
        boolean offsetUpdated;
        // To update the string with new values
        String insert;
        boolean hasAltered = false;

        for(int i = 0; i < length/2; i++){
            leftPos = i; 
            rightPos = (length-1) - i;
            offsetPos = rightPos -1; offsetUpdated = false;

            // set values at opposite indices and offset
            left = Integer.parseInt(String.valueOf(theNumber.charAt(leftPos)));
            right = Integer.parseInt(String.valueOf(theNumber.charAt(rightPos)));
            offset = Integer.parseInt(String.valueOf(theNumber.charAt(offsetPos)));

            if(left != right){
                // if r > l then offest needs updating
                if(right > left){
                    // update and replace
                    right = left;
                    insert = Integer.toString(right);

                    theNumber.replace(rightPos, rightPos + 1, insert);

                    offset++; if (offset == 10) offset = 0;
                    insert = Integer.toString(offset);

                    theNumber.replace(offsetPos, offsetPos + 1, insert);
                    offsetUpdated = true;

                    // then we need to update the value to left again
                    while (offset == 0 && offsetUpdated){ 
                        offsetPos--;
                        offset =
                            Integer.parseInt(String.valueOf(theNumber.charAt(offsetPos)));
                        offset++; if (offset == 10) offset = 0;
                        // replace
                        insert = Integer.toString(offset);
                        theNumber.replace(offsetPos, offsetPos + 1, insert);
                    }
                    // finally incase right and offset are the two middle values
                    left = Integer.parseInt(String.valueOf(theNumber.charAt(leftPos)));
                    if (right != left){
                        right = left;
                        insert = Integer.toString(right);
                        theNumber.replace(rightPos, rightPos + 1, insert);
                    }
                }// if r > l
                else
                    // update and replace
                    right = left;
                    insert = Integer.toString(right);
                    theNumber.replace(rightPos, rightPos + 1, insert);           
            }// if l != r
        }// for i
        System.out.println(theNumber.toString());
    }// palindrome
}