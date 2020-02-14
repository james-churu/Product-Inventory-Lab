package Models;

public class Candy{
    double price;
    String name;
    int ID;
    boolean hardCandy;
    int QTY;

    public Candy(double priceIn,String nameIn, int IDin,boolean hardCandyIn,int qtyIn){
        price = priceIn;
        name = nameIn;
        ID = IDin;
        boolean hardCandy = hardCandyIn;
        QTY = qtyIn;
    }
    public Candy(){

    }
    //////////////////////////////////////// Get & Set Name Methods
    public void setName(String nameIn){
        this.name = nameIn;
    }
    public String getName(){
        return this.name;
    }
    //////////////////////////////////////
    public double getPrice(){
        return this.price;
    }
    public int getID(){
        return this.ID;
    }
    public boolean getHardCandy(){
        return this.hardCandy;
    }
    public int getQTY(){
        return this.QTY;
    }




    public static void main(String[] args){

    }
}
