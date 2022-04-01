public class MainClass {
    Payment pay;

    public void setPay(Payment pay) {
        this.pay = pay;
    }
    public void payAmount()
    {
        pay.payFees();
    }

    public static void main(String[] args) {
        MainClass mc=new MainClass();
        Payment pay=new CollegeFees();
        mc.setPay(pay);
        mc.payAmount();
    }
}
