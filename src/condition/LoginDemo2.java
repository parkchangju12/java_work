package condition;

public class LoginDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = args[0];
		String password = args[1];
		if (id.equals("changju")){
			if (password.equals("1234")){
				System.out.println("right");
			} else {
				System.out.println("passward wrong");
			}
		} else {
			System.out.println("id wrong");
		}
				

	}

}
