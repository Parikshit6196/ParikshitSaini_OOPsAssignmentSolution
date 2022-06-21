package greatLearming;

public class hrDepartment extends superDepartment {

	public String departmentName() {
		String d ="Hr department";
		System.out.println("Hr Department ");
		return d;
		
	}
	
	public String getTodaysWork() {
		String e = "Fill today’s worksheet and mark your attendance";
		System.out.println(e);
		return e;
		
	}
	
	public String getWorkDeadline() {
		String f= "Complete by EOD";
		System.out.println(f);
		return f;
	
    }
	
	public  String doActivity() {
		String g= "team Lunch";
		System.out.println(g);
		return g;
		
	}
}
