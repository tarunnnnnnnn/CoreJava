package april25;


public class Student implements Comparable<Student>{
	String name;
	int id ;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setid(int id)
	{
		this.id = id;
		
	}
	public Student (String name ,int id )
	{
		super();
		this.name = name;
		this.id =id;
	}
	public int compareTo(Student that) {
		return this.Id() - that.getId
		
	}
	
	

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	

}
