package entity;

/**
 * The representation of a user in our program.
 */
public interface User {

    /**
     * Returns the username of the user.
     * @return the username of the user.
     */
    String getName();

    /**
     * Returns the password of the user.
     * @return the password of the user.
     */
    String getPassword();

    /**
     * Returns the height of the user.
     * @return the height of the user.
     */
    float getHeight();

    /**
     * Returns the weight of the user.
     * @return the weight of the user.
     */
    float getWeight();

    /**
     * Returns the gender of the user.
     * @return the gender of the user.
     */
    String getGender();

    /**
     * Returns the age of the user.
     * @return the age of the user.
     */
    int getAge();
}
