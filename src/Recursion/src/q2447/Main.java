package Recursion.src.q2447;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

// 별찍기 -10 (매우 고민햇다)
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = sc.nextInt();
		char star[][] = new char[t][t];
		for(int i = 0; i<t; i ++) {
			for (int j = 0 ; j < t ; j++) {
				star[i][j]=' ';
			}
		}
		play(star,0 , 0 , t);
		for(int i = 0; i<t; i ++) {
			System.out.println(star[i]);
		}
		
	}
	
	public static void play (char arr[][],int x , int y, int t) throws Exception{
		
	
		int i , j ;
		if(t == 1) {
			arr[x][y]= '*';
			return ;
		}
		int div = t/3;
			
		for (i =0; i<3 ; i++) {
			for(j= 0; j<3;j++) {
				if(i != 1 || j != 1) {
					play(arr,x+(div*i),y+(div*j), div);
				}
				
				
			}
		}
	}
	
}