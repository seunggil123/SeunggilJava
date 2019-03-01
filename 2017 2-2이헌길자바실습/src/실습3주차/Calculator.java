package 실습3주차;

public class Calculator extends Arithmetic {

	
	public Calculator(double left,double right)
	{
		this.left=left;
		this.right=right;
		
	}
	@Override
	public double add() {
		// TODO Auto-generated method stub
		return super.left+super.right;
	}
	@Override
	public double sub() {
		// TODO Auto-generated method stub
		return super.left -super.right;
	}

	@Override
	public double multi() {
		// TODO Auto-generated method stub
		return super.left *super.right;
	}

	@Override
	public double div() {
		// TODO Auto-generated method stub
		return super.left /super.right;
	}

	
	
	
	
	
	
	

}
