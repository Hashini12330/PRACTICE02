public class Main{
    public static void main(String[] args){
        Report r = new Report();

        r.loadFromFile();


        Printer p = new Printer();
        p.print(r);

        r.saveToFile();
        
    }

}


// loose coubling   --> good coupling
class Report{       // Report handles loading and saving reports.
    void loadFromFile(){
        System.out.println("Loading report from file...");
    }

    void saveToFile(){
        System.out.println("Saving report to file...");
    }

}

class Printer{      // Printer handles printing.        // ---- Therefore, they are relatively independent.
    void print(Report report){
        System.out.println("Printing report...");
    }


}

