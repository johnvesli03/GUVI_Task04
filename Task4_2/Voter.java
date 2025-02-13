package Task4_2;

public class Voter {
    private String voterId;
    private String name;
    private int age;

    public Voter(String voterId, String name , int age) throws InvalidAge_For_VoterException {
        if(age <18) {
            throw new InvalidAge_For_VoterException("invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Voter ID: " + voterId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

