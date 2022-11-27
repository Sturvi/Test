import java.util.ArrayList;

public class Player extends Human {
    Backpack backpack = new Backpack();

    public Player(String name) {
        super(name);
    }


    void take (String item){
        backpack.backpackList.add(item);
    }



    class Backpack {
        ArrayList<String> backpackList = new ArrayList<String>();

        public String toString() {
            String backPackString = "";
            for (String i :
                    backpackList) {
                backPackString += backPackString.equals("") ?  i : "," + i;
            }
            return backpackList.size() == 0 ? "the backpack is empty" : backPackString + " in the backpack";
        }



    }
}

