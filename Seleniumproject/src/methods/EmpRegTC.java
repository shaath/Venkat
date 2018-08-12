package methods;

import java.io.IOException;

public class EmpRegTC {

	public static void main(String[] args) throws IOException
	{
		OrgHrmLib om=new OrgHrmLib();
		
		String res=om.OrgLaunch(om.url);
		System.out.println(res);
		
		res=om.OrgLogin("Admin", "admin");
		System.out.println(res);
		
		res=om.OrgEmp("Vignan", "Kumar", "Emp3214");
		System.out.println(res);
		
		res=om.OrgLogout();
		System.out.println(res);
		
		om.OrgClose();
		System.out.println("Successfully closed");

	}

}
