package TableVisitor;

import AbstractTable.*;

/**
 * Created by Justice on 4/6/2016.
 */
public class SimplePrintVisitor implements AbstractVisitor {
    public void visit(Body body) {

    }

    public void visit(Caption caption) {

    }

    public void visit(Cell cell) {

    }

    public void visit(ColGroup colGroup) {

    }

    public void visit(ColHeader colHeader) {

    }

    public void visit(Element element) {

    }

    public void visit(Footer footer) {

    }

    public void visit(Header header) {

    }

    public void visit(Row row) {

    }

    public void visit(Table table) {
        System.out.println("Hello World");
    }
}
