package arc.oop.model.BillsManager.interfaces;

import arc.oop.model.Bill.impls.Bill;
import arc.oop.model.Bill.interfaces.IBill;
import arc.oop.model.chamber.interfaces.IChamber;

import java.util.ArrayList;

/**
 * Created by initium on 13.03.17.
 */
public interface IBillManager {
   String getInfo();
   void addBill(IBill bill);
   void deleteBill(IBill bill);
   ArrayList<IBill> getBillsList();
   void showInfo();

//
   int getTotalSum();
   int getMaxIncome();
   int getMinIncome();
   ArrayList<IChamber> getChamberWithJacusi();
   ArrayList<IChamber> getBrokenFridge();
   ArrayList<IChamber> getUnOccupied();

}
