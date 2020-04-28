import com.google.common.base.Optional;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;


public class Guava {
    public static void main(String[] args) {
        printing();

        Integer a = null;
        Integer b = 10;
        System.out.println(sum(a, b));

        Integer value1 =  null;
        Integer value2 =  10;

        //Optional.fromNullable - allows passed parameter to be null.
        Optional<Integer> a1 = Optional.fromNullable(value1);

        //Optional.of - throws NullPointerException if passed parameter is null
        Optional<Integer> b2 = Optional.of(value2);

        System.out.println(sumOptional(a1,b2));

    }


    public static Integer sumOptional(Optional<Integer> a, Optional<Integer> b){
        //Optional.isPresent - checks the value is present or not
        System.out.println("First parameter is present: " + a.isPresent());

        System.out.println("Second parameter is present: " + b.isPresent());


        //Optional.or - returns the value if present otherwise returns
        //the default value passed.
        Integer value1 = a.or(0);

        //Optional.get - gets the value, value should be present
//           * Returns the contained instance if it is present; {@code defaultValue} otherwise. If
//                * no default value should be required because the instance is known to be present, use
        Integer value2 = b.get();

        return value1 + value2;
    }

    public static Integer sum(Integer a, Integer b){
        return a + b;
    }

    public static void printing(){
        System.out.println("hello");
        Table<String, String, Integer> weightedGraph = HashBasedTable.create();
        weightedGraph.put("Joe", "Bloggs", 25);
        weightedGraph.put("Joe", "William", 25);
        weightedGraph.put("Harry", "David", 25);
        weightedGraph.put("Larry", "David", 31);

        System.out.println("weightedGraph: " + weightedGraph);

        System.out.println("Row Joe: " + weightedGraph.row("Joe"));
        System.out.println("Row Bloggs: " + weightedGraph.row("Bloggs"));
        System.out.println("Column Joe: " + weightedGraph.column("Joe"));
        System.out.println("Column David: " + weightedGraph.column("David"));

        System.out.println("Column 25: " + weightedGraph.column("25"));

        Table<Integer, String, String> dataBaseTable = HashBasedTable.create();

        dataBaseTable.put(1, "Harry", "Jones");
        dataBaseTable.put(2, "Harry", "Jones2");

        System.out.println("This is databaseTable: " + dataBaseTable);
        System.out.println(dataBaseTable.row(2));
    }
}
