package methods;

import java.io.IOException;

public class LoginTC {

	public static void main(String[] args) throws IOException 
	{
		OrgHrmLib om=new OrgHrmLib();
		
		String res=om.OrgLaunch(om.url);
		System.out.println(res);
		
		res=om.OrgLogin("Admin", "admin");
		System.out.println(res);
		
		res=om.OrgLogout();
		System.out.println(res);
		
		om.OrgClose();
		System.out.println("Successfully closed");

	}

}
