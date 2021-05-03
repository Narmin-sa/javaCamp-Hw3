package hw2;

public class Main {

	public static void main(String[] args) {
		UserStudent userStudent = new UserStudent();
		userStudent.id = 666;
		
		UserInstructor userInstructor = new UserInstructor();
        userInstructor.id = 777;
        
        UserManager userManager = new UserManager();
        User[] users = {userStudent, userInstructor};
        userManager.addMultiple(users);
        
        UserManager usermanager = new UserManager();
        usermanager.add(new DatabaseLogger());
	}

}
