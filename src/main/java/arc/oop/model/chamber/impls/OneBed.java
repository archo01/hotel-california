package arc.oop.model.chamber.impls;

import arc.oop.model.chamber.interfaces.IChamber;

/**
 * Created by initium on 06.03.17.
 */
public class OneBed implements IChamber {
    int id;
    boolean fridge;
    boolean bar;
    boolean conditioner;
    boolean jacusi;

    public OneBed(int id, boolean fridge, boolean bar, boolean conditioner, boolean jacusi) {
        this.id = id;
        this.fridge = fridge;
        this.bar = bar;
        this.conditioner = conditioner;
        this.jacusi = jacusi;
    }

    public OneBed() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFridge() {
        return fridge;
    }

    public void setFridge(boolean fridge) {
        this.fridge = fridge;
    }

    public boolean isBar() {
        return bar;
    }

    public void setBar(boolean bar) {
        this.bar = bar;
    }

    public boolean isConditioner() {
        return conditioner;
    }

    public void setConditioner(boolean conditioner) {
        this.conditioner = conditioner;
    }

    public boolean isJacusi() {
        return jacusi;
    }

    public void setJacusi(boolean jacusi) {
        this.jacusi = jacusi;
    }

    public int getBill() {
        int sum = 200;

        if (isFridge()){
            sum += 100;
        }

        if (isBar()){
            sum += 250;
        }

        if (isConditioner()) {
            sum += 50;
        }

        if (isJacusi()) {
            sum += 350;
        }
        return sum;
    }

    public String getInfo() {
        String result = "Chabmer :" + getId();
        if (isFridge()){
            result += "//Fridge";
        }

        if (isBar()){
            result += "//Bar";
        }

        if (isConditioner()) {
            result += "//Conditioner";
        }

        if (isJacusi()) {
            result += "//Jacusi";
        }

        return result + "//price//" +this.getBill();
    }


}
