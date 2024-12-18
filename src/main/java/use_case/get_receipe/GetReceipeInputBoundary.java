package use_case.get_receipe;

import use_case.get_receipe.GetReceipeInputData;

/**
 * The Get Receipe Use Case.
 */
public interface GetReceipeInputBoundary {

    /**
     * Execute the Get Receipe Use Case.
     * @param getReceipeInputData the input data for this use case
     */
    void execute(GetReceipeInputData getReceipeInputData);

}
