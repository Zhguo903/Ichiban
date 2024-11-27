package use_case.change_weight;

/**
 * The input data for the Change Weight Use Case.
 */
public class ChangeWeightInputData {

    private final String username;
    private final String password;
    private final float height;
    private final float weight;
    private final String gender;
    private final int age;

    public ChangeWeightInputData(String username, String password, float height,
                                 float weight, String gender, int age) {
        this.username = username;
        this.password = password;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
    }

    String getUsername() {return username;}

    String getPassword() {return password;}

    float getHeight() {return height;}

    float getWeight() {
        return weight;
    }

    String getGender() {return gender;}

    int getAge() {return age;}

}
