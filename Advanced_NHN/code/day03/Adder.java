package NGS.NHN.code.day03;

public class Adder implements BinaryOp {
	@Override
	public int apply(int left, int right) {
		return left + right;
	}
}