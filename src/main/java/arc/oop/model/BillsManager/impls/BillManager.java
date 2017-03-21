package arc.oop.model.BillsManager.impls;

import arc.oop.model.Bill.impls.Bill;
import arc.oop.model.Bill.interfaces.IBill;
import arc.oop.model.BillsManager.interfaces.IBillManager;
import arc.oop.model.chamber.interfaces.IChamber;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by initium on 13.03.17.
 */
public class BillManager implements IBillManager {
    ArrayList<IBill> billsList = new ArrayList<IBill>();

    public ArrayList<IBill> getBillsList() {
        return billsList;
    }

    public void showInfo() {
        for (IBill item : billsList) {
            System.out.println(item.getInfo());
        }
    }

    public int getTotalSum() {
        return 0;
    }

    public int getMaxIncome() {
        return 0;
    }

    public int getMinIncome() {
        return 0;
    }

    public ArrayList<IChamber> getChamberWithJacusi() {
        return null;
    }

    public ArrayList<IChamber> getBrokenFridge() {
        return null;
    }

    public ArrayList<IChamber> getUnOccupied() {
        return null;
    }

    public void setBillsList(ArrayList<IBill> billsList) {
        this.billsList = billsList;
    }

    public void addBill(IBill bill) {
        this.billsList.add(bill);

    }

    public void deleteBill(IBill bill) {
        this.billsList.remove(bill);
    }


    public String getInfo() {

        String information = "";

        for (int i = 0; i < billsList.size(); i++ ){
            information += this.billsList.get(i).getInfo() + "{}{}{}";
        }

        return information;
    }

}
