public class Motor {
    public void rotate(int speed) {
        if (speed > 0) {
            System.out.println("モーターが速度 " + speed + " で回転しています。ブォーン...");
        } else {
            System.out.println("モーターが停止しました。");
        }
    }
}
