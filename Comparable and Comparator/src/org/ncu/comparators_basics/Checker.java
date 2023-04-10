public class Checker implements Comparable<Checker> {
	 private String name ;
	 private int score ; 
	 
	 Checker ( String name , int score){
		 this.name = name;
		 this.score = score;
	 }
	 
	 public String getname() {
		 return name;
	 }
	
	 public void setname() {
		 this.name = name;
	 }
	 
	 public int getscore() {
		 return score;
	 }
	 
	 public void setscore() {
		 this.score = score;
		 
		 @Override 
		 public  String toString() {
			 return "[name=" + this.name + " , score" + this.score + "]"; 
		 }
	 }

	@Override
	public int compareTo(Checker o) {
		return this.name - o.name;
				
	}
}

	
	 
	
		
