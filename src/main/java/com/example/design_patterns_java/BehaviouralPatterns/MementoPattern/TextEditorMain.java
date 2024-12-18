package com.example.design_patterns_java.BehaviouralPatterns.MementoPattern;

public class TextEditorMain {

   /* Memento pattern is used to restore state of an object to a previous state.
    Memento pattern falls under behavioral pattern categor*/
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker(); //History / StateMgmt

        editor.write("A");
        caretaker.saveState(editor);

        editor.write("B");
        caretaker.saveState(editor);
        //Problem - > Undo the last write!
        editor.write("C");
        caretaker.saveState(editor);

        //CareTaker Undo
        caretaker.undo(editor);

        System.out.println(editor.getContent());
    }
}
