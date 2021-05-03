package hw2;

public class UserManager {
	public void kaydol(User user)
	{
		System.out.println(user.id + " kaydedildi. ");
	}
	public void addMultiple(User[] users)
	{
		for(User user : users)
		{
			kaydol(user);
		}
	}
	public void yorumYaz(User user)
	{
		System.out.println("Yorum yazıldı. ");
	}
	
	public void bitirVeDevamEt(User user)
	{
		System.out.println("Bir sonrakine geçildi. ");
	}
	
	public void oncekiDers(User user)
	{
		System.out.println("Önceki derse geçildi. ");
	}
	
	public void add(Logger logger)
	{
		System.out.println("Kullanıcı eklendi.");
		logger.log();
	}

}
