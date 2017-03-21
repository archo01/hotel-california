package arc.oop.model.spa.impls;

import arc.oop.model.spa.interfaces.ISpa;

/**
 * Created by initium on 10.03.17.
 */
public class Sauna implements ISpa {

    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sauna(int id) {
        this.id = id;
    }

    public Sauna() {

    }

    public int getBill() {
        return 350;
    }

    public String getInfo() {
        return "Русская Баня";
    }
}
