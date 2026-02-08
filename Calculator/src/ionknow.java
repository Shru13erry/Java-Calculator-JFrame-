/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
import java.io.*;
/**
 *
 * @author YX LOH
 */
public class ionknow {
    public static void main(String[] args) {
        try{
            FileWriter write = new FileWriter("Hehe.txt");
            write.write("nigge");
            write.write("reggin");
            write.append("ds");
            write.close();
            
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        try{
            Scanner sc = new Scanner(new FileReader("Hehe.txt"));
            String s;
            while(sc.hasNextLine()){
                s = sc.nextLine();
                System.out.println(s);
            }
        }
            catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
