public class TimeConversion {
    
    /**
     * Constructor
     */
    TimeConversion(){

    }


    /**
     * TO DO: showDecaseconds method
     * Given a number of seconds calculates 
     * and display decaseconds
    */
    public void showDecaseconds(int seconds){ 
    //Explains what a decasecond is 
    System.out.println("A decasecond is 10 seconds.");
    //converts users input to decaseconds 
    double decaSeconds = seconds/10.0;
    //outputs the value 
    System.out.println(seconds + " seconds is equal to " + decaSeconds + " decaseconds");
    //Adds an empty line to make answers readable 
    System.out.println("");
    }

    /**
     * TO DO: showJiffies method
     * Given a number of seconds calculates 
     * and display jiffies
    */
    public void showJiffies(int seconds){
    //Explains what a jiffy is 
    System.out.println("A jiffy is a real unit of time and it is used in computer operating systems. 1 jiffy is 10 milliseconds and there are 1000 milliseconds in 1 second.");
    //converts from seconds 
    double jiffies = seconds*100.0;
    //outputs the answer 
    System.out.println(seconds + " seconds is equal to " + jiffies + " jiffies");
    //Adds an empty line to make answers readable 
    System.out.println("");
    }

    /** 
     * TO DO: showNewYorkMinutes method
     * Given a number of seconds calculates 
     * and display New York minutes
    */
    public void showNewYorkMinutes(int seconds){
    //explains a new york minute
    System.out.println("A new york minute is the period of time between the traffic lights turning green and the cab behind you honking. It is 1/20th of 1 second.");  
    //converts from seconds
    double nycMin = seconds*20.0;
    //outputs the answer 
    System.out.println(seconds + " seconds is equal to " + nycMin + " New York Minutes");
    //adds an empty line
    System.out.println("");
    }

    /**
     * TO DO: showNanoCenturies method
     * Given a number of seconds calculates 
     * and display Nanocenturies
    */ 
    public void showNanoCenturies(int seconds){
    //explains a nanocentury
    System.out.println("A nanocentury is a computing measurement coined from the expression -  \"never to let the user wait more than a few nanocenturies for a response\". It is 3.156 seconds.");  
    //converts from seconds
    double nanoSen = seconds/3.156;
    //outputs the answer
    System.out.println(seconds + " seconds is equal to " + nanoSen + " nanocenturies");
    //adds an empty line
    System.out.println("");
    }

     /**
     * TO DO: showScaramuccis method
     * Given a number of seconds calculates 
     * and display Scaramuccis
    */ 
    public void showScaramuccis(int seconds){
    //explains a scaramucci
    System.out.println("A scaramucci is the tenure of former White House Communications Director Anthony Scaramucci. It is 11 days.");  
    //converts from seconds
    double scaramucci = seconds/950400.0;
    //outputs the answer
    System.out.println(seconds + " seconds is equal to " + scaramucci + " scaramuccis");
    //adds an empty line 
    System.out.println("");
    }


    
}//end class