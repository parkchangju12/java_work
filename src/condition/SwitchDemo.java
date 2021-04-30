package condition;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("switch(1)");
		switch(1) {
		case 1:
			System.out.println("park");
		case 2:
			System.out.println("chang");
			break;
		case 3:
			System.out.println("ju");
		}
		System.out.println("switch(2)");
		switch(5%3) {
		case 1:
			System.out.println("park");
		case 2:
			System.out.println("chang");
		case 3:
			System.out.println("ju");		}
		System.out.println("switch(3)");
		switch(6/2) {
		case 1:
			System.out.println("park");
		case 2:
			System.out.println("chang");
		case 3:
			System.out.println("ju");		
			}
		System.out.println("switch(4)");
		switch(4) {
		case 1:
			System.out.println("park");
		case 2:
			System.out.println("chang");
		case 3:
			System.out.println("ju");
		case 4:
			System.out.println("1234");
			}
		switch("아아") {
		case "아아":
			System.out.println("아아");
		default :
			System.out.println("호호");
		}
	}

}
