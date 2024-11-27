package use_case.change_weight;

/**
 * Output Data for the Change Weight Use Case.
 */
public class ChangeWeightOutputData {

    private final String username;

    private final boolean useCaseFailed;

    public ChangeWeightOutputData(String username, boolean useCaseFailed) {
        this.username = username;
        this.useCaseFailed = useCaseFailed;
    }

    public String getUsername() {
        return username;
    }

    public boolean isUseCaseFailed() {
        return useCaseFailed;
    }
}
