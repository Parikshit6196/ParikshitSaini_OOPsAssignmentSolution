package greatLearming;

public class driverMain {

	public static void main(String args[]) {
		 
		adminDepartment obj = new adminDepartment();
		hrDepartment obj1 = new hrDepartment();
		techDepartment obj2 = new techDepartment();
		superDepartment o = new adminDepartment();
		
		System.out.println("Welcome to Admin Department ");
		obj.getTodaysWork();
		obj.getWorkDeadline();
		System.out.println(o.isTodayAHoliday());
		
		System.out.println("Welcome to HR Department");
		obj1.doActivity();
		obj1.getTodaysWork();
		obj1.getWorkDeadline();
		System.out.println(o.isTodayAHoliday());
		
		System.out.println("Welcome to Tech Department");
		obj2.getTodaysWork();
		obj2.getWorkDeadline();
		obj2.getTechStackInformation();
		System.out.println(o.isTodayAHoliday());
		
	}
}
