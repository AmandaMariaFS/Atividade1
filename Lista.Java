/*
 *  Kaio Victtor Santos A. Galvão   ----- SP3044131
 *  Amanda Maria Ferreira da Silva  ----- SP3044998
 *  
*/

import java.util.*;

public class Lista {
    
    public static void list(){

        System.out.println("------------- List -------------");

        Integer num1 = 8;
        Integer num2 = 9;
        Integer num3 = 2;

        List<Integer> list = new LinkedList<>();

        list.add(num1);
        list.add(num2);
        list.add(1,num3); //adicionando na posição 1 a variável num3

        System.out.println("--- Tamanho do ArrayList ---\n" + list.size());

        System.out.println("\n--- Números da List ---");
        
        list.forEach(num -> {
            System.out.println("" + num);
        });

        list.remove(2);

        System.out.println("\n--- List com número removido ---");
        
        list.forEach(num -> {
            System.out.println("" + num);
        });

        System.out.println("\n--- Número da posição 0 da List ---\n" + list.get(0));


    }

    public static void arrayList (){

        System.out.println("\n\n------------- ArrayList -------------");
        String item1 = "Abacate";
        String item2 = "Acerola";
        String item3 = "Mamão";
        String item4 = "Manga";

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add(item1);
        arrayList.add(item2);
        arrayList.add(item3);
        arrayList.add(2, item4); //adicionando na posição 2 a varíavel item4
      
        System.out.println("--- Tamanho do ArrayList ---\n" + arrayList.size());

        System.out.println("\n--- Itens do ArrayList ---");
        
        arrayList.forEach(item -> {
            System.out.println("" + item);
        });

        arrayList.remove(0);
        arrayList.remove(2);

        System.out.println("\n--- ArrayList com itens removidos ---");
        
        arrayList.forEach(item -> {
            System.out.println("" + item);
        });


        System.out.println("\n--- Item da posição 1 do ArrayList ---\n" + arrayList.get(1));

    }
     
    public static void collection(){
      System.out.println("\n\n------------- Collection -------------");

      Collection<String> collection = new ArrayList<>();
      for(int i=0; i<5; ++i){
        collection.add("Item" + i);
      }

      System.out.println("--- Tamanho do Collection ---\n" + collection.size());

      System.out.println("\n--- Itens da Collection ---");
        
        collection.forEach(item -> {
            System.out.println("" + item);
        });

        collection.remove("Item2");

        System.out.println("\n--- Collection com item removido ---");
        
        collection.forEach(item -> {
            System.out.println("" + item);
        });

    }

    public static void iterator(){
      Collection<String> collection = new ArrayList<>();
      for(int i=0; i<5; ++i){
        collection.add("Item" + i);
      }
      int size = 0;

      System.out.println("\n\n------------- Interator -------------");

      Iterator<String> iterator = collection.iterator();


      System.out.println("\n--- Itens do Interator ---");

      while (iterator.hasNext()) {
        String item = iterator.next();
        System.out.println(item);
        size++;
      }

      System.out.println("--- Tamanho do Interator ---\n" + size);

      iterator.remove();

      System.out.println("\n--- Interator com itens removido ---");

      while (iterator.hasNext()) {
        String item = iterator.next();
        System.out.println(item);
      }
      
    }
    

    public static void map(){

        System.out.println("\n\n------------- Maps -------------");


        Map<String, String> map = new LinkedHashMap<>(); //Velocidade média e com valores atribuidos na ordem do put

        map.put("user", "Maria");
        map.put("phone", "(11)99999-9999");
        map.put("city", "São Paulo");

        System.out.println("--- Map de um Cadastro ---\n");
        map.keySet().forEach(key -> {
            System.out.println(key + ": " + map.get(key));
        });

        System.out.println("\n--- Tamanho do primeiro Map ---\n" + map.size() );

        System.out.println("\n--- Valor que está na key user ---\n" + map.get("user"));
        
        Map<String, Integer> map2 = new HashMap<>(); //Mais rápido e com valores ordenados

        map2.put("Kaio", 18);
        map2.put("Amanda", 17);
        map2.put("Carol", 15);
        


        System.out.println("\n--- Map de nome e idade ---\n");
        map2.keySet().forEach(key -> {
            System.out.println(key + ", idade: " + map2.get(key));
        });
        
        System.out.println("\n--- Tamanho do Segundo Map ---\n" + map2.size() );

        map2.remove("Carol");

        System.out.println("\n--- Map de nome e idade com valor removido ---\n");
        map2.keySet().forEach(key -> {
            System.out.println(key + ", idade: " + map2.get(key));
        });

    }


}
