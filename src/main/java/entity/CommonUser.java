package entity;

/**
 * A simple implementation of the User interface.
 */
public class CommonUser implements User {

    private final String name;
    private final String password;
    private final String height;
    private final String weight;
    private final String gender;
    private final String age;

    public CommonUser(String name, String password, String height,
                      String weight, String gender, String age) {
        this.name = name;
        this.password = password;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public float getHeight() {return Float.parseFloat(height);}

    @Override
    public float getWeight() {return Float.parseFloat(weight);}

    @Override
    public String getGender() {return gender;}

    @Override
    public int getAge() {return Integer.parseInt(age);}
}
