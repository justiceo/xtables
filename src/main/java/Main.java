import AbstractTable.Table;
import TableVisitor.SimplePrintVisitor;

/**
 * Created by Justice on 4/6/2016.
 */
public class Main {

    public static void main(String args[]) {
        Table table = new Table();
        table.accept(new SimplePrintVisitor());
    }
}
