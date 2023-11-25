// Write a program create class as MyDate with dd,mm,yy as data members. Write parameterized constructor. 
//Display the date in dd-mm-yy format. (Use this keyword)

import java.util.*;
import java.io.*;

class date{
    int dd,mm,yy;
        date(int dd,int mm,int yy){
        this.dd=dd;
        this.mm=mm;
        this.yy=yy;
    }
    void display(){
        System.out.println(dd+"-"+mm+"-"+yy);
    }
}

public class slip11_q1 {
    public static void main(String[] args) {
        date d=new date(12, 06, 2023);
        d.display();
    }
}
