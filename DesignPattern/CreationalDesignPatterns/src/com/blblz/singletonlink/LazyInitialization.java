package com.blblz.singletonlink;

public class LazyInitialization {
private static LazyInitialization instance;
    
    private LazyInitialization(){}
    
    public static LazyInitialization getInstance(){
        if(instance == null){
            instance = new LazyInitialization();
        }
        return instance;
    }
    
    public static void main(String[] args) {
    	LazyInitialization  lazyobj = LazyInitialization.getInstance();
    	LazyInitialization  lazyobj1 = LazyInitialization .getInstance();
    	System.out.println("the addrres of 1st lazyobj refference "+lazyobj.hashCode());
    	System.out.println("the addrres of 2nd lazyobj1 refference "+lazyobj1.hashCode());
    	
    }
}
