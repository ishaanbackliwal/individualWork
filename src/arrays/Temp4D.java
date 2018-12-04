package arrays;

import java.util.Random;
import java.util.Scanner;

public class Temp4D {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int maxY = 10;
		int maxM = 12;
		int maxW = 4;
		int maxD = 7;
		int min = -20;
		int max = 110;
		int highD = 0;
		int highAvgM = max;
		int highDY = 0;
		int highDM = 0;
		int highDW = 0;
		int highDD = 0;
		int sum = 0;
		int avg = 0;
		int temps[][][][] = new int[maxY][maxM][maxW][maxD];
		for (int years = 0; years < temps.length; years++) {
			for (int months = 0; months < temps[0].length; months++) {
				for (int weeks = 0; weeks < temps[0][0].length; weeks++) {
					for (int days = 0; days < temps[0][0][0].length; days++) {
						temps[years][months][weeks][days] = min + generator.nextInt(max - min + 1);
					}
				}
			}
		}
		for (int years = 0; years < temps.length; years++) {
			for (int months = 0; months < temps[0].length; months++) {
				for (int weeks = 0; weeks < temps[0][0].length; weeks++) {
					for (int days = 0; days < temps[0][0][0].length; days++) {
						if (temps[years][months][weeks][days] > highD) {
							highD = temps[years][months][weeks][days];
							highDY = years;
							highDM = months;
							highDW = weeks;
							highDD = days;
						}
					}
				}
			}
		}
		for (int years = 0; years < temps.length; years++) {
			for (int months = 0; months < temps[0].length; months++) {
				for (int weeks = 0; weeks < temps[0][0].length; weeks++) {
					for (int days = 0; days < temps[0][0][0].length; days++) {
						sum += temps[years][months][weeks][days];
					}
				}
				avg = sum / (temps[0][0].length * temps[0][0][0].length);
				if (avg > highAvgM) {
					highAvgM = avg;
				}
			}
		}
		System.out.println("Which year would you like data on?");
		int dataY = input.nextInt();
		for (int months = 0; months < temps[0].length; months++) {
			for (int weeks = 0; weeks < temps[0][0].length; weeks++) {
				for (int days = 0; days < temps[0][0][0].length; days++) {
					System.out.print(temps[dataY][months][weeks][days] + " ");
				}
				System.out.println();
			}
		}
		System.out.println("Highest daily temperature: " + highD);
		System.out.println("D/W/M/Y: " + highDD + "/" + highDW + "/" + highDM + "/" + highDY);
		System.out.println("Highest monthly temperature: " + highAvgM);
	}

}
