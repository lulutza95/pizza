public class pizza {
    private String Pizza;
    private int pret;
    private Boolean veg;
    public   void Pizza (Boolean veg){
        this.veg =veg;
        if(this.veg) {
            this.pret = 300;
        }
            else{
                this.pret = 400;
            }

    }
    public void getpizzapret(){
        System.out.println(this.pret);
    }

}
