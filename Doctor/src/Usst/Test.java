package Usst;

public class Test {

}
/*
 * �������л��������²��裺

����1�� ����һ������������������԰�װһ���������͵�Ŀ������������ļ��������

����2�� ͨ�������������writeObject()����д����

�����������л��Ĳ������£�

����1�� ����һ�������������������԰�װһ���������͵�Դ�����������ļ���������

����2�� ͨ��������������readObject()������ȡ����

*/

/*
ObjectOutputStream objectOut=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("object.bin")));
Customer cus=new Customer("wang","0001","pddd",3000);
objectOut.writeObject(cus);
objectOut.close();

ObjectInputStream objectIn=new ObjectInputStream(new BufferedInputStream(new FileInputStream("object.bin")));
cus=(Customer)objectIn.readObject();
System.out.println("Name:"+cus.getName());
System.out.println("ID:"+cus.getID());
System.out.println("Password:"+cus.getPassword());
System.out.println("Salary:"+cus.getSalary());
}
catch (NotSerializableException e)
{
System.out.println(e.getMessage());
}
catch(ClassNotFoundException e)
{
   System.out.println(e.getMessage());
}
catch(IOException e)
{
   System.out.println(e.getMessage());
}
}
}

class Customer implements Serializable
{
private String name,ID;
transient private String password;
private float salary;

public Customer(String name,String ID,String password,float salary)
{
this.name=name;
this.ID=ID;
this.password=password;
this.salary=salary;
}

public String getName()
{
return name;
}

public String getID()
{
return ID;
}

public String getPassword()
{
return password;
}

public float getSalary()
{
return salary;
}
*/

