/*
 * [C]66
 * [TA's advise]
 * 1.分數上的問題, 如果有疑問可以來找助教詢問.
 * 2.檔名錯誤, 我嘗試幫你作修改但因為裡面程式碼似乎有些問題, 你class中又寫了class, 導致程式無法正確執行, 所以我才給了C
 * 3.撰寫的程式似乎有辦法能夠更為精簡, 如果對於OO有任何問題歡迎與我聯繫, 可以到R508問我.
 * 4.toString() override句法正確, 但撰寫位置錯誤, 這部分屬於觀念錯誤, 扣2分.
 * 5.getWidth(),getHeight(),這個與本身method涵義不同, 這部分扣2分.
 * */

package ForHM;
	class Rect{
	
		int W,H,X,Y;
		int Area,Per;
		String name;
	void getWidth(){
		Area=W*H;
		}
	void getHeight(){
		Per=(W+H)*2;
	}
	public class name{
		public String toString(){return"Rect"+name;
			
		
	}
		name String=new name();
		
	}
	void Display(){
	System.out.println(name);
	System.out.println("--------------------------------------------------------");
	System.out.println("java.Rectangle[x="+this.X+",y="+this.Y+",width="+this.W+",height="+this.H);
	System.out.println("Area="+Area);
	System.out.println("Perimeter="+Per);
	System.out.println("========================================================");
	
	
	}
	}
	public class HM1 {
		
	public static void main(String[] args){
		
		Rect R1=new Rect();
		Rect R2=new Rect();
		R1.X=15;
		R1.Y=25;
		R1.W=57;
		R1.H=18;
		R1.name="Rectangle 1";
		R1.getWidth();
		R1.getHeight();
		R1.toString();
	    R2.X=0;
	    R2.Y=12;
	    R2.W=60;
	    R2.H=47;
	    R2.name="Rectangle 2";
	    R2.getWidth();
	    R2.getHeight();
	    R2.toString();
	    R1.Display();
	    R2.Display();
	    
	    
	}
		
	}
