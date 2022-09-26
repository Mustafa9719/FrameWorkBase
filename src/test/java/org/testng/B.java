package org.testng;


import org.testng.annotations.DataProvider;

public class B {
@DataProvider(name="res")
private Object[][] test2() {
Object[][] obj = new Object[][] {{"sogesh","mustafa"}};
return obj;
}
}
