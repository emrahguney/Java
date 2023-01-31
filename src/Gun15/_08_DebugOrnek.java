package Gun15;

public class _08_DebugOrnek {
    public static void main(String[] args) {
        int x,y;
        //F8 adim adim ilerler, F9 ise breakpointten breakpoint e ilerler   //F9 soyle calisir koydugun 1 den fazla kirmizi nokta varsa direk o kirmizi noktaya atlar
        //ornegin 5 12 16 19 da kirmizi noktalar var F9 ile debug bakacaksan sadece 5 12 16 ve 19 a bakar

        x=10;
        y=x;

        x+=2;
        y--;

        y*=2;

        y=5;
    }
}
