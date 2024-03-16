/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muratkynr
 */
interface GetInfo {

   abstract public String  getInfo();
}


abstract class H1  {

    void op() {}
    public String getInfo(){return "Hey , I am in H1 hierarcy ("+ toString() + ")" ;}
    
}

class H1A extends H1 implements GetInfo{
    
    @Override
    
    public String toString(){
        return "I am the H1A";
    }
    
}

class H1B extends H1 implements GetInfo{
}

class H1C extends H1 implements GetInfo{
}

abstract class H2 {
    void oper(){}
    public String getInfo(){return "Hey , I am in H2 hierarcy ("+ toString() + ")" ;}

}
class H2A extends H2 implements GetInfo{
    
}

class H2B extends H2 implements GetInfo{
}

public class Week5Test {

    public static void main(String[] args) {
            GetInfo h1arr[] = {new H1A(),new H1B(),new H1C()};
            GetInfo h2arr[]= {new H2A(),new H2B()};
            
            GetInfo objects[][]={h1arr,h2arr};
            for(GetInfo objArr[]: objects){
                for(GetInfo obj : objArr){
                    System.out.println(obj.getInfo());
                }
            }
            
    }
}
