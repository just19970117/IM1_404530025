package Main;

import java.util.ArrayList;

//�Ψө� ���ŵ���h�֭�
class Count {
	String Level;
	int Cou;

	Count(String _Level, int _Cou) {
		this.Level = _Level;
		this.Cou = _Cou;
	}

	// ��X���Ų֭p���X��
	public String toString() {
		return this.Level + "=" + this.Cou;
	}
}

public class GradeAnalyzer {
	boolean First = true;
	// new�@�Ӱ}�C
	Count[] GradeLevel = new Count[11];
	// new �@��ArrayList
	ArrayList<Double> Score = new ArrayList<Double>();
	// �ŧi�`�M�B�����B�зǮt
	double Sum = 0, Aver = 0, St1 = 0, St = 0;
	// �ŧi��J����
	int InputTime = 0;

	static boolean isValidGrade(double Input) // �ˬd��J�Ʀr�O�_�ŦX�W�w
	{
		if (Input >= 0 && Input <= 100)
			return true;
		else
			return false;
	}

	// �N��J���Ƥ����Ų֭p
	void addGrade(double Input) {
		// Good, +2.
		if (First) {
			GradeLevel[0] = new Count("A+", 0);
			GradeLevel[1] = new Count("A ", 0);
			GradeLevel[2] = new Count("A-", 0);
			GradeLevel[3] = new Count("B+", 0);
			GradeLevel[4] = new Count("B ", 0);
			GradeLevel[5] = new Count("B-", 0);
			GradeLevel[6] = new Count("C+", 0);
			GradeLevel[7] = new Count("C ", 0);
			GradeLevel[8] = new Count("C-", 0);
			GradeLevel[9] = new Count("D ", 0);
			GradeLevel[10] = new Count("F ", 0);
			First = false;
		}

		if (!isValidGrade(Input)) {
			// �γ\�i�H�g��throw Exception.
			return;
		}
		Score.add(Input);
		Sum += Input;
		InputTime++;
		// �N��J���ƱƵ���
		if (Input > 60) {
			if (Input >= 98)
				GradeLevel[0].Cou++;
			else if (Input < 98 && Input >= 92)
				GradeLevel[1].Cou++;
			else if (Input < 92 && Input >= 90)
				GradeLevel[2].Cou++;
			else if (Input < 90 && Input >= 88)
				GradeLevel[3].Cou++;
			else if (Input < 88 && Input >= 82)
				GradeLevel[4].Cou++;
			else if (Input < 82 && Input >= 80)
				GradeLevel[5].Cou++;
			else if (Input < 80 && Input >= 78)
				GradeLevel[6].Cou++;
			else if (Input < 78 && Input > 72)
				GradeLevel[7].Cou++;
			else if (Input < 72 && Input > 70)
				GradeLevel[8].Cou++;
			else if (Input < 70 && Input >= 60)
				GradeLevel[9].Cou++;

		} else
			GradeLevel[10].Cou++;
	}

	// �p�⥭���M�зǮt
	void analyzeGrades() {
		// ����=�`�M���H���Ŀ�J����
		Aver = Sum / InputTime;
		for (int i = 0; i < Score.size(); i++) {
			St1 += Math.pow(Score.get(i) - Aver, 2);
		}
		St = Math.round((Math.sqrt(St1 / InputTime)));
	}

	// ��ܵ���
	public String toString() {
		String result = "";
		for (int i = 0; i < GradeLevel.length; i++) {
			result += GradeLevel[i] + "\n";
		}
		return "The grade disriburion is :\n\n" + result;
	}
}
