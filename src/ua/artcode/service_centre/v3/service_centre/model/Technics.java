package ua.artcode.service_centre.v3.service_centre.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by tokar on 06.05.2015.
 */
public class Technics implements Serializable  {
    private String condition;
    private Date datePurchase;
    private double price;
    private int identificationCode;
    private Date date;



    public Technics(String condition, Date datePurchase, double price,int identificationCode) {
        this.condition = condition;
        this.datePurchase = datePurchase;
        this.price = price;
        this.identificationCode=identificationCode;
        this.date=null;


    }

    public String getCondition() {
        return condition;
    }

    public Date getDatePurchase() {
        return datePurchase;
    }

    public double getPrice() {
        return price;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setDatePurchase(Date datePurchase) {
        this.datePurchase = datePurchase;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setIdentificationCode(int identificationCode) {
        this.identificationCode = identificationCode;
    }

    public int getIdentificationCode() {

        return identificationCode;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
   // public String toString(){
      //  return  String.format("condition : %s, datePurchase: %2$tm-%2$td-%2$tY, price: %.2f,identificationCode: %d,date: %5$tm-%5$td-%5$tY\n",
      //          condition,
       //         datePurchase,
         //       price,
           //     identificationCode,
              //  date
             //   );

   // }


    @Override
    public String toString() {
        return "Technics{" +
                "condition='" + condition + '\'' +
                ", datePurchase=" + datePurchase +
                ", price=" + price +
                ", identificationCode=" + identificationCode +
                ", date=" + date +
                '}';
    }
}
