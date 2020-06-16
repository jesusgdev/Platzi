class Paypal extends Payment {

    Integer id;
    String email;
    
    public Paypal(Integer id, String email) {
        super(id);
        this.email = email;

    }
}