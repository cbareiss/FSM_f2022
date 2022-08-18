/*******************************************
/** Author:  Dr. Cathy Bareiss
/*  Course:  CSC 122, Fall 2022
/*  Lab:     Lab 1: Finite State Machine
/*  Created: August 2022
/*  Class:   FSMDrive -> driver for a FSM
/*  Related classes:  FSM, Transitions, Transition
*******************************************/
import java.io.*;
import java.util.*;

public class FSMDriver {
    public static void main(String[] args) throws IOException {
        FSM myFSM;
        
        // create a machine from a file called "simple"
        myFSM = new FSM("simple");
        // test the string "aab" on that machine and report the results
        System.out.println(myFSM.test("aab"));
    }
}