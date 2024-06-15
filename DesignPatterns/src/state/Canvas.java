package state;

public class Canvas {
    private Tool currentTool;

    public void setCurrent(Tool currentTool){
        this.currentTool = currentTool;
    }

    public Tool getCurrentTool(){
        return currentTool;
    }

    public void mouseUp(){
        currentTool.moveUp();
    }

    public void mouseDown(){
        currentTool.moveDown();
    }
}
