package arc.oop.model.spa.impls;

import arc.oop.model.spa.interfaces.ISpa;

/**
 * Created by initium on 10.03.17.
 */
public class Pool implements ISpa {

    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pool() {
    }

    public Pool(int id) {

        this.id = id;
    }

    public int getBill() {
        return 300;
    }

    public String getInfo() {
        return "Басейн";
    }
}
