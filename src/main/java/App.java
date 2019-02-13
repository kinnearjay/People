import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args){
        Person pr = new Person(24, "Jordan", "Fun Police");
        Person pr1 = new Person(40, "William", "Real Police");
        Person pr2 = new Person(35, "John", "Not the Police");
        Person pr3 = new Person(15, "Reece", "Chocolate maker");

        List<Person> perList = new ArrayList<Person>();
        perList.add(pr);
        perList.add(pr1);
        perList.add(pr2);
        perList.add(pr3);

        perList.forEach(System.out::println);

        Scanner sc = new Scanner(System.in);

        String nameSearch = sc.nextLine();

        findByName(perList,nameSearch);






    }

    public static String findByName(List<Person>   lP, String name){

        for(int i = 0 ; i< lP.size() ; i++){
            if(lP.get(i).toString().contains(name)){
                System.out.println(lP.get(i).toString());
                return lP.get(i).toString();
            }

        }
        return "sorry cant find em";
    }
}
