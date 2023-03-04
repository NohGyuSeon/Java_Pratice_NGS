package NGS.NHN.code.day04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	public static boolean checkTicTakTo(char[][] array, char c) {
		
		boolean flag = false;

        for (int i = 0; i < array.length; i++) {
            if(array[0][i] == c && array[1][i] == c && array[2][i] == c) {
                flag = true;
            }
            if(array[i][0] == c && array[i][1] == c && array[i][2] == c) {
                flag = true;
            }
        }
        

        if (array[0][0] == c && array[1][1] == c && array[2][2] == c) {
            flag = true;
        } else if (array[0][2] == c && array[1][1] == c && array[2][0] == c) {
            flag = true;
        }
        
        if (flag == true) {
            return true;
        } else {
            return false;
        }
	}
	
	public static void printArray(char[][] array) {
		  for (int i = 0; i < array.length; i++) {
	            for (int j = 0; j < array.length; j++) {
	                System.out.print(array[i][j] + " ");
	            }
	            System.out.println();
	        }
	}
	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			char array[][] = new char[3][3];
			
			for (int i = 0; i < array.length; i++) {
				Arrays.fill(array[i], '-');
			}
			
			printArray(array);
			
		    int index = 9;
            while(true) {
                // 사용자가 먼저 값 입력 'O'로 해당 배열 체크, (이미 체크된 자리일경우 콜백 후 반복)
                // 컴퓨터가 랜덤하게 입력 'X' 체크, (이미 체크된 자리일경우 콜백 후 반복)
                // 루프 전 검사하여 3개줄 겹치는지 확인 (세로3개, 가로3개, 대각선2개)
                // 승부가 결정날 때까지 반복
            	
                while(true) {
                    System.out.print("사용자 차례입니다. 행, 열을 차례로 입력하세요(1~3): ");
                    int x = sc.nextInt()-1;
                    int y = sc.nextInt()-1;
    
                    if (array[x][y] == '-') {
                        array[x][y] = 'O';
                        break;  
                    } else {
                        System.out.print("이미 체크된 자리입니다. 다시 입력하세요: ");
                    }
                }

                if (checkTicTakTo(array, 'O')) {
                    System.out.println("사용자가 이겼습니다!");
                    printArray(array);
                    break;
                }

                index--;
                if (index == 0) {
                    System.out.println("무승부입니다!");
                    printArray(array);
                    break;
                }

                System.out.println("컴퓨터 차례입니다.");
                while(true) {
                    Random rand = new Random();
                    int x = rand.nextInt(3);
                    int y = rand.nextInt(3);
    
                    if (array[x][y] == '-') {
                        array[x][y] = 'X';
                        break;
                    } else {
                        continue;
                    }
                }
                
                if (checkTicTakTo(array, 'X')) {
                    System.out.println("컴퓨터가 이겼습니다!");
                    printArray(array);
                    break;
                }
                
                printArray(array);
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

}
