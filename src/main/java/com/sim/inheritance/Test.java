package com.sim.inheritance;

import java.io.IOException;

/*
 * class A { void m1() { System.out.println("In m1 A"); } } class B extends A {
 * void m1() { System.out.println("In m1 B"); } void m2() {
 * System.out.println("In m2 B"); } } public class Test {
 * 
 * public static void main(String[] args) { A a=new B(); //a.m2(); // There will
 * be compile-time error. Even though we are assigning B’s object to A’s
 * reference we can call only methods which are in A from A’s reference. a.m1();
 * } }
 */


/*
 * class A { void m1() throws ArrayIndexOutOfBoundsException {
 * System.out.println("In m1 A"); } } class B extends A { void m1() throws
 * IndexOutOfBoundsException { System.out.println("In m1 B"); } } public class
 * Test {
 * 
 * public static void main(String[] args) { A a=new B(); a.m1(); } }
 */



/*
 * class A { void m1() throws IOException { System.out.println("In m1 A"); } }
 * class B extends A { //As IOException and Exception are checked exception, so
 * you can not broaden the scope of Exception while method overriding. void m1()
 * throws Exception { System.out.println("In m1 B"); } } public class Test {
 * 
 * public static void main(String[] args) { A a=new B(); try { a.m1(); } catch
 * (IOException e) { e.printStackTrace(); } } }
 */

