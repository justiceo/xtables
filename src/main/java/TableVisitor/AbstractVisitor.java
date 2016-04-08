package TableVisitor;

import AbstractTable.*;

/**
 * Created by Justice on 4/6/2016.
 */
public interface AbstractVisitor {
    void visit(Body body);
    void visit(Caption caption);
    void visit(Cell cell);
    void visit(ColGroup colGroup);
    void visit(ColHeader colHeader);
    void visit(Element element);
    void visit(Footer footer);
    void visit(Header header);
    void visit(Row row);
    void visit(Table table);

}
