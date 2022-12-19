package work6;

import java.util.LinkedList;
import java.util.function.Consumer;

public class StringBuilder2 {
    private StringBuilder sb;
    private LinkedList<Consumer<StringBuilder>> undoOperations = new LinkedList<>();

    public StringBuilder2 undo() {
        undoOperations.removeLast().accept(sb);
        return this;
    }

    public StringBuilder2() {
        sb = new StringBuilder();
    }

    public StringBuilder2(int capacity) {
        sb = new StringBuilder(capacity);
    }

    public StringBuilder2(String str) {
        sb = new StringBuilder(str);
    }

    public StringBuilder2(CharSequence seq) {
        sb = new StringBuilder(seq);
    }

    public StringBuilder2 append(boolean b) {
        int begin = sb.length();
        sb.append(b);
        int end = sb.length();
        undoOperations.add(x -> x.delete(begin, end));
        return this;
    }

    public StringBuilder2 append(char c) {
        sb.append(c);
        undoOperations.add(x -> x.delete(x.length() - 1, x.length()));
        return this;
    }

    public StringBuilder2 append(char[] str) {
        int begin = sb.length();
        sb.append(str);
        int end = sb.length();
        undoOperations.add(x -> x.delete(begin, end));
        return this;
    }

    public StringBuilder2 append(char[] str, int offset, int len) {
        int begin = sb.length();
        sb.append(str, offset, len);
        int end = sb.length();
        undoOperations.add(x -> x.delete(begin, end));
        return this;
    }

    public StringBuilder2 append(CharSequence s) {
        int begin = sb.length();
        sb.append(s);
        int end = sb.length();
        undoOperations.add(x -> x.delete(begin, end));
        return this;
    }

    public StringBuilder2 append(CharSequence s, int start, int end) {
        int begin = sb.length();
        sb.append(s, start, end);
        int endInd = sb.length();
        undoOperations.add(x -> x.delete(begin, end));
        return this;
    }

    public StringBuilder2 append(double d) {
        int begin = sb.length();
        sb.append(d);
        int end = sb.length();
        undoOperations.add(x -> x.delete(begin, end));
        return this;
    }

    public StringBuilder2 append(float f) {
        int begin = sb.length();
        sb.append(f);
        int end = sb.length();
        undoOperations.add(x -> x.delete(begin, end));
        return this;
    }

    public StringBuilder2 append(int i) {
        int begin = sb.length();
        sb.append(i);
        int end = sb.length();
        undoOperations.add(x -> x.delete(begin, end));
        return this;
    }

    public StringBuilder2 append(long l) {
        int begin = sb.length();
        sb.append(l);
        int end = sb.length();
        undoOperations.add(x -> x.delete(begin, end));
        return this;
    }

    public StringBuilder2 append(Object obj) {
        int begin = sb.length();
        sb.append(obj);
        int end = sb.length();
        undoOperations.add(x -> x.delete(begin ,end));
        return this;
    }

    public StringBuilder2 append(String str) {
        int begin = sb.length();
        sb.append(str);
        int end = sb.length();
        undoOperations.add(x -> x.delete(begin, end));
        return this;
    }

    public StringBuilder2 append(StringBuffer stringBuffer) {
        int begin = sb.length();
        sb.append(stringBuffer);
        int end = sb.length();
        undoOperations.add(x -> x.delete(begin, end));
        return this;
    }

    public StringBuilder2 appendCodePoint(int codePoint) {
        int begin = sb.length();
        sb.appendCodePoint(codePoint);
        int end = sb.length();
        undoOperations.add(x -> x.delete(begin, end));
        return this;
    }

    public int capacity() {
        return sb.capacity();
    }

    public char charAt(int index) {
        return sb.charAt(index);
    }

    public int codePointAt(int index) {
        return sb.codePointAt(index);
    }

    public int codePointBefore(int index) {
        return sb.codePointBefore(index);
    }

    public int codePointCount(int beginIndex, int endIndex) {
        return sb.codePointCount(beginIndex, endIndex);
    }

    public StringBuilder2 delete(int start, int end) {
        String substr = sb.substring(start, end);
        undoOperations.add(x -> x.insert(start, substr));
        sb.delete(start, end);
        return this;
    }

    public StringBuilder2 deleteCharAt(int index) {
        char c = sb.charAt(index);
        undoOperations.add(x -> x.insert(index, c));
        sb.deleteCharAt(index);
        return this;
    }

    public void ensureCapacity(int minimumCapacity) {
        sb.ensureCapacity(minimumCapacity);
    }

    public void getChart(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
        sb.getChars(srcBegin, srcEnd, dst, dstBegin);
    }

    public int indexOf(String str) {
        return sb.indexOf(str);
    }

    public int indexOf(String str, int fromIndex) {
        return sb.indexOf(str, fromIndex);
    }

    public StringBuilder2 insert(int offset, boolean b) {
        int begin = sb.length();
        sb.insert(offset, b);
        int end = sb.length();
        undoOperations.add(x -> x.delete(offset, offset + (end - begin)));
        return this;
    }

    public StringBuilder2 insert(int offset, char c) {
        sb.insert(offset, c);
        undoOperations.add(x -> x.delete(offset, offset + 1));
        return this;
    }

    public StringBuilder2 insert(int offset, char[] str) {
        sb.insert(offset, str);
        undoOperations.add(x -> x.delete(offset, offset + str.length));
        return this;
    }

    public StringBuilder2 insert(int index, char[] str, int offset, int len) {
        sb.insert(index, str, offset, len);
        undoOperations.add(x -> x.delete(index, index + len));
        return this;
    }

    public StringBuilder2 insert(int dstOffset, CharSequence s) {
        sb.insert(dstOffset, s);
        undoOperations.add(x -> x.delete(dstOffset, dstOffset + s.length()));
        return this;
    }

    public StringBuilder2 insert(int dstOffset, CharSequence s, int start, int end) {
        sb.insert(dstOffset, s, start, end);
        undoOperations.add(x -> x.delete(dstOffset, dstOffset + (end - start)));
        return this;
    }

    public StringBuilder2 insert(int offset, double d) {
        int begin = sb.length();
        sb.insert(offset, d);
        int end = sb.length();
        undoOperations.add(x -> x.delete(offset, offset + (end - begin)));
        return this;
    }

    public StringBuilder2 insert(int offset, float f) {
        int begin = sb.length();
        sb.insert(offset, f);
        int end = sb.length();
        undoOperations.add(x -> x.delete(offset, offset + (end - begin)));
        return this;
    }

    public StringBuilder2 insert(int offset, int i) {
        int begin = sb.length();
        sb.insert(offset, i);
        int end = sb.length();
        undoOperations.add(x -> x.delete(offset, offset + (end - begin)));
        return this;
    }

    public StringBuilder2 insert(int offset, long l) {
        int begin = sb.length();
        sb.insert(offset, l);
        int end = sb.length();
        undoOperations.add(x -> x.delete(offset, offset + (end - begin)));
        return this;
    }

    public StringBuilder2 insert(int offset, Object obj) {
        int begin = sb.length();
        sb.insert(offset, obj);
        int end = sb.length();
        undoOperations.add(x -> x.delete(offset, offset + (end - begin)));
        return this;
    }

    public StringBuilder2 insert(int offset, String str) {
        sb.insert(offset, str);
        undoOperations.add(x -> x.delete(offset, offset + str.length()));
        return this;
    }

    public int lastIndexOf(String str) {
        return sb.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int fromIndex) {
        return sb.lastIndexOf(str, fromIndex);
    }

    public int length() {
        return sb.length();
    }

    public int offsetByCodePoints(int index, int codePointOffset) {
        return sb.offsetByCodePoints(index, codePointOffset);
    }

    public StringBuilder2 replace(int start, int end, String str) {
        String substr = sb.substring(start, end);
        undoOperations.add(x -> x.replace(start, start + str.length(), substr));
        sb.replace(start, end, str);
        return this;
    }

    public StringBuilder2 reverse() {
        undoOperations.add(x -> x.reverse());
        sb.reverse();
        return this;
    }

    public void setCharAt(int index, char ch) {
        char c = sb.charAt(index);
        undoOperations.add(x -> x.setCharAt(index, c));
        sb.setCharAt(index, ch);
    }

    public void setLength(int newLength) {
        int length = sb.length();
        undoOperations.add(x -> x.setLength(length));
        sb.setLength(newLength);
    }

    public CharSequence subSequence(int start, int end) {
        return sb.subSequence(start, end);
    }

    public String substring(int start) {
        return sb.substring(start);
    }

    public String substring(int start, int end) {
        return sb.substring(start, end);
    }

    public String toString() {
        return sb.toString();
    }

    public void trimToSize() {
        sb.trimToSize();
    }
    public static void main(String[] args) {
        StringBuilder2 s = new StringBuilder2("geeg");
        System.out.println(s);
        System.out.println("Replacing:");
        s.replace(1,3,"aa");
        System.out.println(s);
        s.undo();
        System.out.println("Undoing:");
        System.out.println(s);
    }
}
