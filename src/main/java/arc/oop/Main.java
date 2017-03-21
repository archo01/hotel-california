package arc.oop;

import arc.oop.model.Bill.impls.Bill;
import arc.oop.model.Bill.interfaces.IBill;
import arc.oop.model.BillsManager.impls.BillManager;
import arc.oop.model.BillsManager.interfaces.IBillManager;
import arc.oop.model.chamber.impls.Budjet;
import arc.oop.model.chamber.impls.OneBed;
import arc.oop.model.chamber.impls.President;
import arc.oop.model.chamber.interfaces.IChamber;
import arc.oop.model.restoran.impls.Breakfast;
import arc.oop.model.restoran.impls.BussinessLanch;
import arc.oop.model.restoran.interfaces.IRestoran;
import arc.oop.model.spa.impls.EmptyBill;
import arc.oop.model.spa.impls.Pool;
import arc.oop.model.spa.impls.Sauna;
import arc.oop.model.spa.interfaces.ISpa;
import org.omg.CORBA.portable.ApplicationException;

import javax.swing.*;

/**
 * Created by initium on 06.03.17.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        OneBed simpleChamber = new OneBed(1,true,false,
                true,true);
        System.out.println(simpleChamber.getInfo());
        Budjet simpleBudjetniy = new Budjet();
        simpleBudjetniy.setId(15);

        System.out.println(simpleBudjetniy.getInfo());
        IChamber chamber12 = new OneBed(12, true, false,true, true);
        IRestoran restoran12 = new BussinessLanch(01);
        ISpa spa12 = new EmptyBill(01);
        IBill bill12 = new Bill(chamber12,restoran12,spa12);
        System.out.println("---");
        System.out.println(chamber12.getBill());
        System.out.println(restoran12.getBill());
        System.out.println(spa12.getBill());
        System.out.println(bill12.getChamber().getId());
        System.out.println(bill12.getSum());
        System.out.println("---------------------");



        IChamber chamber01 = new President(101);
        IChamber chamber02 = new President(102);
        IChamber chamber03 = new President(103);
        IChamber chamber04 = new President(104);
        IChamber chamber05 = new Budjet(11);
        IChamber chamber06 = new Budjet(12);
        IChamber chamber07 = new Budjet(13);
        IChamber chamber08 = new Budjet(14);
        IChamber chamber09 = new OneBed(1001,false,false,true,true);
        IChamber chamber10 = new OneBed(1002,false,true,true,true);


        IRestoran lanch01 = new BussinessLanch(1);
        IRestoran lanch02 = new BussinessLanch(2);
        IRestoran lanch03 = new BussinessLanch(3);
        IRestoran lanch04 = new BussinessLanch(4);
        IRestoran lanch05 = new arc.oop.model.restoran.impls.EmptyBill(5);
        IRestoran lanch06 = new arc.oop.model.restoran.impls.EmptyBill(6);
        IRestoran lanch07 = new Breakfast(7);
        IRestoran lanch08 = new Breakfast(8);
        IRestoran lanch09 = new Breakfast(9);
        IRestoran lanch10 = new Breakfast(10);


        ISpa spa01 = new Sauna(1);
        ISpa spa02 = new Pool(2);
        ISpa spa03 = new EmptyBill(3);


        IBill bill01 = new Bill(chamber01,lanch01,spa01);
        IBill bill02 = new Bill(chamber02,lanch02,spa01);
        IBill bill03 = new Bill(chamber03,lanch03,spa02);
        IBill bill04 = new Bill(chamber04,lanch04,spa03);
        IBill bill05 = new Bill(chamber05,lanch05,spa02);
        IBill bill06 = new Bill(chamber06,lanch06,spa01);
        IBill bill07 = new Bill(chamber07,lanch07,spa02);
        IBill bill08 = new Bill(chamber08,lanch08,spa01);
        IBill bill09 = new Bill(chamber09,lanch09,spa02);
        IBill bill10 = new Bill(chamber10,lanch10,spa03);


        IBillManager billManager = new BillManager();
        billManager.addBill(bill01);
        billManager.addBill(bill02);
        billManager.addBill(bill03);
        billManager.addBill(bill04);
        billManager.addBill(bill05);
        billManager.addBill(bill06);
//        billManager.deleteBill(bill01);




        System.out.println("-----------    -----    ----------------");


        System.out.println(bill10.getSum());
        System.out.println(billManager.getBillsList());

        System.out.println("-----------    -----    ----------------");


        System.out.println(bill02.getInfo());
        System.out.println(billManager.getInfo());
        System.out.println("____________________________");
        billManager.showInfo();







    }
        }
