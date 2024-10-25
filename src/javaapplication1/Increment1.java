/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author User
 */
public class Increment1 
{
    public static void main(String[] args) 
    {
        int scoreA=0 , scoreB=0;
        //..
        scoreA=scoreA+1;
        System.out.println("A="+scoreA+ "B="+scoreB);
        
        scoreA=scoreA+1;
        System.out.println("A="+scoreA+ "B="+scoreB);
        
        ++scoreA;   //pre increment
        System.out.println("A="+scoreA+ "B="+scoreB);
        
        scoreB++;   //post increment
        System.out.println("A="+scoreA+ "B="+scoreB);
        
        int bonusA = 5;
        int totalScoreA = scoreA++ + bonusA; //++ increase 1, then bonus increase 5, so total = 9
        // if scoreA++ then this will only add on bonus
        System.out.println("Total Score A = "+totalScoreA);
    }
}
