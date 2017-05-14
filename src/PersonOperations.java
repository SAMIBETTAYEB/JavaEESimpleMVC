import java.util.ArrayList;
import test.Person;

public class PersonOperations {

	ArrayList<Person> persons;
	
	public PersonOperations(){
		persons=new ArrayList<>();
	}
	
	public PersonOperations(ArrayList<Person> persons){
		this.persons=persons;
	}
	
	public void addPerson(Person person){
		persons.add(person);
	}
	
	public ArrayList<Person> getPersons(){
		return persons;
	}
	
}
