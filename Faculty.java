public class Faculty{
    List<Student> list = new ArrayList<Student>();
	String ime;
    public void addStudent(Student std) {
        list.add(std);

    }

    public void removeStudnet(Student student) {
        list.remove(student);

    }


}