import java.util.Scanner;

public class IplDemo {

	 private String[][] rcb;
	    private String[][] mi;
	    private String[][] rr;
	    private String[][] csk;
	    private String[][] gt;

	    public IplDemo(String[][] rcb, String[][] mi, String[][] rr, String[][] csk, String[][] gt) {
	        this.rcb = rcb;
	        this.mi = mi;
	        this.rr = rr;
	        this.csk = csk;
	        this.gt = gt;
	    }

	    public static void display(String[][] team) {
	        for (int i = 0; i < team.length; i++) {
	            System.out.println(team[i][0] + " : " + team[i][1]);
	        }
	    }

	    public void displayTeam(String team) {
	        switch (team.toLowerCase()) {
	            case "rcb":
	                display(rcb);
	                break;
	            case "mi":
	                display(mi);
	                break;
	            case "rr":
	                display(rr);
	                break;
	            case "csk":
	                display(csk);
	                break;
	            case "gt":
	                display(gt);
	                break;
	            default:
	                System.out.println("Invalid Team Name");
	        }
	    }

	    public static void main(String[] args) {

	        String[][] rcb = {
	                {"Virat Kohli", "21.00 Cr"},
	                {"Rajat Patidar", "11.00 Cr"},
	                {"Josh Hazlewood", "12.50 Cr"},
	                {"Bhuvneshwar Kumar", "10.75 Cr"},
	                
	        };

	        String[][] mi = {
	                {"Jasprit Bumrah", "18.00 Cr"},
	                {"Suryakumar Yadav", "16.35 Cr"},
	                {"Hardik Pandya", "16.35 Cr"},
	                {"Rohit Sharma", "16.30 Cr"},
	                {"Tilak Varma", "8.00 Cr"},
	                
	        };

	        String[][] rr = {
	                {"Sanju Samson", "18.00 Cr"},
	                {"Yashasvi Jaiswal", "18.00 Cr"},
	                {"Riyan Parag", "14.00 Cr"},
	                {"Dhruv Jurel", "14.00 Cr"},
	                {"Shimron Hetmyer", "11.00 Cr"},
	               
	        };

	        String[][] csk = {
	                {"Ruturaj Gaikwad", "18.00 Cr"},
	                {"Shivam Dube", "12.00 Cr"},
	                {"Ravindra Jadeja", "18.00 Cr"},
	                {"MS Dhoni", "4.00 Cr"},
	              
	               
	        };

	        String[][] gt = {
	                {"Shubman Gill", "16.50 Cr"},
	                {"Rashid Khan", "18.00 Cr"},
	                {"Sai Sudharsan", "8.50 Cr"},
	               
	        };

	        IplDemo ipl = new IplDemo(rcb, mi, rr, csk, gt);

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Team Name (RCB/MI/RR/CSK/GT): ");
	        String team = sc.nextLine();

	        ipl.displayTeam(team);

	        sc.close();
	    }
	}

	


