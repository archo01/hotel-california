package arc.oop.model.chamber.impls;

import arc.oop.model.chamber.interfaces.IChamber;

/**
 * Created by initium on 06.03.17.
 */
public class President implements IChamber {
    int id;

    public int getBill() {
        return 5000;
    }

    public String getInfo() {
        return "President Chamber allInClusive";
    }

    public President(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public President() {
    }

    public int getChamberId() {
        return id;
    }
}






