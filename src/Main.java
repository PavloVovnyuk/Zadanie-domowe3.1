public class Main {
    public static void main(String[] args) {
        Table table1 = new Table ();
        table1.diameter = 1.20;
        table1.height = 80.0;
        table1.name ="table";


        System.out.println ("Przedmiot 1");
        System.out.println ("Przedmiot się nazywa " + table1.name);
        System.out.println ("Diameter stołu wynosi " + table1.diameter + " cm");
        System.out.println ("Wysokość stołu " + table1.height + " cm");

        System.out.println ("Przedmiot 2");
        Table table2 = new Table ();
        table2.diameter = 1.45;
        table2.height = 1.36;
        table2.name ="table2";

        System.out.println ("Przedmiot się nazywa " + table2.name);
        System.out.println ("Diameter stołu wynosi " + table2.diameter + " cm");
        System.out.println ("Wysokość stołu " + table2.height + " cm");
    }
}
