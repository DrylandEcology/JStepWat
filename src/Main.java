import stepwat.input.ST.ST_Input;

public class Main {
	public static void main(String[] args) {
		try {
			ST_Input stepwatInput = new ST_Input("/home/ryan/workspace/StepWat/testing/Stepwat Inputs/", "files.in");
			stepwatInput.readInputData();
			stepwatInput.prjDir = "/home/ryan/Documents/Work/StepWatTest";
			stepwatInput.writeInputData();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}