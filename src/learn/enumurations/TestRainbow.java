package learn.enumurations;

public class TestRainbow {
	public static void main(String[] args){
		Rainbow rainbowEnum = Rainbow.get("red");
		System.out.println(rainbowEnum);
		System.out.println(rainbowEnum.getColor());
		System.out.println(rainbowEnum.getHexCode());
		
		Rainbow rainbowEnum2 = Rainbow.getByHexCode(0xff0000);
		System.out.println(rainbowEnum2);
		System.out.println(rainbowEnum2.getColor());
		System.out.println(rainbowEnum2.getHexCode());
		
	}
}
