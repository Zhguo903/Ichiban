package use_case.change_password;

/**
 * The input data for the Change Password Use Case.
 */
public class ChangePasswordInputData {

    private final String password;
    private final String username;
    private final float height;
    private final float weight;
    private final String gender;
    private final int age;

    public ChangePasswordInputData(String username, String password, float height, float weight,
                                   String gender, int age) {
        this.password = password;
        this.username = username;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
    }

    String getPassword() {
        return password;
    }

    String getUsername() {
        return username;
    }

    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
