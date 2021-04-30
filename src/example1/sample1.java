package example1;

class sample extends MultiplicationableCalculator {
	public void sampel1() {
		System.out.println(this.left % this.right);
	}
}
public class sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample sm = new sample();
		sm.setOperands(100, 20);
		sm.avg();
		sm.sum();
		sm.multiplication();
		sm.sampel1();
	}

}
