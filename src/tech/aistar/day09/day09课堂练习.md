1. ```java
    public class Cygnus{  
       static int value = 9;   
      
       private void printValue(){
          //方法中是不允许定义静态变量的.
          //static int value = 69;
          int value = 69;
          System.out.println(this.value);  
      }
      
      public static void main(String[] args) throws Exception{
          new Cygnus().printValue();
     }
     
   }
   这个程序会有下面哪种结果？
   A. 编译错误
   B. 打印9      √
   C. 打印69
   D. 运行时抛出异常
   ```

---------------------------------------------------------------------------------------
#### 2. 写出以下程序的输出结果

```java
 class Base{
    	static{
     		System.out.println("base static");   //①
 			}
   		 public Base(){
     		System.out.println("base constructor");//③
 		}
}

public class Test extends Base{

		static{
   			 System.out.println("test static"); // ②
		}
 
		public Test(){
			//super();//调用父类空参构造
   	  System.out.println("test constructor");//④
		}
 
		public static void main(String[] args) {
    			new Test();
		}
}
```
---------------------------------------------------------------------------------------
#### 4. 写出以下程序的输出结果

```java
public class Test {

 static{
     System.out.println("test static 1");
 }
 public static void main(String[] args) {
      
 }

 static{
     System.out.println("test static 2");
 }
    
}

test static 1
test static 2
```



---------------------------------------------------------------------------------------
4. 

```java
public class test{  
	static{
     //此处的x作用域只在它所在的{}中
		 int x=5; 
	}
 
	static int x,y; 
	
  public static void main(String args[]){
   		x--; // x = -1
   		myMethod( );
      // 1+0 + 2 = 3
   		System.out.println(x+y+ ++x);  
       							 
	}
	public static void myMethod( ){
      //y=-1 + 1 = 0
  		y=x++ + ++x;
	}
}
A.	编译错误
B.	输出：1
C.	输出：2
D.	输出：3    √
E.	输出：7
F.	输出：8
```
#### 5. 阅读下列程序，选择哪一个是正确的输出结果 (C)

```java
class HelloA{  
	public HelloA()	{ 
        	System.out.println("I’m A class ")
    	}
	static{
	    	System.out.println("static A");
	}
}

public class HelloB extends HelloA{
    public HelloB(){
        System.out.println("I’m B class");
    }
    static{
        System.out.println("static B");
    }
    

	public static void main (String[] args){
    	new HelloB();
	}
}

A.	static A I’m A class static B I’m B class
B.	I’m A class I’m B class static A static B
C.	static A static B I’m A class I’m B class
D.	I’m A class static A I’m B class static B
```
---------------------------------------------------------------------------------------
#### 6. 以下代码的输出结果是？    (C)

```java
public class B{ 
    //①-给所有的静态属性分配空间和初始化
    public static B t1 = new B();
    public static B t2 = new B();
    
	{
       
   		 System.out.println("构造块");
	}
  
  //②
	static{
    	System.out.println("静态块");
	}

	public static void main(String[] args){
   		 B t = new B();
	}
 }

A.	静态块 构造块 构造块 构造块
B.	构造块 静态块 构造块 构造块
C.	构造块 构造块 静态块 构造块	
D.	构造块 构造块 构造块 静态块

```
#### 7. 下面代码在main方法代码后可以正常使用的是（A,D）

```java
public class Test{
    private int a=10;
    int b=20;//属于对象的
    static int c=1;//属于类的
    
    public static void main(String arg[]){
        Test t = new Test();
        
    }
    
    
 }

A.	t.a
B.	this.c  
C.	Test.b  
D.	Test.c

```

#### 8. 下列程序执行后结果为(A)

```java
class A {
    int x = 10;
  
    public int func1(int a, int b) {
        return a - b;
    }
}
class B extends A {
    int x = 100;
  
    public int func1(int a,int b) {
        return a + b;
    }
}

public class ChildClass {
    public static void main(String[] args) {
   
    	A a = new B();
      //a.x = 10
   
    	B b = new B();
      //b.x = 100
   
    	System.out.println("Result=" + a.func1(100, 50));
   	  System.out.println("Result=" + b.func1(100, 50));
      
      
    }
}
A.	Result=150Result=150
B.	Result=100Result=100
C.	Result=100Result=150
D.	Result=150Result=100
```

#### 9. 以下代码执行后输出结果为（A）

```java
public class Test{
    public static Test t1 = new Test();
  
	  {
    	 System.out.println("blockA");
  	}

	  static{
    	System.out.println("blockB");
	  }

    public static void main(String[] args){
        Test t2 = new Test();
	}
}

A.	blockAblockBblockA
B.	blockAblockAblockB
C.	blockBblockBblockA
D.	blockBblockAblockB
```

#### 判断以下方法不是方法重载的( B)

```java
A. public void fun1(int x,int y){}
B. public void fun1(int a,int b){} //参数个数和类型高度和A一样
C. public void fun1(int x,long y){}
D. public int fun1(int x){..}
E. public int fun1(long  y,int x){..}
```

#### 判断以下方法是不是方法重写

```java
class A{
    public void study(int x,int y){ ..}
   
    //私有的方法肯定是不允许重写.
    private void play(int x,int y){ ..}  
}

class B extends A{
     public void study(int a,int b){ ..} // true
     public void play(int x,int y){ ..} // 不OK
}

class C extends A{
     //对c去调用的时候 => 重载
     public void study(char a,char b){ ..} // 不是,参数列表不一样 
}

class D extends A{
     public void study2(char a,char b){ ..} // 不是,方法名不一样
  
     //子类访问修饰符的范围必须要大于等于父类的
     //public>protected>默认的>私有的
     protected void study(int a,int b){ ..} // 不行,不是
     public void study(float a,float b){ ..} //不是
}

 
```

写出以下程序执行结果，有误的请指出

```java
class Pet{
    public void run(){
       System.out.println("pet is running");
    }
}

class Dog extends Pet{
    public void run(){
       System.out.println("dog is running");
    }
}
//测试类
class Test{
    public static void main(String[] args){
        Pet p1 =  new Dog();
        System.out.println(p1 instanceof Dog);//true
        System.out.println(p1 instanceof Pet);//true
        p1.run();//dog is running
        
        Dog d1 = (Dog)p1;
        System.out.println(d1 instanceof Dog);//true
        System.out.println(d1 instanceof Pet);//true
        d1.run();//dog is running
        
        Pet p2 =  new Pet();
        Dog d2 = (Dog)p2;//java.lang.ClassCastException
        System.out.println(d2 instanceof Dog);//true
        System.out.println(d2 instanceof Pet);//true
    }
    
}
```
