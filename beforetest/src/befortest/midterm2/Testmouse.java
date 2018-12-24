
package befortest.midterm2;

public class Testmouse {

    public static void main(String[] args) {
        Mouses mouses[] = new Mouses[3];

        mouses[0] = new WireMouse("Green", 1.5, "USB C");
        mouses[1] = new WrilessMouse("Yellow", 2.4);
        mouses[2] = new WrilessMouse("blue", 5);

        for (Mouses mouse : mouses) {
            System.out.println(mouse);
        }
        mouses[0].leftClick();
        mouses[1].rightClick();
        mouses[0].scoll(-5);
        mouses[0].scoll(2);
    }
}
