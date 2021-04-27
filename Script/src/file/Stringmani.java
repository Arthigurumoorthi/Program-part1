package file;

public class Stringmani {

	public static void main(String[] args) {
	        
		String comment="Hiworld";
	    String result= "true";
	   //finding length
	    System.out.println(comment.length());
		//concat for merge
		System.out.println("Merging value="+comment.concat(result));
	
		String emp="Sreeshma";
		//compare
		System.out.println("compare name:" +emp.compareTo("sreeshma"));
		//ignore
        System.out.println("compare:" +emp.compareToIgnoreCase("Sreeshma"));
        //contain
        System.out.println("contain:" +emp.contains("Sri"));
        //endswith
        System.out.println("endword:" +emp.endsWith("a"));
        //replacet
        System.out.println("replace:" +emp.replace( "Sree", "Sri"));
        //upper
        System.out.println("Needcapzz=" +emp.toUpperCase());
        
	}

}
