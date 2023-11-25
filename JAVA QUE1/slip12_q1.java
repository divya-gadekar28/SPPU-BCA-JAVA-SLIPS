//Create a package named “Series” having a class to print series of Square of numbers. Write a
//program to generate “n” terms series.

package Series;
public class slip12_q1 {
    public static void squareSeries(int n) {
        for(int i=1;i<=n;i++){
            System.out.println(i*i+"\t");
        }
    }
}


//compile: javac -d . slip12_q1.java