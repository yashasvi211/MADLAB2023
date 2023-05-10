 
abstract class Bharatvanshi {
    public abstract void fight();
    public abstract void obedience();
    public abstract void kindness();
}

 
class Pandav extends Bharatvanshi {
    public void fight() {
        
    }
    
    public void obedience() {  
    }
    
    public void kindness() {
       
    }
}

 
class Kaurav extends Bharatvanshi {
    public void fight() {
 
    }
    
    public void disobedience() {
        
    }
    
    public void cruelty() {
        
    }
}

 
class Arjun extends Pandav {
  
}

 
class Bheem extends Pandav {
 
}

 
class Duryodhan extends Kaurav {
   
}

 
class Vikarn extends Kaurav {
}

 
public class Main {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        arjun.fight();       
        arjun.obedience();    
        arjun.kindness();   

        Duryodhan duryodhan = new Duryodhan();
        duryodhan.fight();        
        duryodhan.disobedience();  
        duryodhan.cruelty();      
    }
}
