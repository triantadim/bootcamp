package jbc_exercise2;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Dimitris Triantafyllou
 */
public class Jbc_Exercise2 {
  
////////////////////////////// PERSON class/////////////    
    static class Person {
        String Firstname;
        int Age;
        ArrayList<Pet> animal;
        int ment;
        
        ///creates obj person with parameters animals
        public Person(String Firstname, int Age , ArrayList<Pet> animal, int ment){
            this.Firstname = Firstname;
            this.Age = Age;
            this.animal = animal;  
            this.ment = ment;
        }
        ///creates obj person without parameters animals
        public Person(String Firstname, int Age, int ment ){
            this.Firstname = Firstname;
            this.Age = Age;
            this.ment = ment;
        }
            
        public String getFirstname() {
            return Firstname;
        }

        public int getAge() {
            return Age;
        }
        public int getment() {
            return ment;
        }
        
        public String getanimal() {
            return animal.toString();
        }
        
        @Override
        public String toString() {
            if(getment() == 1){
                return ("Name " + getFirstname() + " Age " + getAge() + " and has a " + getanimal());
            }else{
                return ("Name " + getFirstname() + " Age " + getAge() + " doesnt have any pets");
            }
            
    }
    }
/////////////////////////PET class//////////////////    
    static class Pet {
        String Nickname;
        String Pettype;
        
        public Pet(String Nickname, String Pettype){
            this.Nickname = Nickname;
            this.Pettype = Pettype;
        }
        
        public Pet(){
            this.Nickname = "none";
            this.Pettype = "none";
        }
        
        public String getNickname() {
            return Nickname;
        }
        public String getPettype() {
            return Pettype;
        }
        @Override
        public String toString(){
            return (getPettype() + " named " + getNickname());
        }
    } 
    
    public static void clean(){
        for (int i = 0; i < 50; ++i) System.out.println();
    }
////////////////////MAIN///////////////////////
    public static void main(String[] args) {
        int outherperson;
        Person member;
        //Pet animals;
        
        
        ArrayList<Person> family = new ArrayList<>();
        
        
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Please provide the name of a family member.");
            String name = sc.next();clean();
            
            System.out.println("Please provide this family members age.");
            int age = sc.nextInt();clean();


            System.out.println("Does this family member has any pets?\npress:\n1. for Yes.\n2. for No.");
            int petsnum = sc.nextInt();clean();
            
            String petsname ;
            String pettype;
            ArrayList<Pet> animals = null;
            
            int run;
            
                if (petsnum == 1){
                    animals = new ArrayList<>();
                    do{
                        System.out.println("What is the name of the pet.");
                        petsname = sc.next();clean();
                        System.out.println("What is this pets type.");
                        pettype = sc.next(); clean();
                        animals.add(new Pet(petsname, pettype));
                        System.out.println("Do they have more pets?\npress:\n1. for Yes.\n2. for No.");
                        run = sc.nextInt(); clean();
                    }while(run == 1);
                    member = new Person(name, age, animals, petsnum);
                    family.add(member); 
                } else{
      
                    member = new Person(name, age, petsnum);
                    family.add(member); 
                }
            System.out.println("Do you have another family member?\npress:\n1. for Yes.\n2. for No.");
            outherperson = sc.nextInt();clean();
            
        }while(outherperson == 1);
        
        for(Person individual : family){
            System.out.println(individual.toString());
        }

    }
    
}

