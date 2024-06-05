package com.sbmavenwep.demo2;

/*import com.sbmavenwep.demo2.mathexam.MathExam;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class exam001Test {
    @Test
    public void subtract001() throws Exception {
        // Given 테스트하기 위한 준비 동작
        MathExam math = new MathExam();
//        int num1 = -50001;
//        int num2 = 3;
//        int expected = -50004;

        // When 테스트를 실시
//        int actual = subTest001(num1, num2);

        // Then 실제값과 기대값을 비교해서 테스트한다.
        assertThat(-1).isEqualTo(math.subTest001(2, 3));
        assertThat(98).isEqualTo(math.subTest001(100, 2));
        assertThat(3).isEqualTo(math.subTest001(10, 7));
        assertThat(29).isLessThan(math.subTest001(100, 70)); //30보다 작은 값인지 확인
        assertThat(301).isGreaterThan(math.subTest001(1000, 700)); //30보다 큰 값인지 확인
        //assertThat(actual).isEqualTo(expected).describedAs("실제값과 다름");

        // 예외가 발생해야지만 정상 동작으로 인식한다.
        assertThatThrownBy(() -> math.subTest001(70000, 7))
                .isInstanceOf(Exception.class);
        // RuntimeException 예외가 발생해야지만 정상 동작으로 인식한다.
        Throwable exception = assertThrows(RuntimeException.class, () -> {
            math.subTest001(2330, 50002);
        });
        System.out.println(exception.toString());
    }

    @Test
    public void multiply001() throws Exception {
        // Given 테스트하기 위한 준비 동작
        MathExam math = new MathExam();
        // When
        // Then
        assertThat(12).isEqualTo(math.mathTest002(3, 4));
        assertThat(513).isEqualTo(math.mathTest002(27, 19));
        assertThatThrownBy(() -> math.mathTest002(-1, 10))
                .isInstanceOf(Exception.class);
        assertThatThrownBy(() -> math.mathTest002(10, 101))
                .isInstanceOf(Exception.class);
    }

    @Test
    public void comp001() throws Exception {
        // Given 테스트하기 위한 준비 동작
        MathExam math = new MathExam();
        // When
        // Then
        assertThat(math.mathTest004(2, 3)).isEqualTo(-1);
        assertThat(math.mathTest004(11, 11)).isEqualTo(1);
        assertThat(math.mathTest004(7, 99)).isEqualTo(-1);
        assertThatThrownBy(() -> math.mathTest004(-1, 10))
                .isInstanceOf(Exception.class);
        assertThatThrownBy(() -> math.mathTest004(10, 10001))
                .isInstanceOf(Exception.class);
    }

    @Test
    public void exam120817() throws Exception {
        MathExam math = new MathExam();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(5.5).isEqualTo(math.exam120817(numbers));
        assertThat(94.0).isEqualTo(math.exam120817(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
        assertThatThrownBy(() -> math.exam120817(new int[]{0, 1000, 2000}))
                .isInstanceOf(Exception.class);
        Throwable exception = assertThrows(Exception.class, () -> {
            math.exam120817(new int[]{0, 1000, 2000});
        });
        System.out.println(exception.toString());
        assertThatThrownBy(() -> math.exam120817(new int[]{0, 1000, 2000}))
                .isInstanceOf(Exception.class);
        exception = assertThrows(Exception.class, () -> math.exam120817(new int[]{}));
        System.out.println(exception.toString());
    }

    @Test
    public void exam120820() throws Exception {
        System.out.println("exam120820");
        MathExam math = new MathExam();

        // Test valid ages
        assertThat(math.exam120820(40)).isEqualTo(1983);
        assertThat(math.exam120820(23)).isEqualTo(2000);

        // Test invalid ages
        Throwable ex = assertThrows(Exception.class, () -> math.exam120820(0));
        System.out.println(ex.toString());

        Throwable ex1 = assertThrows(Exception.class, () -> math.exam120820(121));
        System.out.println(ex1.toString());
    }

    @Test
    public void exam120829() throws Exception {
        MathExam math = new MathExam();

        assertThat(math.exam120829(70)).isEqualTo(1);
        assertThat(math.exam120829(91)).isEqualTo(3);
        assertThat(math.exam120829(180)).isEqualTo(4);

        Exception ex1 = assertThrows(Exception.class, () -> math.exam120829(0));
        assertThat(ex1.getMessage()).isEqualTo("각도는 1부터 179 사이어야 합니다.");
    }

    @Test
    public void exam120833() throws Exception {
        MathExam math = new MathExam();

        assertThat(math.exam120833(10)).isEqualTo(30);
        assertThat(math.exam120833(4)).isEqualTo(6);

        Exception ex1 = assertThrows(Exception.class, () -> math.exam120833(0));
        assertThat(ex1.getMessage()).isEqualTo("[0] 값은 0~1000 사이여야 합니다.");
        Exception ex2 = assertThrows(Exception.class, () -> math.exam120833(1001));
        assertThat(ex2.getMessage()).isEqualTo("[1001] 값은 0~1000 사이여야 합니다.");
    }

    @Test
    public void exam120885() throws Exception {
        System.out.println("exam120885");
        MathExam math = new MathExam();
        Throwable ex1 = assertThrows(Exception.class, () -> math.exam120885(new int[]{}, 150));
        System.out.println(ex1.toString());
        Throwable ex2 = assertThrows(Exception.class, () -> math.exam120885(new int[]{150, 201}, 130));
        System.out.println(ex2.toString());
        Throwable ex3 = assertThrows(Exception.class, () -> math.exam120885(new int[]{150, 180}, 201));
        System.out.println(ex3.toString());

        assertThat(math.exam120885(new int[]{149, 180, 192, 170}, 167)).isEqualTo(3);
        assertThat(math.exam120885(new int[]{180, 120, 140}, 190)).isEqualTo(0);
    }

    @Test
    public void exam120818() throws Exception {
        System.out.println("exam120818");
        MathExam math = new MathExam();
        Throwable ex1 = assertThrows(Exception.class, () -> math.exam120818(9));
        System.out.println(ex1.toString());
        Throwable ex2 = assertThrows(Exception.class, () -> math.exam120818(10000001));
        System.out.println(ex2.toString());
        Throwable ex3 = assertThrows(Exception.class, () -> math.exam120818(10001));
        System.out.println(ex3.toString());
        assertThat(math.exam120818(150000)).isEqualTo(142500);
        assertThat(math.exam120818(580000)).isEqualTo(464000);
    }

    @Test
    public void exam120837() throws Exception {
        System.out.println("exam120837");
        MathExam math = new MathExam();
        Throwable ex1 = assertThrows(Exception.class, () -> math.exam120837(-1));
        System.out.println(ex1.toString());
        Throwable ex2 = assertThrows(Exception.class, () -> math.exam120837(1001));
        System.out.println(ex2.toString());

        assertThat(math.exam120837(23)).isEqualTo(5);
        assertThat(math.exam120837(24)).isEqualTo(6);
        assertThat(math.exam120837(999)).isEqualTo(201);
    }

    @Test
    public void exam120839() throws Exception {
        System.out.println("exam120839");
        MathExam math = new MathExam();
        Throwable ex1 = assertThrows(Exception.class, () -> math.exam120839(null));
        System.out.println(ex1.toString());
        Throwable ex2 = assertThrows(Exception.class, () -> math.exam120839(""));
        System.out.println(ex2.toString());
        Throwable ex3 = assertThrows(Exception.class, () -> math.exam120839("026"));
        System.out.println(ex3.toString());

        assertThat(math.exam120839("2")).isEqualTo("0");
        assertThat(math.exam120839("205")).isEqualTo("052");
    }

    @Test
    public void exam120824() throws Exception {
        System.out.println("exam120824");
        MathExam math = new MathExam();
        Throwable ex1 = assertThrows(Exception.class, () -> math.exam120824(null));
        System.out.println(ex1.toString());
        Throwable ex2 = assertThrows(Exception.class, () -> math.exam120824(new int[]{-1}));
        System.out.println(ex2.toString());
        Throwable ex3 = assertThrows(Exception.class, () -> math.exam120824(new int[]{1001}));
        System.out.println(ex3.toString());

        assertThat(math.exam120824(new int[]{1, 2, 3, 4, 5})).isEqualTo(new int[]{2, 3});
        assertThat(math.exam120824(new int[]{1, 3, 5, 7})).isEqualTo(new int[]{0, 4});
    }

    @Test
    public void exam120899() throws Exception {
        System.out.println("exam120899");
        MathExam math = new MathExam();

        Throwable ex1 = assertThrows(Exception.class, () -> math.exam120899(new int[]{1001}));
        System.out.println(ex1.toString());
        Throwable ex2 = assertThrows(Exception.class, () -> math.exam120899(new int[]{2, 3, 2}));
        System.out.println(ex2.toString());
        //assertThat(math.exam120824(new int[]{1, 8, 3})).isEqualTo(new int[]{8, 1});
        assertThat(math.exam120824(new int[]{9, 10, 11, 8})).isEqualTo(new int[]{11, 2});

    }
    @Test
    public void numberPrint() throws Exception {
        int x = 0b1011,y = 0206, z = 0x2A0F;
        char a = 'A', b = 'B', c ='C';

        System.out.println(String.format("10진수: x=%d, y=%d, z=%d", x, y, z));
        System.out.println(String.format("8진수: x=%o, y=%o, z=%o", x, y, z));
        System.out.println(String.format("16진수: x=%x, y=%x, z=%x", x, y, z));
        System.out.println(String.format("Char: x=%c, y=%c, z=%c", x, y, z));

        System.out.println(String.format("10진수: a=%d, b=%d, c=%d", (int)a, (int)b, (int)c));
        System.out.println(String.format("8진수: a=%o, b=%o, c=%o", (int)a, (int)b, (int)c));
        System.out.println(String.format("16진수: a=%x, b=%x, c=%x", (int)a, (int)b, (int)c));
        System.out.println(String.format("Char: a=%c, b=%c, c=%c", (int)a, (int)b, (int)c));
    }

    public class Main {
        public static void main(String[] args) {
            System.out.println("special characters");
            System.out.println("[\\n,\\\",\\\\] is very important.");
        }
    }*/

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimalNumber = scanner.nextInt();
        System.out.printf("%o", decimalNumber);

        scanner.close();
    }
}*/

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimalNumber = scanner.nextInt();
        System.out.printf("%x", decimalNumber);

        scanner.close();
    }
}*/

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimalNumber = scanner.nextInt();
        System.out.printf("%X", decimalNumber);

        scanner.close();
    }
}*/

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 13;
        n = scanf(scanner.nextLine());
        System.out.printf("%d", n);
        scanner.close();
    }

    public static int scanf(String input) {
        return Integer.parseInt(input, 8);
    }
}*/

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanf(scanner.nextLine());
        System.out.printf("%o", n);
        scanner.close();
    }

    public static int scanf(String input) {
        return Integer.parseInt(input, 16);
    }
}*/

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        int asciiValue = (int) ch;
        System.out.println(asciiValue);

        scanner.close();
    }
}*/

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        char ch = (char) value;
        System.out.println(ch);
        scanner.close();
    }
}*/

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] dateParts = input.split("\\.");
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);


        System.out.printf("%04d.%02d.%02d", year, month, day);
    }
}*/

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] parts = input.split("-"); // "-"로 분할

        String front = parts[0];
        String back = parts[1];

        System.out.println(front+back);
    }
}*/

import java.util.Scanner;

public class exam001Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] timeParts = input.split(":");
        int hour = Integer.parseInt(timeParts[0]);
        int minute = Integer.parseInt(timeParts[1]);

        System.out.printf(String.format("%d.%02d", hour, minute));
    }
}

//}







