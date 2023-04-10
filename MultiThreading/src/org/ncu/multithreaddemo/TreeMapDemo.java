package org.ncu.multithreaddemo;

import java.util.Map;
import java.util.TreeMap;
public class TreeMapDemo {
public static void main(String args[]) {
Map m = new TreeMap();
m.put(11, "audi");
m.put(null, null);
m.put(11, "bmw");
m.put(null, "fer");
System.out.println(m.size());
System.out.println(m);
}
}
