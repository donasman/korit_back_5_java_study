package ch13;

import com.study.ch13.Car;
import com.study.ch13.Factory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;


public class FactoryService1Test {
    @DisplayName("공장에서 자동차 생성 메소드 테스트")
    @Test
    public void create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1공장에서 차량을 생산합니다.");
        System.out.print("모델명 입력 >> ");
        String modelName = scanner.nextLine();
        Factory factory = Factory.getInstance();
        factory.setFactoryName("자동차 생산 공장");
        Car car = factory.produce(modelName);
        System.out.println(car.toString());
    }

    @Test
    public void test() {
        int a = 10;
        int b = 20;
        int c = a + b;
        Assertions.assertEquals(c, a + b);
    }
}
