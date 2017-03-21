package arc.oop.model.restoran.impls;

import arc.oop.model.restoran.interfaces.IRestoran;

/**
 * Created by initium on 10.03.17.
 */
public class BussinessLanch implements IRestoran{
    int id;

    public int getId() {
        return 0;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BussinessLanch(int id) {
        this.id = id;
    }

    public BussinessLanch() {
    }

    public int getBill() {
        return 300;
    }

    public String getInfo() {
        return "Биснес Ланч(с 10:00 до 16:00)";
    }
}
