# FP LBE Alpro 2022

# Irsyad Fikriansyah Ramadhan / 5025211149

## Inheritance

Hierarki **`class`** pada kode saya diantara lain :

* `Telephone` (superclass)
  * `Smartphone`
    * `FlipPhone`
    * `Tablet`

Berikut adalah bentuknya dalam kode :

```java
public abstract class Telephone{
    private String phoneNumber;

    Telephone(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public abstract void chat();
    public abstract void call();
}
 /***
public class Smartphone extends Telephone 
 /***
public class FlipPhone extends Smartphone
 /***
public class Tablet extends Smartphone
```

## Encapsulation

Implementasi encapsulation dengan menggunakan access modifier seperti private

```java
...
    private String phoneNumber;
...
```

```java
...
    private String brand;
...
```

## Abstraction

Superclass **`Telephone`** menggunakan modifier abstract untuk menggunakan `Telephone` sebagai tamplate kelas lain.

```java
public abstract class Telephone{
    private String phoneNumber;

    Telephone(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public abstract void chat();
    public abstract void call();
}
```

## Polymorphism

Saya menurunkan kelas **`Telephone`** menjadi beberapa subclass. Subclass tersebut memiliki method yang sama yaitu, chat( ) dan call( ). Setiap jenis Smartphone memiliki hasil method yang berbeda

```java
...
    public void chat() {
        System.out.println("Hey, this is my new FlipPhone 😎");
    }

    public void call() {
        System.out.println("Hello, it's me…, calling from my flip phone");
    }
...
```
