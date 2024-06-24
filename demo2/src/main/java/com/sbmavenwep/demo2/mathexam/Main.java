package com.sbmavenwep.demo2.mathexam;

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int currentTime = scanner.nextInt();
//        int ourScore = scanner.nextInt();
//
//        int nextGoalTime = ((currentTime / 5) + 1) * 5;
//
//
//        int finalScore = ourScore;
//        for (int time = nextGoalTime; time <= 90; time += 5) {
//            finalScore++;
//        }
//
//        System.out.println(finalScore);
//
//        scanner.close();
//    }
//}

//public class Main {
//    public static void main(String[] args) throws Exception{
//        Scanner scanner = new Scanner(System.in);
//
//        int hour = scanner.nextInt();
//        int mins = scanner.nextInt();
//
//        if (hour < 0 || hour >= 24) {
//            throw new Exception(String.format("시간(%d)은 0~23 이여야 합니다.", hour));
//        } else if (mins < 0 || mins >= 60) {
//            throw new Exception(String.format("분(%d)은 0~59 이여야 합니다.", mins));
//        }
//    mins -= 30;
//        if(mins < 0) {
//            if (hour <= 0) {
//                hour = 23;
//            } else {
//                hour--;
//            }
//        //hour = (hour - 1 < 0) ? 23 : hour ;
//            mins += 60;
//        }
//        System.out.println(String.format("%d %d", hour, mins));
//    }
//}

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//        int press = ((n % 10) * 10 + (n / 10)) * 2;
//        press %= 100;
//
//        System.out.println(press);
//
//        if (press<= 50) {
//            System.out.println("GOOD");
//        } else {
//            System.out.println("OH MY GOD");
//        }
//    }
//}

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double a = scanner.nextDouble();
//        double b = scanner.nextDouble();
//
//        double maxResult = Math.max(Math.max(a + b, a - b), Math.max(b - a,
//                           Math.max(a * b, Math.max(a / b, Math.max(b / a,
//                           Math.max(Math.pow(a, b), Math.pow(b, a)))))));
//
//        System.out.printf("%.6f", maxResult);
//    }
//}

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int year = scanner.nextInt();
//        int month = scanner.nextInt();
//
//        int lastDay = getLastDay(year, month);
//
//        System.out.println(lastDay);
//    }
//
//    public static int getLastDay(int year, int month) {
//        int lastDay;
//
//        switch (month) {
//            case 2:
//                if (LeapYear(year)) {
//                    lastDay = 29;
//                } else {
//                    lastDay = 28;
//                }
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                lastDay = 30;
//                break;
//            default:
//                lastDay = 31;
//        }
//
//        return lastDay;
//    }
//    public static boolean LeapYear(int year) {
//        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
//    }
//}

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//
//        if (a <= b && b <= c) {
//
//            if (a == b && b == c) {
//                System.out.println("정삼각형");
//            }
//
//            else if (a == b || b == c) {
//                System.out.println("이등변삼각형");
//            }
//
//            else if (a * a + b * b == c * c) {
//                System.out.println("직각삼각형");
//            }
//
//            else {
//                System.out.println("삼각형");
//            }
//        } else {
//            System.out.println("삼각형아님");
//        }
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        scanner.useDelimiter("\r?\n");
//
//        String[] winningNumbersStr = scanner.next().split(" ");
//        int[] winningNumbers = parseNumbers(winningNumbersStr);
//
//        String[] hyeNumbersStr = scanner.next().split(" ");
//        int[] hyeNumbers = parseNumbers(hyeNumbersStr);
//
//        int bonusNumber = Integer.parseInt(winningNumbersStr[6]);
//
//        int result = checkRank(winningNumbers, bonusNumber, hyeNumbers);
//
//        System.out.println(result);
//    }
//
//    public static int[] parseNumbers(String[] numbersStr) {
//        int[] numbers = new int[6];
//        for (int i = 0; i < 6; i++) {
//            numbers[i] = Integer.parseInt(numbersStr[i]);
//        }
//        return numbers;
//    }
//
//    public static int checkRank(int[] winningNumbers, int bonusNumber, int[] hyeNumbers) {
//        int matchCount = 0;
//        for (int hyeNumber : hyeNumbers) {
//            for (int winningNumber : winningNumbers) {
//                if (hyeNumber == winningNumber) {
//                    matchCount++;
//                    break;
//                }
//            }
//        }
//
//        if (matchCount == 6) return 1;
//        if (matchCount == 5 && containsNumber(hyeNumbers, bonusNumber)) return 2;
//        if (matchCount == 5) return 3;
//        if (matchCount == 4) return 4;
//        if (matchCount == 3) return 5;
//        return 0;
//    }
//
//    public static boolean containsNumber(int[] numbers, int number) {
//        for (int num : numbers) {
//            if (num == number) return true;
//        }
//        return false;
//    }
//}
//
//import java.io.*;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, "UTF-8"));
//        Scanner scanner = new Scanner(System.in);
//
//        double length = scanner.nextDouble();
//        double real = scanner.nextDouble();
//
//        double normal = (length-100)*0.9;
//        double pig=(real-normal)*100/normal;
//
//        if (pig <= 10){
//            bw.write("정상");
//        }
//        else if (pig>10&&pig<=20){
//            bw.write("과체중");
//        }
//        else {
//            bw.write("비만");
//        }
//        bw.flush();
//    }
//}

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.io.*;
//import java.util.Scanner;
//
//class Student implements Comparable<Student> {
//    String name;
//    int score;
//
//    public Student(String name, int score) {
//        this.name = name;
//        this.score = score;
//    }
//
//    @Override
//    public int compareTo(Student other) {
//        if (this.score != other.score) {
//            return other.score - this.score;
//        } else {
//            return 0;
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, "UTF-8"));
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        scanner.nextLine();
//
//        List<Student> students = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            String[] input = scanner.nextLine().split(" ");
//            String name = input[0];
//            int score = Integer.parseInt(input[1]);
//            students.add(new Student(name, score));
//        }
//
//        Collections.sort(students);
//
//        for (int i = 0; i < m; i++) {
//            bw.write(students.get(i).name + "\n");
//        }
//        bw.flush();
//    }
//}

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
//@AllArgsConstructor
//@Getter
//@Setter
//class Student implements Comparable<Student> {
//    private String name;
//    private int score;
//
//    @Override
//    public int compareTo(Student other) {
//        if (this.score != other.score) {
//            return Integer.compare(other.score, this.score);
//        } else {
//            return 0;
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, "UTF-8"));
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        scanner.nextLine();
//
//        List<Student> students = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            String[] input = scanner.nextLine().split(" ");
//            String name = input[0];
//            int score = Integer.parseInt(input[1]);
//            students.add(new Student(name, score));
//        }
//
//        Collections.sort(students);
//
//        for (int i = 0; i < m; i++) {
//            bw.write(students.get(i).getName() + "\n");
//        }
//        bw.flush();
//    }
//}
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.text.DecimalFormat;
//
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
//
//
//        String input = br.readLine();
//        // 절대값 계산 및 출력
//        System.out.println(ABS(input));
//
//        br.close();
//    }
//
//    public static String ABS(String input) {
//        double value = Double.parseDouble(input);
//        double absValue = value < 0 ? -value : value;
//
//        // 소수점 이하 불필요한 0 제거 후 포맷
//        return formatDouble(absValue);
//    }
//
//    public static String formatDouble(double value) {
//        DecimalFormat df = new DecimalFormat("#.##########"); // 소수점 이하 최대 10자리까지 허용
//        return df.format(value);
//    }
//}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int selfNumberSum = getSelfNumberSum(a, b);


        System.out.println(selfNumberSum);
    }


    public static int getSelfNumberSum(int start, int end) {
        boolean[] isSelfNumber = new boolean[end + 1];
        int selfNumberSum = 0;


        for (int i = 1; i <= end; i++) {
            isSelfNumber[i] = true;
        }


        for (int i = 1; i <= end; i++) {
            int generator = getGenerator(i);
            if (generator <= end) {
                isSelfNumber[generator] = false; // Numbers with generators are not self-numbers
            }
        }


        for (int i = start; i <= end; i++) {
            if (isSelfNumber[i]) {
                selfNumberSum += i;
            }
        }

        return selfNumberSum;
    }


    public static int getGenerator(int n) {
        int sum = n;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

