package arc.oop.model.restoran.impls;

import arc.oop.model.restoran.interfaces.IRestoran;

/**
 * Created by initium on 10.03.17.
 */
public class Breakfast implements IRestoran {
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Breakfast(int id) {
        this.id = id;
    }

    public Breakfast() {

    }

    public int getBill() {
        return 100;
    }

    public String getInfo() {
        return "Яичница с беконом";
    }
}
