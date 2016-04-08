package AbstractTable;

import TableVisitor.AbstractVisitor;

import java.util.List;

/**
 * Created by Justice on 4/6/2016.
 */
public abstract class Element {

    private boolean isLastChild;
    private boolean isFirstChild;
    private int height;
    private int width;

    public boolean isFirstChild() { return isFirstChild; }
    public void setFirstChild(boolean isFirstChild) { this.isFirstChild = isFirstChild; }
    public boolean isLastChild() { return  isLastChild; }
    public void setLastChild(boolean isLastChild){ this.isLastChild = isLastChild; }

    public int getHeight() { return height; }
    public int getWidth() { return width; }
    public void setHeight(int height) { this.height = height; }
    public void setWidth(int width) { this.width = width; }

    public abstract List<Element> getChildren();
    public abstract void accept(AbstractVisitor v);
    public abstract String toString();
}
