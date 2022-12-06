import age_exception1.*;
import age_exception2.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

class Patient
{
	TestMyException a=new TestMyException();
	age_error b=new age_error();
	public int pat_no;
	public String name;
	public int age;
	public String age1;
	public String bg;
	public String gender;
	public String ph;
	public String disease;
	public String doc_name;
	public String date;
	public String treatment;
	public String med;
	Patient(int x,String y)
	{
		pat_no=x;
		name=y;
	}
	Patient()
	{
	}
	public void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Patient Number");
		pat_no=sc.nextInt();
		System.out.println("Enter the Name of the Patient");
		name=sc.next();
		System.out.println("Enter the Age of the Patient");
		age1=sc.next();
		age=b.age_check(age1);
		age=a.catch_age(age);
		System.out.println("Enter the Blood Group of the Patient");
		bg=sc.next();
		System.out.println("Enter the Gender of the Patient");
		gender=sc.next();
		System.out.println("Enter the Phone Number of the Patient");
		ph=sc.next();
		System.out.println("Enter the Disease of the Patient");
		disease=sc.next();
		System.out.println("Enter the Name of Allocated Doctor to the Patient");
		doc_name=sc.next();
		System.out.println("Enter the Date of Admission of the Patient");
		date=sc.next();
		System.out.println("Enter the Treatment Type of the Patient");
		treatment=sc.next();
		System.out.println("Enter the Medecines of the Patient");
		med=sc.next();
	}
	public void display()
	{
		System.out.println("Patient Number : "+pat_no);
		System.out.println("Name of the Patient : "+name);
		System.out.println("Age of the Patient : "+age);
		System.out.println("Blood Group of the Patient : "+bg);
		System.out.println("Gender of the Patient : "+gender);
		System.out.println("Phone Number of the Patient : "+ph);
		System.out.println("Disease of the Patient : "+disease);
		System.out.println("Name of the Allocated Doctor to the Patient : "+doc_name);
		System.out.println("Date of Admission of the Patient : "+date);
		System.out.println("Treatment of the Patient : "+treatment);
		System.out.println("Medecines of the Patient : "+med);
	}
}
class accomodation_fee extends Thread
{
	private int no_of_days;
	accomodation_fee(int n) 
	{
		no_of_days=n;
	}
	public void run()
	{
		int total;
		total=(no_of_days*7500)+5000;
		System.out.println("Total Accomodation Fees = Rs "+total);
	}
}
class doctor_fee extends Thread
{
	private int no_of_days;
	doctor_fee(int n) 
	{
		no_of_days=n;
	}
	public void run()
	{
		int total;
		total=(no_of_days*24*150)+1000;
		System.out.println("Total Doctor Fees = Rs "+total);
	}
}
class medecine_fee extends Thread
{
	private int no_of_days;
	medecine_fee(int n) 
	{
		no_of_days=n;
	}
	public void run()
	{
		int total;
		total=(no_of_days*24*50)+500;
		System.out.println("Total Medecine Fees = Rs "+total);
	}
}

interface cost_calculator
{
	float accomodation_rate=7500;
	float doctor_rate=24*150;
	float medecine_rate=24*50;
	float compute_total(int no_of_days);
}
class accomodation implements cost_calculator
{
	public float compute_total(int no_of_days)
	{
		return ((no_of_days*7500)+5000);
	} 
}
class doctor implements cost_calculator
{
	public float compute_total(int no_of_days)
	{
		return ((no_of_days*24*150)+1000);
	} 
}
class medecine implements cost_calculator
{
	public float compute_total(int no_of_days)
	{
		return ((no_of_days*24*50)+500);
	} 
}
class staff_variable
{
	String name;
	String age;
	String gender;
	String ph;
	String desig;
	String sal;
	String lab_no;
}
class staff_method extends staff_variable
{
	public void getdata()
	{
		Scanner g=new Scanner(System.in);
		System.out.println("Enter the Staff's Name");
		name=g.next();
		System.out.println("Enter the Staff's Age");
		age=g.next();
		System.out.println("Enter the Staff's Gender");
		gender=g.next();
		System.out.println("Enter the Staff's Phone Number");
		ph=g.next();
		System.out.println("Enter the Staff's Designation");
		desig=g.next();
		System.out.println("Enter the Staff's Salary");
		sal=g.next();
		System.out.println("Enter the Staff's allocated Lab's Number");
		lab_no=g.next();
	}
	public void display()
	{
		System.out.println("Staff's Name : "+name);
		System.out.println("Staff's Age : "+age);
		System.out.println("Staff's Gender : "+gender);
		System.out.println("Staff's Phone Number : "+ph);
		System.out.println("Staff's Designation : "+desig);
		System.out.println("Staff's Salary : "+sal);
		System.out.println("Staff's allocated Lab Number : "+lab_no);
	}
}
class staff extends staff_method
{
}


class info
{
	public static void main(String args[])
	{
		Scanner m=new Scanner(System.in);
		int choice;
		choice=0;
		while(choice!=9)
		{
			System.out.println("\n\n\n");
			System.out.println("\t\t\t\t\t\t\tJupiter Hospital Management System");
			System.out.println("\n\n\n");
			System.out.println("*****Main Menu******");
			System.out.println("1. Patient List");
			System.out.println("2. Emergency Patient List");
			System.out.println("3. Total Cost (Interface)");
			System.out.println("4. Total Cost (Multithreading)");
			System.out.println("5. Doctor's List");
			System.out.println("6. Staff's List");
			System.out.println("7. Advertisement");
			System.out.println("8. Patient Feedback");
			System.out.println("9. Exit");
			System.out.println("Please Enter your choice");
			choice=m.nextInt();
			switch(choice)
			{
				case 1:
					int choice1,nos,i,target,found;
					Scanner sc=new Scanner(System.in);
					String target1;
					choice1=0;
					System.out.println("Enter the number of Patients");
					nos=m.nextInt();
					Patient s1[]=new Patient[nos];
					for(i=0;i<nos;i++)
					{
						s1[i]=new Patient();
					}
					while(choice1!=5)
					{
						System.out.println("*****Main Menu*****");
						System.out.println("1. Enter the Patient's details");
						System.out.println("2. Display the Patient List");
						System.out.println("3. Search a Patient's detail using Patient's Number");
						System.out.println("4. Search a Patient's detail using Patient's Name");
						System.out.println("5. Exit");
						System.out.println("Please Enter your Choice");
						choice1=sc.nextInt();
						switch(choice1)
						{
						case 1:
							for(i=0;i<nos;i++)
							{
								s1[i].getdata();
								System.out.println("");
							}
							break;
						case 2:
							for(i=0;i<nos;i++)
							{
								s1[i].display();
								System.out.println("");
							}
							break;
						case 3:
							found=0;
							System.out.println("Enter the Patient Number");
							target=sc.nextInt();
							for(i=0;i<nos;i++)
							{
								if(target==s1[i].pat_no)
								{
									s1[i].display();
									found=1;
									break;
								}
							}
							if(found==0)
							{
								System.out.println("Patient Number not found");
							}
							System.out.println("");
							break;
						case 4:
							found=0;
							System.out.println("Enter the Patient's Name");
							target1=sc.next();
							for(i=0;i<nos;i++)
							{
								if(target1.equals(s1[i].name))
								{
									s1[i].display();
									found=1;
									break;
								}
							}
							if(found==0)
							{
								System.out.println("Patient Name not found");
							}
							System.out.println("");
							break;
						case 5:
							System.out.println("Exiting Application");
							break;
						default:
							System.out.println("Invalid Choice");
							break;
						}
					}
					break;
				case 2:
					int choice2,nos2,i2,no2;
					String name2;
					Scanner sc2=new Scanner(System.in);
					choice2=0;
					System.out.println("Enter the number of Patients");
					nos2=sc2.nextInt();
					Patient s2[]=new Patient[nos2];
					while(choice2!=4)
					{
						System.out.println("*****Main Menu*****");
						System.out.println("1. Enter the Patient's details");
						System.out.println("2. Display the Patient List");
						System.out.println("3. Edit List");
						System.out.println("4. Exit");
						choice2=sc2.nextInt();
						switch(choice2)
						{
							case 1:
								for(i2=0;i2<nos2;i2++)
								{
									System.out.println("Please Enter the Patient Number");
									no2=sc2.nextInt();
									System.out.println("Please Enter the Patient Name");
									name2=sc2.next();
									s2[i2]=new Patient(no2,name2);
									System.out.println("");
								}
								break;
							case 2:
								for(i2=0;i2<nos2;i2++)
								{
									s2[i2].display();
									System.out.println("");
								}
								break;
							case 3:
								for(i2=0;i2<nos2;i2++)
								{
									System.out.println("Patient Number : "+s2[i2].pat_no);
									System.out.println("Patient Name : "+s2[i2].name);
									s2[i2].getdata();
									System.out.println("");
								}
								break;
							case 4:
								System.out.println("Exiting Application");
								break;
							default:
								System.out.println("Invalid Choice");
								break;
						}
					}
					break;
				case 3:
					Scanner z=new Scanner(System.in);
					int no3;
					accomodation ac=new accomodation();
					doctor d=new doctor();
					medecine medec=new medecine();
					System.out.println("Enter the number of days");
					no3=z.nextInt();
					cost_calculator cal;
					cal=ac;
					System.out.println("Total Accomodation Fees = Rs "+cal.compute_total(no3));
					cal=d;
					System.out.println("Total Doctor Fees = Rs "+cal.compute_total(no3));
					cal=medec;
					System.out.println("Total Medecine Fees = Rs "+cal.compute_total(no3));
					break;
				case 4:
					int no_of_days;
					Scanner o=new Scanner(System.in);
					System.out.println("Enter the number of days");
					no_of_days=o.nextInt();
					accomodation_fee a=new accomodation_fee(no_of_days);
					doctor_fee b=new doctor_fee(no_of_days);
					medecine_fee c=new medecine_fee(no_of_days);
					a.start();
					b.start();
					c.start();
					break;
				case 5:
					Scanner z1=new Scanner(System.in);
					int choice4,no4,no5,i4,loc4;
					choice4=0;
					String doctor_array[]=new String[100];
					String doc_name;
					Vector doctor_list=new Vector();
					System.out.println("Enter the number of Doctors");
					no4=z1.nextInt();
					while(choice4!=4)
					{
						System.out.println("");
						System.out.println("*****Main Menu*****");
						System.out.println("1. Create Doctor's List");
						System.out.println("2. Add Doctor at a given location");
						System.out.println("3. Display");
						System.out.println("4. Exit");
						System.out.println("Enter your choice");
						choice4=z1.nextInt();
						switch(choice4)
						{
							case 1:
								for(i4=0;i4<no4;i4++)
								{
									System.out.println("Enter the Doctor's Name");
									doc_name=z1.next();
									doctor_list.addElement(doc_name);
								}
								break;
							case 2:
								System.out.println("Enter the Doctor's Name");
								doc_name=z1.next();
								System.out.println("Enter the location");
								loc4=z1.nextInt();
								doctor_list.insertElementAt(doc_name,loc4);
								break;
							case 3:
								no5=doctor_list.size();
								doctor_list.copyInto(doctor_array);
								System.out.println("The Doctors in the list are \n");
								for(i4=0;i4<no5;i4++)
								{
									System.out.println(doctor_array[i4]);
								}
								break;
							case 4:
								System.out.println("Exiting Application");
								break;
							default:
								System.out.println("Invalid Choice");
								break;
						}
					}
					break;
				case 6:

					Scanner h=new Scanner(System.in);
					int choice6,nos6,i6,found6;
					String target6;
					choice6=0;
					System.out.println("Enter the number of Staff Members");
					nos6=h.nextInt();
					staff sta[]=new staff[nos6];
					for(i6=0;i6<nos6;i6++)
					{
						sta[i6]=new staff();
					}
					while(choice6!=4)
					{
						System.out.println("*****Main Menu*****");
						System.out.println("1. Enter the Staff's details");
						System.out.println("2. Display the Staff List");
						System.out.println("3. Search a Staff");
						System.out.println("4. Exit");
						System.out.println("Please Enter your Choice");
						choice6=h.nextInt();
						switch(choice6)
						{
							case 1:
								for(i6=0;i6<nos6;i6++)
								{
									sta[i6].getdata();
									System.out.println("");
								}
								break;
							case 2:
								for(i6=0;i6<nos6;i6++)
								{
									sta[i6].display();
									System.out.println("");
								}
								break;
							case 3:
								System.out.println("");
								found6=0;
								System.out.println("Enter the Staff's Name");
								target6=h.next();
								for(i6=0;i6<nos6;i6++)
								{
									if(target6.equals(sta[i6].name))
									{
										sta[i6].display();
										found6=1;
										break;
									}
								}
								if(found6==0)
								{
									System.out.println("Staff Name not found");
								}
								System.out.println("");
								break;
							case 4:
								System.out.println("Exiting Application");
								break;
							default:
								System.out.println("Invalid Choice");
								break;
						}
					}
					break;
				case 7:
					try 
					{ 
						Process p = Runtime.getRuntime().exec("javac app.java");
						Process p2 = Runtime.getRuntime().exec("appletviewer app.java");
					}
					catch (IOException e)
					{  
						e.printStackTrace();  
					}
					break;
				case 8:
					try 
					{ 
						Process p = Runtime.getRuntime().exec("javac feedback.java");
						Process p2 = Runtime.getRuntime().exec("java feedback");
					}
					catch (IOException e)
					{  
						e.printStackTrace();  
					}
					break;
				case 9:
					System.out.println("Exiting Application");
					break;
				default:
					System.out.println("Invalid Choice");
					break;
			}
		}
	}
}
