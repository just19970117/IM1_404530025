/*
 * [A]98
 * [TA's Advise]
 * 1. 建議都寫在程式裡囉, 沒什麼太大問題.
 * */

//不建議folder name取Main.
package Main;

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 將主程式放入程式內
		GradeAnalyzer Test = new GradeAnalyzer();
		String Question = "";
		// 讓使用者不斷輸入
		// 以下並不是不斷, 如果不斷的話應該是while(true)
		for (int i = 0; i < 99999; i++) {
			Question = JOptionPane.showInputDialog(null, "Please enter number: ");
			if (Question.equalsIgnoreCase("Q")) {
				break;
			}
			// 有使用者輸入的話別忘記要例外處理, -2.
			Test.addGrade(Double.parseDouble(Question));
		}

		// 並沒有檢查是否<2, -2.
		// 輸出文字
		Test.analyzeGrades();
		System.out.println("You entered " + Test.InputTime + " valid grade from 0 to 110. Invalid grades are ignored!");
		System.out.println("The average=" + Test.Aver + "with a standard deviation=" + Test.St);
		System.out.println(Test);
	}
}
