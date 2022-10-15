package student;

public class Student {
    private String name;
    private String surname;
    private int  birth;
    private String email;


    public int getBirth() {
        if (2022 - getBirth() > 0) {
            return birth;
        } else {

            return getBirth();
        }
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Student(String surname, int birth, String email, String name) {
        this.surname = surname;
        this.name=name;
        this.birth=birth;
        this.email=email;



    }
    }

