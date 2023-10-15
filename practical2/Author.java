package practical2;

public class Author {
    private String name;

    private String email;

    private char gender;

    public Author(String name, String email, char gender){

        this.name = name;

        this.email = email;

        this.gender = gender;

    }

    public String getName(){return name;}

    public String getEmail(){return email;}

    public char getGender(){return gender;}

    public void setEmail(String email){this.email = email;}

    @Override

    public String toString(){

        return "Author{" +

                "name='" + name + '\'' +

                ", email='" + email + '\'' +

                ", gender=" + gender +

                '}';

    }
}

class TestAuthor {
    public static void main(String[] args){

        Author Tanya = new Author("Tanya", "tanymv2004@gmail.com", 'g');

        System.out.println(Tanya.getName());

        System.out.println(Tanya.getEmail());

        Tanya.setEmail("t_m@gmail.com");

        System.out.println(Tanya.getGender());

        Tanya.setEmail("ttaaa@gmail.com");

        System.out.println(Tanya.toString());

    }

}