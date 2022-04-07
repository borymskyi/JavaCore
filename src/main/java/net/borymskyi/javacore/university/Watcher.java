/*
    Напишите свой класс StringBuilder, с возможностью оповещения других объектов об изменении своего состояния.
    Для этого делегируйте все методы стандартному StringBuilder, а в собственном классе реализуйте шаблон
    проектирования «Наблюдатель».
 */

package main.java.net.borymskyi.javacore.university;
/**
 Слушатель.
 Каждый раз, когда меняется связанный с ним UndoableStringBuilder,
 вызывается метод onChange().
 */
interface OnStringBuilderChangeListener {
    void onChange(OvservableStringBuilder stringBuilder);
}

class OvservableStringBuilder {

    private OnStringBuilderChangeListener onChangeListener;

    private StringBuilder stringBuilder;

    public void setOnChangeListener(OnStringBuilderChangeListener onChangeListener) {
        this.onChangeListener = onChangeListener;
    }

    public OvservableStringBuilder() {
        stringBuilder = new StringBuilder();
    }

    private void notifyOnStringBuilderChangeListener(){
        if(onChangeListener != null){
            onChangeListener.onChange(this);
        }
    }

    // ....... Методы которые изменяют значение обьекта ..........
    public OvservableStringBuilder append(Object obj) {
        stringBuilder.append(obj);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public OvservableStringBuilder replace(int start, int end, String str) {
        stringBuilder.replace(start, end, str);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public OvservableStringBuilder insert(int index, char[] str, int offset, int len) {
        stringBuilder.insert(index, str, offset, len);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    // ....... Служебные методы ..........
    public String toString() {
        return stringBuilder.toString();
    }
}

class MyListener implements OnStringBuilderChangeListener {
    /*
        Определяем метод onChange
        В него передаётся stringBuilder, который "прослушивается"
     */
    public void onChange(OvservableStringBuilder stringBuilder) {
        System.out.println("CHANGED: " + stringBuilder.toString());
    }
}

public class Watcher {
    public static void main(String[] strings) {
        OvservableStringBuilder UndoableStringBuilder = new OvservableStringBuilder();
        UndoableStringBuilder.setOnChangeListener(new MyListener());
        UndoableStringBuilder.append("One");
        UndoableStringBuilder.append("Two");
        UndoableStringBuilder.append("Three");
    }
}