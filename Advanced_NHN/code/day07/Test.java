package NGS.NHN.code.day07;

import java.io.IOException;
import java.util.Scanner;

public class Test {
	static int k = 0;
	
    public static void main(String[] args) {
 
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("총 계산 횟수를 입력하세요: ");
            int num = sc.nextInt();
            while(num != 0) {
                try {
                    System.out.print("\n거듭제곱 승수를 입력하세요: ");
                    k = sc.nextInt();
                    
                    System.out.println("\n입력할 형태를 고르세요!");
                    System.out.println("유리수(분자/분모), 유리수(분자/분모) → 0");
                    System.out.println("유리수(분자/분모), 정수 → 1");
                    System.out.print("Enter a digit: ");
                    
                    int flag = sc.nextInt();
                    
                    if (flag == 0) {
                        System.out.print( "\n연산할 유리수들을 입력하세요: ");
                        Rational r1 = new Rational(sc.nextInt(), sc.nextInt());
                        Rational r2 = new Rational(sc.nextInt(), sc.nextInt());
                        
                        printResult(r1, r2);
                    } else if (flag == 1) {
                        System.out.print( "\n연산할 유리수와 정수를 입력하세요: ");
                        Rational r1 = new Rational(sc.nextInt(), sc.nextInt());
                        Rational r2 = new Rational(sc.nextInt());
                        
                        printResult(r1, r2);
                    } else {
                        throw new IOException();
                    }
                    
                    num--; 
                } catch (IOException ie) {
                    System.out.println("올바른 입력 값이 아닙니다! 다시 입력하세요.");
                    continue;
                }
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printResult(Rational r1, Rational r2) throws Exception {
        System.out.println();
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.substract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println("pow " + r1 + "(" + k + ") = " + r1.exponent(k));
        System.out.println("pow " + r2 + "(" + k + ") = " + r2.exponent(k));
        System.out.println("negate " + r1 + " = " + r1.negate());
        System.out.println("negate " + r2 + " = " + r2.negate());
        System.out.println(r1 + " equals " + r2 + " = " + r1.equals(r2));
        System.out.println(r1 + " compareTo " + r2 + " = " + r1.compareTo(r2));
    }

}
