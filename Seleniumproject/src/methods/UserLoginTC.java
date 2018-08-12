package methods;

import java.io.IOException;

public class UserLoginTC {

	public static void main(String[] args) throws IOException
	{
		OrgHrmLib om=new OrgHrmLib();
		
		String res=om.OrgLaunch(om.url);
		System.out.println(res);
		
		res=om.OrgLogin("Vignankumar12345", "Vignankumar12345");
		System.out.println(res);
		
		res=om.OrgLogout();
		System.out.println(res);
		
		om.OrgClose();
		System.out.println("Successfully closed");

	}

}
