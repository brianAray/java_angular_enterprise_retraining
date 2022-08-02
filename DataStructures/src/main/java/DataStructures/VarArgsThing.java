package DataStructures;

public class VarArgsThing {

    // Var Args
    // Variable Arguments
    public void printOutNames(int age, String... names){
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        System.out.println(age);
    }

}
