/*******************************************
/** Author:  Dr. Cathy Bareiss
/*  Course:  CSC 122, Fall 2022
/*  Lab:     Lab 1: Finite State Machine
/*  Created: August 2022
/*  Class:   FSM -> simulates a finite state machine
/*  Related classes:  Transitions, Transition
*******************************************/

// When making changes, be sure to use any constants specified when
// appropriate
import java.io.*;
import java.util.*;

public class FSM {
    // Field variables
    public static final int ACCEPT=0;
    public static final int REJECT=-1;
    private String alphabet;
    private int numStates;
    private int initState;
    private Transitions trans;
    private int[] finalStates;
    private int numFinal;
    
    // Constructor
    
    // create the machine with all the sent items
    public FSM(String inAlph, int inNum, int inStart, Transitions inTrans,
               int[] inFinSt) {

    }
    
    // this constructor will create a FSM with the data in the opened file
    public FSM(Scanner datafile) {
        load(datafile);
    }
    
    // this constructor will craete a FSM with the data in the file of the
    // passed filename
    public FSM(String filename) throws IOException {
        Scanner data;
        
        data = new Scanner(new FileReader(filename));
        load(data);
    }
    
    // This is a private method used to load the data file a file into the
    // machine.  You should definitely review it and understand it.  You
    // do not need to change it.
    private void load(Scanner datafile) {
        int olds, news, finals;
        char ch;
        int i;
        alphabet = datafile.nextLine();
        numStates = datafile.nextInt();
        initState = datafile.nextInt();
        trans = new Transitions(numStates*numStates*(alphabet.length()+1));
        olds = datafile.nextInt();
        while (olds >= 0) {
            news = datafile.nextInt();
            ch = datafile.nextLine().charAt(1);
            trans.addTransition(olds, news, ch);
            olds = datafile.nextInt();
        }
        finalStates = new int[numStates];
        numFinal = 0;
        finals = datafile.nextInt();
        while (finals >= 0) {
            finalStates[numFinal] = finals;
            numFinal++;
            finals = datafile.nextInt();
        }
    }

    // This methods tests a given string on this FSM to see if it is
    // accepted.  You need to use the logic and complete it.
    public int test(String input) {
        
        // set the current state to the start set
        
        // point yourself to the beginning of the string
        
        // as long as there is more to process and you have
        // not encountered an error
            // get the current state and character
            // find the next state
            // advanced to the state and move to the next character
        // if you are now in a final state, accept the string
        // otherwise reject it
        return 0;
    }
    
    // This method returns true if a given state is in an array of final
    // states, otherwise returns false.  You should implement it with a
    // sequential search.
    private boolean isFinal(int state) {
        return true;
    }
    
    // This is a standard toString method
    public String toString() {
        String result;
        
        result = "Alphabet: "+alphabet+"\n";
        result += "Number of states: "+numStates+"\n";
        result += "Initial state: "+initState+"\n";
        result += "Transitions: \n"+trans.toString()+"\n";
        result += "Final states: (";
        if (numFinal > 0) {
            result += finalStates[0]+"";
            for (int i=1; i<numFinal;i++)
                result += ", "+finalStates[i];
            result +=")\n";
        }
        return result;
    }
}       