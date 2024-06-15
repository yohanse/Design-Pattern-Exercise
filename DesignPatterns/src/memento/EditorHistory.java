package memento;

import java.util.ArrayList;
import java.util.List;

public class EditorHistory {
    private final List<EditorState> state = new ArrayList<>();

    public void push(EditorState editorState){
        state.add(editorState);
    }

    public EditorState pop(){
        var lastIndex = state.size() - 1;
        var lastEditorState = state.get(lastIndex);
        state.remove(lastIndex);
        return lastEditorState;
    }
}
