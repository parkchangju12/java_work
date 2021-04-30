package condition;

public class LoginDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = args[0];
		String passward = args[1];
		if (id.equals("changju") && passward.equals("1234")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}

	}

}
