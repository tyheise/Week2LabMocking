package cmput402.mocking;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
    	Address address1= new Address("University of Alberta", "Edmonton");
    	Employee employee1= new Employee("Shaiful Chowdhury", 1, 20000, address1);

    	Address address2= new Address("University of Waterloo", "Waterloo");
    	Employee employee2= new Employee("Sarah Nadi", 2, 90000, address2);

    	Address address3= new Address("University of Victoria", "Victoria");
    	Employee employee3= new Employee("Abram hindle", 2, 70000, address3);
    }

    public static String capitalizeName(String name){
        String capName="";
        String[] tempString;
        String[] newString;
        tmpString=name.split(" ");

        for(name in tempString){
            name = Character.toUpperCase(name.charAt(0)) + line.substring(1);
            newString.append(name);
        }
        capName=String.join(" ", newString);

        return capName;
    }
}
