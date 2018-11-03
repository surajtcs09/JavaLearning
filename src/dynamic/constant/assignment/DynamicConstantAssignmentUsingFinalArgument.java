package dynamic.constant.assignment;

public class DynamicConstantAssignmentUsingFinalArgument {
public static void main(String args[]){
	DynamicConstantAssignmentUsingFinalArgument dcaufa= new DynamicConstantAssignmentUsingFinalArgument();
	int xx= dcaufa.getDynamicValue();
	int v1=5;
	switch(v1){
	case 0:
		System.out.println("Something");
		break;
	case 1:
		System.out.println("Something Else");
		break;
	default:
		System.out.println("Default");
		break;
	}
}
	public int getDynamicValue(){
		return 0;
	}

}
