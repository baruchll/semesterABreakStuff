package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {


//        System.out.println(pow());
//        divBy2And3();
//        System.out.println(salaryStuff());
//        System.out.println(sumNum());
//        System.out.println(sameNumbers());
//        join([0.7, 0.7], [0.3, 0.4]);
//        sortingStuff();
    }

    public static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }

    //1
    public static void divBy2And3() {

        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                continue;
            }
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.println(i);
            }
        }
    }


    //2
    public static int pow() {
        Scanner s = new Scanner(System.in);
        int a, b;
        System.out.println("enter the first number");
        a = s.nextInt();
        System.out.println("enter the second number");
        b = s.nextInt();
        s.close();
        System.out.println("ur number is:");
        return (int) Math.pow(a, b);

    }


    //3
    public static String stringStuff() {
        int cnt = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("type in stuff");
        String a = s.nextLine();
        s.close();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                cnt++;
            }
        }
        return ("you have " + cnt + " words");
    }


    //4
    public static int salaryStuff() {

        int afterTax = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("type in ur salary");
        int salary = s.nextInt();
        if (salary <= 6290) {
            afterTax = salary - (salary / 10);
        }
        if (salary >= 6291 && salary <= 9030) {
            afterTax = salary - (salary / 100) * 14;
        }
        if (salary >= 9031 && salary <= 14490) {
            afterTax = salary - (salary / 100) * 20;
        }
        if (salary >= 14491 && salary <= 20140) {
            afterTax = salary - (salary / 100) * 31;
        }
        if (salary >= 20141 && salary <= 41910) {
            afterTax = salary - (salary / 100) * 35;
        }
        if (salary >= 41911 && salary <= 53970) {
            afterTax = salary - (salary / 100) * 47;
        }
        if (salary >= 53971) {
            afterTax = salary - (salary / 100) * 50;
        }

        System.out.println("ur salary after tax is:");
        return afterTax;
    }


    //5
    public static int sumNum() {
        int arr[] = new int[0], sum = 0;
        for (int a = 0; a < arr.length; a++) {
            sum += a;
        }
        return sum;
    }


    //6
    public static int sameNumbers() {

        int arr[] = new int[0], cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }


    //7
    public static void join(Point a[], Point b[]) {
        int one;
        one = a.length + b.length;
        Point c[] = new Point[one];
        for (int i = 0; i < one; i++) {
            if (i < a.length){
                c[i] = a[i];
            }
            else c[i] = b[i];
        }
    }


    //8
    public static void sharpestSlope(Point[] x){
        Point a = x[0];
        Point b = x[0];
        double sharpest = x[0].slope(x[1]);
        for (Point t:x) {
            for (int i = 0; i < x.length; i++){
                if (t.slope(x[i])>= sharpest){
                    a = t;
                    b = x[i];
                }
            }
        }
        System.out.println("x1 is "+ a.x + " y1 is "+ a.y+" x2 is "+b.x+" y2 is "+b.y);
    }

    //9
    public static ArrayList<Date> sortingStuff(Date calender[]){
        ArrayList<Date> dates = new ArrayList<>();
        for (int i = 0; i < calender.length; i++) {
            for (int j = 1; j < calender.length - 1; j++) {
                if (calender[j-1].theYear() > calender[j].theYear()){
                    Date temp = calender[j];
                    calender[j] = calender[j -1];
                    calender[j -1] = temp;
                }
            }
            for (int j = 0; j < calender.length; j++) {
                dates.set(j, calender[j]);
            }
        }

    return dates;
    }


    //10
    public static ArrayList<Date> datesAvg(ArrayList<Date> listsOfDates){
        for (int i = 0; i < listsOfDates.size(); i++) {
            for (int j = 0; j < listsOfDates.size() - 1; j++) {
                if (listsOfDates.get(j - 1).theYear() > listsOfDates.get(j).theYear()){
                    swap(j, j -1);
                }
            }
            for (int j = 0; j < datesAvg(listsOfDates).size(); j++) {
                for (int k = 0; k < datesAvg(listsOfDates).size() - 1; k++) {
                    if (datesAvg(listsOfDates).get(k - 1).theYear() > datesAvg(listsOfDates).get(k).theYear()){
                        swap(k, k -1);
                    }
                }
            }
        }
        return datesAvg(listsOfDates);
    }
}

