package use_case.get_receipe;

/**
 * The input data for the Get Receipe Use Case.
 */
public class GetReceipeInputData {

    private final float height;
    private final float weight;
    private final String gender;
    private final int age;

    public GetReceipeInputData(float height, float weight, String gender, int age) {
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
    }

    public double getBMR(){
        if (gender.equals("Male")){
            return (88.362 + (13.397 * this.weight) + (4.799 * this.height) - (5.677 * this.age));
        }
        else{
            return (447.593 + (9.247 * this.weight) + (3.098 * this.height) - (4.33 * this.age));
        }
    }
}
