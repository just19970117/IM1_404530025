/*
 * [A]98
 * [TA's Advise]
 * 1. ��ĳ���g�b�{�����o, �S����Ӥj���D.
 * */

//����ĳfolder name��Main.
package Main;

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �N�D�{����J�{����
		GradeAnalyzer Test = new GradeAnalyzer();
		String Question = "";
		// ���ϥΪ̤��_��J
		// �H�U�ä��O���_, �p�G���_�������ӬOwhile(true)
		for (int i = 0; i < 99999; i++) {
			Question = JOptionPane.showInputDialog(null, "Please enter number: ");
			if (Question.equalsIgnoreCase("Q")) {
				break;
			}
			// ���ϥΪ̿�J���ܧO�ѰO�n�ҥ~�B�z, -2.
			Test.addGrade(Double.parseDouble(Question));
		}

		// �èS���ˬd�O�_<2, -2.
		// ��X��r
		Test.analyzeGrades();
		System.out.println("You entered " + Test.InputTime + " valid grade from 0 to 110. Invalid grades are ignored!");
		System.out.println("The average=" + Test.Aver + "with a standard deviation=" + Test.St);
		System.out.println(Test);
	}
}
