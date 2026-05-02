class Time {
    int h,m,s;
    Time(int h,int m,int s){
        this.h=h;
        this.m=m;
        this.s=s;
    }
    void add(Time t){
        int sec=s+t.s;
        int min=m+t.m+sec/60;
        int hr=h+t.h+min/60;
        sec%=60;
        min%=60;
        System.out.println(hr+":"+min+":"+sec);
    }
}
public class Main {
    public static void main(String[] args) {
        new Time(1,20,30).add(new Time(2,40,50));
    }
}
