package work6;

interface ChangeListener {
    void onChangeAlert(StringWatcher stringBuilder);
}

public class StringWatcher {


    private ChangeListener onChangeListener;

    // делегат
    private StringBuilder stringBuilder;


    public void setOnChangeListener(ChangeListener onChangeListener) {
        this.onChangeListener = onChangeListener;
    }

    public StringWatcher() {
        stringBuilder = new StringBuilder();
    }

    private void alertChangeListener(){
        if(onChangeListener != null){
            onChangeListener.onChangeAlert(this);
        }
    }

    public StringWatcher append(Object obj) {
        stringBuilder.append(obj);
        alertChangeListener();
        return this;
    }

    public StringWatcher replace(int start, int end, String str) {
        stringBuilder.replace(start, end, str);
        alertChangeListener();
        return this;
    }


    public String toString() {
        return stringBuilder.toString();
    }

    public static void main(String[] strings) {
        StringWatcher WatchableStringBuilder =
                new StringWatcher();
        WatchableStringBuilder.setOnChangeListener(new MyListener());
        WatchableStringBuilder.append("Something");
        WatchableStringBuilder.append(" happened... ");

    }
}

class MyListener implements ChangeListener {

    public void onChangeAlert(StringWatcher stringBuilder) {
        System.out.println("CHANGED: " + stringBuilder.toString());
    }
}

