package Q_61_84.Q75.clothing.pants;

// line n1
//import Q_61_84.Q75.clothing.Shirt;
import Q_61_84.Q75.clothing.Shirt;

import static Q_61_84.Q75.clothing.Shirt.getColor;

public class Jeans {
    public void matchShirt(){
        // line n2
        String color = Shirt.getColor();
        if(color.equals("Green")){
            System.out.print("Fit");
        }
    }

    public static void main(String[] args) {
        Jeans trouser = new Jeans();
        trouser.matchShirt();
    }
}

/*
Which two sets of actions, independently , enable the code fragment to print Fit?
we inserted the options in answer A :
        line n1: import cltohing.Shirt (since our package starts with Q75 our one has that too)
        line n2 :  String color = Shirt.getColor();

        and it printed Fit on the console
 */


