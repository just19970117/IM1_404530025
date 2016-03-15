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
