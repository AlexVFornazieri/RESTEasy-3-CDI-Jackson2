package com.restEasy3.test;

import java.util.HashSet;
import java.util.Set;
 
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

 
@ApplicationPath("/rest")
public class TestApplication extends Application {
 
   private Set<Object> singletons = new HashSet<Object>();
   private Set<Class<?>> empty = new HashSet<Class<?>>();
 
   // Para funcionar o @inject do CDI aplicação deve ser vazia,
   // sem listagens de classes/singletons conforme descrito em
   // http://stackoverflow.com/a/27344142/7931838
   
   @Override
   public Set<Class<?>> getClasses() {
      return empty;
   }
 
   @Override
   public Set<Object> getSingletons() {
      return singletons;
   }
}