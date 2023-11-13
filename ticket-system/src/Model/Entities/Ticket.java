package Model.Entities;

public class Ticket {
    private String Title;
    private Double Price;
    private String Session;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public String getSession() {
        return Session;
    }

    public void setSession(String session) {
        Session = session;
    }

    public Ticket() {
    }

    public Ticket(String title, Double price, String session) {
        Title = title;
        Price = price;
        Session = session;
    }



}
