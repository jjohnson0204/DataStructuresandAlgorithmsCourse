package Stacks;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {

        /* stack = LIFO data structure
                stores objects into a sort of "vertical tower"
                push() to add to the top
                pop() to remove from the top
         */

        Stack<String> stack=new Stack<String>();

        stack.push("Genshin Impact");
        stack.push("Fortnite");
        stack.push("Apex");
        stack.push("Smite");
        stack.push("Destiny 2");
        stack.push("Paladins");
        stack.push("Final Fantasy XV");

        String myFavGame = stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.search("Genshin Impact"));
        System.out.println(stack);
        System.out.println(myFavGame);

        /*
            *************************output****************************
            Paladins
            6
            [Genshin Impact, Forntie, Apex, Smite, Destiny 2, Paladins]
            Final Fantasy XV

            Process finished with exit code 0
            ***********************************************************
         */





    }
}
