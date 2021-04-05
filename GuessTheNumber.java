package Java1;	//package在前 import在后
import java.util.*;
public class GuessTheNumber {
	public static void main(String[] args) {
		//欢迎界面
		System.out.println("******你好！欢迎来到猜数字游戏！******");
		System.out.println("Hello!Welcome to GuessTheNumber Game!");
		//线程睡觉3秒 
		try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace(); 
	        }
		//学到了学到了，没在外面声明时要用int
		 System.out.println("请任意输入1(Easy 1~3)或2(Hard 1~5)选择难度来开始游戏");
		 //先写出需要的元素
		Scanner ChooseHard = new Scanner(System.in); //选择难度
		Scanner GNumber = new Scanner(System.in);    //输入猜的数,G表示Guess
		Random CNumber = new Random();    			 //要猜的数，C表示Computer
		//为数申请空间
		int Hard = ChooseHard.nextInt();
		//if引导进入不同难度
		if(Hard==1) {
			System.out.println("您选择的是简单模式，即将开始游戏");
			System.out.println("要猜的数已选好，请猜这个数");
			int NGuess = CNumber.nextInt(3);       //声明需要猜的数，为0<x<3的数，N意思为need
			int InputN = GNumber.nextInt();          //声明输入数，N意思为Number。
			//！在前  =在后
			if (InputN!=NGuess) {
			System.out.println("您猜错了");
			if(InputN>NGuess) {
				System.out.println("您猜的数比要猜的数大");
			}else{
				System.out.println("您猜的数比要猜的数小");
			}
			}else{
				System.out.println("您猜对了！今天是您的幸运日");
			}
		}else if(Hard==2) {
			System.out.println("您选择的是困难模式，即将开始游戏");
			System.out.println("要猜的数已选好，请猜这个数");
			int NGuess = CNumber.nextInt(5);       //声明需要猜的数，为0<x<15的数，N意思为need
			int InputN = GNumber.nextInt();          //声明输入数，N意思为Number。
			//！在前  =在后
			if (InputN!=NGuess) {
			System.out.println("您猜错了");
			if(InputN>NGuess) {
				System.out.println("您猜的数比要猜的数大");
			}else{
				System.out.println("您猜的数比要猜的数小");
			}
			}else{
				System.out.println("您猜对了！今天是您的幸运日");
			}
		}else{
			System.out.println("您输入了错误的数，游戏即将结束");
		}
	}
}
