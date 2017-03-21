package arc.oop.model.Bill.impls;

import arc.oop.model.Bill.interfaces.IBill;
import arc.oop.model.chamber.interfaces.IChamber;
import arc.oop.model.restoran.interfaces.IRestoran;
import arc.oop.model.spa.interfaces.ISpa;

/**
 * Created by initium on 10.03.17.
 */

public class Bill implements IBill{
    IChamber chamber;
    IRestoran restoran;
    ISpa spa;

    public Bill(IChamber chamber, IRestoran restoran, ISpa spa) {
        this.chamber = chamber;
        this.restoran = restoran;
        this.spa = spa;
    }

    public IChamber getChamber() {
        return chamber;
    }

    public void setChamber(IChamber chamber) {
        this.chamber = chamber;
    }

    public IRestoran getRestoran() {
        return restoran;
    }

    public void setRestoran(IRestoran restoran) {
        this.restoran = restoran;
    }

    public ISpa getSpa() {
        return spa;
    }

    public void setSpa(ISpa spa) {
        this.spa = spa;
    }




    public int getSum() {
        return chamber.getBill() + restoran.getBill() + spa.getBill();
    }

    public String getInfo() {
        return this.chamber.getInfo() + "//" + this.restoran.getInfo()+ " //" + this.spa.getInfo();
    }
}
