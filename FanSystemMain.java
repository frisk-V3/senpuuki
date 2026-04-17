public class FanSystemMain {
    public static void main(String[] args) {
        // 扇風機を設置
        ElectricFan livingRoomFan = new ElectricFan();
        // リモコンをペアリング
        RemoteControl myRemote = new RemoteControl(livingRoomFan);

        // 動かしてみる
        myRemote.pressPower();       // ON (弱)
        myRemote.pressSpeedButton(); // 中
        myRemote.pressSpeedButton(); // 強
        myRemote.pressPower();       // OFF
    }
}
