public class ElectricFan {
    private boolean powerOn = false;
    private int currentSpeed = FanSettings.OFF;
    private Motor motor = new Motor();

    public void powerToggle() {
        powerOn = !powerOn;
        currentSpeed = powerOn ? FanSettings.LOW : FanSettings.OFF;
        System.out.println("電源: " + (powerOn ? "ON" : "OFF"));
        motor.rotate(currentSpeed);
    }

    public void nextSpeed() {
        if (!powerOn) return;
        currentSpeed = (currentSpeed % 3) + 1;
        System.out.println("風量を切り替えました。");
        motor.rotate(currentSpeed);
    }
}
