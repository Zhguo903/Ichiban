package entity;

/**
 * A simple implementation of the User interface.
 */
public class CommonUser implements User {

    private final String name;
    private final String password;
    private final float height;
    private final float weight;
    private final String gender;
    private final int age;

    public CommonUser(String name, String password, float height,
                      float weight, String gender, int age) {
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
    public float getHeight() {return height;}

    @Override
    public float getWeight() {return weight;}

    @Override
    public String getGender() {return gender;}

    @Override
    public int getAge() {return age;}
}
