package interface_adapter.signup;

import use_case.signup.SignupInputBoundary;
import use_case.signup.SignupInputData;

/**
 * Controller for the Signup Use Case.
 */
public class SignupController {

    private final SignupInputBoundary userSignupUseCaseInteractor;

    public SignupController(SignupInputBoundary userSignupUseCaseInteractor) {
        this.userSignupUseCaseInteractor = userSignupUseCaseInteractor;
    }

    /**
     * Executes the Signup Use Case.
     * @param username the username to sign up
     * @param password1 the password
     * @param password2 the password repeated
     * @param height the height of user
     * @param weight the weight of user
     * @param gender the gender of user
     * @param age the age of user
     */
    public void execute(String username, String password1, String password2,
                        float height, float weight, String gender, int age) {
        final SignupInputData signupInputData = new SignupInputData(
                username, password1, password2, height,weight, gender, age);

        userSignupUseCaseInteractor.execute(signupInputData);
    }

    /**
     * Executes the "switch to LoginView" Use Case.
     */
    public void switchToLoginView() {
        userSignupUseCaseInteractor.switchToLoginView();
    }
}
