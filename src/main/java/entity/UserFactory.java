package entity;

/**
 * Factory for creating users.
 */
public interface UserFactory {
    /**
     * Creates a new User.
     * @param name the name of the new user
     * @param password the password of the new user
     * @param height the height of user
     * @param weight the weight of user
     * @param gender the gender of user
     * @param age the age of user
     * @return the new user
     */
    User create(String name, String password, float height, float weight, String gender, int age);

}
