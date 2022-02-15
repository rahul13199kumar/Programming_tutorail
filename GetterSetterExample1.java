package gettersetter;


class Employee   
{  
      
    private int eId;  
    private String eName;  
    private String eDesignation;  
    private String eCompany;  
  
    public int getEmpId()   
    {  
        return eId;  
    }  
    public void setEmpId(final int eId)   
    {  
        this.eId = eId;  
    }  
    public String getEmpName()   
    {  
        return eName;  
    }  
    public void setEmpName(final String eName)   
    {  
         
        if(eName == null ||  eName.length() <= 0)   
        {  
            throw new IllegalArgumentException();  
        }  
        this.eName = eName;  
    }  
    public String getEmpDesignation()   
    {  
        return eDesignation;  
    }  
    public void setEmpDesignation(final String eDesignation)   
    {  
        this.eDesignation = eDesignation;  
    }  
    public String getEmpCompany()   
    {  
        return eCompany;  
    }  
      
    public void setEmpCompany(final String eCompany)   
    {  
        this.eCompany = eCompany;  
    }  
   
    @Override  
    public String toString()   
    {  
        String str = "Employee: [id = " + getEmpId() + ", name = " + getEmpName() + ", designation = " + getEmpDesignation() + ", company = " + getEmpCompany() + "]";  
        return str;  
    }  
}  
  
public class GetterSetterExample1   
{  
     
    public static void main(String argvs[])   
    {  
  
        final Employee emp = new Employee();  
          
        
        emp.setEmpId(119025);  
        emp.setEmpName("Rahul Kumar");  
        emp.setEmpDesignation("Software Tester");  
        emp.setEmpCompany("XYZ Corporation");  
          
     
        System.out.println(emp.toString());  
    }  
}  