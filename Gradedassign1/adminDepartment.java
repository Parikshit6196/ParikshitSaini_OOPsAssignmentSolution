package greatLearming;

public class adminDepartment extends superDepartment {

	public String departmentName() {
		String a= "Admin Department";
		System.out.println(a);
		return a;	
	}
	
	public String getTodaysWork() {
		String b="Complete your documents Submission";
		System.out.println(b);
	  return b;	
	}
	
	public String getWorkDeadline() {
		String c= "Complete by EOD";
		System.out.println(c);
		return c;
	}
}
