package interface_adapter.change_weight;

import use_case.change_weight.ChangeWeightInputBoundary;
import use_case.change_weight.ChangeWeightInputData;

/**
 * Controller for the Change Weight Use Case.
 */
public class ChangeWeightController {
    private final ChangeWeightInputBoundary userChangeWeightUseCaseInteractor;

    public ChangeWeightController(ChangeWeightInputBoundary userChangeWeightUseCaseInteractor) {
        this.userChangeWeightUseCaseInteractor = userChangeWeightUseCaseInteractor;
    }

    /**
     * Executes the Change Weight Use Case.
     * @param weight the new weight
     * @param username the user whose weight to change
     */
    public void execute(String password, String username, float height, float weight,
                        String gender, int age) {
        final ChangeWeightInputData changeWeightInputData = new ChangeWeightInputData(username, password,
                height, weight, gender, age);

        userChangeWeightUseCaseInteractor.execute(changeWeightInputData);
    }
}
