package com.company;

import java.util.Objects;

public class ChristmassDraw {
    public static void main(String args []){
//        couplesSet is our initial array, with use of 'personCounter' and 'randomDraw' we will go individually through each person in the array (personCounter's role)
//        and match a random person for them (randomDraw's role).
        String [] couplesSet = new String[]{"x1","y1","x2","y2","x3","y3","x4","y4","x5","y5" };
        String [][] notAllowed = {
                {"x1", "y1"}, {"x1", "y4"}, {"x2", "y2"}, {"x2", "x3"}, {"x3", "y3"},
                {"x3", "y5"}, {"x4", "y3"}, {"x4", "y4"}, {"x5", "x2"}, {"x5", "y5"},
                {"y1", "x1"}, {"y1", "x5"}, {"y2", "x2"}, {"y2", "x4"}, {"y3", "y1"},
                {"y3", "x3"}, {"y4", "x4"}, {"y4", "y2"}, {"y5", "x5"}, {"y5", "x1"}};
//        personCounter is going to be our master counter through the couplesSet array.
        int personCounter = 0;
        String [] persona= {"--","--","--","--","--","--","--","--","--","--"};
        String [] theirMatch= {"--","--","--","--","--","--","--","--","--","--"};
        boolean drawFromNotAllowed = false;
        boolean personAlreadyDrawn = false;

        while (personCounter < couplesSet.length) {
            // Firstly, we DRAW a random number, which will be a second index of the couplesSet array. If the number passes all the ifs below, it's gonna serve as an index under which we pick the drawn person.
            int randomDraw = (int) (Math.random()* couplesSet.length);
//            BELOW can be uncommented to see more what's going on :)
//            System.out.println("personCounter: " + personCounter);
//            System.out.println("randomDraw: " + randomDraw);

            // Here we check if by any chance we haven't drew ourselves, if so, we hit 'continue;' which will make us repeat our drawing
            if (randomDraw == personCounter){
//                System.out.println("I drew myself, so I repeat drawing..");
                continue;
            }
//            here we go through the whole "not allowed" array. If we ever come on a "randomDraw" which is not allowed, we set "drawFromNotAllowed" to true and break from the for loop
            for (String[] aNotAllowedArray : notAllowed) {
                if ((Objects.equals(aNotAllowedArray[0], couplesSet[personCounter])
                        && Objects.equals(aNotAllowedArray[1], couplesSet[randomDraw]))) {
//                    System.out.println("I found a match from not allowed");
                    drawFromNotAllowed = true;
                    break;
                }
            }
//            if the loop up ^ has set "drawFromNotAllowed" to true, this condition statement will spot it and, and hit "continue" to repeat the whole drawing procedure.
            if (drawFromNotAllowed){
                drawFromNotAllowed = false;
                continue;
            }

//            At the end, we need to check if our "randomDraw" isn't already picked by someone before (e.g. we drew y4 for x3, but x2 had already drawn y4) if that's the case, we set personAlreadyDrawn to true
            for (int i = 0; i < theirMatch.length; i++) {
                if (Objects.equals(theirMatch[i], couplesSet[randomDraw])){
                    personAlreadyDrawn = true;
                    break;
                }
            }
//          Similarly as with "not allowed", if personAlreadyDrawn, repeat the whole procedure of drawing
            if (personAlreadyDrawn){
                personAlreadyDrawn = false;
                continue;
            }

//            At the end, if our randomDraw hasn't been caught by any of the previous if's, we allow firstly to set up a right persona, and then a corresponding match for the persona in the theirMatch array (persona and theirMatched are matched by an index, e.g. theirMatch[2] is for persona[2] )
            persona[personCounter] = couplesSet[personCounter];
            theirMatch[personCounter] = couplesSet[randomDraw];
            System.out.println(persona[personCounter] + " buys the present for: " + theirMatch[personCounter]);
            personCounter++;
        }
    }
}
