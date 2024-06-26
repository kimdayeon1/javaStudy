package com.sbmavenwep.demo2.mathexam;

public class MathExam {
    public int subTest001(int n1, int n2) throws Exception {
        if (n1 < -50000 || n1 > 50000) {
            throw new Exception("num1 값은 -50000보다 작거나, 50000보다 크다");
        }
        if (n2 < -50000 || n2 > 50000) {
            throw new RuntimeException("num2 값은 -50000보다 작거나, 50000보다 크다.");
        }
        return n1 - n2;
    }

    public int mathTest002(int n1, int n2) throws Exception {
        if (n1 < 0 || n1 > 100) {
            throw new Exception("num1 값은 0~100 사이의 값 이어야 합니다.");
        }
        if (n2 < 0 || n2 > 100) {
            throw new Exception("num2 값은 0~100 사이의 값 이어야 합니다.");
        }
        return n1 * n2;
    }

    public int mathTest004(int n1, int n2) throws Exception {
        if (n1 < 0 || n1 > 10000) {
            throw new Exception("num1 값은 0~100 사이의 값 이어야 합니다.");
        }
        if (n2 < 0 || n2 > 10000) {
            throw new Exception("num2 값은 0~100 사이의 값 이어야 합니다.");
        }
        return (n1 == n2 ? 1 : -1);
    }

    public double exam120817(int[] numbers) throws Exception {
        if (numbers == null) {
            throw new Exception("number는 null이 아니어야 합니다.");
        }
        if (numbers.length < 1 || numbers.length > 100) {
            throw new Exception("numbers 배열 크기는 1~100 개 사이 여야 합니다.");
        }
        double sum = 0.0d;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0 || numbers[i] > 1000) {
                throw new Exception(String.format("number[%d] 값은 0~1000 개 사이 여야 합니다.", i));
            }
            sum += numbers[i];
        }
        return sum / numbers.length;
    }

    public int exam120820(int age) throws Exception {
        if (age <= 0 || age > 120) {
            throw new Exception("Invalid age");
        }
        return 2023 - age;
    }

    public int exam120829(int angle) throws Exception {
        if (angle < 1 || angle > 180) {
            throw new Exception("각도는 1부터 179 사이어야 합니다.");
        }
        if (angle < 90) {
            return 1;
        } else if (angle == 90) {
            return 2;
        } else if (angle < 180) {
            return 3;
        } else {
            return 4;
        }
    }


    public int exam120833(int n) throws Exception {
        if (n <= 0 || n > 1000) {
            throw new Exception(String.format("[%d] 값은 0~1000 사이여야 합니다.", n));
        }

        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public int exam120885(int[] array, int height) throws Exception {
        if (array == null || array.length == 0 || array.length > 100) {
            throw new Exception(String.format("array는 null이거나 길이가 1~100이어야 합니다."));
        }
        if (height <= 1 || height > 200) {
            throw new Exception(String.format("height는 1~200이여야 합니다."));
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 0 || array[i] > 200) {
                throw new Exception(String.format("array[%d] = [%d]는 1~200 이어야 합니다.", i, array[i]));
            }
            if (array[i] > height) {
                //키 큰 사람을 누적해야 한다
                result++;
            }
        }
        return result;
    }

    public int exam120818(int price) throws Exception {
        if (price < 10 || price > 1000000) {
            throw new Exception(String.format("price는 10~1000000 이어야 합니다."));
        }
        if (price % 10 != 0) {
            throw new Exception(String.format("price는 10원 단위이어야 합니다."));
        }
        double result = 0;
        if (price >= 100000 && price < 300000) {
            result = price * 0.95;
        } else if (price >= 300000 && price < 500000) {
            result = price * 0.9;
        } else if (price >= 500000) {
            result = price * 0.80;
        }

        return (int) result;
    }

    public int exam120837(double hp) throws Exception {

        if (hp < 0 || hp > 1000) {
            throw new Exception("체력은 0 이상 1000 이하여야 합니다.");
        }

        int generalAntAttack = 5;
        int soldierAntAttack = 3;
        int normalAntAttack = 1;

        int generals = (int) hp / generalAntAttack;
        int remainingHP = (int) hp % generalAntAttack;

        int soldiers = remainingHP / soldierAntAttack;
        remainingHP %= soldierAntAttack;
        int normalAnts = remainingHP;
        int totalAnts = generals + soldiers + normalAnts; //

        return totalAnts;
    }

    public String exam120839(String rsp) throws Exception {
        if (rsp == null) {
            throw new Exception(String.format("rsp는 null이 아니어야 합니다."));
        }
        if (rsp.length() <= 0 || rsp.length() > 100) {
            throw new Exception(String.format("rsp[%s] 문자열의 길이는 1~100 이어야 합니다.", rsp));
        }
        String result = "";
        for (int i = 0; i < rsp.length(); i++) {
            char ch = rsp.charAt(i);
            if (ch == '2') {
                result += "0";
            } else if (ch == '0') {
                result += "5";
            } else if (ch == '5') {
                result += "2";
            } else {
                throw new Exception(String.format("rsp[%s] 문자열은 0, 2, 5만 포함해야 합니다.", ch));
            }
        }
        return result;
    }

    public int[] exam120824(int[] num_list) throws Exception {
        if (num_list == null || num_list.length == 0 || num_list.length > 100) {
            throw new Exception(String.format("리스트의 길이는 1~100이어야 합니다."));
        }
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0 || num_list[i] > 1000) {
                throw new Exception(String.format("num_list는 0~1000 이어야 합니다."));
            }
        }
        int[] result = new int[2];
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                result[0]++;
            } else {
                result[1]++;
            }
        }
        return result;
    }

    public int[] exam120899(int[] array) throws Exception {
        if (array == null || array.length == 0 || array.length > 100) {
            throw new Exception("array의 길이는 1~100이어야 합니다.");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 || array[i] > 1000) {
                throw new Exception("array는 0~1000 이어야 합니다.");
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    throw new Exception("array에는 중복이 없어야 합니다.");
                }
            }
        }

        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    result[0] = array[i];
                    result[1] = i;
                } else {
                    result[0] = array[j];
                    result[1] = j;
                    break;
                }
            }
        }

        return result;
    }

}














