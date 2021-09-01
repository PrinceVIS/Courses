import java.util.ArrayList;

public class Model {
    private ArrayList<String> arrayValues = new ArrayList<>();

    public Model() {
    }

    public void setValue(int index, String value){
        arrayValues.set(index, value);
    }

    public String getValue(int index){
        return arrayValues.get(index);
    }

    public void addValue(String value){
        arrayValues.add(value);
    }

    public int getSize(){
        return arrayValues.size();
    }

    public String validateValue(String correctValue){
        switch (correctValue){
            case View.HELLO:
                return View.WRONG_HELLO_INPUT;
            case View.WORLD:
                return View.WRONG_WORLD_INPUT;
            default:
                return View.WRONG_INPUT;
        }
    }
}
