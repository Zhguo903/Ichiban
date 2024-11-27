package use_case.change_weight;

import entity.User;
import entity.UserFactory;

/**
 * The Change Weight Interactor.
 */
public class ChangeWeightInteractor implements ChangeWeightInputBoundary {
    private final ChangeWeightUserDataAccessInterface userDataAccessObject;
    private final ChangeWeightOutputBoundary userPresenter;
    private final UserFactory userFactory;

    public ChangeWeightInteractor(ChangeWeightUserDataAccessInterface changeHeightDataAccessInterface,
                                  ChangeWeightOutputBoundary changeHeightOutputBoundary,
                                  UserFactory userFactory) {
        this.userDataAccessObject = changeHeightDataAccessInterface;
        this.userPresenter = changeHeightOutputBoundary;
        this.userFactory = userFactory;
    }

    @Override
    public void execute(ChangeWeightInputData changeWeightInputData) {
        final User user = userFactory.create(changeWeightInputData.getUsername(),
                changeWeightInputData.getPassword(), changeWeightInputData.getHeight(),
                changeWeightInputData.getWeight(), changeWeightInputData.getGender(),
                changeWeightInputData.getAge());
        userDataAccessObject.changeWeight(user);

        final ChangeWeightOutputData changeWeightOutputData = new ChangeWeightOutputData(user.getName(),
                                                                                  false);
        userPresenter.prepareSuccessView(changeWeightOutputData);
    }
}
