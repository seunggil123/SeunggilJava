package ½Ç½À10;

public class UnsupportedFunctionException extends RuntimeException {
	private int ERR_CODE;
	private String str;
	public UnsupportedFunctionException()
	{
//		super("Error: Not a positive number");
	}
	
	public UnsupportedFunctionException(String str)
	{
		super(str);

	}
	
	public UnsupportedFunctionException(String str, int ERR_CODE)
	{
		super(str);
		this.ERR_CODE = ERR_CODE;
		this.str = str;
	}
	
	public int getErrCode()
	{
		return ERR_CODE;
	}
	
	@Override
	public String getMessage() {
		return getErrCode()+""+str;
	}
}