package arc.oop.model.Bill.interfaces;

import arc.oop.model.chamber.interfaces.IChamber;

/**
 * Created by initium on 10.03.17.
 */
public interface IBill {
    int getSum();
    String getInfo();
    IChamber getChamber();
}
