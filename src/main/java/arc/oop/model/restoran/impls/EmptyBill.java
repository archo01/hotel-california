package arc.oop.model.restoran.impls;

import arc.oop.model.restoran.interfaces.IRestoran;

/**
 * Created by initium on 10.03.17.
 */
public class EmptyBill implements IRestoran {
    int id;

    public EmptyBill(int id) {
        this.id = id;
    }

    public EmptyBill() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getBill() {
        return 0;
    }

    public String getInfo() {
        return "No Services";
    }
}
