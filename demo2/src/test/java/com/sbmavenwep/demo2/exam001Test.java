package com.sbmavenwep.demo2;

import com.sbmavenwep.demo2.mathexam.MathExam;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class exam001Test {
    @Test
    public void subtract001() throws Exception{
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
    public void  comp001() throws Exception {
        // Given 테스트하기 위한 준비 동작
        MathExam math = new MathExam();
        // When
        // Then
        assertThat(math.mathTest004(2, 3)).isEqualTo(-1);
        assertThat(math.mathTest004(11, 11)).isEqualTo(1);
        assertThat(math.mathTest004(7, 99)).isEqualTo(1);
        assertThatThrownBy(() -> math.mathTest004(-1, 10))
                .isInstanceOf(Exception.class);
        assertThatThrownBy(() -> math.mathTest004(10, 10001))
                .isInstanceOf(Exception.class);
    }
    @Test
    public void exam120817() throws Exception {
        MathExam math=new MathExam();
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(5.5).isEqualTo(math.exam120817(numbers));
        assertThat(94.0).isEqualTo(math.exam120817(new int[]{89,90,91,92,93,94,95,96,97,98,99}));
        assertThatThrownBy(() -> math.exam120817(new int[]{0, 1000, 2000}))
                .isInstanceOf(Exception.class);
        Throwable exception = assertThrows(Exception.class, ()->{
            math.exam120817(new int[]{0, 1000, 2000});
        });
        System.out.println(exception.toString());
        assertThatThrownBy(() -> math.exam120817(new int[]{0, 1000, 2000}))
                .isInstanceOf(Exception.class);
        exception=assertThrows(Exception.class,()->math.exam120817(new int[] {}));
        System.out.println(exception.toString());
        }
    }







