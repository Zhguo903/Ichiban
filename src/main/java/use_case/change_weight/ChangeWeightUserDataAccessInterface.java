package use_case.change_weight;

import entity.User;

/**
 * The interface of the DAO for the Change Weight Use Case.
 */
public interface ChangeWeightUserDataAccessInterface {

    /**
     * Updates the system to record this user's weight.
     * @param user the user whose weight is to be updated
     */
    void changeWeight(User user);
}
