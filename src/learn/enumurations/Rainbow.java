package learn.enumurations;

enum Rainbow {
	RED("Red",0xff0000), GREEN("Green",0x00ff00), BLUE("Blue", 0x0000ff);
	private String color;
	private int hexCode;
	Rainbow(String color, int hexCode){
		this.color = color;
		this.hexCode = hexCode;
	}
	public String getColor(){
		return color;
	}
	public int getHexCode(){
		return hexCode;
	}
	public static Rainbow get(String inputColor){
		for(Rainbow ewmp: values()){
			if(inputColor.equalsIgnoreCase(ewmp.color)){
				return ewmp;
			}			
		}
		return null;
	}
	public static Rainbow getByHexCode(int hexCode){
		for(Rainbow ewmp: values()){
			if(hexCode==ewmp.hexCode){
				return ewmp;
			}			
		}
		return null;
	}
}


