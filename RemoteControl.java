public class RemoteControl {
    private ElectricFan fan;

    public RemoteControl(ElectricFan fan) {
        this.fan = fan;
    }

    public void pressPower() {
        System.out.print("[リモコン操作] ");
        fan.powerToggle();
    }

    public void pressSpeedButton() {
        System.out.print("[リモコン操作] ");
        fan.nextSpeed();
    }
}
