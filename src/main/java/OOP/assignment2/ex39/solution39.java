/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
package OOP.assignment2.ex39;
import java.util.*;//List<Map> listOfMap = new ArrayList<>();
//hashmap made Map<Object,Object> nameMap = new HashMap<>();
//List<Map> listOfMap = new ArrayList<>();
public class solution39 {
    public static void main(String[] args) {
        List<Map<String,String>> listOfMap =  populateEmployees();
        listOfMap = sortlistOfMap(listOfMap);
        displayTable(listOfMap);
    }

    private static void displayTable(List<Map<String, String>> listOfMap) {
        System.out.printf("First Name    Last Name    Position    Separation Date%n");

        for(int i = 0; i <6; i++){
            Map<String, String> map = listOfMap.get(i);
            String firstname = map.get("firstname");
            System.out.print(firstname + "        ");
            String lastname = map.get("lastname ");
            System.out.print(lastname + "   ");
            String position = map.get("Position");
            System.out.print(position + "   ");
            String separationDate = map.get("SeparationDate");
            System.out.printf(separationDate + "   %n");
        }
    }

    public static List sortlistOfMap(List<Map<String, String>> listOfMap) {
            Map<String, String> tempMap = new HashMap<>();
            for (int i = 0; i < 4; i++) {
                Map<String, String> map = listOfMap.get(i);
                Map<String, String> map2 = listOfMap.get(i+1);

                if(map.get("lastname ").compareTo(map2.get("lastname ")) > 0){
                    listOfMap.set(i, map2);
                    listOfMap.set(i+1,map);
                }
            }
            return listOfMap;
    }
    private static List populateEmployees() {
        List<Map> listOfMap = new ArrayList<>();
        HashMap<String,String> emp1= new HashMap<>();
        emp1.put("firstname", "John");
        emp1.put("lastname ", "Johnson");
        emp1.put("Position", "Manager");
        emp1.put("SeparationDate", "2016-12-31");
        listOfMap.add(emp1);
        HashMap<String,String> emp2= new HashMap<>();
        emp2.put("firstname", "Tou");
        emp2.put("lastname ", "Xiong");
        emp2.put("Position", "Software Engineer");
        emp2.put("SeparationDate", "2016-10-05");
        listOfMap.add(emp2);
        HashMap<String,String> emp3 = new HashMap<>();
        emp3.put("firstname", "Michaela");
        emp3.put("lastname ", "Michaelson");
        emp3.put("Position", "District Manager");
        emp3.put("SeparationDate", "2015-12-19");
        listOfMap.add(emp3);
        HashMap<String,String> emp4= new HashMap<>();
        emp4.put("firstname", "Jake");
        emp4.put("lastname ", "Jacobson");
        emp4.put("Position", "Programmer");
        emp4.put("SeparationDate", "");
        listOfMap.add(emp4);
        HashMap<String,String> emp5= new HashMap<>();
        emp5.put("firstname", "Jacquelyn");
        emp5.put("lastname ", "Jackson");
        emp5.put("Position", "DBA");
        emp5.put("SeparationDate", "");
        listOfMap.add(emp5);
        HashMap<String,String> emp6= new HashMap<>();
        emp6.put("firstname", "Sally");
        emp6.put("lastname ", "Webber");
        emp6.put("Position", "Web Developer");
        emp6.put("SeparationDate", "2015-12-18");
        listOfMap.add(emp6);
        return listOfMap;
    }
}
