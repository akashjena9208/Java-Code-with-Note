package API;

import javax.swing.plaf.synth.SynthSplitPaneUI;

//import java.util.Date;
//import java.util.*;
public class api_1
{
    public static void main(String[] args) 
    {
        java.util.Date dt=new java.util.Date(); // inside the constractor no pass
        System.out.println(dt);
        

        long timeInMs=dt.getTime();


        java.sql.Date dt1=new java.sql.Date(timeInMs); // inside constrator data pass bcz of sql package
        System.out.println(dt1);


        //java.util.ArrayList al=new java.util.ArrayList<>();
    
// All class are not good so joda 1.8 new version generit

/*.......................Date packge........................................................................... 
  javap java.util.Date
Compiled from "Date.java"
public class java.util.Date implements java.io.Serializable, java.lang.Cloneable, java.lang.Comparable<java.util.Date> {
  public java.util.Date();
  public java.util.Date(long);
  public java.util.Date(int, int, int);
  public java.util.Date(int, int, int, int, int);
  public java.util.Date(int, int, int, int, int, int);
  public java.util.Date(java.lang.String);
  public java.lang.Object clone();
  public static long UTC(int, int, int, int, int, int);
  public static long parse(java.lang.String);
  public int getYear();
  public void setYear(int);
  public int getMonth();
  public void setMonth(int);
  public int getDate();
  public void setDate(int);
  public int getDay();
  public int getHours();
  public void setHours(int);
  public int getMinutes();
  public void setMinutes(int);
  public int getSeconds();
  public void setSeconds(int);
  public long getTime();
  public void setTime(long);
  public boolean before(java.util.Date);
  public boolean after(java.util.Date);
  public boolean equals(java.lang.Object);
  static final long getMillisOf(java.util.Date);
  public int compareTo(java.util.Date);
  public int hashCode();
  public java.lang.String toString();
  public java.lang.String toLocaleString();
  public java.lang.String toGMTString();
  public int getTimezoneOffset();
  public static java.util.Date from(java.time.Instant);
  public java.time.Instant toInstant();
  public int compareTo(java.lang.Object);
  static {};
}
         */

        
        
    }
    
}
