package com.arrays;

public class DiffTypesObjectInObjectArray {

	public static void main(String[] args) {
		Object[] a = new Object[6];
		a[0] = new Emp(111, "ratan");
		a[1] = new Integer(10);
		a[2] = new Student(1, "anu");
		
		for(Object a1:a) {
			if(a1 instanceof Emp) {
				Emp e = (Emp) a1;
				System.out.println(e.eid+"----"+e.ename);
			}
			if(a1 instanceof Student) {
				Student st = (Student) a1;
				System.out.println(st.sid+"----"+st.sname);
			}
			if(a1 instanceof Integer) {
				System.out.println(a1);
			}
			if(a1 == null) {
				System.out.println(a1);
			}
		}
	}
}


//Employee Class
class Emp {
	int eid;
	String ename;

	Emp(int eid, String ename) { // conversion of local to instance
		this.eid = eid;
		this.ename = ename;
	}
}



//Student Class
class Student {
	int sid;
	String sname;

	Student(int sid, String sname) { // conversion of local to instance
		this.sid = sid;
		this.sname = sname;
	}
}