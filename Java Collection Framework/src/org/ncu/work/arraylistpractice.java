import java.util.ArrayList;

public class arraylistpractice {

	public static void main(String[] args) {
    ArrayList<String> arr = new ArrayList<>();
    arr.add("krati");
    arr.add("arora");
    System.out.println("elements in the list" + arr);
    System.out.println("updates list" + arr.remove(1));
    arr.set(1, "gudda");
    System.out.println("updated" + arr);
    System.out.println("does the list contain krati?" + arr.contains("krati"));
    
    
    
    
    


	}

}
