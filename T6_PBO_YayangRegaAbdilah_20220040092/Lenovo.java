


public class Lenovo implements Laptop {
    private int volume;
    boolean is_power_on;
    private boolean is_powe_on;
    
    public Lenovo (){
        this.volume = 50;
    }
    
    @Override
    public void powerOn() {
        is_powe_on = true;
        System.out.println("Laptop is on");
        System.out.println("Lenovo ThinkPad");
    }
    
    @Override
    public void powerOff() {
        is_powe_on = false;
        System.out.println("Shutdown is process....");
   
    }
    
    @Override
    public void volumeUp() {
        if (is_power_on){
            if (this.volume==MAX_VOL){
                System.out.println("Volume is full");
            }
            else{
                this.volume += 10;
                System.out.println("Volume is :" + this.getVolume());
            }
        }else{
            System.out.println("Laptop mati");
        }
    }
    
    @Override
    public void volumeDown() {
        if (is_power_on){
            if (this.volume==MIN_VOL){
                System.out.println("Volume is 0%");
            }
            else{
                this.volume -= 10;
                System.out.println("Volume is :" + this.getVolume());
            }
        }else{
            System.out.println("Laptop mati");
        }
    }
    
    public int getVolume(){
        return this.volume;
    }    
}
