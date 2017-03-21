package arc.oop.model.chamber.impls;

import arc.oop.model.chamber.interfaces.IChamber;

/**
 * Created by initium on 06.03.17.
 */
public class Budjet implements IChamber {
    int id;

    public Budjet(int id) {
        this.id = id;
    }

    public Budjet() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBill() {
        return 100;
    }

    public String getInfo() {
        return "price" + this.getBill() + "///Super ECONOM" + "//Nomer" + getId();
    }
}
