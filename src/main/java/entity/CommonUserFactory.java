package entity;

/**
 * Factory for creating CommonUser objects.
 */
public class CommonUserFactory implements UserFactory {

    @Override
    public User create(String name, String password, String height,
                       String weight, String gender, String age) {
        return new CommonUser(name, password, height, weight, gender, age);
    }
}
