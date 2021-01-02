package assignment1;
import java.util.Objects;
import java.util.Random;

/**
 * Simple class for a student of assignment 1
 * @author maria ramlochan
 */
public class Student {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Address addr = new Address("barclay", 4341, "montreal", "H3S1K9");
       Student stu1 = new Student("Maria", "Ramlochan", 20);
       System.out.println(stu1.toString());
    }

    //Data members
    private String fName;
    private String lName;
    private int age;
    Address addr = new Address();
    private String email;
    
    /**
     * Default constructor 
     */
    public Student() {
        this.fName = "";
        this.lName = "";
        this.age = 0;
        this.email = "";
    }
    
    /**
     * Constructor with only first name and last name
     * @param fName the first name of a student
     * @param lName the last name of a student
     */
    public Student(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }
    
    /**
     * Constructor with only first name, last name, age and address
     * @param fName the first name of a student
     * @param lName the last name of a student
     * @param age the age of student
     */
    public Student(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }
    
    /**
     * Constructor with first name, last name, age, address and email
     * @param fName the first name of a student
     * @param lName the last name of a student
     * @param age the age of student
     * @param addr the address of a student
     * @param email the email of a student
     */
    public Student(String fName, String lName, int age, String addr, String email) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.email = email;
    }
    
    /**
     * Method to generate an email address
     */
    public String generateEmail() {
        Random random = new Random();
        int ranDigits = random.nextInt(9999);
        String newFName = fName.substring(0);
        email = lName + newFName + ranDigits + "@vaniercollege.qc.ca";
        
        return email;
    }
    
    /**
     * Method to verify if first name and last name are valid
     * @return true if the conditions are not false
     */
    public boolean isNameValid() {
        for (int i = 0; i < fName.length(); i++)
            if (! Character.isSpaceChar(fName.charAt(i)) || ! fName.equals("-") 
                    || ! Character.isLetter(fName.charAt(i)))
            return false; 
        
        for (int i = 0; i < lName.length(); i++)
            if (! Character.isSpaceChar(lName.charAt(i)) || ! lName.equals("-")
                    || ! Character.isLetter(lName.charAt(i)))
            return false; 
        return true;
    }
    
    /**
     * Constructor to verify if age is valid
     * @return true if the conditions are not false
     */
    public boolean isAgeValid() {
        return !(age < 0 || age > 120);
        /*if (age < 0 || age > 120)
            return false;
        return true; 
         */
    }
    
    public boolean equals(Student stu) {
        if (this == stu) {
            return true;
        }
        if (stu == null) {
            return false;
        }
        if (getClass() != stu.getClass()) {
            return false;
        }
        final Student other = (Student) stu;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.fName, other.fName)) {
            return false;
        }
        if (!Objects.equals(this.lName, other.lName)) {
            return false;
        }
        if (!Objects.equals(this.addr, other.addr)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return String.format ("Name: %s %s\nAge: %s\nAddress: %s\nEmail: %s", fName,
                lName, age, addr, email);
    }
    
    //Getters
    public String getFName() {
        return fName;
    }

    public String getLName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
    
    //Setters
    public void setFName(String fName) {
        if (isNameValid() == true)
            this.fName = fName;
    }

    public void setLName(String lName) {
        if (isNameValid() == true)
            this.lName = lName;
    }

    public void setAge(int age) {
        if (isAgeValid() == true)
            this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}