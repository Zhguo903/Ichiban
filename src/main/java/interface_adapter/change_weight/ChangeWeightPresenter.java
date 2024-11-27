package interface_adapter.change_weight;

import interface_adapter.change_password.LoggedInViewModel;
import use_case.change_password.ChangePasswordOutputData;
import use_case.change_weight.ChangeWeightOutputBoundary;
import use_case.change_weight.ChangeWeightOutputData;

/**
 * The Presenter for the Change Weight Use Case.
 */
public class ChangeWeightPresenter implements ChangeWeightOutputBoundary {

    private final interface_adapter.change_weight.LoggedInViewModel loggedInViewModel;

    public ChangeWeightPresenter(LoggedInViewModel loggedInViewModel) {
        this.loggedInViewModel = loggedInViewModel;
    }

    @Override
    public void prepareSuccessView(ChangeWeightOutputData outputData) {
        // currently there isn't anything to change based on the output data,
        // since the output data only contains the username, which remains the same.
        // We still fire the property changed event, but just to let the view know that
        // it can alert the user that their password was changed successfully..
        loggedInViewModel.firePropertyChanged("password");

    }

    @Override
    public void prepareFailView(String error) {
        // note: this use case currently can't fail
    }
}
