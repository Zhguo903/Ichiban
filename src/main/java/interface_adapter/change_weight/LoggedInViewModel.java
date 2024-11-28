package interface_adapter.change_weight;

import interface_adapter.ViewModel;
import interface_adapter.change_weight.LoggedInState;

/**
 * The View Model for the Logged In View.
 */
public class LoggedInViewModel extends ViewModel<interface_adapter.change_weight.LoggedInState> {

    public LoggedInViewModel() {
        super("logged in");
        setState(new LoggedInState());
    }

}
