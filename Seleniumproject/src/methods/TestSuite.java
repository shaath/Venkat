package methods;

import java.io.IOException;

public class TestSuite {

	public static void main(String[] args) throws IOException
	{
		OrgHrmLib om=new OrgHrmLib();
		//Login
		String res=om.OrgLaunch(om.url);
		System.out.println(res);
		
		res=om.OrgLogin("Admin", "admin");
		System.out.println(res);
		
		res=om.OrgLogout();
		System.out.println(res);
		
		om.OrgClose();
		System.out.println("Successfully closed");

		//EmpReg
		res=om.OrgLaunch(om.url);
		System.out.println(res);
		
		res=om.OrgLogin("Admin", "admin");
		System.out.println(res);
		
		res=om.OrgEmp("Sandeep", "Kumar", "Emp4514");
		System.out.println(res);
		
		res=om.OrgLogout();
		System.out.println(res);
		
		om.OrgClose();
		System.out.println("Successfully closed");
		
		//Userreg
		res=om.OrgLaunch(om.url);
		System.out.println(res);
		
		res=om.OrgLogin("Admin", "admin");
		System.out.println(res);
		
		res=om.OrgUserReg("Sandeep Kumar", "Sandeepkumar12345", "Sandeepkumar12345", "Sandeepkumar12345");
		System.out.println(res);
		
		res=om.OrgLogout();
		System.out.println(res);
		
		om.OrgClose();
		System.out.println("Successfully closed");
		
		//UserLogin
		
		res=om.OrgLaunch(om.url);
		System.out.println(res);
		
		res=om.OrgLogin("Sandeepkumar12345", "Sandeepkumar12345");
		System.out.println(res);
		
		res=om.OrgLogout();
		System.out.println(res);
		
		om.OrgClose();
		System.out.println("Successfully closed");

	}

}
