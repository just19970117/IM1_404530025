package Main;

import java.util.ArrayList;

//ノㄓ 单单ぶ
class Count {
	String Level;
	int Cou;

	Count(String _Level, int _Cou) {
		this.Level = _Level;
		this.Cou = _Cou;
	}

	// 块单仓璸Τ碭
	public String toString() {
		return this.Level + "=" + this.Cou;
	}
}

public class GradeAnalyzer {
	boolean First = true;
	// new皚
	Count[] GradeLevel = new Count[11];
	// new ArrayList
	ArrayList<Double> Score = new ArrayList<Double>();
	// 羆㎝キА夹非畉
	double Sum = 0, Aver = 0, St1 = 0, St = 0;
	// 块Ω计
	int InputTime = 0;

	static boolean isValidGrade(double Input) // 浪琩块计琌才砏﹚
	{
		if (Input >= 0 && Input <= 100)
			return true;
		else
			return false;
	}

	// 盢块だ计ぇ单仓璸
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
			// ┪砛糶throw Exception.
			return;
		}
		Score.add(Input);
		Sum += Input;
		InputTime++;
		// 盢块だ计逼单
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

	// 璸衡キА㎝夹非畉
	void analyzeGrades() {
		// キА=羆㎝埃Τ块Ω计
		Aver = Sum / InputTime;
		for (int i = 0; i < Score.size(); i++) {
			St1 += Math.pow(Score.get(i) - Aver, 2);
		}
		St = Math.round((Math.sqrt(St1 / InputTime)));
	}

	// 陪ボ单
	public String toString() {
		String result = "";
		for (int i = 0; i < GradeLevel.length; i++) {
			result += GradeLevel[i] + "\n";
		}
		return "The grade disriburion is :\n\n" + result;
	}
}
