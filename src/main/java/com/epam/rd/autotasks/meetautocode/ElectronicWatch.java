package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int hours = seconds/3600;
        int minutes = (seconds - hours*3600)/60;
        seconds = seconds - (hours*3600 + minutes*60);
        if (hours >= 24) hours = 0;
        if (minutes / 10 == 0 && seconds / 10 != 0) {
            System.out.println(hours + ":0" + minutes + ":" + seconds);
        } else if (seconds / 10 == 0 && minutes / 10 != 0) {
            System.out.println(hours + ":" + minutes + ":0" + seconds);
        } else if (minutes / 10 == 0 && seconds / 10 == 0) {
            System.out.println(hours + ":0" + minutes + ":0" + seconds);
        } else {
            System.out.println(hours + ":" + minutes + ":" + seconds);
        }
    }
}