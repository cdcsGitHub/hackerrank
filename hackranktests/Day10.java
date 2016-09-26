/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackranktests;

import java.util.Scanner;

/**
 *
 * @author claydcomer
 */
public class Day10 
{
    public void run()
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = "";
        String bin = Integer.toBinaryString(n);
        int counter = find(bin);
        System.out.println(counter);
    }
    
    private int find(String s) 
    {
        String[] list = s.split("0");
        int r = 0;
        for(String element : list)
        {
            if(r < element.length())
            {
                r = element.length();
            }
        }
        
        return r;
    }
}
