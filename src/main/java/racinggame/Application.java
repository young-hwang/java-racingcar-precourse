package racinggame;

import nextstep.utils.Console;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.NoSuchElementException;

public class Application {
    public static void main(String[] args) {
        try {
            // TODO 자동차 경주 게임 구현
            System.out.println("pobi : -");
            System.out.println("woni : ");
            System.out.println("최종 우승자는 pobi 입니다.");
            Console.readLine();
        } catch (RuntimeException e) {
            System.out.println("[ERROR]");
        }

//        throw new NoSuchElementException();
    }
}
