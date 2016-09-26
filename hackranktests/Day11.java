/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackranktests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author claydcomer
 */
public class Day11 
{
    public void run()
    {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++)
        {
            for(int j=0; j < 6; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }
//        System.out.println(arr[0][2]);
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                temp.add(arr[i][j] + arr[i+2][j] + 
                        arr[i][j+1] + arr[i+1][j+1] + arr[i+2][j+1] + 
                        arr[i][j+2] + arr[i+2][j+2]);
            }
        }
        
        int max = Collections.max(temp);
        System.out.println(max);
    }
}
