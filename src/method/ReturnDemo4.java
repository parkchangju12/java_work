package method;

public class ReturnDemo4 {

	public static String[] getMember() {
		// TODO Auto-generated method stub
		String[] members = {"������", "������", "���̶�"};
		return members;
	}
	public static void main(String[] args) {
		String[] members = getMember();
		System.out.println(members[1]);
	}

}
