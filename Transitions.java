/*******************************************
/** Author:  Dr. Cathy Bareiss
/*  Course:  CSC 122, Fall 2022
/*  Lab:     Lab 1: Finite State Machine
/*  Created: August 2022
/*  Class:   Transitions -> contains a list of transitions
/*  Related classes:  Transition, FSM
*******************************************/
public class Transitions {
    // Field variables
    public static final int MAX=100; // default max number
    private Transition[] transitions;
    private int n;                   // number in use

    // Constructors
    
    // create a constructor of default size with all elements at null
    // and empty
    public Transitions () {

    }
    
    // create a constructor similar to previous one but of a set size
    public Transitions(int num) {

    }
    
    // Mutators
    
    // Add the sent transition to the list of transitions, any location is fine
    public void addTransition(Transition newTrans) {

    }
    
    // same as previous but sent the components of a transition that should be
    // used to create the transition first
    public void addTransition(int olds, int news, char chr) {

    }
    
    // Accessors
    
    // Find a transition that is equal to the sent state and character
    // This should be a sequential search
    // If found, return that transition else return null
    // hint:  use a write equals method
    public Transition lookup(int olds, char chr) {
        return null;
    }
    
    // Helpers
    // Only one needed is a toString
    public String toString() {
        String result;
        int i;
        
        result = "";
        for (i=0; i< n; i++)
            result += transitions[i].toString()+"\n";
        return result;
    }
}
