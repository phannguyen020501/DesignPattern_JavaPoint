package StructuralPattern.Facade.ex1;

public class ShopFacade {
    private static final ShopFacade INSTACE = new ShopFacade();

    private AccountService accountService;
    private PaymentService paymentService;
    private ShippingService shippingService;
    private EmailService emailService;
    private SmsService smsService;

    public ShopFacade() {
        this.accountService = new AccountService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
        this.emailService = new EmailService();
        this.smsService = new SmsService();
    }


    public static ShopFacade getInstance(){
        return INSTACE;
    }

    public void byProductByCashWithFreeShipping(String email){
        accountService.getAccount(email);
        paymentService.paymentByCash();
        shippingService.freeShipping();
        emailService.sendEmail(email);
        System.out.println("Done\n");
    }

    public void buyProductByPaypalWithStandardShipping(String email,String mobilephone){
        accountService.getAccount(email);
        paymentService.paymentByPaypal();
        shippingService.standardShipping();
        emailService.sendEmail(email);
        smsService.sendSMS(mobilephone);
        System.out.println("Done\n");
    }
}
