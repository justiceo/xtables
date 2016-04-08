package AbstractTable;

import TableVisitor.AbstractVisitor;

import java.util.List;

/**
 * Created by Justice on 4/6/2016.
 */
public class Table extends Element {

    private Caption caption;
    private ColGroup colGroup;
    private Header header;
    private Body body;
    private Footer footer;

    // there's typically one instance of table, so it's both first and last
    public boolean isFirstChild() {
        return true;
    }

    public boolean isLastChild() {
        return true;
    }


    public List<Element> getChildren() {
        return null;
    }

    public void accept(AbstractVisitor v) {
        v.visit(this);
    }

    public String toString() {
        return null;
    }
}
