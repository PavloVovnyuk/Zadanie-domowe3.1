public class Main {
    public static void main(String[] args) {
        Table table1 = new Table ("table1", 1.20, 80.0);

        System.out.println ("Przedmiot 1");
        System.out.println ("Przedmiot się nazywa " + table1.name);
        System.out.println ("Diameter stołu wynosi " + table1.diameter + " cm");
        System.out.println ("Wysokość stołu " + table1.height + " cm");

        Table table2 = new Table ("table2", 1.45, 1.36);

        System.out.println ("Przedmiot 2");
        System.out.println ("Przedmiot się nazywa " + table2.name);
        System.out.println ("Diameter stołu wynosi " + table2.diameter + " cm");
        System.out.println ("Wysokość stołu " + table2.height + " cm");
    }
}
