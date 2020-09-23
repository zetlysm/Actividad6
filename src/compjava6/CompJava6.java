/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compjava6;

import java.util.Scanner;

/**
 *
 * @author hgarz
 */
public class CompJava6 {

    public static double avg(double[] marks)
    {
        double sum = 0;
        for(int i=0; i<marks.length; i++)
        {
            sum = sum + marks[i];
        }
        double result = sum / marks.length;
        //System.out.println(result);
        return result;
    }
    
    public static String grade(double avgMethod)
    {
        String ltrGrade;
        int value= (int)avgMethod;
        switch(value/10)
        {
            case 9: ltrGrade = "A";
                break;
            case 8: ltrGrade = "B";
                break;
            case 7: ltrGrade = "C";
                break;
            case 6: ltrGrade = "D";
                break;
            default:
                    ltrGrade = "F";
        }
        //System.out.println(ltrGrade);
        return ltrGrade;
    }
    
    public static void print(String name, double[] marks, double avgMethod, String grade)
    {
        System.out.println("Name: "+name);
        for(int i = 0; i < marks.length; i++)
        {
            //marks[i] = Math.round(marks[i] * 100.0) / 100.0;
            System.out.format("Grade "+i+": "+"%.0f",marks[i]);
            System.out.println("");
        }
        System.out.println("Average: "+avgMethod);
        System.out.println("Grade: "+grade);
    }
            
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double marks[] = {75,90,55,100,85};
        //double marks[] = new double[5];
        String name = "John Smith";

        double avgMethod = avg(marks);
        grade(avgMethod);
        print(name,marks,avgMethod,grade(avgMethod));

    }
    
}
