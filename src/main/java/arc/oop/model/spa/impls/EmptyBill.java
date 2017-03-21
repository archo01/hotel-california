package arc.oop.model.spa.impls;

import arc.oop.model.spa.interfaces.ISpa;

/**
 * Created by initium on 10.03.17.
 */
public class EmptyBill implements ISpa {
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EmptyBill() {

    }

    public EmptyBill(int id) {

        this.id = id;
    }

    public int getBill() {
        return 0;
    }

    public String getInfo() {
        return "No resault";
    }
}
